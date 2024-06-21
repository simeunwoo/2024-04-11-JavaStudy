package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.*;
import com.sist.dao.*;
import java.text.*;
import java.util.Date;

// 사번의 정보를 출력 => 조인 
public class EmpListPanel extends JPanel{
	JLabel titleLa,titleLa2;
	JTable table, table2;
	DefaultTableModel model, model2;
	JButton b1, b2;
	int curpage = 1;
	int totalpage = 0;
	EmpMemberDAO dao;
	

	public EmpListPanel() {
		setLayout(null);
		dao.newInstance();
		titleLa = new JLabel("사원 정보", JLabel.CENTER);
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		titleLa.setBounds(10, 15, 930, 40);
		add(titleLa);

		
		String[] col = { "사번", "이름", "직위", "연봉", "입사일", "부서명", "근무지", "실적" };
		String[][] row = new String[0][8];
		model = new DefaultTableModel(row, col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(10, 65, 910, 500);
		add(js);

		// 데이터 첨부
		EmpMemberDAO dao = EmpMemberDAO.newInstance();
		ArrayList<EmpVO> list = dao.empListData();

		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

		for (EmpVO vo : list) {
			String formattedDate = "";
			try {
				Date date = inputFormat.parse(vo.getHiredate());
				formattedDate = outputFormat.format(date);
			} catch (ParseException e) {
				e.printStackTrace();
				formattedDate = vo.getHiredate(); // 변환 실패 시 원래 문자열 사용
			}

			String[] data = { String.valueOf(vo.getEmpno()), vo.getEname(), vo.getJob(), String.valueOf(vo.getSal()),
					formattedDate, vo.getDvo().getDname(), vo.getDvo().getLoc(), String.valueOf(vo.getPerformance()) };
			model.addRow(data);

			///////////////////////////////////////////////////////////////////// 실적순위

			titleLa2 = new JLabel("실적 순위", JLabel.RIGHT);
			titleLa2.setFont(new Font("맑은 고딕", Font.BOLD, 35));
			titleLa2.setBounds(10, 15, 1100, 40);
			add(titleLa2);
			
			
			ArrayList<EmpVO> list2 = dao.empRankData();

			String[] col2 = { "사번", "이름", "부서명", "실적" };
			String[][] row2 = new String[0][4];
			model2 = new DefaultTableModel(row2, col2) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			table2 = new JTable(model2);
			JScrollPane js2 = new JScrollPane(table2);
			js2.setBounds(920, 65, 250, 500);
			
			add(js2);

			for (EmpVO vo2 : list2) {

				String[] data2 = { String.valueOf(
						vo2.getEmpno()), 
						vo2.getEname(), 
						vo2.getDvo().getDname(),
						String.valueOf(vo2.getPerformance()) 
						};
				model2.addRow(data2);

			}
		}
	}

}