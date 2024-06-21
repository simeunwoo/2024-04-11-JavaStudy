package com.sist.dao;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	public static MemberDAO dao;
	private final String URL = "jdbc:oracle:thin:@192.168.10.124:1521:XE";

	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {}
	}

	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr3", "happy");
		}catch(Exception e) {}
	}

	public void disConnection() {
		try {
			if(conn != null) conn.close();
			if(ps != null) ps.close();
		} catch (Exception e) {
		}
	}

	public static MemberDAO newInstance() {
		if(dao == null)
			dao = new MemberDAO();
		return dao;
	}

	public boolean checkId(String id) {
		boolean bCheck = false;
		try {
			getConnection();
			String sql = "SELECT COUNT(*) FROM member WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			if(rs.getInt(1) == 0) 
				bCheck = true;
			else
				bCheck = false;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
		return bCheck;
	}
	
	public String getId(int no) {
		String result = "";
		try {
			getConnection();
			String sql = "SELECT COUNT(*) FROM member WHERE empno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			rs.next();
			if(rs.getInt(1) == 0) {
				result = "NONE";
				rs.close();
			}
			else {
				rs.close();
				sql = "SELECT name FROM member where empno = ?";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, no);
				rs = ps.executeQuery();
				rs.next();
				result = rs.getString(1);
				System.out.println(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
		System.out.println(result);
		return result;
	}
	
	public DeptVO getDept(int deptno) {
		DeptVO vo = new DeptVO();
		try {
			getConnection();
			String sql = "SELECT dname, loc FROM dept WHERE deptno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, deptno);
			ResultSet rs = ps.executeQuery();
			rs.next();
			vo.setDname(rs.getString(1));
			vo.setLoc(rs.getString(2));
			vo.setDeptno(deptno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
		return vo;
	}


	public String memberLogin(String id, String pwd) {
		String result = "";
		try {
			getConnection();
			String sql = "SELECT COUNT(*) FROM member WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			rs.close();
			if(count == 0) {
				result = "NO ID";
			}
			else {
				sql = "SELECT pwd, admin FROM member WHERE id = ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				rs = ps.executeQuery();
				rs.next();
				String pwd_temp = rs.getString(1);


				if(pwd_temp.equals(pwd)) {
					result = rs.getString(2);
				}
				else {
					result = "NO PWD";
				}
				rs.close();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			disConnection();
		}
		return result;
	}

	public String[] getEmp() {
		ArrayList<String> list1 = new ArrayList<String>();

		try {
			getConnection();
			String sql = "SELECT ename, empno FROM emp";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list1.add(rs.getInt(2) + ". " + rs.getString(1));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
		String[] list2 = list1.toArray(new String[list1.size()]);

		return list2;
	}

	public void updatePerformance(int empno, int stack) {
		try {
			getConnection();
			String sql = "UPDATE emp SET PERFORMANCE = PERFORMANCE + ? WHERE empno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, stack);
			ps.setInt(2, empno);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
	}

	public void memberInsert(MemberVO vo)
	{
		try
		{
			getConnection();
			System.out.println(vo.getId() + "check");
			String sql="INSERT INTO member VALUES(?,?,?,?,?,?,?,?,?,?,?,'n')";
			ps=conn.prepareStatement(sql);
			// ?에 값을 채운다 
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPwd());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getSex());
			ps.setString(5, vo.getPhone());

			ps.setString(6, vo.getPost());
			ps.setString(7, vo.getAddr1());
			ps.setString(8, vo.getAddr2());
			ps.setString(9, vo.getEmail());
			ps.setString(10, vo.getBirthday());
			ps.setInt(11, vo.getEmpno());

			// 추가 요청 
			ps.executeUpdate();// commit() 포함 => INSERT / UPDATE / DELETE 
			// executeQuery() => 데이터를 가지고 온다 => SELECT

		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
	}
	public MemberVO memberInfo(String id)
	{
		MemberVO vo=new MemberVO();
		try
		{
			getConnection();
			String sql="SELECT id,name,sex,admin,empno "
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
			vo.setEmpno(rs.getInt(5));
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

}