
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
   BoardDetailPanel bdp;
   ChatPanel chatP=new ChatPanel();
   // 웹에서 => 화면 변경 => Controller
   /*
    * 	처리 : Model
    * 	화면 : View
    * 	화면 변경 : Controller => MVC
    * 
    * 	최근 => Spring MVC가 사라졌다 => 프레임워크가 사라졌다 ㅋ
    */
   public ControllPanel() // 화면을 변경해주는 역할
   {
	   setLayout(card);
	   //add("EP",ep);
	   hp=new HomePanel(this);
	   dp=new GoodsDetailPanel(this);
	   fp=new FindPanel(this);
	   bp=new BoardListPanel(this);
	   bip=new BoardInsertPanel(this);
	   bdp=new BoardDetailPanel(this);
	   add("HP",hp);
	   add("CHAT",chatP);
	   add("DP",dp);
	   add("FP",fp);
	   add("LIST",bp);
	   add("INSERT",bip);
	   add("DETAIL",bdp);
	   
	  
   }
}
