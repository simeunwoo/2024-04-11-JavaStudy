package com.sist.client;
import java.util.*;
import javax.swing.*;

import com.sist.dao.BoardDAO;
import com.sist.dao.BoardVO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ReviewInsertPanel extends JPanel implements ActionListener {

    JLabel titleLa,subLa,contentLa,recomLa;
    JTextField subtf;
    JTextArea ta;
    JComboBox<String> box;
    JButton b1,b2;
    ControlPanel cp;
    BoardDAO dao;
    /*
    타이틀
    제목
    내용
    사원 추천하기
     */
    public ReviewInsertPanel(ControlPanel cp)
    {
    	this.cp=cp;
    	dao=BoardDAO.newInstance();
    	
    	setLayout(null);
    	titleLa=new JLabel("제품 후기",JLabel.CENTER);
    	titleLa.setFont(new Font("휴먼모음T",Font.BOLD,35));
    	titleLa.setBounds(175, 50, 930, 40);
    	add(titleLa);
    	
    	subLa=new JLabel("제목",JLabel.RIGHT);
    	subLa.setBounds(250, 165, 90, 30);
    	add(subLa);
    	
    	subtf=new JTextField();
    	subtf.setBounds(365, 165, 550, 30);
    	add(subtf);
    	
    	recomLa=new JLabel("제품",JLabel.RIGHT);
    	recomLa.setBounds(250, 120, 90, 30);
    	add(recomLa);
    	
    	box=new JComboBox();
    	box.addItem("");
    	box.setBounds(365, 120, 550, 30);
    	add(box);
    	
    	contentLa=new JLabel("내용",JLabel.RIGHT);
    	contentLa.setBounds(250, 210, 90, 30);
    	add(contentLa);
    	
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	js.setBounds(365, 210, 550, 420);
    	add(js);
    	
    	b1=new JButton("입력 완료");
    	b1.setBounds(765, 645, 150, 30);
    	add(b1);
    	
    	b2=new JButton("취소");
    	b2.setBounds(1065, 645, 150, 30);
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
			if(subject.length()<1)
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
			
			BoardVO vo=new BoardVO();
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setHit(0);
			
			dao.boardInsert(vo);
			
			cp.rp.print();
			cp.card.show(cp, "RP");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "RP");
		}
	}
}