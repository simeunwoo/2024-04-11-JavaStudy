package com.sist.main;
class Movie
{
	void display() {}
}
class MegaBox extends Movie
{
	// int display() {} // 오류 => 리턴형이 동일해야 한다
	// void display() {}
	int display(int a) // 오버로딩 => 상속 받은 것이 아니라 다른 메소드를 선언한 것
	{
		return 10;
	}
	// void display() {} // 오버라이딩
	// protected void display() {} // 오버라이딩
	 public void display() {} // 오버라이딩
	 /*
	  *	오버라이딩 조건
	  *		1. 상속 => 재정의 : 메소드 내용을 변경하여 사용
	  *		2. 메소드명이 동일
	  *		3. 매개 변수가 동일 => 매개 변수가 다른 경우 : 메소드가 다른 것을 정의 : 오버로딩
	  *		4. 리턴형이 동일
	  *		5. 접근지정어가 동일, 확대가 되어야 한다
	  *
	  * 	private < default < protected < public
	  * 
	  * 	=> 라이브러리 => 오버라이딩 : 한국 IT 개발에 잘 맞지 않는다
	  * 	=> 상속 여러개가 있는 경우에는 가장 큰 클래스를 상속 받는다
	  * 	=> JButton, JTextField, JFrame
	  */
}
public class MainClass_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
