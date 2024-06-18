package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class ReviewPanel extends JPanel {

	JButton prevBtn,nextBtn,updateBtn;
	JLabel pageLa,titleLa;
	JTable table;
	DefaultTableModel model;
	TableColumn column;
/*
번호, 제목, 아이디, 작성일, 조회수
 */
    public ReviewPanel()
    {
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
       	   			column.setPreferredWidth(50);
       	   		}
       	   		else if(i==1)
       	   		{
       	   			column.setPreferredWidth(350);
       	   		}
       	   		else if(i==2)
       	   		{
       	   			column.setPreferredWidth(100);
       	   		}
       	   		else if(i==3)
       	   		{
       	   			column.setPreferredWidth(150);
       	   		}
       	   		else if(i==4)
       	   		{
       	   			column.setPreferredWidth(50);
       	   		}
       	   	}
       	   	table.getTableHeader().setReorderingAllowed(false);
       	   	table.setShowVerticalLines(false);
       	   	table.setRowHeight(30);
       	   	table.getTableHeader().setBackground(Color.GREEN);
       	   	
        	setLayout(null);
        	titleLa.setBounds(370, 80, 620, 50);
        	add(titleLa);
        	js.setBounds(370, 190, 600, 330);
        	add(js);
        	updateBtn.setBounds(370, 140, 100, 35);
        	add(updateBtn);
        	
        	JPanel p=new JPanel();
        	p.add(prevBtn);
        	p.add(pageLa);
        	p.add(nextBtn);
        	
        	p.setBounds(370, 550, 600, 35);
        	add(p);
        	
        	setSize(960, 700);
        	
        	
    }
}
