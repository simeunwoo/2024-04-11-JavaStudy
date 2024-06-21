
package com.sist.client;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// detail.jsp
import javax.swing.*;

import com.sist.dao.BoardDAO;
import com.sist.dao.BoardVO;
import com.sist.dao.GoodsDAO;
import com.sist.dao.GoodsVO;
public class BoardDetailPanel extends JPanel{
	JLabel titleLa,idLa,dayLa,hitLa,subLa,recomLa;
	JLabel id,day,hit,sub;
	JTextField recom;
	JTextArea ta;
	JButton b1,b2;
	BoardDAO dao;
	GoodsDAO gdao;

	int no=0;
	/*
아이디 / 작성일
조회수
제목 / 내용
	 */
	public BoardDetailPanel()
	{
		dao=BoardDAO.newInstance();
		gdao=GoodsDAO.newInstance();

		titleLa=new JLabel("제품 후기",JLabel.CENTER);
		titleLa.setFont(new Font("휴먼모음T",Font.BOLD,35));
		setLayout(null);
		titleLa.setBounds(175, 50, 930, 40);
		add(titleLa);

		idLa=new JLabel("아이디",JLabel.CENTER);
		idLa.setOpaque(true);
		idLa.setBackground(new Color(207,255,229));
		idLa.setBounds(410, 100 , 80, 30);
		id=new JLabel("",JLabel.LEFT);
		id.setBounds(500, 100, 150, 30);
		add(idLa);add(id);

		recomLa=new JLabel("제품",JLabel.CENTER);
		recomLa.setOpaque(true);
		recomLa.setBackground(new Color(207,255,229));
		recomLa.setBounds(665, 100 , 80, 30);
		recom=new JTextField("",JLabel.LEFT);
		recom.setBounds(715, 100, 400, 30);
		recom.setEditable(false);
		add(recomLa);add(recom);

		dayLa=new JLabel("작성일",JLabel.CENTER);
		dayLa.setOpaque(true);
		dayLa.setBackground(new Color(207,255,229));
		dayLa.setBounds(410, 135 , 80, 30);
		day=new JLabel("",JLabel.LEFT);
		day.setBounds(500, 135, 150, 30);
		add(dayLa);add(day);

		hitLa=new JLabel("조회수",JLabel.CENTER);
		hitLa.setOpaque(true);
		hitLa.setBackground(new Color(207,255,229));
		hitLa.setBounds(665, 135 , 40, 30);
		hit=new JLabel("",JLabel.LEFT);
		hit.setBounds(715, 135, 120, 30);
		add(hitLa);add(hit);

		subLa=new JLabel("제목",JLabel.CENTER);
		subLa.setOpaque(true);
		subLa.setBackground(new Color(207,255,229));
		subLa.setBounds(410, 170 , 80, 30);
		sub=new JLabel("");
		sub.setBounds(500, 170, 400, 30);
		add(subLa);add(sub);

		ta=new JTextArea();
		ta.setEditable(false); // 비활성화 
		ta.setBounds(410, 205, 460, 250);
		add(ta);

		b1=new JButton("수정");
		b2=new JButton("목록으로");
		b1.setBounds(700, 500, 100, 35);
		b2.setBounds(810, 500, 100, 35);
		add(b1); add(b2);


	}
	public void print(int no)
	{
		this.no = no;
		BoardVO vo=dao.boardDetailData(no);
		// 	this.no.setText(String.valueOf(vo.getNo()));
		id.setText(vo.getId());
		sub.setText(vo.getTitle());
		hit.setText(String.valueOf(vo.getHit()));
		day.setText(vo.getRegdate().toString());
		ta.setText(vo.getContent());
		System.out.println(vo.getGvo().getGoods_name());
		recom.setText(vo.getGvo().getGoods_name());
	}


}