/*
 * 	자바에서 제공하는 제어문 : 필요한 내용만 출력(조건문,선택문-다중조건문과 동일), 반복 수행, 반복 제어
 * ------------------- 연산자+제어문=메소드
 * 	반복 수행 : for, while, do~while
 * 	반복 제어 : 종료, 제외, break continue
 * 
 * 	1) 조건문 : 사용빈도가 가장 많다
 * 		=> 단일 조건문 : true일 때 수행 => 검색 => 검색어 입력 여부 확인, 상세보기
 * 		=> 선택 조건문 : true/false를 나눠서 수행 => 로그인 (로그인된 경우 / 로그인이 안된 경우)
 * 										   => 아이디 중복 (중복이 없는 경우 / 중복이 있는 경우)
 * 		=> 다중 조건문 : 조건 여러개 중에서 한개만 true로 수행 => 메뉴 클릭, 키보드 (키값) => 게임
 * 		=> 선택문 : 다중조건문을 단순화 => 웹에서는 거의 사용빈도가 없다
 * 									화면 이동(JSP) => Spring
 * 									=> Front (Router)
 * 									=> 간결하다 => 게임 (키보드값)
 * 			*** 웹 => if / if~else / for / while
 * 				=> 기본 : 데이터베이스 : SQL (80% 차지) => 취업
 * 			: 한개의 값이 있는 경우 => 선택문이 편리함
 * 			: 범위가 있는 경우 => 다중조건문이 편리함
 * 				=> 보통 10개정도면 선택문, 그 이상이면 다중조건문을 선택하곤 함
 * 
 * 		------------------------------------------------
 * 		HTML/CSS/JavaScript => 화면UI => Vue, React, Next
 * 			 ㅣ
 * 			Java : 데이터 처리 (요청 처리)
 * 			 ㅣ
 * 			Oracle : 데이터를 저장하는 공간 => 데이터베이스 (영구적)
 * 		================================================ AWS (PaaS) => Linux
 * 
 * 		형식)
 * 		switch (정수, 문자, 문자열) (실수, 논리형은 X)
 * 
 * 			=> 문자 (+,-,*,/)
 * 			{
 * 			case '+' : 문자 중에 +가 들어온 경우
 * 				처리문장
 * 				break; => 처리 후 종료
 * 			case '-' : 문자 중에 -가 들어온 경우
 * 				처리문장
 * 				break; => 처리 후 종료
 * 			...
 * 			...
 * 			...
 * 			default('기타 등등') : case에 없는 데이터가 있는 경우 (다중조건문의 else 느낌)
 * 				처리문장
 * 			}
 * 
 * 			=> 같은 처리 100/10 => 10 9 8 7...
 * 			switch(정수)
 * 			{
 * 				case 10:
 * 					A
 * 					break;
 * 				case 9:
 * 					A
 * 					break;
 * 					...
 * 					...
 * 					...
 * 			}
 * 
 * 			switch(정수)
 * 				case 10:
 * 				case 9:
 * 					...
 * 					...
 * 					...
 * 					A
 * 					break; => 처리문장, break가 없는 경우도 있다 (반복일 때 간소화 가능)
 * 						   => 밑에 있는 break까지 수행
 */

import java.util.Scanner;

public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번재 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("연산자 입력(+.-.*./):");
		char op=scan.next().charAt(0);
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		// 사용자 입력 요청
		// 결과값 출력
		// 문자 => ''
		// 문자열 => ""
		switch(op) // 문자,정수,문자열 (O) / 실수,논리형 (X)
		{
		case '+':
			System.out.println(num1+"+"+num2+"="+(num1+num2)); // 처리문장
			break; // case 한개(한문장) 수행 => break를 사용하여 종료
		case '-':
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case '/':
			if(num2==0)
				System.out.println("0으로 나눌 수 없다");
			else
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			break;
		default: // default는 필요없을 시 생략 가능
			System.out.println("잘못된 연산자이다"); // 연산자가 잘못된 경우
			// 마지막이기 때문에 break를 사용해도 되고 안해도 된다
			// *** case에 등록된 값이 중복되면 오류 발생
			// *** 데이터가 일치 => case에 등록되는 데이터형 통일
		}
	}

}
