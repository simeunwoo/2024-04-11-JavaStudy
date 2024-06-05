package com.sist.client;
import java.awt.*;
import javax.swing.*;

public class MenuPanel extends JPanel{
	JButton homeBtn,findBtn,boardBtn,chatBtn,newsBtn,exitBtn;
	public MenuPanel()
	{
		setLayout(new GridLayout(1,6,5,5)); // 1줄에 6개 버튼 설정 (가로)
	//	setLayout(new GridLayout(6,1,5,5)); // 세로로 1줄에 6개 버튼 설정 = 6줄에 1개씩 버튼 설정 (세로)
		homeBtn=new JButton("홈");
		findBtn=new JButton("맛집 검색");
		boardBtn=new JButton("커뮤니티");
		chatBtn=new JButton("실시간 채팅");
		newsBtn=new JButton("뉴스 검색");
		exitBtn=new JButton("나가기");
		
		add(homeBtn); // add의 순서를 맞추어야 한다 => 추가되는 순서대로 버튼이 들어오기 때문
		add(findBtn);
		add(boardBtn);
		add(chatBtn);
		add(newsBtn);
		add(exitBtn);
	}
}
