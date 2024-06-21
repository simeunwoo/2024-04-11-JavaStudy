package com.sist.client;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ControlPanel extends JPanel{
	public GoodsDetailPanel dp;
	public HomePanel hp;
	public EmpListPanel ep;
	public FindPanel fp;
	public CardLayout card = new CardLayout();
	public ChatPanel cp;
	public SearchPanel sp;
	BoardListPanel blp;
	BoardInsertPanel bip;
	BoardDetailPanel bdp;
	BoardUpdatePanel bup;
	EmpDetailPanel edp;
	public ControlPanel(){
		fp = new FindPanel();
		hp = new HomePanel(this);
		dp = new GoodsDetailPanel(this);
		ep = new EmpListPanel();
		cp = new ChatPanel();
		sp = new SearchPanel(this);
		blp = new BoardListPanel();
		bip = new BoardInsertPanel();
		bdp = new BoardDetailPanel();
		bup = new BoardUpdatePanel();
		edp = new EmpDetailPanel();
		setLayout(card);
		add("HOME", hp);
		add("DETAIL", dp);
		add("LIST", ep);
		add("FIND", fp);
		add("CHAT", cp);
		add("SEARCH", sp);
		add("BLIST", blp);
		add("BINSERT", bip);
		add("BDETAIL", bdp);
		add("BUPDATE", bup);
		add("EDETAIL", edp);
	}
	
}