package com.sist.client;

import javax.swing.*;
import com.sist.dao.*;
import java.awt.*;
import java.awt.event.*;

public class EmpUpdatePanel extends JPanel implements ActionListener {
    JLabel enola, enamela, jobla, salla, hiredatela, performancela, dnamela, locla, dnola;
    JLabel enola2, enamela2, hiredatela2, performancela2, dnamela2, locla2, dnola2;
    JTextField saltf, jobtf;
    JButton list, update;
    JLabel tLa;
    ControlPanel cp; // 화면 이동
    EmpMemberDAO dao;

    public EmpUpdatePanel(ControlPanel cp) {
        dao = EmpMemberDAO.newInstance();
        this.cp = cp;
        setLayout(null);
        tLa = new JLabel("사원 상세 정보", JLabel.CENTER);
        tLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
        tLa.setBounds(10, 45, 1260, 40);
        add(tLa);

        enola = new JLabel("사번", JLabel.RIGHT);
        enola.setBounds(350, 110, 90, 30);
        add(enola);

        enola2 = new JLabel();
        enola2.setBounds(465, 110, 200, 30);
        add(enola2);

        enamela = new JLabel("이름", JLabel.RIGHT);
        enamela.setBounds(350, 160, 90, 30);
        add(enamela);

        enamela2 = new JLabel();
        enamela2.setBounds(465, 160, 200, 30);
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

        hiredatela2 = new JLabel();
        hiredatela2.setBounds(465, 280, 200, 30);
        add(hiredatela2);

        performancela = new JLabel("실적", JLabel.RIGHT);
        performancela.setBounds(350, 320, 90, 30);
        add(performancela);

        performancela2 = new JLabel();
        performancela2.setBounds(465, 320, 200, 30);
        add(performancela2);

        dnamela = new JLabel("부서", JLabel.RIGHT);
        dnamela.setBounds(350, 360, 90, 30);
        add(dnamela);

        dnamela2 = new JLabel();
        dnamela2.setBounds(465, 360, 450, 30);
        add(dnamela2);

        locla = new JLabel("근무지", JLabel.RIGHT);
        locla.setBounds(350, 400, 90, 30);
        add(locla);

        locla2 = new JLabel();
        locla2.setBounds(465, 400, 450, 30);
        add(locla2);

        dnola = new JLabel("부서번호", JLabel.RIGHT);
        dnola.setBounds(350, 440, 90, 30);
        add(dnola);

        dnola2 = new JLabel();
        dnola2.setBounds(465, 440, 450, 30);
        add(dnola2);

        list = new JButton("취소");
        update = new JButton("수정");

        JPanel p = new JPanel();
        p.add(list);
        p.add(update);

        p.setBounds(350, 500, 565, 50);
        add(p);

        list.addActionListener(this);
        update.addActionListener(this);
    }

    public void print(String no) {
		EmpVO vo = dao.empDetailData(no);
		this.enola2.setText(String.valueOf(vo.getEmpno()));
		enamela2.setText(vo.getEname());
		jobtf.setText(vo.getJob());
		saltf.setText(String.valueOf(vo.getSal()));
		hiredatela2.setText(vo.getHiredate().toString());
		performancela2.setText(String.valueOf(vo.getPerformance()));
		dnamela2.setText(vo.getDvo().getDname());
		locla2.setText(vo.getDvo().getLoc());
		dnola2.setText(String.valueOf(vo.getDvo().getDeptno()));
	}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == list) {
            cp.card.show(cp, "EDETAIL");
        } else if (e.getSource() == update) {
            try {
                String job = jobtf.getText().trim();
                if (job.length() < 1) {
                    JOptionPane.showMessageDialog(this, "직위를 입력해주세요.");
                    jobtf.requestFocus();
                    return;
                }

                String salStr = saltf.getText().trim();
                if (salStr.length() < 1) {
                    JOptionPane.showMessageDialog(this, "연봉을 입력해주세요.");
                    saltf.requestFocus();
                    return;
                }

                // 연봉이 숫자인지 확인
                int sal;
                try {
                    sal = Integer.parseInt(salStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "연봉은 숫자여야 합니다.");
                    saltf.requestFocus();
                    return;
                }

                
                
                String name = enamela2.getText();
                int eno = Integer.parseInt(enola2.getText());
                
                EmpVO vo = new EmpVO();
                vo.setEmpno(eno); // 사번 설정
                vo.setEname(name);
                vo.setSal(sal);
                vo.setJob(job);

                boolean bCheck = dao.empUpdate(vo);

                if (bCheck) {
                    JOptionPane.showMessageDialog(this, "수정이 완료되었습니다");
                    cp.eup.print(String.valueOf(vo.getEmpno()));
                    cp.edp.print(String.valueOf(vo.getEmpno()));
                    cp.fp.print();
                } else {
                    JOptionPane.showMessageDialog(this, "수정에 실패했습니다. 다시 시도해주세요.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "오류가 발생했습니다. 다시 시도해주세요.");
                ex.printStackTrace();
            }
        }
    }
}