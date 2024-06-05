package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class SFindPanel extends JPanel {

	JButton inBtn,prevBtn,nextBtn;
	JLabel pageLa,titleLa;
	JTable table;
	DefaultTableModel model;
	TableColumn column;
	    
    public SFindPanel()
    {
    	inBtn=new JButton("새 글");//<input type=button value="새글">
    	prevBtn=new JButton("이전");
    	nextBtn=new JButton("다음");
    	pageLa=new JLabel("0 page / 0 pages"); //<label>0 page / 0 pages</label>
    	titleLa=new JLabel("사원목록",JLabel.CENTER);// <table>
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	
    	String[] col={"번호","제목","이름","작성일","조회수"};//<tr><th></th>....</tr>
    	String[][] row=new String[0][5];
    	
       	model=new DefaultTableModel(row,col) // 데이터 관리
       	{

       		@Override
       		public boolean isCellEditable(int row, int column) {
       		// TODO Auto-generated method stub
       		return false;
       		}
       	    		 // 익명의 클래스 => 포함 클래스 => 상속없이 오버라이딩 => 클릭 => 편집기 => 편집방지 
       	    		 
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
       	   	table.getTableHeader().setBackground(Color.MAGENTA);
       	   	
        	setLayout(null);
        	titleLa.setBounds(10, 15, 620, 50);
        	add(titleLa);
        	inBtn.setBounds(10, 70, 100, 30);
        	add(inBtn);
        	js.setBounds(10, 110, 600, 330);
        	add(js);
        	
        	JPanel p=new JPanel();
        	p.add(prevBtn);
        	p.add(pageLa);
        	p.add(nextBtn);
        	
        	p.setBounds(10, 450, 600, 35);
        	add(p);
    }
}
