// => 사용자로부터 => 2개의 정수를 받아서 결과값을 전송

import java.util.Scanner;

public class 메소드_계산기 {
	static int add(int a, int b)
	{
		return a+b;
	}
	// 사용자 요청 => 매개변수
	// => 처리 결과값 => 리턴형
	// 리턴형은 1개만 사용 가능
	/*
	 * 			데이터 첨부 => 매개변수
	 * 		-----| |-----
	 * 		|			|
	 * 		|	 처리		| => {구현부}
	 * 		|			|
	 * 		---------||--
	 * 				결과값 도출 => 리턴형
	 * 
	 * 		예)
	 * 		과일 =====> 믹서기 =====> 즙
	 * 		(매개변수)	   (구현)		  (결과값)
	 * 
	 * 		GPT
	 * 		사용자 입력 =====> 구글링 / 데이터 만들기 =====> 화면
	 * 		(매개변수)		  	(메소드 : 구현)			   (결과값)
	 * 		---------------------------------------------
	 * 		1. 사용자가 보내주는 값? 어떤 값을 받을 지 => 매개변수
	 * 		2. 처리 방법 => {구현부}
	 * 			=> 변수 / 연산자 / 제어문 => 명령문
	 * 									----
	 * 									명령문의 집합
	 * 		3. 어떤 결과값 도출 => 리턴형
	 * 		---------------------------------------------
	 * 		| 소스를 구분 => 기능별 분리 => 알아보기 쉽다, 오류 시에 메소드만 찾을 수 있다
	 * 								 필요 시 변경 가능
	 * 		| 재사용이 가능하다
	 * 		| 게임을 다시 시작할 수 있다
	 * 		| 메소드는 호출 시마다 => 처음부터 다시 구동
	 * 		| 결과값이 많은 경우
	 * 		  ------------- 정렬 => 배열
	 * 			=> 리턴형 => 정수, 실수, 문자, 문자열, 논리, 배열, 클래스
	 * 				int method()
	 * 				double method()
	 * 				char method()
	 * 				String method()
	 * 				boolean method()
	 * 				int[] method()
	 * 				Sawon method() => 사용이 안됨
	 * 
	 * 			=> 매개변수 => 정수, 실수, 문자, 문자열, 논리, 배열, 클래스
	 * 						-----------------------
	 * 							기본형
	 * 			=> 리턴형 / 매개변수의 차이점은 (1개 / 여러개)
	 * 					  ------
	 * 						| 갯수를 모르는 경우
	 * 						  회원가입 => 필수 외의 입력을 안해도 된다
	 */
	static int minus(int a, int b)
	{
		return a-b;
	}
	static int gop(int a, int b)
	{
		return a*b;
	}
	// 리턴형 => 고정된 것이 아니다 => 프로그램에 맞게 설정
	static String div(int a, int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌 수 없다";
		else
			result=String.valueOf(a/b); // toString <=연관=> String.valueOf
		return result;
	}
	// 계산기
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		char op=scan.next().charAt(0);
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		switch(op)
		{
		case '+':
			System.out.printf("%d + %d = %d\n",num1,num2,add(num1,num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n",num1,num2,minus(num1,num2));
			break;
		case '*':
			System.out.printf("%d * %d = %d\n",num1,num2,gop(num1,num2));
			break;
		case '/':
			System.out.println(div(num1,num2));
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		// 연결만 한다 // Object(클래스)는 모든 데이터형을 받을 수 있다 => 가장 큰 데이터형
		
	//	System.out.printf("%d %d %d %d %d"); // %d => 매개변수는 여러개 사용 가능
		// PrintStream java.io.PrintStream.printf(String format, Object... args)
		
		Object i=10;
		i="";
		i='A';
		i=10.5;
		i=true;
		i=new Scanner(System.in); // 전부 가능
	}

}
