package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.client.ReviewBoard;
import com.sist.client.ReviewBoardSystem;
import com.sist.dao.BoardVO;
import com.sist.dao.GoodsDAO;

// import com.sist.commons.Function;
// import com.sist.dao.*;

// 네트워크 연결 
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class ClientMain extends JFrame implements ActionListener,MouseListener,Runnable {
    CardLayout card=new CardLayout();
    ControlPanel cp=new ControlPanel();
    ReviewPanel rp=new ReviewPanel(cp);
    ReviewInsertPanel rip=new ReviewInsertPanel(cp);
    ReviewUpdatePanel rup=new ReviewUpdatePanel(cp);
    ReviewDeletePanel rdelp=new ReviewDeletePanel(cp);
    ReviewDetailPanel rdp=new ReviewDetailPanel(cp);
    
    ReviewBoard rb=new ReviewBoard();
    ReviewBoardSystem rbs=new ReviewBoardSystem(cp);
    
    GoodsDAO gdao;
    
    // 네트워크에 필요한 객체
    Socket s; // 통신기기 => 핸드폰 
    OutputStream out; // 서버로 전송 
    BufferedReader in; // 서버로부터 값을 받는다 
    
    String myId;
    
    int curpage=1;
    int totalpage=0;
    
    public ClientMain()
    {
    	setLayout(null);
    	add("RP",cp);
    	cp.setBounds(0, 0, 1280, 720);

    	
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	
    	setSize(1280,720);
    	setVisible(true);
    	
    	listPrint();
    	
    	cp.rp.prevBtn.addActionListener(this);
    	cp.rp.nextBtn.addActionListener(this);
    	cp.rp.insertBtn.addActionListener(this);
    	cp.rp.table.addMouseListener(this);
    	
    }
    
    public void listPrint()
    {
    	// 테이블 전체를 한번 지운다
    	for(int i=rp.model.getRowCount()-1;i>=0;i--)
    	{
    		rp.model.removeRow(i);
    	}
    	
    	ArrayList<ReviewBoard> list=rbs.boardList(curpage);
    	totalpage=rbs.boardTotalPage();
    	rp.pageLa.setText(curpage+" page / "+totalpage+" pages");
    	for(int i=0;i<list.size();i++) // 최신 => 가장 위로 올린다.
    	{
    		ReviewBoard b=list.get(i);
    		String[] data={
    			String.valueOf(b.getBno()),
    			b.getTitle(),
    			b.getId(),
    			new SimpleDateFormat("yyyy-MM-dd").format(b.getRegdate()),
    			String.valueOf(b.getHit())
    		};
    		rp.model.addRow(data);
    	}
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
        new ClientMain();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.rp.table)
		{
			if(e.getClickCount()==2)
			{
				// 선택된 위치 
				int row=cp.rp.table.getSelectedRow();
				String no=cp.rp.model.getValueAt(row, 0).toString();
				ReviewBoard b=rbs.boardDetail(Integer.parseInt(no));
				cp.rdp.id.setText(b.getId());
				cp.rdp.day.setText(new SimpleDateFormat("yyyy-MM-dd").format(b.getRegdate()));
				cp.rdp.hit.setText(String.valueOf(b.getHit()));
				cp.rdp.sub.setText(b.getTitle());
				cp.rdp.ta.setText(b.getContent());
				// 화면 이동 
				cp.card.show(cp, "RDP");
/*
     JLabel id,day,hit,sub;
     JTextArea ta;				
 */
		/*
		아이디 / 작성일
		조회수
		제목 / 내용
		 */
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.rp.prevBtn)
		{
			if(curpage>1)
			{
				curpage--;
				listPrint();
			}
		}
		else if(e.getSource()==cp.rp.nextBtn)
		{
		    if(curpage<totalpage)
		    {
		    	curpage++;
		    	listPrint();
		    }
		}
		else if(e.getSource()==cp.rp.insertBtn)
		{
			GoodsDAO gdao=new GoodsDAO();
			rip.subtf.setText("");
			rip.ta.setText("");
			rip.subtf.requestFocus();
			cp.card.show(cp, "RIP");
		}
	}

}