package com.sist.client;
// 윈도우 창 띄우기
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class PostFindFrame extends JFrame {
	JTextField tf;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	
	public PostFindFrame()
	{
		setLayout(new BorderLayout());
		
		tf=new JTextField(15);
		b1=new JButton("검색");
		b2=new JButton("취소");
		JPanel p=new JPanel();
		p.add(tf); p.add(b1); p.add(b2);
		add("North",p);
		
		String[] col={"우편 번호","주소"};
		String[][] row=new String[0][2];
		model=new DefaultTableModel(row,col)
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		add("Center",js);
		
		setSize(450, 300);
//		setVisible(true); // 시작하자마자 동시에 뜨므로 => 우편 번호 검색 버튼(jp.b2) 검색 시에 뜨기 위하여 설정하지 않는다
	}
}
