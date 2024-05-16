package com.sist.main_2;

class AA
{
	int a=10;
	int b=20;
	public void aaa()
	{
		System.out.println("A:aaa() Call...");
	}
}
// AA a=new AA() ===> a,b,aaa()
class BB extends AA
{
	// int a=10,b=20; aaa() => 수정(오버라이딩)
	int c=30;
	public void aaa() // aaa()가 새롭게 변경됨
	{
		System.out.println("B:aaa() Call...");
	}
	public void bbb()
	{
		System.out.println("B:bbb() Call...");
	}
}
// BB b=new BB() ===> c,aaa(),bbb()
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa=new AA(); // AA에 설정된 변수/메소드에만 접근 가능
		System.out.println(aa.a); // 10
		System.out.println(aa.b); // 20
		aa.aaa(); // A:aaa() Call...
		System.out.println("=== BB ===");
		BB bb=new BB();
		System.out.println(bb.c); // 30
		bb.aaa(); // B:aaa() Call...
		bb.bbb(); // B:bbb() Call...
		System.out.println(bb.a); // 10
		System.out.println(bb.b); // 20
		
		System.out.println("=== AA:new BB() ===");
		AA cc=new BB();
		// 변수는 AA가 가지고 있는 것만 사용 가능
		// 메소드는 BB가 가지고 있는 것만 호출
		// ===> cc => a,b (c는 사용 불가능) / 변경된 aaa()를 호출
		System.out.println(cc.a); // 10
		System.out.println(cc.b); // 20
		cc.aaa(); // B:aaa() Call...
		/*
		 * 	기본
		 * 	클래스명 객체명=new 생성자()
		 * 	=> 클래스명==생성자() : 같다(기본적으로는)
		 * 
		 * 	클래스명 객체명=new 생성자()
		 * 	=> 클래스명!=생성자() : 다르다
		 * 	=> 상속이 있는 경우
		 * 	=> 상속을 내리는 클래스와 상속을 받는 클래스가 변수/메소드가 동일한 경우
		 * 									=> 추가된 변수/메소드가 있는 경우에는 사용하지 않는다 : 접근 불가능
		 *	=> 상속 받은 클래스가 여러개인 경우에 주로 사용
		 *									=> 한개의 객체로 모든 클래스를 제어
		 *
		 *	class A
		 *	class B extends A
		 *	class C extends A
		 *	class D extends A
		 *	class E extends A
		 *
		 *	B b=new B()
		 *	C c=new C()
		 *	D d=new D()
		 *	E e=new E()
		 *	================== 객체를 여러개 생성하는 것이 아니라
		 *	A a=new B()
		 *	a=new C()
		 *	a-new D()
		 *	a=new E()
		 *	================== 한개의 객체를 이용한다
		 *	-----------------------------------------------> 추상 클래스, 인터페이스
		 *	=> 목적 : 여러개의 관련된 클래스를 한개로 묶어서 관리할 목적
		 *			설계용 => 다음에 재사용 가능
		 *	=> 단점 : 단일 상속 => 일반 클래스와 동일 : 멤버 변수, 생성자, 구현된 메소드 : 구현이 안된 메소드 포함
		 *
		 *	사이트 - 맛집 / 영화
		 *	맛집 : 로그인, 회원 가입 + (맛집 목록, 맛집 상세, 예약)
		 *	영화 : 로그인, 회원 가입 + (영화 목록, 영화 상세, 예약)
		 *	~~~> 로그인, 회원 가입 :
		 *	~~~> 
		 *
		 *	public abstract class ClassName
		 *	{
		 *		------------------------------
		 *		변수
		 *		static / 인스턴스 변수
		 *		------------------------------
		 *		생성자 : 디폴트만 사용하는 것을 권장
		 *		------------------------------
		 *		구현된 메소드
		 *		=> 사이트에서 같은 기능
		 *			로그인 / 회원 가입 / 아이디 찾기 / 비밀번호 찾기 / 아이디 중복 / 우편 번호 찾기 ...
		 *		------------------------------
		 *		구현이 안된 메소드 => 추상 메소드
		 *		=> 기능은 같은데 출력 내용이 다른 경우
		 *			목록 / 상세 / 예약 / 결제 ...
		 *		------------------------------
		 *	}
		 */
	}

}
