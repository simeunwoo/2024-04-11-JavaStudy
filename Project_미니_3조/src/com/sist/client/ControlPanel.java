package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	CardLayout card=new CardLayout();
	ReviewPanel rp;
	ReviewInsertPanel rip;
	ReviewDetailPanel rdp;
	ReviewDeletePanel rdelp;
	ReviewUpdatePanel rup;
	
	public ControlPanel()
	{
		setLayout(card);
		
		rip = new ReviewInsertPanel(this);
		rdp = new ReviewDetailPanel(this);
		rp = new ReviewPanel(this);
		rdelp=new ReviewDeletePanel(this);
		rup=new ReviewUpdatePanel(this);
		
		add("RP",rp);
		add("RIP",rip);
		add("RDP",rdp);
		add("RDELP",rdelp);
		add("RUP",rup);

	}

}
