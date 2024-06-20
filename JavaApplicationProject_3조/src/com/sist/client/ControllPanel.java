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
   BoardDeletePanel bdelp;
   BoardUpdatePanel bup;
   MyPagePanel mpp;
   ChatPanel chatp=new ChatPanel();
   // 웹에서 => 화면 변경 => Controller 
   /*
    *    처리 : Model 
    *    화면 : View 
    *    화면변경 : Controller ==> MVC
    *    
    *    최근 => Spring MVC가 사라졌다
    *          ----------- JSP 
    *                      ThymeLeaf / Vue / React => HTML
    */
   ClientMain cMain;
   public ControllPanel(ClientMain cm)
   {
	   cMain=cm;
	   setLayout(card);
	   //add("EP",ep);
	   hp=new HomePanel(this);
	   chatp=new ChatPanel();
	   dp=new GoodsDetailPanel(this);
	   fp=new FindPanel(this);
	   bp=new BoardListPanel(this);
	   bip=new BoardInsertPanel(this);
	   bdp=new BoardDetailPanel(this);
	   bdelp=new BoardDeletePanel(this);
	   bup=new BoardUpdatePanel(this);
	   mpp=new MyPagePanel(this);
	   add("HP",hp);
	   add("CHAT",chatp);
	   add("DP",dp);
	   add("FP",fp);
	   add("LIST",bp);
	   add("INSERT",bip);
	   add("DETAIL",bdp);
	   add("DELETE",bdelp);
	   add("UPDATE",bup);
	   add("MYPAGE",mpp);
   }
}