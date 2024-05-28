package com.sist.user;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sist.model.*;
import java.util.*;

public class BoardMain extends JFrame {
	private CardLayout card=new CardLayout();
	BoardList bList=new BoardList();
	int curpage=1;
	int totalpage=0;
	public BoardMain()
	{
		setLayout(card);
		add("LIST",bList);
		setTitle("게시판 ver 1.0");
		setSize(640, 550);
		setVisible(true);
	}
	public void listPrint()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardMain();
	}

}
