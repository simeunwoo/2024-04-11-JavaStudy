package com.sist.client;
import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel {
	MenuPanel mp=new MenuPanel();
	ControlPanel cp=new ControlPanel();
//	EmpListPanel ep=new EmpListPanel();
	SFindPanel sfp=new SFindPanel();
	
	public MainPanel()
	{
		setLayout(new BorderLayout());
		add("North",mp);
		add("Center",cp);
	}
}
