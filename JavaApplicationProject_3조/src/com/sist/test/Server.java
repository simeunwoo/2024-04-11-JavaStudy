package com.sist.test;
import java.util.*;
import java.io.*; // 전송
import java.net.*; // 통신

import com.sist.commons.Function;
import com.sist.dao.*;

public class Server implements Runnable {

	// 접속 담당
	private ServerSocket ss;
	// PORT 번호 => 0~65535 내에서 정하기 => 0~1023은 이미 알려진 번호
	private final int PORT=4852;
	private MemberDAO dao;
	// 저장 공간 (접속자)
	private Vector<Client> waitVc=new Vector<Client>();
	
	public Server()
	{
		// 시작과 동시에 서버 구동
		try
		{
			ss=new ServerSocket(PORT);
			dao=MemberDAO.newInstance(); // 객체 생성 // 데이터베이스
			System.out.println("서버 시작");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	// 접속 시에 접속자 정보 저장 => 접속자마다 통신이 따로 수행 => 쓰레드
	public void run()
	{
		// 접속 시에 처리
		while(true)
		{
			try
			{
				Socket s=ss.accept();
				// 접속이 된 경우에만 호출
				// s => 클라이언트 정보 => 발신자 정보 => IP, PORT
				Client client=new Client(s);
				// 통신을 시작
				client.start();
			}catch(Exception ex) {}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start(); // run() 호출
	}
	/*
	 * 	클래스의 종류
	 * 	    = 추상 클래스
	 * 	    = *** 보완 => 인터페이스
	 * 	    = 내부 클래스
	 *        -------- 클래스 메모리 할당 없이 모든 변수/메소드에 접근 가능
	 *        1) 멤버 클래스 : 네트워크, 쓰레드 ...
	 *        	class A
	 *        	{
	 *        		데이터
	 *        		class B
	 *        		{
	 *        			A가 가지고 있는 모든 데이터를 공유
	 *        		}
	 *        	}
	 *        2) 익명의 클래스 : 스프링, 데이터 분석
	 *        	=> 상속 없이 오버라이딩이 가능 => 생성자에서 메소드 변경, 추가
	 * 
	 */
	// 통신
	class Client extends Thread
	{
		
		Socket s; // 클라이언트와 통신하는 통신 기기
		OutputStream out; // 클라이언트에게 전송
		BufferedReader in; // 클라이언트로부터 요청값 받기
		// 개인 정보
		String id,name,sex,pos,admin;
		public Client(Socket s)
		{
			// 변수 초기화
			try
			{
				this.s=s;
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 네트워크 전송 => 1byte로 전송
				// 값을 받는 경우는 => 2byte로 받는다
				// 1->2로 변경해서 받는 클래스 : 필터 스트림
				// InputStreamReader
			}catch(Exception ex) {}
		}
		
		// 통신을 시작한다
		public void run() // 클라이언트마다 따로 동작 => 쓰레드
		{
			while(true)
			{
				try
				{
					// 클라이언트의 요청값을 받는다
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					// 100|id|pwd
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
						// 로그인 요청
						case Function.LOGIN:
						{
							
						}
						break;
						// 나가기 요청
						case Function.EXIT:
						{
							
						}
						break;
						// 채팅 요청
						case Function.CHAT:
						{
							
						}
					}
				}catch(Exception ex) {}
			}
		}
		
		// 접속자 전체에게 전송
		public synchronized void messageAll(String msg)
		{
			// synchronized => 동기화
			while(true)
			{
				try
				{
					for(Client client:waitVc)
					{
						client.messageTo(msg);
					}
				}catch(Exception ex) {}
			}
		}
		
		// 접속자에게만 전송
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}
}
