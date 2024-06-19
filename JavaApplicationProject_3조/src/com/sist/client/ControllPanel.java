
package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
   CardLayout card=new CardLayout();
   //EmpListPanel ep=new EmpListPanel();
   HomePanel hp;
   GoodsDetailPanel dp;
   FindPanel fp;
   BoardListPanel bp;
   BoardInsertPanel bip;
   ChatPanel chatP=new ChatPanel();
   public ControllPanel()
   {
	   setLayout(card);
	   //add("EP",ep);
	   hp=new HomePanel(this);
	   dp=new GoodsDetailPanel(this);
	   fp=new FindPanel(this);
	   bp=new BoardListPanel(this);
	   bip=new BoardInsertPanel(this);
	   add("HP",hp);
	   add("CHAT",chatP);
	   add("DP",dp);
	   add("FP",fp);
	   add("LIST",bp);
	   add("INSERT",bip);
	   
	  
   }
}
