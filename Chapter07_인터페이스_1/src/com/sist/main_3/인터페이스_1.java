package com.sist.main_3;
interface A
{
	public void aaa();
}
interface B
{
	public void bbb();
}

// 다중 상속 => ,로 구분
/*
 * 	자신의 클래스 = 자신의 생성자()
 * 	상위 클래스 = 하위 클래스 생성자()
 * 
 * 	class A
 * 	class B extends A
 * 
 * 	A a=new A()
 * 	B b=new B()
 * 	A c=new B()
 * 	-------------------------
 * 	interface A
 * 	class B implements A
 * 
 * 	A a=new A() => 불가능 : interface, 추상 클래스는 메모리 할당이 불가능하다 (미완성)
 * 	B b=new B()
 * 	A c=new B() => 구현된 클래스를 이용하여 메모리 저장
 * 
 * 		===> 구현한 클래스, 오버라이딩
 */
class C implements A,B
{

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("C:bbb() Call...");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("C:aaa() Call...");
	}
	
}

public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new C(); // aaa() 호출 가능
		// 클래스명
		a.aaa();
		B b=new C(); // bbb() 호출 가능
		b.bbb();
		// 다중 상속 시에는 상속 받은 클래스 이용 => 모든 메소드를 갖고 있기 때문 (상속 받은 클래스는 데이터 용량이 증가됨)
		C c=new C(); // aaa(), bbb() 호출 가능
		c.aaa(); c.bbb();

	}

}
