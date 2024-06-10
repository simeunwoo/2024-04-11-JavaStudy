package com.sist.dao;
import java.util.*;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

import java.sql.*;

public class EmpDeptDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static EmpDeptDAO dao; // 싱글턴 (데이터베이스가 있으면 무조건 싱글턴이 있다)
	
	// 1. 드라이버 등록
	public EmpDeptDAO()
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
	public static EmpDeptDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDeptDAO();
		return dao; // null이 아니면 기존에 저장된 dao를 전송, null이면 새로 dao를 전송
	}
	
	// 기능 설정
	// 1. emp, dept 데이터 출력 (웹, 윈도우) => DAO 변경이 없다
	// 2. DAO / VO는 변경 사항이 없다
	public ArrayList<EmpVO> empListData()
	{
		ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			getConnection();
			String sql="SELECT empno,ename,job,hiredate,dname,loc "
						+"FROM emp,dept "
						+"WHERE emp.deptno=dept.deptno";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.getDvo().setDname(rs.getString(5));
				vo.getDvo().setLoc(rs.getString(6));
				
				list.add(vo);
			}
		}catch(Exception ex)
		{
			
		}
		finally
		{
			
		}
		return list;
	}
}
