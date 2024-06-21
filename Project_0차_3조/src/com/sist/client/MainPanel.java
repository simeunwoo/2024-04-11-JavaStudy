
package com.sist.client;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	ControlPanel cp = new ControlPanel();
	MenuPanel mp = new MenuPanel();
	public MainPanel() {
		setLayout(null);
		mp.setBounds(0, 15, 1280, 30);
		cp.setBounds(0, 50, 1280, 650);
		add(mp);
		add(cp);
	}
}
