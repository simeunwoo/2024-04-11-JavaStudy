package com.sist.main_2;
/*
 * 	추상클래스의 단점
 * 	=> 상속을 내리는 클래스 => 상속을 받을 수 없다
 */

abstract class AAA
{
	int a;
	public abstract void aaa();
	public void bbb()
	{
		
	}
}
class BBB extends AAA
{
	// => a, bbb(), aaa() => 구현 (오버라이딩)
	int b; // 상속 때 접근 불가
	public void ccc() // 상속 때 접근 불가
	{
		
	}
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
}

class CCC
{
	int a,b;
	public void ddd() {}
}
class DDD extends CCC
{
	// a,b,ddd()
	int c;
	public void eee() {}
}
/*
 * 	상속을 내린 클래스는 => 자신의 변수, 메소드 사용 가능
 * 	상속을 받은 클래스는 => 자신의 변수, 메소드 + 상속을 받은 변수, 메소드 사용 가능
 * 	CCC 선언 => a,b,ddd()
 * 	DDD 선언 => a,b,ddd(),c,eee()
 */

public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA aa=new BBB(); // a, aaa(), bbb()만 접근 가능
		// 추가한 변수/메소드가 있는 경우 상속을 받은 클래스로 선언
//		aa.b // 오류
	}

}
