package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.sist.dao.*; // DAO로부터 오라클 연결을 위해 사용

public class ClientMainPanel extends JFrame implements ActionListener {
	CardLayout card=new CardLayout();
	LoginPanel lp=new LoginPanel();
	MainPanel mp=new MainPanel();
	JoinPanel jp=new JoinPanel();
	SFindPanel sfp=new SFindPanel();
	
	public ClientMainPanel()
	{
		setLayout(card);
		add("LOGIN",lp);
		add("JP",jp);
		add("SFP",sfp);
		add("MP",mp);
		
		setSize(1280,720);
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 오른쪽 위 X 창을 눌러도 나갈 수 없다
		
		lp.loginBtn.addActionListener(this); // 로그인
		lp.joinBtn.addActionListener(this); // 회원 가입
		lp.cancelBtn.addActionListener(this); // 종료
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtatto.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new ClientMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==lp.cancelBtn)
		{
			dispose(); // 윈도우 메모리 해제
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource()==lp.loginBtn)
		{
			// 입력한 사번과 이름을 가지고 온다
			try
			{
				String id=lp.tf.getText();
				if(id.length()<1)
				{
					JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
					lp.tf.requestFocus();
					return;
				}
//				String name=lp.pf.getText(); // getText()에 밑줄 그어진 거 => 사용하지 말라는 경고 표시이다 (주석 처리하지 않았을 때 볼 수 있다)
				String pwd=String.valueOf(lp.pf.getPassword());
				if(pwd.length()<1)
				{
					JOptionPane.showMessageDialog(this, "비밀 번호를 입력하세요.");
					lp.pf.requestFocus();
					return;
				}
				// 오라클 연결
				MemberDAO dao=MemberDAO.newInstance();
				String result=dao.memberLogin(id, pwd);
				// 웹 => 자바스크립트로 처리
				if(result.equals("NOID")) // 아이디가 틀린 경우
				{
					JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다.");
					lp.tf.setText("");
					lp.pf.setText("");
					lp.tf.requestFocus();
				}
				else if(result.equals("NOPWD")) // 비밀 번호가 틀린 경우
				{
					JOptionPane.showMessageDialog(this, "비밀 번호가 틀립니다.");
					lp.pf.setText("");
					lp.pf.requestFocus();					
				}
				else // 로그인
				{
					System.out.println("로그인 완료");
					card.show(getContentPane(), "JP"); // 화면 변경
				}
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "-");
				return; // 메소드 종료
			}
		}
	}

}
