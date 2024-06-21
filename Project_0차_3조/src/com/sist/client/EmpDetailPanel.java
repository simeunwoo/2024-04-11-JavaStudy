package com.sist.client;

import javax.swing.*;
import java.net.*;
import com.sist.dao.*;
import com.sist.common.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class EmpDetailPanel extends JPanel{
	JLabel enola, enamela, jobla, salla, hiredatela, performancela, dnamela, locla, dnola;
	JTextField enola2, enamela2, jobla2, salla2, hiredatela2, performancela2, dnamela2, locla2, dnola2;
	JButton list, update;
	JLabel pLa, tLa;
	EmpMemberDAO dao;

	public EmpDetailPanel() {
		dao = EmpMemberDAO.newInstance();
		setLayout(null);
    	tLa=new JLabel("사원 상세 정보",JLabel.CENTER);
    	tLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	tLa.setBounds(10, 45, 1260, 40);
    	add(tLa);
    	
    	enola=new JLabel("사번",JLabel.RIGHT);
    	enola.setBounds(350, 110, 90, 30);
    	add(enola);
    	
    	enola2=new JTextField();
    	enola2.setBounds(465, 110, 200, 30);
    	enola2.setEditable(false);
    	add(enola2);
    	
    	/////////////////////////////////////////////////////////////// id
    	
    	
    	enamela=new JLabel("이름",JLabel.RIGHT);
    	enamela.setBounds(350, 160, 90, 30);
    	add(enamela);
    	
    	enamela2=new JTextField();
    	enamela2.setEditable(false);
    	enamela2.setBounds(465, 160, 200, 30);
    	add(enamela2);
    	///////////////////////////////////////////////////////////////
    	
    	
    	jobla=new JLabel("직위",JLabel.RIGHT);
    	jobla.setBounds(350, 200, 90, 30);
    	add(jobla);
    	
    	jobla2=new JTextField();
    	jobla2.setEditable(false);
    	jobla2.setBounds(465, 200, 200, 30);
    	add(jobla2);
    	////////////////////////////////////////////////////////////////
    	
    	
    	salla=new JLabel("연봉",JLabel.RIGHT);
    	salla.setBounds(350, 240, 90, 30);
    	add(salla);
    	
    	salla2=new JTextField();
    	salla2.setEditable(false);
    	salla2.setBounds(465, 240, 70, 30);
    	add(salla2);
    	
    	/////////////////////////////////////////////////////////////
    	
    	hiredatela=new JLabel("입사일",JLabel.RIGHT);
    	hiredatela.setBounds(350, 280, 90, 30);
    	add(hiredatela);
    	
    	hiredatela2=new JTextField();
    	hiredatela2.setEditable(false);
    	hiredatela2.setBounds(465, 280, 200, 30);
    	add(hiredatela2);
    	///////////////////////////////////////////////////////////
    	
    	
    	performancela=new JLabel("실적",JLabel.RIGHT);
    	performancela.setBounds(350, 320, 90, 30);
    	add(performancela);
    	
    	performancela2=new JTextField();
    	performancela2.setEditable(false);
    	performancela2.setBounds(465, 320, 200, 30);
    	add(performancela2);
    	
    	////////////////////////////////////////////////////////////
    	
    	
    	dnamela=new JLabel("부서",JLabel.RIGHT);
    	dnamela.setBounds(350, 360, 90, 30);
    	add(dnamela);
    	
    	dnamela2=new JTextField();
    	dnamela2.setEditable(false);
    	dnamela2.setBounds(465, 360, 450, 30);
    	add(dnamela2);
    	
    	locla=new JLabel("근무지",JLabel.RIGHT);
    	locla.setBounds(350, 400, 90, 30);
    	add(locla);
    	
    	locla2=new JTextField();
    	locla2.setEditable(false);
    	locla2.setBounds(465, 400, 450, 30);
    	add(locla2);
    	///////////////////////////////////////////////////////////
    	
    	dnola=new JLabel("부서번호",JLabel.RIGHT);
    	dnola.setBounds(350, 440, 90, 30);
    	add(dnola);
    	
    	dnola2=new JTextField();
    	dnola2.setEditable(false);
    	
    	dnola2.setBounds(465, 440, 450, 30);
    	add(dnola2);
    	////////////////////////////////////////////////////////////
    	
    	
    	
    	list=new JButton("목록");
    	update=new JButton("수정");
    	
    	JPanel p=new JPanel();
    	p.add(list);p.add(update);
    	
    	p.setBounds(350, 500, 565, 50);
    	add(p);
    	//print(null);
    	
    	
    }

	public void print(String no) {
		EmpVO vo = dao.empDetailData(no);
		enola2.setText(String.valueOf(vo.getEmpno()));
		enamela2.setText(vo.getEname());
		jobla2.setText(vo.getJob());
		salla2.setText(String.valueOf(vo.getSal()));
		hiredatela2.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
		performancela2.setText(String.valueOf(vo.getPerformance()));
		dnamela2.setText(vo.getDvo().getDname());
		locla2.setText(vo.getDvo().getLoc());
		dnola2.setText(String.valueOf(vo.getDvo().getDeptno()));
	}
	



}