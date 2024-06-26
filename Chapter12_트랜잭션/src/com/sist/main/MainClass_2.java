package com.sist.main;
import java.sql.*;
/*
 * 	INSERT / UPDATE / DELETE가 여러개 동시에 수행될 때
 * 	------------------------- 일괄 처리 (트랜잭션)
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,"hr","happy");
			conn.setAutoCommit(false);
			// SQL
			conn.commit();
		}catch(Exception ex)
		{
			try
			{
				conn.rollback();
			}catch(Exception x) {}
		}
		finally
		{
			try
			{
				conn.setAutoCommit(true);
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}catch(Exception ex) {}
		}
	}

}
