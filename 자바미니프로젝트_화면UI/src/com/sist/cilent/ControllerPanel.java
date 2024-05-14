package com.sist.cilent;
import java.awt.CardLayout;
import java.awt.Color;
// 기능별로 나눠서 처리 => 분업
import javax.swing.*;
public class ControllerPanel extends JPanel {
	public CardLayout card=new CardLayout();
	public HomePanel hp=new HomePanel();
	public FindPanel fp=new FindPanel();
	
	public ControllerPanel()
	{
		setLayout(card);
		add("HOME",hp); // 먼저 설정 시, 배경이 blue로 나옴
		add("FIND",fp); // 먼저 설정 시. 배경이 magenta로 나옴
	}
}

