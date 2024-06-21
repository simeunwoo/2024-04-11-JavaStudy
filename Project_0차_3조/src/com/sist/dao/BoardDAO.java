package com.sist.dao;
import java.util.*;
import java.sql.*;
public class BoardDAO {
	// 오라클 연결 객체
	private Connection conn; // Socket
	// 오라클 송수신 => Socket / OutputStream, BufferedReader => Network 이용
	private PreparedStatement ps;
	// 오라클 주소 : 상수형
	private final String URL="jdbc:oracle:thin:@192.168.10.124:1521:XE"; // XE : 테이블이 저장된 데이터베이스 (폴더)
	// 객체는 한번만 생성 => 싱글턴
	private static BoardDAO dao;
	// 드라이버 등록 = 오라클 연결 = SQL 문장 전송 = 결과값 읽기 = 데이터 모아서 = 윈도우로 전송
	public BoardDAO()
	{
		// 시작과 동시에 수행 문장, 멤버 변수 초기화
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	// 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr3","happy");
			// 대문자 구분
			// 오라클로 명령 => conn hr/happy
		}catch(Exception ex) {}
	}
	// 오라클 닫기
	public void disConnection()
	{
		try
		{
			if(ps!=null)
				ps.close(); // ps를 먼저 끊고, 그 다음에 conn을 끊어야 한다
			if(conn!=null)
				conn.close();
		}catch(Exception ex) {}
	}
	/*
	 * 	> 여는 순서
	 * 	Connection => PreparedStatement => ResultSet
	 * 
	 * 	> 닫는 순서 (여는 순서를 반대로)
	 * 	ResultSet.close() => PreparedStatement.close() => Connection.close()
	 */
	// 싱글턴
	public static BoardDAO newInstance()
	{
		if(dao==null)
			dao=new BoardDAO(); // dao가 없으면 새로 생성
		return dao; // dao가 있으면 원래 있던 것을 써라
	}
	///////////////////////////////////////////// 공통 기반 => 웹 (클래스 => jar) => 라이브러리화
	// 기능 => 리턴형 (어떤 데이터를 보내줄 지), 매개 변수 (사용자로부터 어떤 값을 받을 지)
	
	// 1. 목록 출력 => 페이지 나누기 (인라인뷰)
	// VO => 한개의 게시물 정보 => 컬렉션/배열을 이용해서 여러개를 묶어서 전송
	public List<BoardVO> boardListData(int page)
	{
		// 리턴형 => return
		List<BoardVO> list=new ArrayList<BoardVO>(); // VO (게시물 1개) => VO 여러개를 보내준다 (ArrayList의 역할)
		try
		{
			// 연결
			getConnection();
			// 오라클로 보낼 SQL 문장
			String sql="SELECT bno, title, id, regdate, hit,gno, (SELECT goods_name FROM goods_all where gno = no), num "
						+"FROM (SELECT bno, title,id,regdate,hit, gno,(SELECT goods_name FROM goods_all where gno = no),  rownum as num "
						+"FROM (SELECT bno, title,id,regdate,hit,(SELECT goods_name FROM goods_all where gno = no),  gno "
						+"FROM board ORDER BY bno DESC)) "
						+"WHERE bno BETWEEN ? AND ?"; // 페이지 나누기 (인라인뷰)
			ps=conn.prepareStatement(sql); // 먼저 전송
			// 1page => 1 ~ 10
			// 2page => 11 ~ 20 ...
			// 실행 요청 전에 => ?에 값을 채운다
			int rowSize=10;
			int start=(rowSize*page)-(rowSize-1);
			int end=rowSize*page;
			// 이전 - 다음 => < [1][2][3]... >
			ps.setInt(1, start);
			ps.setInt(2, end);
			// 실행
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				BoardVO vo=new BoardVO();
				vo.setBno(rs.getInt(1));
				vo.setTitle(rs.getString(2));				
				vo.setId(rs.getString(3));				
				vo.setRegdate(rs.getDate(4));				
				vo.setHit(rs.getInt(5));
				vo.setGno(rs.getInt(6));
				vo.getGvo().setGoods_name(rs.getString(7));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			// 에러 확인 => output
			ex.printStackTrace();
		}
		finally
		{
			// 닫기
			disConnection();
		}
		return list;
	}
	// 1-1. 총 페이지
	public int boardTotalPage()
	{
		int total=0;
		try
		{
			getConnection();
			String sql="SELECT CEIL(COUNT(*)/10.0) FROM board";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			total=rs.getInt(1);
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return total;
	}
	// 2. 글 쓰기 => 시퀀스 사용법
	// SELECT 외에는 => 오라클 자체 처리 => 결과값이 없다
	// 글쓰기 => 시퀀스 사용법 => 매개 변수는 특별한 경우 외에는 3개 이상 초과 시 반드시 배열, 클래스 객체
	// ex) memberInsert(String a,String b,String c,String d,String e,String f,String g...)
	//                  -----------------------------------------------------------------
	//					MemberVO vo
	public void boardInsert(BoardVO vo)
	{
		try
		{
			// 연결
			getConnection();
			// SQL 문장
			String sql="INSERT INTO board(bno,id,title,content, gno) "
					+"VALUES(board_bno_seq.nextval,?,?,?, ?)";
			// 전송
			ps=conn.prepareStatement(sql);
			// 실행 요청
			// ?에 값을 채운다
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getContent());
			ps.setInt(4, vo.getGno());
			ps.executeUpdate();
			/*
			 * 	executeQuery() => 결과값이 있다 => SELECT
			 * 	executeUpdate() => 결과값이 없다 => commit() => INSERT / UPDATE / DELETE
			 */
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
	}
	// 3. 상세 보기 => WHERE => 조회수 / 조회수 증가 / 데이터 읽기
	public BoardVO boardDetailData(int no)
	{
		// 한개의 게시물에 대한 구분자 => no
		BoardVO vo=new BoardVO();
		try
		{
			getConnection();
			String sql="UPDATE board SET "
					+"hit=hit+1 "
					+"WHERE bno=?"; // 조회수 증가
			ps=conn.prepareStatement(sql);
			ps.setInt(1, no);
			ps.executeUpdate();
			// 데이터 읽기
			// sql 문장은 여러개 쓸 수 있다
			sql="SELECT id,regdate,hit,title,content, (SELECT goods_name FROM goods_all where gno = no) "
					+"FROM board "
					+"WHERE bno=?";
			ps=conn.prepareStatement(sql);
			// ?의 값을 채워라
			ps.setInt(1, no);
			// 결과값 출력
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setId(rs.getString(1));
			vo.setRegdate(rs.getDate(2));
			vo.setHit(rs.getInt(3));
			vo.setTitle(rs.getString(4));
			vo.setContent(rs.getString(5));
			vo.getGvo().setGoods_name(rs.getString(6));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	// 4. 수정 => 비밀 번호 체크 => 비밀 번호 체크 / 실제 수정 => 묻고 답하기 : SQL(5)
	// 4-1. 기존의 데이터 읽기
	public BoardVO boardUpdateData(int no)
	{
		// 한개의 게시물에 대한 구분자 => no
		BoardVO vo=new BoardVO();
		try
		{
			System.out.println(no);
			getConnection();
			String sql="SELECT id,regdate,hit,title,content "
					+"FROM board "
					+"WHERE bno=?";
			ps=conn.prepareStatement(sql);
			// ?의 값을 채워라
			ps.setInt(1, no);
			// 결과값 출력
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setId(rs.getString(1));
			vo.setRegdate(rs.getDate(2));
			vo.setHit(rs.getInt(3));
			vo.setTitle(rs.getString(4));
			vo.setContent(rs.getString(5));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	// 4-2. 실제 수정
	// SQL 문장 사용법
	public boolean boardUpdate(BoardVO vo)
	{
		boolean bCheck=false;
		try
		{
			getConnection();
			// 비밀 번호 체크
			String sql="UPDATE board SET "
					+"id=?, title=?, content=?, gno = ? "
					+"WHERE bno=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getContent());
			ps.setInt(4, vo.getGno());
			ps.setInt(5, vo.getBno());
			ps.executeUpdate();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return bCheck;
	} 
	public String isMine(int no) {
		String name = "";
		try {
			getConnection();
			String sql = "SELECT id FROM board WHERE bno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			rs.next();
			name = rs.getString(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
		return name;
	}

}