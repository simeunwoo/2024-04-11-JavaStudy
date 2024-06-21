package com.sist.client;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class JoinPanel extends JPanel{
	String[] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    JLabel tLa,iLa,pLa1,nLa,sLa,bLa,pLa,aLa1,aLa2,telLa,cLa,eLa,empLa,nnlabel,redLa;
    JTextField idtf,nametf, yeartf, daytf, posttf,addrtf1,addrtf2,teltf,emailtf,emptf;
    JTextArea cta;
    JButton b1,b2,b3,b4;
    JRadioButton rb1,rb2;
    JComboBox<String> box, monthbox;
    JPasswordField pf;
    
    public JoinPanel()
    {
    	setLayout(null);
    	tLa=new JLabel("회원 가입",JLabel.CENTER);
    	tLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	tLa.setBounds(10, 45, 1260, 40);
    	add(tLa);
    	
    	redLa = new JLabel("*");
    	redLa.setOpaque(true);
    	redLa.setForeground(new Color(255, 0, 0));
    	redLa.setBounds(397, 110, 5, 30);
    	add(redLa);
    	
    	iLa=new JLabel("아이디",JLabel.RIGHT);
    	iLa.setBounds(350, 110, 90, 30);
    	add(iLa);
    	
    	idtf=new JTextField();
    	idtf.setBounds(465, 110, 200, 30);
    	add(idtf);
    	
    	b1=new JButton("아이디 중복체크");
    	
    	b1.setBounds(670, 110, 150, 30);
    	add(b1);
    	/////////////////////////////////////////////////////////////// id
    	
    	redLa = new JLabel("*");
    	redLa.setOpaque(true);
    	redLa.setForeground(new Color(255, 0, 0));
    	redLa.setBounds(385, 160, 5, 30);
    	add(redLa);
    	
    	pLa1=new JLabel("비밀번호",JLabel.RIGHT);
    	pLa1.setBounds(350, 160, 90, 30);
    	add(pLa1);
    	
    	pf=new JPasswordField();
    	pf.setBounds(465, 160, 200, 30);
    	add(pf);
    	///////////////////////////////////////////////////////////////
    	redLa = new JLabel("*");
    	redLa.setOpaque(true);
    	redLa.setForeground(new Color(255, 0, 0));
    	redLa.setBounds(410, 200, 5, 30);
    	add(redLa);
    	
    	nLa=new JLabel("이름",JLabel.RIGHT);
    	nLa.setBounds(350, 200, 90, 30);
    	add(nLa);
    	
    	nametf=new JTextField();
    	nametf.setBounds(465, 200, 200, 30);
    	add(nametf);
    	////////////////////////////////////////////////////////////////
    	redLa = new JLabel("*");
    	redLa.setOpaque(true);
    	redLa.setForeground(new Color(255, 0, 0));
    	redLa.setBounds(410, 240, 5, 30);
    	add(redLa);
    	
    	sLa=new JLabel("성별",JLabel.RIGHT);
    	sLa.setBounds(350, 240, 90, 30);
    	add(sLa);
    	
    	rb1=new JRadioButton("남자");
    	rb1.setBounds(465, 240, 70, 30);
    	add(rb1);
    	
    	rb2=new JRadioButton("여자");
    	rb2.setBounds(540, 240, 70, 30);
    	add(rb2);
    	
    	ButtonGroup bg=new ButtonGroup();
    	bg.add(rb1); bg.add(rb2);
    	
    	
    	rb1.setSelected(true);
    	/////////////////////////////////////////////////////////////
    	
    	telLa=new JLabel("전화",JLabel.RIGHT);
    	telLa.setBounds(350, 280, 90, 30);
    	add(telLa);
    	
    	box=new JComboBox();
    	box.addItem("010");
    	box.setBounds(465, 280, 90, 30);
    	add(box);
    	
    	teltf=new JTextField();
    	teltf.setBounds(570, 280, 200, 30);
    	add(teltf);
    	///////////////////////////////////////////////////////////
    	redLa = new JLabel("*");
    	redLa.setOpaque(true);
    	redLa.setForeground(new Color(255, 0, 0));
    	redLa.setBounds(385, 320, 5, 30);
    	add(redLa);
    	
    	pLa=new JLabel("우편번호",JLabel.RIGHT);
    	pLa.setBounds(350, 320, 90, 30);
    	add(pLa);
    	
    	posttf=new JTextField();
    	posttf.setBounds(465, 320, 200, 30);
    	add(posttf);
    	
    	posttf.setEnabled(false);
    	posttf.setHorizontalAlignment(JLabel.CENTER);
    	
    	b2=new JButton("우편번호 검색");
    	
    	b2.setBounds(670, 320, 150, 30);
    	add(b2);
    	////////////////////////////////////////////////////////////
    	redLa = new JLabel("*");
    	redLa.setOpaque(true);
    	redLa.setForeground(new Color(255, 0, 0));
    	redLa.setBounds(410, 360, 5, 30);
    	add(redLa);
    	
    	aLa1=new JLabel("주소",JLabel.RIGHT);
    	aLa1.setBounds(350, 360, 90, 30);
    	add(aLa1);
    	
    	addrtf1=new JTextField();
    	addrtf1.setBounds(465, 360, 450, 30);
    	addrtf1.setEditable(false);
    	add(addrtf1);
    	
    	aLa2=new JLabel("상세주소",JLabel.RIGHT);
    	aLa2.setBounds(350, 400, 90, 30);
    	add(aLa2);
    	
    	addrtf2=new JTextField();
    	addrtf2.setBounds(465, 400, 450, 30);
    	add(addrtf2);
    	///////////////////////////////////////////////////////////
    	redLa = new JLabel("*");
    	redLa.setOpaque(true);
    	redLa.setForeground(new Color(255, 0, 0));
    	redLa.setBounds(397, 440, 5, 30);
    	add(redLa);
    	
    	eLa=new JLabel("이메일",JLabel.RIGHT);
    	eLa.setBounds(350, 440, 90, 30);
    	add(eLa);
    	
    	emailtf=new JTextField();
    	emailtf.setBounds(465, 440, 450, 30);
    	add(emailtf);
    	////////////////////////////////////////////////////////////
    	redLa = new JLabel("*");
    	redLa.setOpaque(true);
    	redLa.setForeground(new Color(255, 0, 0));
    	redLa.setBounds(385, 480, 5, 30);
    	add(redLa);
    	
    	bLa=new JLabel("생년월일",JLabel.RIGHT);
    	add(bLa);
    	
    	monthbox = new JComboBox<String>(month);
    	yeartf = new JTextField();
		daytf = new JTextField();
		
		bLa.setBounds(350, 480, 90, 30);
		yeartf.setBounds(450, 480, 50, 30);
		monthbox.setBounds(510, 480, 50, 30);
		daytf.setBounds(570, 480, 50, 30);
		
		add(yeartf); add(monthbox); add(daytf);
    	////////////////////////////////////////////////////////////
    	empLa=new JLabel("사번",JLabel.RIGHT);
    	empLa.setBounds(350, 520, 90, 30);
    	add(empLa);
    	
    	emptf=new JTextField();
    	emptf.setBounds(465, 520, 200, 30);
    	add(emptf);
    	
    	

    	
    	nnlabel = new JLabel("*는 필수 입력란입니다");
    	nnlabel.setOpaque(true);
    	nnlabel.setForeground(new Color(255, 0, 0));
    	nnlabel.setFont(new Font("궁서",Font.BOLD,10));
    	nnlabel.setBounds(1000, 50, 200, 30);
    	add(nnlabel);
    	
    	b3=new JButton("회원가입");
    	b4=new JButton("취소");
    	
    	JPanel p=new JPanel();
    	p.add(b3);p.add(b4);
    	
    	p.setBounds(350, 590, 565, 35);
    	add(p);
    	
    }
    
    public static void main(String[] args) {
		new JoinPanel();
	}
}