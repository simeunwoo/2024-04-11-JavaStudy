package com.sist.main;
// UpDown 게임
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // interface

public class 예외처리_응용 extends JFrame{
	// 예외처리_응용 => 윈도우를 확장 => 상속 (단일 상속 기본)
	JTextField tf;
	JButton b1,b2;
	// 클래스 => 변수 (객체) => 변수 사용 (기본형, 배열, 클래스) => 멤버 변수로 사용 가능
	// 초기화, 화면 UI, 서버 연결 => 생성자에 주로 처리
	public 예외처리_응용()
	{
		tf=new JTextField();
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		// 배치
		setLayout(null);
		tf.setBounds(10, 15, 150, 30);
		// 윈도우 추가
		add(tf);
		b1.setBounds(165, 15, 100, 30);
		add(b1);
		b2.setBounds(270, 15, 100, 30);
		add(b2);
		
		// 윈도우 크기
		setSize(400, 90);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
		new 예외처리_응용();
	}

}
