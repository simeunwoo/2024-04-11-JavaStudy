package com.sist.client;
import javax.swing.*;

import com.sist.dao.BoardDAO;
import com.sist.dao.GoodsDAO;
import com.sist.dao.GoodsVO;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardInsertPanel extends JPanel {

    JLabel titleLa,subLa,contentLa,recomLa;
    JTextField subtf;
    JTextArea ta;
    JComboBox<String> box;
    JButton b1,b2;
    BoardDAO dao;
    GoodsDAO gdao;
    /*
    타이틀
    제목
    내용
    사원 추천하기
     */
    public BoardInsertPanel()
    {
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
    	
    	
    	
    	contentLa=new JLabel("내용",JLabel.RIGHT);
    	contentLa.setBounds(250, 210, 90, 30);
    	add(contentLa);
    	
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	js.setBounds(365, 210, 550, 300);
    	add(js);
    	
    	b1=new JButton("입력 완료");
    	b1.setBounds(765, 530, 150, 30);
    	add(b1);
    	
    	b2=new JButton("취소");
    	b2.setBounds(920, 530, 150, 30);
    	add(b2);
    	
    	
    }
    public void printBox(String id) {
    	gdao=GoodsDAO.newInstance();
    	ArrayList<GoodsVO> list_temp = gdao.buyGoodsName(id);
    	ArrayList<String> list_ = new ArrayList<String>();
    	for(GoodsVO vo : list_temp) {
    		list_.add(vo.getNo() + ". " + vo.getGoods_name());
    	}
    	String[] list = list_.toArray(new String[list_.size()]);
    	box=new JComboBox(list);
    	box.setBounds(365, 120, 550, 30);
    	add(box);
    }
}