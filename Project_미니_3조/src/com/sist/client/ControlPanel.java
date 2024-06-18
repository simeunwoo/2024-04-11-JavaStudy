package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	CardLayout card=new CardLayout();
	ReviewPanel rp;
	
	public ControlPanel()
	{
		setLayout(card);
		
		rp=new ReviewPanel();
		add("RP",rp);

	}

}
