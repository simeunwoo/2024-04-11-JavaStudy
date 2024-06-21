package com.sist.client;

import com.sist.dao.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class FindPanel extends JPanel{
	JTable table;
	DefaultTableModel model;
	JTextField tf;
	JButton b;
	EmpMemberDAO dao;
	TableColumn column;
	String[] option = {"부서명", "사원명", "직위"};
	JComboBox<String> cb;
	
	public FindPanel() {
		dao = EmpMemberDAO.newInstance();
		
		setLayout(null); // 위아래 배치(North,South) // 똑같은거여러개 => Grid // 내가 지정하기 null
		tf = new JTextField(20);
		b = new JButton("검색");
		cb = new JComboBox<String>(option);
		
		JPanel p =new JPanel();
		p.add(cb);
		p.add(tf);
		p.add(b);
		p.setBounds(390, 20, 500, 30);
		add(p);
		
		String[] col = {"사번", "이름", "직위", "연봉", "입사일", "부서명", "근무지", "실적"};
		Object[][] row = new Object[0][8];
		
		model = new DefaultTableModel(row,col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(model);
		table.setRowHeight(35);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false); // Vertical
		JScrollPane js = new JScrollPane(table);
		js.setBounds(70, 60, 1100, 500);
		add(js);
		
		for (int i = 0; i < col.length; i++) {
			column = table.getColumnModel().getColumn(i);
			if(i==0) 
				column.setPreferredWidth(30);
			else if(i==1)
				column.setPreferredWidth(100);
			else if(i==2)
				column.setPreferredWidth(500);
			else if(i==3)
				column.setPreferredWidth(150);
		}
		
		
		
	}

}