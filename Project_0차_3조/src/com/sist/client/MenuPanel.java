package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuPanel extends JPanel{
    JButton homeBtn,findBtn,boardBtn,chatBtn,empBtn,myBtn,exitBtn, searchBtn, insertBtn;
    public MenuPanel()
    {
    	setLayout(null);
    	setSize(1280, 30);
    	//setLayout(new GridLayout(6,1,5,5));
    	insertBtn = new JButton("사원 등록");
    	homeBtn = new JButton("홈"); // 쇼핑몰
    	empBtn=new JButton("사원목록"); // 1명
    	findBtn=new JButton("사원검색"); // 1명
    	searchBtn = new JButton("제품검색");
    	boardBtn=new JButton("게시판"); // 1명
    	chatBtn=new JButton("실시간 채팅"); // 2명
    	exitBtn=new JButton("나가기");
    	//myBtn=new JButton("마이페이지");
    	
    	exitBtn.setBounds(1100, 0, 150, 30);
    	chatBtn.setBounds(945, 0, 150, 30);
    	boardBtn.setBounds(790, 0, 150, 30);
    	findBtn.setBounds(635, 0, 150, 30);
    	searchBtn.setBounds(635, 0, 150, 30);
    	homeBtn.setBounds(480, 0, 150, 30);
    	empBtn.setBounds(480, 0, 150, 30);
    	insertBtn.setBounds(10, 0, 150, 30);
    	
    	add(insertBtn);
    	add(homeBtn);
    	add(empBtn);
    	add(searchBtn);
    	add(findBtn);
    	add(boardBtn);
    	add(chatBtn);
    	//add(myBtn);
    	add(exitBtn);
    	
    	insertBtn.setVisible(false);
    }
}