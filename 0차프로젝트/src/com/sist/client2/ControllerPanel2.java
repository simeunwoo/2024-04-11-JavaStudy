package com.sist.client2;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControllerPanel2 extends JPanel {
	public CardLayout card=new CardLayout();
	public HomePanel2 hp=new HomePanel2();
	public FindPanel2 fp=new FindPanel2();
	
	public ControllerPanel2()
	{
		setLayout(card);
		add("HOME",hp);
	}
}

