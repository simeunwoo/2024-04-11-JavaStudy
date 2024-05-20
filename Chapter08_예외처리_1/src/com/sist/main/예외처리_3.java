package com.sist.main;
/*
 * 	1 => 263page
 * 		예외 : 프로그램에 의도하지 않은 문제가 발생 => 발생된 위치에서 비정상 종료 => 비정상 종료를 방지하고 정상 종료가 가능하게 만드는 방법
 * 
 * 	=> 문제가 발생
 * 		= 사용자의 부주의 (입력을 잘못하는 경우)
 * 		= 프로그램의 결함 (프로그래머의 실수)
 * 		= 해결책
 * 		1. 조건문 사용 => if => 사전에 예방
 * 		2. 조건문이 안되는 경우 => 예외 처리를 이용한다
 * 			--------------------------------------------------------------- 가장 많이 사용 된다
 * 			= 직접 처리 : 프로그래머가 에러 발생 시 처리 => 복구
 * 			try~catch : 에러 발생 시 처리 => 예상되는 에러를 처리하기 때문에 여러개 사용 가능
 * 						소스 코딩
 * 			---------------------------------------------------------------
 * 			이미 소스 코드가 완료된 상태 => try~catch를 만들기 어렵기 때문에 ...
 * 			= 간접 처리 : 시스템에 의하여 처리가 가능 => 회피
 * 			throws : 예상되는 에러를 등록 => 호출 시에 처리하고 사용
 * 					라이브러리에 많이 존재 => 라이브러리 메소드 호출 시에는 예외 처리 후에 사용
 */
import java.util.*;
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 264page
/*		Scanner scan=new Scanner(System.in);
		System.out.print("첫번재 정수 입력:");
		// 문자열로 받는다 (웹이나 윈도우는 정수 개념이 없다 => 문자열로 받는 연습 중요)
		String num1=scan.next();
		System.out.print("두번째 정수 입력:");
		String num2=scan.next();
		
		// 첫번째 에러
		int n1=Integer.parseInt(num1); // 문자열을 정수로 변환 => 유효성 검사
		int n2=Integer.parseInt(num2); // 문자열을 정수로 변환
		
		// 정상 수행 가능, 사용자가 입력을 잘못한 경우 => 에러 처리가 안된다 => 입력값을 받아봐야 오류 여부를 알 수 있다
		// => 강제로 예외 처리를 하지 않는다 => 필요 시 예외 처리 생략이 가능 (그대로 종료)
		System.out.println("n1="+n1);
		System.out.println("n2="+n2); */
		
		////////////// 예외 처리를 사용할 경우 //////////////
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("첫번재 정수 입력:");
			String num1=scan.next();
			System.out.print("두번째 정수 입력:");
			String num2=scan.next();
			
			int n1=Integer.parseInt(num1); // => 에러 발생 의심 부분 1
			int n2=Integer.parseInt(num2); // => 에러 발생 의심 부분 2
			int n3=n1/n2; // => 에러 발생 의심 부분 3 // if문 처리가 더 편리할 것이다
			// 오류 시에 요 밑에서부터는 수행 불가
			System.out.println("n1="+n1);
			System.out.println("n2="+n2);
			System.out.println("n3="+n3);
			
			// n1, n2, n3은 try 안에서만 사용 가능 => 밖으로 나가면 사라진다
		}
/*		catch(NumberFormatException e) // 사용자가 n2=0으로 입력 시에 오류 발생 => 이와 관련된 예외 처리 클래스가 설정되지 않으면 => 비정상 종료
		{															// => 이와 관련된 예외 처리 클래스가 설정되어 있으면 => 정상 종료 가능
			System.out.println("정수만 가능");							// => 이와 관련된 예외 처리 클래스 : ArithmeticExcepton
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없다");
		} */
		
		catch(RuntimeException e) // 예외 처리 상속도에서의 상위 클래스 사용으로 예외 처리 간편화 가능
		{
			System.out.println("사용자 입력 오류 발생");
		}

		System.out.println("프로그램 종료"); // 정상 종료
		// 프로그램을 정상 종료가 가능하게 만든다 => 윈도우, 브라우저 => 실행 상태 유지 ...
	}

}
