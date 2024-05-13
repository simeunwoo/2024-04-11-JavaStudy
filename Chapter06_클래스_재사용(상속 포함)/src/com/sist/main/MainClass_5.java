package com.sist.main;
/*
 * 	상속
 * 	=> 사용자 정의 클래스는 상속으로 사용을 잘 안한다
 * 	=> 라이브러리 클래스
 * 	=> 단일 상속
 * 		=> 상위 클래스는 가급적이면 공통 기반을 모아서 처리
 * 		ex) 사람 => 회사원/학생/교직원/교수
 * 			=======================> '회사원' 부분 등을 정리할 때 '사람' 부분은 다시 정리 안해도 됨
 * 	=> 메모리에 저장
 * 		상위 클래스 = 하위 클래스
 * 		상위 클래스 = 상위 클래스
 * 		하위 클래스 = 하위 클래스
 * 		하위 클래스 = (하위 클래스)상위 클래스
 * 		=> 클래스 크기는 상속이 있어야 가능 : 상속을 내리는 클래스 > 상속을 받는 클래스
 * 		=> 선언되는 클래스 : 변수
 * 		=> 생성자 : 메소드 저장
 * 
 * 		class Super
 * 		{
 * 			int a=10;
 * 			int b=20;
 * 			public void display()
 * 			{
 * 				System.out.println("Super:display() Call...")
 * 			}
 * 		}
 * 		class Sub extends Super
 * 		{
 * 			int a=100;
 * 			int b=200;
 * 			public void display()
 * 			{
 * 				System.out.println("Sub:display() Call...")
 * 			}
 * 		}
 * 
 * 		Super sup=new Super(); // sup => a=10, b=20, Super:display() Call...
 * 		Sub sub=new Sub(); // sub => a=100, b=200, Sub:display() Call...
 * 
 * 		Super sup2=new Sub(); // 오버라이딩 => 변수는 클래스에 따라 달라지고, 메소드는 생성자에 따라 달라진다
 * 		-----	   ---------
 * 		클래스		생성자
 * 		a=10,b=20	Sub:display() Call...
 * 		sup의 것		sub의 것
 */
class A
{
	int a=10;
	int c=20;
	public void display()
	{
		System.out.println("A:display() Call...");
	}
}
class B extends A implements Cloneable
{
	int a=100;
	int c=200;
	public void display()
	{
		System.out.println("B:display() Call...");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

// A aa=new B() => 오류 (서로 관계가 없기 때문 => 상속을 받아야 한다)
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println(aa.a); // 10
		System.out.println(aa.c); // 20
		aa.display(); // A:display() Call...
		
		System.out.println("====================");
		B bb=new B(); // 가장 많이 사용
		System.out.println(bb.a); // 100
		System.out.println(bb.c); // 200
		bb.display(); // B:display() Call...
		
//		B kk=bb.clone();
		
		System.out.println("====================");
		A cc=new B(); // 2번째로 많이 사용
		System.out.println(cc.a); // 10
		System.out.println(cc.c); // 20
		// 상위 = 하위 => 변수는 A를 따라 간다
		cc.display(); // B:display() Call... / new B()
		// 메소드는 B를 따라 간다
		
		System.out.println("====================");
		B dd=(B)cc;
		// 라이브러리 => 형변환
		System.out.println(dd.a); // 100
		System.out.println(dd.c); // 200
		dd.display(); // B:display() Call...
	}

}
