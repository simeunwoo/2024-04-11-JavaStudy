package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GoodsDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@192.168.10.124:1521:XE";
	private static GoodsDAO dao; // 싱글턴 

	// 1. 드라이버 등록 
	public GoodsDAO()
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
			// conn hr/happy
		}catch(Exception ex) {}
	}
	// 3. 오라클 해제 
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	// 4. 싱글턴 => 한사람당 한개의 DAO만 사용할수 있게 만든다 => 메모리 누수현상을 제거 
	public static GoodsDAO newInstance()
	{
		if(dao==null)
			dao=new GoodsDAO();
		return dao;// null이 아니면 기존에 저장된 dao를 전송 
	}
	public ArrayList<GoodsVO> goodsListData(int page)
	{
		ArrayList<GoodsVO> list=new ArrayList<GoodsVO>();
		try
		{
			getConnection();
			String sql="SELECT no,goods_name,goods_poster,goods_price,num "
					+"FROM (SELECT no,goods_name,goods_poster,goods_price,rownum as num "
					+"FROM (SELECT no,goods_name,goods_poster,goods_price "
					+"FROM goods_all ORDER BY no ASC)) "
					+"WHERE num BETWEEN ? AND ?";
			ps=conn.prepareStatement(sql);
			int rowSize=12;
			int start=(rowSize * page) - (rowSize - 1);
			int end=rowSize * page;
			ps.setInt(1, start);
			ps.setInt(2, end);

			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				GoodsVO vo=new GoodsVO();
				vo.setNo(rs.getInt(1));
				vo.setGoods_name(rs.getString(2));
				vo.setGoods_poster(rs.getString(3));
				vo.setGoods_price(rs.getString(4));
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
	public int goodsTotalPage() {
		int total = 0;
		try {
			getConnection();
			String sql = "SELECT CEIL(COUNT(*) / 12.0) FROM goods_all";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.next();
			total = rs.getInt(1);
		} catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			disConnection();
		}
		return total;
	}
	public GoodsVO goodsDetailData(int no) {
		GoodsVO vo = new GoodsVO();
		try {
			getConnection();
			/*String sql = "UPDATE goods_all SET hit = hit + 1 WHERE no = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ps.executeUpdate();*/

			String sql = "SELECT no, goods_name, goods_sub, goods_price, goods_discount"
					+ ", goods_first_price, goods_delivery, goods_poster "
					+ "FROM goods_all "
					+ "WHERE no = ?";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();
			rs.next();
			vo.setNo(rs.getInt(1));
			vo.setGoods_name(rs.getString(2));
			vo.setGoods_sub(rs.getString(3));
			vo.setGoods_price(rs.getString(4));
			vo.setGoods_discount(rs.getInt(5));
			vo.setGoods_first_price(rs.getString(6));
			vo.setGoods_delivery(rs.getString(7));
			vo.setGoods_poster(rs.getString(8));
			rs.close();

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			disConnection();
		}
		return vo;
	}
	public ArrayList<GoodsVO> goodsFindData(String name)
    {
   	 ArrayList<GoodsVO> list=new ArrayList<GoodsVO>();
   	 try
   	 {
   		 getConnection();
   		 String sql="SELECT no,goods_name,goods_poster,goods_price "
   				   +"FROM goods_all "
   				   +"WHERE goods_name LIKE '%'||?||'%' "
   				   +"ORDER BY no ASC";
   		 ps=conn.prepareStatement(sql);
   		 ps.setString(1, name);
   		 
   		 ResultSet rs=ps.executeQuery();
   		 while(rs.next())
   		 {
   			 GoodsVO vo=new GoodsVO();
   			 vo.setNo(rs.getInt(1));
   			 vo.setGoods_name(rs.getString(2));
   			 vo.setGoods_poster(rs.getString(3));
   			 vo.setGoods_price(rs.getString(4));
   			 
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
	
	public void ordersInsert(String id, int goods_id) {
		try {
			getConnection();
			String sql = "INSERT INTO orders VALUES(ORDERS_SEQ.nextval, ?, ?, SYSDATE)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setInt(2, goods_id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
	}
}