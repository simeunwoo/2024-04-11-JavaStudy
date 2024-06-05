package com.sist.client;
import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
	Image back;
	JLabel idLa,pwdLa;
	JTextField tf;
	JPasswordField pf;
	JButton loginBtn,joinBtn,cancelBtn;
	
	public LoginPanel()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\project_image\\back.jpg"); // 사진 가져오기
		
		idLa=new JLabel("아이디",JLabel.RIGHT);
		pwdLa=new JLabel("비밀 번호",JLabel.RIGHT);
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		loginBtn=new JButton("로그인");
		joinBtn=new JButton("회원 가입");
		cancelBtn=new JButton("취소");
		
		// 배치
		setLayout(null); // 사용자 정의
		
		idLa.setBounds(650, 555, 80, 30);
		tf.setBounds(735, 555, 180, 30);
		add(idLa); add(tf);

		pwdLa.setBounds(650, 590, 80, 30);
		pf.setBounds(735, 590, 180, 30);
		add(pwdLa); add(pf);

		JPanel p=new JPanel();
		p.add(loginBtn);
		p.add(joinBtn);
		p.add(cancelBtn);
		
		p.setOpaque(false); // 불투명 => false : 투명 모드로 교체
		p.setBounds(650, 620, 265, 35);
		add(p);
	}

	// 오버라이딩 : paintComponent => 스킨 => 이미지 배경
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}
	
}
