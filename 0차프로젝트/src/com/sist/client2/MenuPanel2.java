package com.sist.client2;
import java.awt.GridLayout;

import javax.swing.*;

public class MenuPanel2 extends JPanel {
	public JButton b1,b2,b3,b4,b5,b6,b7;

	public MenuPanel2()
	{
		setLayout(new GridLayout(1,5,5,5));
		b1=new JButton("홈");
		b2=new JButton("로그인");
		b3=new JButton("검색");
		b4=new JButton("댓글");
		b5=new JButton("가격");
		b6=new JButton("서버");
		b7=new JButton("나가기");
		// 추가
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
	}
}
