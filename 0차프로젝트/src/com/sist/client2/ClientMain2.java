package com.sist.client2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClientMain2 extends JFrame implements ActionListener { // ActionListener : 인터페이스
	public MenuPanel2 mp=new MenuPanel2();
	public ControllerPanel2 cp=new ControllerPanel2();
	public ClientMain2()
	{
		setLayout(null);
		mp.setBounds(150, 15, 600, 50);
		add(mp);
		cp.setBounds(0, 50, 800, 530);
		add(cp);
		
		add("Center",cp);

		setSize(800,600);
		setVisible(true);

		setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b6.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		}catch(Exception ex) {}
		
		new ClientMain2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(mp.b1==e.getSource())
		{
			cp.card.show(cp, "HOME");
		}
		else if(mp.b2==e.getSource())
		{
			new Login2();
		}
		else if(mp.b6==e.getSource())
		{
			JOptionPane.showMessageDialog(this, "끝?");
			System.exit(0);
		}
	}

}
