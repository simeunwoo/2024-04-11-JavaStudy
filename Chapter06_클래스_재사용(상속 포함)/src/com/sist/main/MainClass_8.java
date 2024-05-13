package com.sist.main;
// 메소드 오버라이딩 => 204page => 가장 많이 사용
class Music
{
	int count=10;
	public void list()
	{
		System.out.println("목록 출력");
	}
	public void detail()
	{
		System.out.println("상세 보기");
	}
	public void find()
	{
		System.out.println("뮤직 검색");
	}
}
class Genie extends Music
{
	int musiccount=200;
	@Override // 요런거 굳이 안붙여도 됨 (없어도 됨 ㅋ)
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("Genie 뮤직에서 목록 출력");
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		System.out.println("Genie 뮤직에서 상세 보기");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("Genie 뮤직에서 뮤직 검색");
	}
	// 목록 출력
	// 상세 보기
	// 검색
	
}
class Melon extends Music
{
	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("Melon 뮤직에서 목록 출력");
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		System.out.println("Melon 뮤직에서 상세 보기");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("Melon 뮤직에서 뮤직 검색");
	}
	// 목록 출력
	// 상세 보기
	// 검색
}
class Mnet extends Music
{
	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("Mnet 뮤직에서 목록 출력");
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		System.out.println("Mnet 뮤직에서 상세 보기");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("Mnet 뮤직에서 뮤직 검색");
	}
	// 목록 출력
	// 상세 보기
	// 검색
}
public class MainClass_8 {
	/*
	 * 	유사한 클래스를 여러개 모아서 1개 객체로 제어 => 상속
	 * 
	 * 	> 상속을 받는 경우
	 * 	변수 : 선언하는 클래스명
	 * 	메소드 : 생성자에 따라
	 * 	생성자 => 상속의 제외 조건
	 * 
	 * 	class A
	 * 	class B extends A
	 * 
	 * 	A a=new B() => 변수 : A, 메소드 : B => 클래스가 여러개
	 * 	A a=new A() => 변수 : A, 메소드 : A
	 * 	B b=new B() => 변수 : B, 메소드 : B (***** 가장 많이 사용)
	 * 	B b=new A() : 오류 (라이브러리에서 값을 받을 때 많이 등장) => B b=(B)new A()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== Genie 뮤직 =====");
		Music m=new Genie();
		// Genie g=new Genie();
		// 메소드 호출 => 생성자
		m.detail();
		m.list();
		m.find();
		System.out.println("===== Melon 뮤직 =====");
		m=new Melon();
		m.detail();
		m.list();
		m.find();
		System.out.println("===== Mnet 뮤직 =====");
		m=new Mnet();
		m.detail();
		m.list();
		m.find();
/*
===== Genie 뮤직 =====
Genie 뮤직에서 상세 보기
Genie 뮤직에서 목록 출력
Genie 뮤직에서 뮤직 검색
===== Melon 뮤직 =====
Melon 뮤직에서 상세 보기
Melon 뮤직에서 목록 출력
Melon 뮤직에서 뮤직 검색
===== Mnet 뮤직 =====
Mnet 뮤직에서 상세 보기
Mnet 뮤직에서 목록 출력
Mnet 뮤직에서 뮤직 검색
 */
	}

}
