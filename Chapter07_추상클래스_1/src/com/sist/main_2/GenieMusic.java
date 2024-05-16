package com.sist.main_2;
/*
 * 	객체 생성
 * 	클래스명 객체명=new 클래스명()
 * 	=> 다른 클래스에 접근 불가
 * 
 * 	class A
 * 	{
 * 		int a,b;
 * 		public void aaa(){}
 * 	}
 * 	class B extends A
 * 	{
 * 		// a,b,aaa()
 * 		int c;
 * 		public void bbb(){}
 * 	}
 * 
 * 	A aa=new A();
 * 	=> a,b,aaa()
 * 
 * 	B bb=new B();
 * 	=> a,b,aaa(),c,bbb() => 상속 받은 내용 접근이 가능
 * 	=> 상속을 내린 클래스는 본인이 가지고 있는 변수/메소드만 접근 가능 => 상속 받은 클래스에는 접근 불가
 * 
 * 	A cc=new B() => 변수는 A 따라, 메소드는 B 따라
 * 		-------- aaa()를 B가 가지고 있는 aaa()로 덮어 쓴다
 * 	=> a,b,aaa()
 * 			--- B가 가지고 있는 메소드 호출
 */
public class GenieMusic extends MusicSystem {
	public abstract void init();
	public abstract void find(String title);
	public abstract void list();
	public abstract void detail(int mno);
}
