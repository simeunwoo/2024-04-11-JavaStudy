package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	CardLayout card=new CardLayout();
	ReviewPanel rp;
	ReviewInsertPanel rip;
	ReviewDetailPanel rdp;
	
	public ControlPanel()
	{
		setLayout(card);
		
		rip = new ReviewInsertPanel();
		rdp = new ReviewDetailPanel();
		rp = new ReviewPanel();
		
		add("RP",rp);
		add("RIP",rip);
		add("RDP",rdp);

	}

}
