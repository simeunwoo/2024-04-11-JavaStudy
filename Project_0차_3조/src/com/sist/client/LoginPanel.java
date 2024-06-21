package com.sist.client;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel{
	Image back;
	JLabel laId, laPwd;
	public JButton btnClose, btnSignUp, btnLogin;
	public JTextField tfId;
	public JPasswordField pfPwd;
	public JRadioButton rbEmp, rbNemp;				// 일반회원 사원 구분
	ButtonGroup bgSignUp;
	public LoginPanel() {
		setLayout(null);
		
		back = Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\back.jpg");
		
		laId = new JLabel("ID", JLabel.RIGHT);
		laPwd = new JLabel("PWD", JLabel.RIGHT);
		
		tfId = new JTextField();
		
		pfPwd = new JPasswordField();
		
		btnLogin = new JButton("로그인");
		btnClose = new JButton("종료");
		btnSignUp = new JButton("회원가입");
		btnLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
		btnSignUp.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
		btnClose.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
		
		rbEmp = new JRadioButton("사원");
		rbNemp = new JRadioButton("일반 회원");
		rbEmp.setContentAreaFilled(false);
		rbNemp.setContentAreaFilled(false);
		rbNemp.setSelected(true);
		
		bgSignUp = new ButtonGroup();
		bgSignUp.add(rbEmp); bgSignUp.add(rbNemp);
		
		laId.setBounds(445, 400, 80, 30);
		tfId.setBounds(535, 400, 200, 30);
		
		add(laId); add(tfId);
		
		laPwd.setBounds(445, 440, 80, 30);
		pfPwd.setBounds(535, 440, 200, 30);
		add(laPwd); add(pfPwd);
		
		rbEmp.setBounds(580, 480, 60, 30);
		rbNemp.setBounds(655, 480, 80, 30);
		add(rbEmp); add(rbNemp);
		
		btnLogin.setBounds(475, 520, 80, 30);
		btnSignUp.setBounds(565, 520, 80, 30);
		btnClose.setBounds(655, 520, 80, 30);
		
		add(btnLogin); add(btnSignUp); add(btnClose);
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
	
}