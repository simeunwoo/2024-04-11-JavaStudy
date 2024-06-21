package com.sist.client;

import javax.swing.*;
import com.sist.dao.*;
import java.awt.*;
import java.awt.event.*;

public class EmpInsetPanel extends JPanel {
	JComboBox<Integer> cbDeptno;
	Integer[] deptno = {10, 20, 30, 40, 50};
    JLabel enola, enamela, jobla, salla, hiredatela, performancela, dnamela, locla, dnola;
    JTextField enola2, enamela2, hiredatela2, performancela2, dnamela2, locla2, dnola2;
    JTextField saltf, jobtf,enotf;
    JButton list, update, check;
    JLabel tLa;
    EmpMemberDAO dao;

    public EmpInsetPanel() {
    	
        dao = EmpMemberDAO.newInstance();
        setLayout(null);
        tLa = new JLabel("사원 상세 정보", JLabel.CENTER);
        tLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
        tLa.setBounds(10, 45, 1260, 40);
        add(tLa);

        enola = new JLabel("사번", JLabel.RIGHT);
        enola.setBounds(350, 110, 90, 30);
        add(enola);

        enotf = new JTextField();
        enotf.setBounds(465, 110, 110, 30);
        add(enotf);
        

        check = new JButton("확인");
        check.setBounds(570, 110, 80, 30);
        add(check);
        
        enamela = new JLabel("이름", JLabel.RIGHT);
        enamela.setBounds(350, 160, 90, 30);
        add(enamela);

        enamela2 = new JTextField();
        enamela2.setBounds(465, 160, 200, 30);
        enamela2.setEditable(false);
        add(enamela2);

        jobla = new JLabel("직위", JLabel.RIGHT);
        jobla.setBounds(350, 200, 90, 30);
        add(jobla);

        jobtf = new JTextField();
        jobtf.setBounds(465, 200, 200, 30);
        add(jobtf);

        salla = new JLabel("연봉", JLabel.RIGHT);
        salla.setBounds(350, 240, 90, 30);
        add(salla);

        saltf = new JTextField();
        saltf.setBounds(465, 240, 70, 30);
        add(saltf);

        hiredatela = new JLabel("입사일", JLabel.RIGHT);
        hiredatela.setBounds(350, 280, 90, 30);
        add(hiredatela);

        hiredatela2 = new JTextField();
        hiredatela2.setBounds(465, 280, 200, 30);
        add(hiredatela2);

        dnola = new JLabel("부서번호", JLabel.RIGHT);
        dnola.setBounds(350, 360, 90, 30);
        add(dnola);
        
        cbDeptno = new JComboBox<Integer>(deptno);
        cbDeptno.setBounds(465, 360, 80, 30);
        add(cbDeptno);
        

        dnamela = new JLabel("부서", JLabel.RIGHT);
        dnamela.setBounds(350, 400, 90, 30);
        add(dnamela);
        
        dnamela2 = new JTextField();
        dnamela2.setEditable(false);
        dnamela2.setBounds(465, 400, 450, 30);
        add(dnamela2);

        locla = new JLabel("근무지", JLabel.RIGHT);
        locla.setBounds(350, 440, 90, 30);
        locla2 = new JTextField();
        locla2.setEditable(false);
        locla2.setBounds(465, 440, 450, 30);
        add(locla);
        add(locla2);

        list = new JButton("취소");
        update = new JButton("등록");

        JPanel p = new JPanel();
        p.add(list);
        p.add(update);

        p.setBounds(350, 500, 565, 50);
        add(p);

    }

}