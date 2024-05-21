package com.sist.cilent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClientMain extends JFrame implements ActionListener { // ActionListener : 인터페이스
	public MenuPanel mp=new MenuPanel();
	public ControllerPanel cp=new ControllerPanel();
	public ClientMain()
	{
		// 배치
	//	add("North",mp); // => North, South, West, East, Center => BorderLayout (JFrame)
		setLayout(null);
		/*
		 * 	setLayout => 레이아웃
		 * 
		 *  FlowLayout : 컴포넌트를 좌에서 우로 순서대로 배치
		 *  BorderLayout : 컴포넌트를 동, 서, 남, 북, 중앙에 배치
		 *  GridLayout : 컴포넌트를 격자 형태로 배치
		 *  BoxLayout : 컴포넌트를 수직 또는 수평으로 정렬
		 *  CardLayout : 카드를 넘기듯 컴포넌트를 전환
		 */
		mp.setBounds(150, 15, 600, 50);
		add(mp);
		cp.setBounds(0, 50, 800, 530);
		add(cp);
		
		add("Center",cp);
		// 윈도우 크기
		setSize(800,600); // setSize : JFrame의 크기 설정
		setVisible(true); // setVisible : JFrame의 표시 여부 설정
		// 최대화 버튼 삭제 => 윈도우 크기 고정
		setResizable(false); // setResizable : JFrame의 크기를 사용자가 바꿀 수 있느냐 여부 설정
		// X 버튼 클릭 시 메모리 회수 => 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE); // setDefaultCloseOperation : JFrame의 닫기 버튼을 클릭했을 때 동작 설정
		
		mp.b1.addActionListener(this); // addActionListener : JButton에 클릭 이벤트
		// b1 버튼을 클릭하면 => actionPerformed를 호출
		mp.b2.addActionListener(this);
		mp.b6.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		}catch(Exception ex) {}
		
		new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(mp.b1==e.getSource()) // mp.b1 버튼을 e.getSource(누르다/클릭하다) 했을 때
		{
			cp.card.show(cp, "HOME");
		}
		else if(mp.b2==e.getSource())
		{
			cp.card.show(cp, "FIND");
		}
		else if(mp.b6==e.getSource())
		{
			JOptionPane.showMessageDialog(this, "나가"); // JOptionPane : 표준 대화 상자 생성
			System.exit(0); // System.exit : 프로그램 실행 중단, JVM 종료
		}
	}

}
