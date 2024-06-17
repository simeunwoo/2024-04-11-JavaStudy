package com.sist.dao;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.*;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@192.168.10.124:1521:XE";
	private static MemberDAO dao; // 싱글턴 (데이터베이스가 있으면 무조건 싱글턴이 있다)
	
	// 1. 드라이버 등록
	public MemberDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	
	// 2. 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr3","happy");
		}catch(Exception ex) {}
	}
	
	// 3. 오라클 해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) // ps가 null이 아니라면 => ps가 연결 상태라면
				ps.close(); // ps를 닫는다
			if(conn!=null) // conn이 연결 상태라면
				conn.close(); // conn을 닫는다
		}catch(Exception ex) {}

	}
	
	// 4. 싱글턴 => 한 사람 당 한개의 DAO만 사용할 수 있게 만든다 => 메모리 누수 현상을 제거
	public static MemberDAO newInstance()
	{
		if(dao==null)
			dao=new MemberDAO();
		return dao; // null이 아니면 기존에 저장된 dao를 전송, null이면 새로 dao를 전송
	}
	/////////////////////////////////////////// 여기까지는 모든 DAO에서의 공통 사항
	
	// 기능 처리 (SQL 문장 제작에 유의해서 살피기 => 웹도 가능 => DAO 변경이 없다)
	// 1. 로그인 처리
	/*
	 * 	리턴형 => 경우의 수
	 * 	= 사번이 없는 경우 => int에선 0 / String에선 NOSABUN
	 * 	= 사번은 있지만 이름이 틀린 경우 => int에선 1 / String에선 NONAME
	 * 	= 사번도 있고 이름도 같은 경우 => int에선 2 / String에선 OK
	 * 	-------------------------- String / int
	 */
	public String memberLogin(String id,String pwd)
	{
		String result="";
		try
		{
			// 1) 연결
			getConnection();
			// 2) SQL 문장
			String sql="SELECT COUNT(*) "
						+"FROM member "
						+"WHERE id=?"; // 사번이 존재하는지 확인 => 0 or 1
			// 3) 오라클로 SQL 문장 전송
			ps=conn.prepareStatement(sql);
			// ?에 값을 채운다
			ps.setString(1, id);
			// 4) 결과값을 받는다
			ResultSet rs=ps.executeQuery();
			rs.next();
			int count=rs.getInt(1); // 0, 1
			if(count==0) // 아이디가 틀린 경우
			{
				result="NOID";
			}
			else // 아이디가 맞는 경우
			{
				sql="SELECT pwd "
					+"FROM member "
					+"WHERE id=?";
				// 오라클로 전송
				ps=conn.prepareStatement(sql);
				ps.setString(1, id);
				// 결과값 받기
				rs=ps.executeQuery();
				rs.next();
				String db_pwd=rs.getString(1);
				rs.close();
				if(db_pwd.equals(pwd)) // 비밀 번호가 맞는 경우 => 로그인
				{
					result="OK";
				}
				else // 비밀 번호가 틀린 경우
				{
					result="NOPWD";
				}
			}
		}catch(Exception ex)
		{
			ex.printStackTrace(); // 오류 확인 => null, SQL 문장
		}
		finally
		{
			disConnection(); // 오라클 해제
		}
		return result;
	}
	// 1-1. 회원 정보 읽기
	public MemberVO memberInfo(String id)
	{
		MemberVO vo=new MemberVO();
		try
		{
			getConnection();
			String sql="SELECT id,name,sex,admin "
						+"FROM member "
						+"WHERE id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setId(rs.getString(1));
			vo.setName(rs.getString(2));
			vo.setSex(rs.getString(3));
			vo.setAdmin(rs.getString(4));
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
	
	public MemberVO memberInfo2(String id)
	{
		MemberVO vo=new MemberVO();
		try
		{
			getConnection();
			String sql="SELECT name,sex,addr1,phone,content,email "
						+"FROM member "
						+"WHERE id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setName(rs.getString(1));
			vo.setSex(rs.getString(2));
			vo.setAddr1(rs.getString(3));
			vo.setPhone(rs.getString(4));
			vo.setContent(rs.getString(5));
			vo.setEmail(rs.getString(6));
			rs.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	
	// 2. 회원 가입 => 아이디 중복 체크 / 우편 번호 검색
/*
 ID
 PWD
 NAME
 SEX
 BIRTHDAY
 POST
 ADDR1
 ADDR2
 PHONE
 EMAIL
 CONTENT
 REGDATE
 ADMIN
 */
	public String memberInsert(MemberVO vo)
	{
		/*
		 * 	Statement
		 * 	String sql="INSERT INTO member VALUES('"+vo.getId()+"','" ...
		 * 
		 * 	prepareStatement : 미리 ?로 채워 놓고, 나중에 ?의 값을 채운다
		 */
		String result="";
		try
		{
			getConnection();
			String sql="INSERT INTO member VALUES(?,?,?,?,?,?,?,?,?,?,?,SYSDATE,'n')";
			ps=conn.prepareStatement(sql);
			
			// ?에 값을 채운다
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getSex());
			ps.setString(5, vo.getBirthday());
			ps.setString(6, vo.getPost());
			ps.setString(7, vo.getAddr1());
			ps.setString(8, vo.getAddr2());
			ps.setString(9, vo.getPhone());
			ps.setString(10, vo.getEmail());
			ps.setString(11, vo.getContent());
			
			// 추가 요청
			ps.executeUpdate(); // commit() 포함 => INSERT / UPDATE / DELETE
			// executeQuery() => 데이터를 가지고 온다 => SELECT
	//		conn.commit();
			
			result="yes";
		}catch(Exception ex)
		{
			result=ex.getMessage();
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return result;
	}
	// 2-1. 아이디 중복 체크
	public int memberIdCheck(String id)
	{
		int count=0;
		try
		{
			getConnection();
			String sql="SELECT COUNT(*) "
						+"FROM member "
						+"WHERE id=?";
			ps=conn.prepareStatement(sql);
			// ?에 값을 채운다
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			count=rs.getInt(1); // 아이디를 중복 체크 해보았을 때 => 1개가 count 되었다 => 중복
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return count;
	}
	
	// 3. 회원 수정
	
	// 4. 회원 탈퇴
	
	// 5. 우편 번호 검색
	public ArrayList<ZipcodeVO> postFindData(String dong)
	{
		ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
		try
		{
			getConnection();
			String sql="SELECT zipcode,sido,gugun,dong,NVL(bunji,' ') "
						+"FROM zipcode "
						+"WHERE dong LIKE '%'||?||'%'";
			ps=conn.prepareStatement(sql);
			ps.setString(1, dong); // 자동 => '마포'
			ResultSet rs=ps.executeQuery();
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
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
}
