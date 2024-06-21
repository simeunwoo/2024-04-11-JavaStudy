
package com.sist.dao;

import java.sql.*;
import java.util.ArrayList;

public class ZipDAO {
	// 오라클 연결
	private Connection conn;
	// SQL문장 전송
	private PreparedStatement ps;
	
	private static ZipDAO dao;
	
	private final String URL = "jdbc:oracle:thin:@192.168.10.124:1521:XE";
	
	// 드라이버 등록
	public ZipDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {}
	}
	
	// 싱글턴 패턴
	public static ZipDAO newInstance() {
		if(dao == null)
			dao = new ZipDAO();
		return dao;
	}
	
	// 오라클 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr3", "happy");
		} catch (Exception e) {}
	}
	
	//오라클 연결 해제
	public void disConnection() {
		try {
			if(ps != null)
				ps.close();
			if(conn != null)
				conn.close();
		} catch (Exception e) {}
	}
	
	public ArrayList<ZipVO> zipFind(String dong){
		ArrayList<ZipVO> list = new ArrayList<ZipVO>();
		String sql =  "SELECT zipcode, sido, gugun, dong, NVL(bunji, ' ') "
					+ "FROM zipcode "
					+ "WHERE dong like '%" + dong + "%'";
		try {
			getConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ZipVO z = new ZipVO();
				z.setZipcode(rs.getString(1));
				z.setSido(rs.getString(2));
				z.setGugun(rs.getString(3));
				z.setDong(rs.getString(4));
				z.setBunji(rs.getString(5));
				list.add(z);
			}
			rs.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
		return list;
	}
}
