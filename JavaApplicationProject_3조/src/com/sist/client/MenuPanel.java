
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuPanel extends JPanel{
	JButton homeBtn ,findSBtn, findBBtn, chatBtn ,exitBtn,commBtn;
	public MenuPanel() {
		setLayout(new GridLayout(1,6,5,5)); // 가로
		// setLayout(new GridLayout(6,1,5,5)); // 세로
		homeBtn = new JButton("홈");
		findSBtn = new JButton("사원검색");
		findBBtn = new JButton("부서목록");
		chatBtn = new JButton("실시간 채팅");
		commBtn = new JButton("커뮤니티");
		exitBtn = new JButton("나가기");
		
		add(homeBtn); add(findSBtn); add(findBBtn);
		add(chatBtn);  add(commBtn); add(exitBtn);
		
		
	}
}
