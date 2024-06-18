
package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
   CardLayout card=new CardLayout();
   //EmpListPanel ep=new EmpListPanel();
   HomePanel hp;
   GoodsDetailPanel dp;
   ChatPanel chatP=new ChatPanel();
   public ControllPanel()
   {
	   setLayout(card);
	   //add("EP",ep);
	   hp=new HomePanel(this);
	   dp=new GoodsDetailPanel(this);
	   add("HP",hp);
	   add("CHAT",chatP);
	   add("DP",dp);
	   
	  
   }
}
