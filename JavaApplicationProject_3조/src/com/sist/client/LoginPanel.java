package com.sist.client;

import java.awt.*;
import javax.swing.*;
public class LoginPanel extends JPanel{
	Image back;
	JLabel idLa , pwdLa;
	JTextField tf;
	JPasswordField pf;
	JButton loginBtn , joinBtn , cancelBtn;
	
	public LoginPanel() {
		back = Toolkit.getDefaultToolkit().getImage("c:\\project_image\\back.jpg");
		
		idLa = new JLabel("아이디",JLabel.RIGHT);
		pwdLa = new JLabel("비밀번호",JLabel.RIGHT);
		tf = new JTextField();
		pf = new JPasswordField();
		
		loginBtn = new JButton("로그인");
		joinBtn = new JButton("회원가입");
		cancelBtn = new JButton("종료");
		
		//배치
		setLayout(null);
		idLa.setBounds(450 , 490 , 80 , 30);
		tf.setBounds(535 , 490 , 180 , 30);
		add(idLa); add(tf);
		
		pwdLa.setBounds(450 , 525 , 80 , 30);
		pf.setBounds(535 , 525 , 180 , 30);
		add(pwdLa); add(pf);
		
		JPanel p = new JPanel();
		p.add(loginBtn);
		p.add(joinBtn);
		p.add(cancelBtn);
		p.setOpaque(false);

		p.setBounds(490 , 560 , 265 , 35);
		add(p);
	}
	
	// 스킨 => 이미지 배경 => 
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(),this);
	}
	
}