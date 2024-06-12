package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import com.sist.dao.*; // DAO로부터 오라클 연결을 위해 사용

public class ClientMain extends JFrame implements ActionListener {
	CardLayout card=new CardLayout();
	LoginPanel lp=new LoginPanel();
	MainPanel mp=new MainPanel();
	JoinPanel jp=new JoinPanel();
	PostFindFrame post=new PostFindFrame(); // 우편 번호 검색
	IdCheckFrame idfrm=new IdCheckFrame();
	SFindPanel sfp=new SFindPanel();
	
	public ClientMain()
	{
		setLayout(card);
		add("LOGIN",lp);
		add("MP",mp);
		add("JP",jp);
		add("SFP",sfp);
		
		setSize(1280,720);
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 오른쪽 위 X 창을 눌러도 나갈 수 없다
		
		lp.loginBtn.addActionListener(this); // 로그인
		lp.joinBtn.addActionListener(this); // 회원 가입
		lp.cancelBtn.addActionListener(this); // 종료
		
		jp.b1.addActionListener(this); // 아이디 중복 체크 버튼
		jp.b4.addActionListener(this); // 취소
		jp.b2.addActionListener(this); // 우편 번호 검색
		
		post.b1.addActionListener(this); // 우편 번호 검색
		post.b2.addActionListener(this); // 취소
		post.tf.addActionListener(this); // 우편 번호 입력 창 (우편 번호 검색 버튼 (post.b1)와 동시에 처리)
		
//		post.table.addMouseListener(this);
		
		idfrm.b1.addActionListener(this); // 아이디 체크
		idfrm.b2.addActionListener(this); // 확인
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
		else if(e.getSource()==jp.b1) // 아이디 중복 체크
		{
			idfrm.tf.setText("");
			idfrm.b2.setVisible(false);
			idfrm.la3.setText("");
			idfrm.setVisible(true);
		}
		else if(e.getSource()==idfrm.b1)
		{
			String id=idfrm.tf.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요."); // alert()
				idfrm.tf.requestFocus(); // tf.focus()
				return;
			}
			// 입력된 상태
			// 오라클 연결
			MemberDAO dao=MemberDAO.newInstance();
			int count=dao.memberIdCheck(id);
			
			if(count==0) // 아이디 중복이 없다
			{
				idfrm.la3.setText(id+" 는(은) 사용 가능한 아이디입니다.");
				idfrm.b2.setVisible(true);
			}
			else // 아이디 중복이 있다
			{
				idfrm.la3.setText(id+" 는(은) 이미 사용 중인 아이디입니다.");
				idfrm.b2.setVisible(false);
				idfrm.tf.setText("");
				idfrm.tf.requestFocus();
			}
		}
		else if(e.getSource()==idfrm.b2)
		{
			String id=idfrm.tf.getText();
			jp.idtf.setText(id);
			idfrm.setVisible(false);
		}
		else if(e.getSource()==post.b2)
		{
			post.setVisible(false);
		}
		else if(e.getSource()==post.b1 || e.getSource()==post.tf)
		{
			String dong=post.tf.getText();
			if(dong.length()<1) // 입력이 안된 경우
			{
				JOptionPane.showMessageDialog(this, "동/읍/면을 입력하세요.");
				post.tf.requestFocus();
				return;
			}
			
			MemberDAO dao=MemberDAO.newInstance();
			ArrayList<ZipcodeVO> list=dao.postFindData(dong);
			if(list.size()==0) // 검색 결과가 없는 경우
			{
				JOptionPane.showMessageDialog(this, "검색된 결과가 없습니다.");
				post.tf.setText("");
				post.tf.requestFocus();
			}
			else // 검색 결과가 있는 경우
			{
				for(int i=post.model.getRowCount()-1;i>=0;i--)
				{
					post.model.removeRow(i);
				}
				
				for(ZipcodeVO vo:list)
				{
					String[] data={vo.getZipcode(),vo.getAddress()};
					post.model.addRow(data);
				}
			}
		}
		else if(e.getSource()==jp.b2)
		{
			for(int i=post.model.getRowCount()-1;i>=0;i--)
			{
				post.model.removeRow(i);
			}
			post.tf.setText("");
			post.setVisible(true);
		}
		else if(e.getSource()==jp.b4)
		{
			card.show(getContentPane(), "LOGIN");
		}
		else if(e.getSource()==lp.joinBtn)
		{
			card.show(getContentPane(), "JP");
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
					card.show(getContentPane(), "SFP"); // 화면 변경
				}
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "-");
				return; // 메소드 종료
			}
		}
	}

}
