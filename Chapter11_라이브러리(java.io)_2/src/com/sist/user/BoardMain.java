package com.sist.user;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import com.sist.model.*;
import java.util.*;

public class BoardMain extends JFrame implements ActionListener, MouseListener {
	// 인터페이스 => 다중 상속이 가능
	/*
	 * 	1. button => ActionListener
	 *  2. table => MouseListener
	 */
	private CardLayout card=new CardLayout();
	BoardList bList=new BoardList();
	BoardInsert bInsert=new BoardInsert();
	BoardDetail bDetail=new BoardDetail();
	// 클래스 => 관련 있는 클래스별로 선언
	// 프로그램에 필요한 변수 설정
	int curpage=1;
	int totalpage=0;
	
	BoardSystem bs=new BoardSystem(); // 파일에 List 저장됨
	public BoardMain()
	{
		setLayout(card);
		add("LIST",bList);
		add("INSERT",bInsert);
		add("DETAIL",bDetail);
		setTitle("게시판 ver 1.0");
		listPrint();
		setSize(640, 550);
		setVisible(true);
		
		// 등록 => actionPerformed를 호출해라
		bList.inBtn.addActionListener(this); // 새 글
		bList.prevBtn.addActionListener(this); // 이전
		bList.nextBtn.addActionListener(this); // 다음
		bList.table.addMouseListener(this);
		
		bInsert.b2.addActionListener(this); // 취소
		bInsert.b1.addActionListener(this); // 글 쓰기
		
		bDetail.b3.addActionListener(this); // 목록
		bDetail.b2.addActionListener(this); // 삭제
		bDetail.b1.addActionListener(this); // 수정
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 메모리 해제
		
	}
	public void listPrint()
	{
		// 테이블 전체를 한번 지운다
		for(int i=bList.model.getRowCount()-1;i>=0;i--)
		{
			bList.model.removeRow(i);
		}
		ArrayList<Board> list=bs.boardList(curpage);
		totalpage=bs.boardTotalPage();
		bList.pageLa.setText(curpage+" page / "+totalpage+" pages");
		for(int i=0;i<list.size();i++)
		{
			Board b=list.get(i);
			String[] data= {
					String.valueOf(b.getNo()),
					b.getSubject(),
					b.getName(),
					new SimpleDateFormat("yyyy-MM-dd").format(b.getRegdate()),
					String.valueOf(b.getHit())
			};
			bList.model.addRow(data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(bList.inBtn==e.getSource()) // 새 글 버튼을 클릭했다면
		{
			bInsert.nameTf.setText("");
			bInsert.subTf.setText("");
			bInsert.ta.setText("");
			bInsert.pwdPf.setText("");
			card.show(getContentPane(), "INSERT");
			bInsert.nameTf.requestFocus();
		}
		else if(bDetail.b3==e.getSource())
		{
			card.show(getContentPane(), "LIST");
			listPrint();
		}
		else if(bDetail.b2==e.getSource())
		{
			// 게시물 번호 읽기
			String no=bDetail.no.getText();
			int a=JOptionPane.showConfirmDialog(this,"삭제할까요?","삭제",JOptionPane.YES_NO_OPTION);
			if(a==JOptionPane.YES_OPTION)
			{
				bs.boardDelete(Integer.parseInt(no));
				// 이동
				card.show(getContentPane(), "LIST");
				listPrint();
			}
		}
	/*	else if(bDetail.b1==e.getSource())
		{			
			card.show(getContentPane(), "INSERT");
			listPrint();
		}*/
		else if(bList.prevBtn==e.getSource())
		{
			if(curpage>1)
			{
				curpage--;
				listPrint();
			}
		}
		else if(bList.nextBtn==e.getSource())
		{
			if(curpage<totalpage)
			{
				curpage++;
				listPrint();
			}
		}
		
		else if(bInsert.b2==e.getSource()) // 취소 버튼을 클릭했다면
		{
			card.show(getContentPane(), "LIST");
		}
		else if(bInsert.b1==e.getSource()) // 글 쓰기 버튼을 클릭했다면
		{
			// 입력값을 읽기
			String name=bInsert.nameTf.getText();
			if(name.length()<1) // 입력이 안된 경우
			{
				bInsert.nameTf.requestFocus();
				return;
			}
			
			String subject=bInsert.subTf.getText();
			if(subject.length()<1)
			{
				bInsert.subTf.requestFocus();
				return;
			}
			
			String content=bInsert.ta.getText();
			if(content.length()<1)
			{
				bInsert.ta.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(bInsert.pwdPf.getPassword());
			if(pwd.length()<1)
			{
				bInsert.pwdPf.requestFocus();
				return;
			}
			
			Board b=new Board();
			b.setName(name);
			b.setSubject(subject);
			b.setContent(content);
			b.setPwd(pwd);
			b.setRegdate(new Date());
			b.setHit(0);
			
			bs.boardInsert(b); // 추가
			// 이동
			card.show(getContentPane(),"List");
			listPrint();
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) { // 클릭, 더블 클릭
		// TODO Auto-generated method stub
		if(e.getSource()==bList.table)
		{
			if(e.getClickCount()==2)
			{
				// 선택된 위치
				int row=bList.table.getSelectedRow();
				String no=bList.model.getValueAt(row, 0).toString();
				Board b=bs.boardDetail(Integer.parseInt(no));
				bDetail.no.setText(String.valueOf(b.getNo()));
				bDetail.name.setText(b.getName());
				bDetail.sub.setText(b.getSubject());
				bDetail.day.setText(new SimpleDateFormat("yyyy-MM-dd").format(b.getRegdate()));
				bDetail.ta.setText(b.getContent());
				bDetail.hit.setText(String.valueOf(b.getHit()));
				
				// 화면 이동
				card.show(getContentPane(), "DETAIL");
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

}
