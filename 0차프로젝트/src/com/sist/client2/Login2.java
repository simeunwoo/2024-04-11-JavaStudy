package com.sist.client2;

import javax.swing.*;
public class Login2 extends JFrame {

	public JLabel la1, la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1, b2;
	

	public Login2()
	{
		setTitle("로그인");
		// 초기화
		la1=new JLabel("ID");
		la2=new JLabel("PWD");
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");

		setLayout(null);
		la1.setBounds(10, 15, 80, 30);
		tf.setBounds(100, 15, 200, 30);
		
		add(la1); add(tf);
		
		la2.setBounds(10, 55, 80, 30);
		pf.setBounds(100, 55, 200, 30);
		
		add(la2); add(pf);
		
		JPanel p=new JPanel();
		p.add(b1); p.add(b2);
		
		p.setBounds(10, 95, 290, 35);
		add(p);
		
		setSize(400, 175);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		}catch(Exception ex) {}
		
		new Login2();
	}

}
