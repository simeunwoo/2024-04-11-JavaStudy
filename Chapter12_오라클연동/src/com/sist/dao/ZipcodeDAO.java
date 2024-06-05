package com.sist.dao;
// => 기능 (오라클 연결 => 사용자 요청에 맞는 데이터를 찾아온다)
import java.util.*; // ArrayList
import java.sql.*; // 오라클에 연결하는 라이브러리
/*
 * 	데이터베이스 연동
 * 	jdbc => dbcp => orm
 * 	                --- MyBatis (SQL 문장이 있다 => 반복 기능 제거) / JPA (SQL 없이 수행)
 * 	<프로젝트>
 * 	1차 : jdbc
 * 	2차 : dbcp
 * 	3차 : MyBatis
 * 	개인 : JPA
 */
public class ZipcodeDAO {
	// 오라클 연결 클래스
	private Connection conn;
	// SQL 전송하는 클래스 (결과값 받기)
	private PreparedStatement ps; // SQL 전송 => 결과값 읽기
	// 오라클 연결 => URL (오라클 주소) thin => 연결만 하는 드라이버
	/*
	 * 	localhost => 본인 컴퓨터 => IP
	 * 	1521 : PORT, 1433 (MS-SQL), 3306 (MySQL, MariaDB)
	 * 	XE : table에 저장된 데이터베이스 => ORCL / ORA
	 * 	(연습용 => 무료)
	 */
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 1. 드라이버 등록
	public ZipcodeDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception ex) {}
	}
	// 2. 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			// conn hr/happy (관리자용 SQL Plus에서 연결)
		}
		catch(Exception ex) {}
	}
	// 3. 오라클 연결 해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) // ps : 통신
				ps.close(); // 통신 중단
			if(conn!=null) // conn : 전화기
				conn.close();
		}
		catch(Exception ex) {}
	}
	// ----------------------------------- 공통 사항 => 클래스화 => 라이브러리로 제작 => .jar
	// 4. 기능 설정
	// => 우편 검색 / 우편 번호 검색 개수
	public ArrayList<ZipcodeVO> postFind(String dong)
	{
		ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
		try
		{
			// 오라클 연결 => 값을 읽기
			// 4-1. 오라클 연결
			getConnection();
			// 4-2. SQL 문장 만들기 // => *를 가져오면 => NULL 값이 나올 수 있다 => 컬럼과 NVL 활용
			String sql="SELECT zipcode,sido,gugun,dong,NVL(bunji,' ') "
					+"FROM zipcode "
					+"WHERE dong LIKE '%'||?||'%'";
					// WHERE dong LIKE CONCAT('%',?,'%') => MYSQL / MariaDB에 사용
					// NVL (오라클) => ISNULL (MYSQL / MariaDB)
			ps=conn.prepareStatement(sql); // 미리 SQL 문장을 전송하고 나중에 값을 채워준다 => ? 활용
			ps.setString(1, dong); // ?에 값을 채워서 실행 요청
			// 오라클에 실행 요청 => 결과값을 메모리에 저장 => ResultSet 활용
			ResultSet rs=ps.executeQuery(); // Query 문장을 실행한 결과를 rs에 넣어라
			// 메모리 => 커서의 위치가 맨 마지막에 존재 => 첫째줄로 이동 => next() 활용
			while(rs.next())
			{
				ZipcodeVO vo=new ZipcodeVO();
				vo.setZipcode(rs.getString(1));
				vo.setSido(rs.getString(2));
				vo.setGugun(rs.getString(3));
				vo.setDong(rs.getString(4));
				vo.setBunji(rs.getString(5));
				list.add(vo);
			}
			rs.close(); // 메모리 닫기
		}
		catch(Exception ex)
		{
			ex.printStackTrace(); // 에러 확인
		}
		finally
		{
			disConnection(); // 닫기
		}
		return list;
	}
}
