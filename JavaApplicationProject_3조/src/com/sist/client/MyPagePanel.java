package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import com.sist.commons.*;
import com.sist.dao.*;
import java.util.List;
import java.util.*;
import java.net.*;

public class MyPagePanel extends JPanel{
    JLabel titleLa;
    JTable table;
    DefaultTableModel model;
    GoodsDAO dao;
    ControllPanel cp;
    
    public MyPagePanel(ControllPanel cp)
    {
    	this.cp=cp;
    	dao=GoodsDAO.newInstance();
    	titleLa=new JLabel("장바구니",JLabel.CENTER);// <table>
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30));
    	setLayout(null);
    	titleLa.setBounds(70, 15, 700, 50);
    	
    	add(titleLa);
    	
    	String[] col={"번호","상품명","","구매 가격","수량"};
    	Object[][] row=new Object[0][5];
    	model=new DefaultTableModel(row,col)
    	{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
    		
    	};
    	table=new JTable(model);
    	JScrollPane js=new JScrollPane(table);
    	
    	js.setBounds(70, 75, 800, 400);
    	add(js);
    	print();
    }
    public void print()
    {
    	String id=cp.cMain.myId;
    	List<CartVO> list=dao.cartSelect(id);
    	
    	for(int i=model.getRowCount()-1;i>=0;i--)
    	{
    		model.removeRow(i);
    	}
    	for(CartVO vo:list)
    	{
    		try
    		{
    			URL url=new URL(vo.getGvo().getGoods_poster());
    			Image img=ImageChange.getImage(new ImageIcon(url), 45, 45);
    			Object[] data= {
    				vo.getCno(),
    				vo.getGvo().getGoods_name(),
    				new ImageIcon(img),
    				vo.getPrice(),
    				vo.getAccount()
    			};
    			model.addRow(data);
    		}catch(Exception ex) {}
    		
    	}
    }
}