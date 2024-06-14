package com.sist.server;
import java.net.*;
import java.nio.Buffer;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame implements ActionListener {
	JTextField tf,tf1;
	JButton b1,b2;
	JTextArea ta;
	String name;
	// 네트워크 관련
	Socket s; // 서버 연결
	// 전송
	OutputStream out;
	// 서버로부터 전송값 받기
	BufferedReader in;
	
	public Client()
	{
		tf=new JTextField(25);
		b1=new JButton("접속");
		b2=new JButton("종료");
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		tf1=new JTextField(30);
		tf1.setEnabled(false);
		
		JPanel p=new JPanel();
		p.add(tf); p.add(b1); p.add(b2);
		add("North",p);
		ta.setEnabled(false); // 편집 불가 (비활성화) => 먼저 화면에 접속이 되면 그 때 비활성화를 푼다 (활성화)
		add("Center",js);
		add("South",tf1);
		
		setSize(450, 400);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();
	/*	try
		{
			Socket s=new Socket("192.168.0.115",4852);
			// s => 서버
			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println(in.readLine());
		}catch(Exception ex) {} */
		/*
		(서버 실행)
		Server Start ...
		(클라이언트 실행)
		접속 IP:127.0.0.1
		포트 번호:51993
		(클라이언트 실행)
		접속 IP:127.0.0.1
		포트 번호:51994
		(클라이언트 실행)
		접속 IP:127.0.0.1
		포트 번호:51995
		 */
			/*
			 * IP 주소 : 192.168.0.115
			 */
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) // 접속
		{
			try
			{
				
			}catch(Exception ex) {}
		}
		else if(e.getSource()==b2) // 종료
		{
			System.exit(0);
		}
		else if(e.getSource()==tf1) // 채팅 문자열
		{
			
		}
	}

}
