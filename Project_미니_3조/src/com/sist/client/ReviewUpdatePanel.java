package com.sist.client;
import java.util.*;
import javax.swing.*;

import com.sist.dao.BoardDAO;
import com.sist.dao.BoardVO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ReviewUpdatePanel extends JPanel implements ActionListener{

    JLabel titleLa,subLa,contentLa,recomLa,pwdLa;
    JTextField subtf;
    JPasswordField pwdpf;
    JTextArea ta;
    JComboBox<String> box;
    JButton b1,b2;
    ControlPanel cp;
    BoardDAO dao;
    int no=0;
    /*
    타이틀
    제목
    내용
    사원 추천하기
     */
    public ReviewUpdatePanel(ControlPanel cp)
    {
    	this.cp=cp;
    	dao=BoardDAO.newInstance();
    	
    	setLayout(null);
    	titleLa=new JLabel("제품 후기",JLabel.CENTER);
    	titleLa.setFont(new Font("휴먼모음T",Font.BOLD,35));
    	titleLa.setBounds(175, 50, 930, 40);
    	add(titleLa);
    	
    	subLa=new JLabel("제목",JLabel.RIGHT);
    	subLa.setBounds(250, 118, 90, 30);
    	add(subLa);
    	
    	subtf=new JTextField();
    	subtf.setBounds(365, 120, 550, 30);
    	add(subtf);
    	
    	recomLa=new JLabel("사원 추천하기",JLabel.RIGHT);
    	recomLa.setBounds(250, 600, 90, 30);
    	add(recomLa);
    	
    	box=new JComboBox();
    	box.addItem("");
    	box.setBounds(365, 600, 90, 30);
    	add(box);
    	
    	contentLa=new JLabel("내용",JLabel.RIGHT);
    	contentLa.setBounds(250, 160, 90, 30);
    	add(contentLa);
    	
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	js.setBounds(365, 165, 550, 420);
    	add(js);
    	
    	pwdLa=new JLabel("비밀 번호",JLabel.CENTER);
    	pwdpf=new JPasswordField();
    	pwdLa.setBounds(250, 640, 80, 30);
    	pwdpf.setBounds(365, 640, 150, 30);
    	add(pwdLa);add(pwdpf);
    	
    	b1=new JButton("수정 완료");
    	b1.setBounds(765, 600, 150, 30);
    	add(b1);
    	
    	b2=new JButton("취소");
    	b2.setBounds(1065, 600, 150, 30);
    	add(b2);
    	
    	setSize(1280, 720);
    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			String subject=subtf.getText();
			if(subject.length()<1) // NOT NULL => 강제로 입력 => 웹 (유효성 검사 => 자바스크립트)
			{
				subtf.requestFocus();
				return;
			}
			String content=ta.getText();
			if(content.length()<1)
			{
				ta.requestFocus();
				return;
			}
			
			// 데이터를 모아서 DAO로 전송
			BoardVO vo=new BoardVO();
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setNo(no);
			
			// 데이터베이스 연동
			boolean bCheck=dao.boardUpdate(vo);
			// 이동
			if(bCheck==true)
			{
				JOptionPane.showMessageDialog(this, "수정이 완료되었습니다");
				cp.rdp.print(no);
				cp.card.show(cp, "RDP");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "비밀 번호가 틀립니다\n다시 입력하세요");
				pwdpf.setText("");
				pwdpf.requestFocus();
			}
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "RDP");
		}
	}
}