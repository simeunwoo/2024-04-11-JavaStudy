/*
 * 	static 메소드를 이용하면
 * 	-----------
 * 		=> static 변수만 사용이 가능
 * 		=> 멤버변수를 사용하려면 => 객체 생성 (new)
 * 
 * 	멤버메소드 (******* 핵심) => 5장 시작 (140page)
 * 		=> static변수, 멤버변수를 사용할 수 있다
 */
public class 멤버변수_활용_3 {
	int a=10;
	static int b=20; // 카드 놀이 => width/height => 한번에 동시에 변경
	
	// 공통으로 사용되는 메소드
	static void display() // 자바에서 static : 공유되는 느낌
	{
		멤버변수_활용_3 ss=new 멤버변수_활용_3();
		System.out.println("a="+ss.a);
	}
	
	// 클래스 멤버 메소드
	void print()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
