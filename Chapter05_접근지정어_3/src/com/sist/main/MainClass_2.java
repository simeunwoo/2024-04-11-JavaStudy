package com.sist.main;
class A
{
	public A() // 생성자 호출 => (과 동시에) 클래스가 메모리에 저장된 상태
	{
		System.out.println("메모리에 저장");
	}
	// 메모리 해제 => 소멸자 함수

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("메모리 해제");
	}
}
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); // 충전
		a=null; // 방전 => 객체가 null이면 사용할 수 없다
/*
메모리에 저장
 */
		System.gc(); // 가비지 컬렉션 호출
/*
메모리에 저장
메모리 해제
 */
	}

}
