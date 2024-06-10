package com.sist.dao;
import java.util.*;
import java.sql.*;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
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
			conn=DriverManager.getConnection(URL,"hr","happy");
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
	 * 	= 사번은 있지만 이름이 다른 경우 => int에선 1 / String에선 NONAME
	 * 	= 사번도 있고 이름도 같은 경우 => int에선 2 / String에선 OK
	 * 	-------------------------- String / int
	 */
	public String memberLogin(int empno,String ename)
	{
		String result="";
		try
		{
			// 1) 연결
			getConnection();
			// 2) SQL 문장
			String sql="SELECT COUNT(*) "
						+"FROM emp "
						+"WHERE empno="+empno; // 사번이 존재하는지 확인 => 0 or 1
			// 3) 오라클로 SQL 문장 전송
			// 4) 결과값을 받는다
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
	
	// 2. 회원 가입 => 아이디 중복 체크 / 우편 번호 검색
	
	// 3. 회원 수정
	
	// 4. 회원 탈퇴
}
