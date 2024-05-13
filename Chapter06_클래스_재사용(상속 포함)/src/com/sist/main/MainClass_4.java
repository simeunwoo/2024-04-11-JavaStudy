package com.sist.main;
/*
 * 	상속 : 재사용 기법, 단일 상속
 * 	=> 예외 조건 : 생성자, 초기화 블록, static(공통으로 사용)
 * 
 * 	메모리 저장
 * 	---------------
 * 	--- 변수 ---
 * 	--- 메소드 ---
 * 	---------------
 * 
 * 	---------------
 * 	--- super ---
 * 	변수/메소드
 * 	-------------
 * 	--- this ----
 * 	변수/메소드
 * 	-------------
 * 	---------------
 * 
 * 	class A
 * 	{
 * 		int a,b,c,d,e,f;
 * 	}
 * 	class B extends A
 * 	{
 *		// int a,b,c,d,e,f; => 소스가 간결해진다
 * 		int k;
 *		=> 기능을 변경 => 메소드(오버라이딩)
 * 	}
 * 	=> 실행 속도가 느려진다
 * 	=> 소스를 볼 수 없기 때문에 => 가독성이 떨어진다
 * 	=> 제약 조건이 많다
 * 	=> 결합성이 높아진다
 * 	------------------------------------> 상속을 사용하지 않는다 (Spring)
 * 	=> 사용 빈도 : 상속 < 포함
 * 
 * 	Music : 지니, 멜론, Mnet => 동일 부분이 많음 => 상속 활용
 * 	Movie : CGV, 롯데시네마, 메가박스 => " => "
 *  FoodHouse : 메뉴판닷컴, 망고, 만개레시피 => " => "
 *  ...
 *  
 *  상속을 내리는 클래스 : super 클래스, base 클래스, 부모 클래스, 상위 클래스
 *  상속을 받는 클래스 : sub 클래스, 파생 클래스, 자식 클래스, 하위 클래스
 *  
 *  class 게시판
 *  {
 *  	글쓰기()
 *  	상세 보기()
 *  	검색()
 *  	수정()
 *  	추가()
 *  	삭제()
 *  }
 *  
 *  class 묻고답하기 extends 게시판
 *  {
 *  	묻기() => '글쓰기()' 대신에 변경 => 오버라이딩
 *  	답하기()
 *  }
 *  
 *  class 갤러리게시판 extends 게시판
 *  {
 *  	파일업로드() => 이미지
 *  }
 */
//import javax.swing.*;

public class MainClass_4 /*extends JFrame*/{ // 상속 클래스
/*	JFrame f=new JFrame(); // 포함 클래스 (has-a) => 여러개 사용이 가능
	public MainClass_4()
	{
		f.setSize(500, 500); // 포함 // 상속일 경우 : setSize(500, 500)
		f.setVisible(true); // 포함 // 상속일 경우 : setVisible(true)
	}
	*/

class Super
{
	int a;
	int b;
}
class Sub extends Super
{
	// a,b는 상속으로 인하여 포함됨
	int c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	new MainClass_4();
/*		Super su=new Super();
		System.out.println("su.a");
		System.out.println("su.b"); // => su는 a, b만 사용 가능
		Sub sub=new Sub();
		System.out.println("sub.a");
		System.out.println("sub.b");
		System.out.println("sub.c"); // => sub는 a, b, c까지 사용 가능
		*/
		
	//	Super su=new Sub(); // 상위=하위 / 가장 많이 사용된다
	//	System.out.println(su.a);
	//	System.out.println(su.b);
		// Super > Sub => double > int (이런 느낌)
		
	//	Sub sub=(Sub)su; // 하위=(하위)상위 / 형변환
	//	System.out.println(sub.a);
		// 클래스에 따라 => 접근 변수가 달라진다
		// => 인터페이스 => 상위 클래스로 처리 => 형변환
	}

}
