package com.sist.main;
/*
 * 	# 객체 지향 프로그램 => 규칙 (권장 사항)
 * 		> 기존의 프로그램을 쉽게 제작, 활용
 * 		   -------------------
 * 			= 코드의 재사용이 높다 (개발이 빠르다)
 * 				=> 상속 : 기존의 기능을 변경 : 오버라이딩 (is-a)
 * 				=> 포함 : 기존의 기능을 있는 그대로 사용 : (has-a)
 * 			= 코드 관리가 용이하다 => 구조화 프로그램 (프로그램을 관련된 사항만 나눠서 작업) => 메소드
 * 			= 이미 사용 중인 프로그램을 변경 : 신뢰성이 뛰어나다
 * 			= 보안 => 데이터를 보호 => 캡슐화
 * 		---------------------------------
 * 		객체 지향의 3대 특성
 * 		1. 캡슐화 => 변수 관련 => private 변수/메소드를 이용하여 접근하는 방식
 * 		2. 상속 => 재사용 기법
 * 		3. 다형성 => 오버로딩/오버라이딩 => 유지 보수 (기능 변경 = 메소드 관련)
 * 		
 * 		*** 상속을 사용하면 결합성이 높고, 제약 조건이 많이 존재, 메모리가 커진다, 속도가 늦다 => 가급적이면 사용하지 않는다
 * 		=> 단일 상속
 * 		=> 상속 기호 : extends => 기존의 클래스를 확장해서 사용 ...
 * 		class A
 * 		class B extends A : (B : 상속을 받는 클래스 / A : 상속을 내리는 클래스)
 * 		상속을 내리는 클래스 : private, static, 생성자, 초기화 블록 => 이를 제외하고 나머지는 상속이 된다
 * 		
 * 		*** 상속을 내린 클래스 (상위, 부모, 베이스 클래스)는 상속 받은 클래스의 변수, 메소드에 접근이 안된다
 * 		*** 상속을 받은 클래스는 상속을 내린 클래스에 접근이 가능
 * 
 * 		*** 상속을 내린 클래스는 자신의 객체 (this)만 가지고 있다
 * 		*** 상속을 받은 클래스는 자신의 객체 (this), 상위 클래스 객체 (super)를 가지고 있다
 * 
 * 		*** static 메소드나 static 초기화 블록은 this가 없다 => this는 인스턴스, 생성자에서만 사용 가능
 * 		*** new를 이용하여 객체 생성 시에 => this가 생성
 * 			--- JVM에 의하여 자동 생성
 */
public class MainClass_1 {
	private int num; // Heap에 저장
	public MainClass_1()
	{
		System.out.println("this라는 자신의 객체가 생성"); // this라는 자신의 객체가 생성
		System.out.println("this="+this); // this=com.sist.main.MainClass_1@6504e3b2
	}
	public void numData(int num) // Stack에 저장
	{
		// 적용하는 우선 순위 => 지역변수와 매개변수가 우선 순위 => 없는 경우에 멤버변수를 찾는다
		System.out.println("num="+num); // num=0 / 여기서 num => 지역변수, 매개변수를 우선 순위로 찾는다
		// 멤버변수를 사용할 때는 this.변수명
		System.out.println("this.num="+this.num); // this.num=0
		// this가 구분자 => 멤버변수
		// 색상 => 밤색 : 지역변수, 매개변수 / 파랑색 : 멤버변수 (정자 형식), static 변수 (필기체 형식)
		num=num;
		System.out.println("this.num="+this.num); // this.num=0
		// 매개변수와 멤버변수의 충돌이 많이 때문에 => 구분자 this를 활용해야
	}
	public void display()
	{
		System.out.println("this="+this); // this=com.sist.main.MainClass_1@6504e3b2
	}
	public static void aaa()
	{
	//	System.out.println("this="+this); // 오류 // static은 모든 객체가 공통으로 사용 => this 사용 불가능 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		MainClass_1 m=new MainClass_1();
		// this=m => JVM => 자동으로 객체 주소를 대입
		System.out.println("m="+m); // m=com.sist.main.MainClass_1@6504e3b2
		m.numData(0); // => num=0, this.num=0
		MainClass_1 m1=new MainClass_1();
		// this=m1
		System.out.println("m1="+m1); // m1=com.sist.main.MainClass_1@61064425
		// 객체 생성 시마다 this가 생성된다 => 자신의 클래스 객체를 나타내준다
	}

}
