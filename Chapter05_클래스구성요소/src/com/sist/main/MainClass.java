package com.sist.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(); // 재사용 (같은 패키지 내 클래스이므로)
		s.process(); // 재사용 (같은 패키지 내 클래스이므로)
		/*
		국어 점수:89
		영어 점수:90
		수학 점수:97
		총점:276
		평균:92.00
		학점:A
		 */
		
		// 메소드의 두번째 목적 : 재사용 (메소드의 첫번째 목적 : 반복적인 소스 제거)
	}

}
