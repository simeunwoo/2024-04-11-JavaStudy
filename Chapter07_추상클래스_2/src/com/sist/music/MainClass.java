package com.sist.music;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스, 인터페이스 => 관련된 클래스를 묶어서 1개의 객체로 제어하는 목적
		// 데이터 => 한개의 이름으로 여러개의 변수를 제어 => 배열
		/*
		 * 	추상 클래스
		 * 	= 공통으로 사용되는 기능 => 구현이 동일한 경우
		 * 		list(), find(), detail() => 추상 클래스에서 구현
		 * 	= 공통으로 사용 => 구현 내용이 다른 경우
		 * 		init() => 선언 => 각 클래스에서 구현
		 * 
		 * 	메소드
		 * 	=> 구현된 메소드 : 상속 받은 클래스의 구현 내용이 동일
		 * 		[접근지정어] 리턴형 메소드명(매개 변수...)
		 * 		{
		 * 			구현하는 내용이 들어간다
		 * 		}
		 * 	=> 구현이 안된 메소드 : 상속 받은 클래스가 동일하지 않는 경우에 선언만 => abstract
		 * 		[접근지정어] abstract 리턴형 메소드명(매개 변수...); // abstract : 선언만 한다
		 * 	*** 메소드가 선언만 되어 있는 경우에는 new를 이용하여 메모리를 저장할 수 없다
		 * 		추상 클래스는 new를 이용하여 메모리 할당이 불가능
		 * 		상속 받은 클래스를 이용하여 메모리에 저장 후에 사용 => 선언된 메소드를 반드시 구현하여 사용
		 * 	*** 메소드가 구현이 안된 경우 (미완성 클래스) : 추상 클래스, 인터페이스
		 * 
		 * 	abstract class A
		 * 	{
		 * 		public void aaa(){} => {} 메소드는 구현으로 인정
		 * 		public void bbb(){}
		 * 		public void ccc(){}
		 * 		=> 구현이 안된 메소드가 반드시 포함하는 것은 아니다
		 * 		=> 구성 요소는 선택 사항
		 * 	}
		 * 
		 * 	추상 클래스에서 모든 메소드가 구현이 된 경우에도 => 메모리 할당을 할 수 없다
		 * 	abstract => 선언 시에는 메모리 할당을 할 수 없다
		 * 
		 * 	abstract class A
		 * 	{
		 * 		---------------
		 * 		변수 : 인스턴스
		 * 				정적
		 * 		---------------
		 * 		생성자
		 * 		---------------
		 * 		메소드
		 * 		---------------
		 * 		선언된 메소드
		 * 		---------------
		 * 		=> 선택 사항
		 * 	}
		 * 
		 * 	구현이 안된 메소드가 없는 경우에는 추상 클래스보다는 일반 클래스가 편하다
		 * 	=> 자체 메모리 할당이 가능
		 * 	=> 추상 클래스는 무조건 상속을 내려서 처리해야 한다
		 */
		Scanner scan=new Scanner(System.in);
		
//		MusicSystem ms=new GenieMusic();
//		MusicSystem ms=new MelonMusic();
//		ms.init();
		
		MusicSystem ms=null;
		System.out.print("지니뮤직(1),멜론(2):");
		int n=scan.nextInt();
		
		if(n==1)
			ms=new GenieMusic();
		else
			ms=new MelonMusic();
		
		ms.init();
		
		while(true)
		{
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 목록");
			System.out.println("2. 상세 보기");
			System.out.println("3. 검색");
			System.out.println("4. 종료");
			System.out.println("===========");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			
			switch(menu)
			{
			case 1:
				ms.list();
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
			case 2:
				System.out.print("번호 선택(1~50):");
				int no=scan.nextInt();
				ms.detail(no);
				break;
			case 3:
				System.out.print("검색어 입력:");
				String title=scan.next();
				ms.find(title);
				break;
			}
		}
		// Music과 관련된 클래스를 한개로 묶어서 처리 => 추상 클래스, 인터페이스를 이용한다
		/*
		 * 	무조건 => 한개로 통합
		 * 
		 * 	변수 여러개 => 변수 한개의 이름 => 배열
		 * 	클래스 여러개 => 추상 클래스 => 한개의 객체 생성
		 * 	데이터 여러개 => 파일/오라클
		 */
	}

}
