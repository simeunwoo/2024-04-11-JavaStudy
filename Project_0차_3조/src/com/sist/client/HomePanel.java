package com.sist.client;

import javax.swing.*;
import javax.swing.border.LineBorder;

import com.sist.dao.*;
import java.awt.*;
import java.awt.event.*;

import com.sist.common.*;
import java.util.*;
import java.net.*;

public class HomePanel extends JPanel implements ActionListener,MouseListener{
    JPanel pan=new JPanel(); // 12개 이미지 출력 
    //JPanel panplus=new JPanel();
    JButton b1,b2; // 이전 , 다음 
    JLabel pagename;
    JLabel la=new JLabel("0 page / 0 pages");	//페이지 확인 라벨
    JLabel[] imgs=new JLabel[16];			// 미리보기 이미지 라벨 
    //JLabel[] titles=new JLabel[12];
    
    int curpage=1; // 현재 페이지 
    int totalpage=0; // 총페이지 
    // 데이터베이스 연결
    GoodsDAO dao;
    // 초기화 
    ControlPanel cp;
    public HomePanel(ControlPanel cp)
    {
    	setLayout(null);
    	pagename=new JLabel("상품 페이지", JLabel.CENTER);				//페이지 제목
    	Font titlefont=new Font("맑은 고딕", Font.BOLD, 35);			//페이지 제목 폰트 설정
    	pagename.setFont(titlefont);								//페이지 제목 폰트 적용
    	pagename.setForeground(Color.PINK);
    	
    	this.cp=cp;
    	dao=GoodsDAO.newInstance();
    	pan.setLayout(new GridLayout(4,4,3,3));
    	//panplus.setLayout(new GridLayout(4,3,3,30));
    	
    	setLayout(new BorderLayout());
    	add("North", pagename);
    	add("Center", pan);
    	b1=new JButton("이전");
    	b2=new JButton("다음");
    	JPanel p=new JPanel();
    	p.add(b1);p.add(la);p.add(b2);
    	add("South",p);
    	print();
    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	
    }
    public void print()
    {
    	totalpage=dao.goodsTotalPage();
    	ArrayList<GoodsVO> list=dao.goodsListData(curpage);
    	for(int i=0;i<list.size();i++)
    	{
    		GoodsVO vo=list.get(i);
    		try
    		{
    			URL url=new URL(vo.getGoods_poster());					// 제품 화면
    			Image img=ImageChange.getImage(new ImageIcon(url), 160, 120);			// 이미지 크기 축소 
    			imgs[i]=new JLabel(new ImageIcon(img));			// 이미지 미리보기 아이콘
    			imgs[i].setToolTipText("제품명 : "+vo.getGoods_name()+" 가격 : "+vo.getGoods_price()+" 조회수 : "+vo.getHit()+" - No."+vo.getNo());
    			//imgs[i].setText(vo.getGoods_name());
				
    			//titles[i]=new JLabel();
    			//titles[i].setText(vo.getGoods_name());
    			
    			//panplus.setLayout(new BorderLayout());
    			//panplus.add(imgs[i], BorderLayout.NORTH);
    			//panplus.add(titles[i], BorderLayout.SOUTH);
    			
    			//pan.setLayout(new BorderLayout());
    			
    			//pan.add(panplus);
    			pan.add(imgs[i]);
    			//pan.add(titles[i], BorderLayout.SOUTH);
    			
    			imgs[i].addMouseListener(this);
    			
    		}catch(Exception ex){}
    	}
    	la.setText(curpage+" page / "+totalpage+" pages");
    }
    public void init()
    {
    	for(int i=0;i<imgs.length;i++)
    	{
    		imgs[i]=new JLabel("");
    	}
    	pan.removeAll();
    	pan.validate();
    	//panplus.removeAll();
    	//panplus.validate();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			if(curpage>1)
			{
				curpage--;
				init();
				print();
			}
		}
		else if(e.getSource()==b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				init();
				print();
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {			//이미지 클릭시 상세페이지 출력
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				if(e.getClickCount()==2)
				{
					String no=imgs[i].getToolTipText();
					no=no.substring(no.lastIndexOf(" - No.")+6);
					cp.dp.print(Integer.parseInt(no));
					cp.card.show(cp, "DETAIL");
				}
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
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				imgs[i].setBorder(new LineBorder(Color.gray,1));
			}
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				imgs[i].setBorder(null);
			}
		}
	}
    
}