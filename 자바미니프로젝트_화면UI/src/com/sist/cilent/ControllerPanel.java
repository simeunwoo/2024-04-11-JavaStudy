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
		setLayout(card); // setLayout : 컨테이너(ex) JFrame, JPanel ...)에 레이아웃 매니저를 설정하는데 사용되는 메서드
		add("HOME",hp); // 먼저 설정 시, 배경이 blue로 나옴
		add("FIND",fp); // 먼저 설정 시. 배경이 magenta로 나옴
	}
}

