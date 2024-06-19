package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import com.sist.dao.BoardDAO;

public class ReviewPanel extends JPanel {

	JButton prevBtn,nextBtn,updateBtn;
	JLabel pageLa,titleLa;
	JTable table;
	DefaultTableModel model;
	TableColumn column;
    ControlPanel cp;
    BoardDAO dao;
/*
번호, 제목, 아이디, 작성일, 조회수
 */
    public ReviewPanel(ControlPanel cp)
    {
    	this.cp=cp;
    	dao=BoardDAO.newInstance();
    	
    	prevBtn=new JButton("이전");
    	nextBtn=new JButton("다음");
    	updateBtn=new JButton("작성하기");
    	pageLa=new JLabel("0 page / 0 pages");
    	titleLa=new JLabel("제품 후기 게시판 목록",JLabel.CENTER);
    	titleLa.setFont(new Font("휴먼모음T",Font.BOLD,45));
    	
    	String[] col={"번호","제목","아이디","작성일","조회수"};
    	String[][] row=new String[0][5];
    	
       	model=new DefaultTableModel(row,col)
       	{

       		@Override
       		public boolean isCellEditable(int row, int column) {
       		// TODO Auto-generated method stub
       		return false;
       		}
       
       	};
       	    	
       	   	table=new JTable(model); // 테이블 모양 관리 
       	   	JScrollPane js=new JScrollPane(table);
       	   	for(int i=0;i<col.length;i++)
       	   	{
       	   		column=table.getColumnModel().getColumn(i);
       	   		if(i==0)
       	   		{
       	   			column.setPreferredWidth(125);
       	   		}
       	   		else if(i==1)
       	   		{
       	   			column.setPreferredWidth(875);
       	   		}
       	   		else if(i==2)
       	   		{
       	   			column.setPreferredWidth(250);
       	   		}
       	   		else if(i==3)
       	   		{
       	   			column.setPreferredWidth(305);
       	   		}
       	   		else if(i==4)
       	   		{
       	   			column.setPreferredWidth(125);
       	   		}
       	   	}
       	   	table.getTableHeader().setReorderingAllowed(false);
       	   	table.setShowVerticalLines(false);
       	   	table.setRowHeight(50);
       	   	table.getTableHeader().setBackground(new Color(207,255,229));
       	   	
        	setLayout(null);
        	titleLa.setBounds(340, 80, 620, 50);
        	add(titleLa);
        	js.setBounds(170, 210, 900, 390);
        	add(js);
        	updateBtn.setBounds(170, 160, 100, 35);
        	add(updateBtn);
        	
        	JPanel p=new JPanel();
        	p.add(prevBtn);
        	p.add(pageLa);
        	p.add(nextBtn);
        	
        	p.setBounds(370, 610, 600, 35);
        	add(p);
        	
        	setSize(1280, 720);
        	
        	
    }
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
