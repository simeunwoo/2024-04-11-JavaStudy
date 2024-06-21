
package com.sist.client;

import java.awt.Font;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PostFindFrame extends JFrame{
	public JLabel lTitle, lHelp;
	public JTextField tfAddress;
	public JTable table;
	public DefaultTableModel model;
	public JButton btn1;
	public PostFindFrame() {
		lTitle = new JLabel("우편번호 찾기", JLabel.CENTER);
		lHelp = new JLabel("찾는 동을 입력해주세요");
		
		tfAddress = new JTextField();
		
		String[] col = {"우편번호", "주소"};
		String[][] row = new String[0][2];
		model = new DefaultTableModel(row, col){
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		
		setLayout(null);
		setSize(600, 450);
		
		btn1 = new JButton("검색");
		
		lTitle.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		lTitle.setBounds(0, 10, 600, 45);
		
		lHelp.setBounds(20, 70, 450, 30);
		
		add(lTitle); add(lHelp);
		
		tfAddress.setBounds(20, 110, 390, 30);
		btn1.setBounds(430, 110, 120, 30);
		
		add(tfAddress); add(btn1);
		
		js.setBounds(10, 150, 570, 255);
		add(js);
	}
}
