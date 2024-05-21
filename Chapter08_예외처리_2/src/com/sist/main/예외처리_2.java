package com.sist.main;
// import java.io.*;
// import java.sql.*;
/*
 * 	throw : 임의로 에러 발생
 * 	형식) 
 * 		throw new 예외클래스()
 * 		=> 요기부터는 코딩 불가능 (바로 catch로 이동하기 때문)
 */

import java.util.Scanner;

public class 예외처리_2 {

	public static void main(String[] args) /* throws Exception */ {
		// TODO Auto-generated method stub
//		FileReader fr=new FileReader("c:\\javaDev\\movie.txt"); // 에러 뜸 (예외 처리를 안하면 안되는 에러의 일종이다)
																// => 방법 1. throws Exception을 사용한다 (main 클래스 뒤에)
																// => 방법 2. try ~ catch를 사용한다
/*		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		}catch(IOException e) {} // IOException 대신 상위 클래스인 Throwable, Exception 등을 사용해도 좋다
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.print("양수만 입력:");
		int no=scan.nextInt();
		try
		{
			// 예외 처리가 발생한 것이 아니라 => 임의로 발생
			if(no<0)
			{
				// 견고한 프로그램 => 에러 발생 시에 처리가 되고 있는지 => 테스트
				// 애플리케이션 테스트
				// 개발자 => 단위 테스트 => JUnit
				throw new IllegalArgumentException("음수는 사용할 수 없다"); // 이 문장을 수행할 경우 밑에 no의 번호 문장은 수행하지 않는다
																// => throw new 예외클래스()를 수행하면 바로 catch로 이동하기 때문
//				System.out.println("음수는 사용할 수 없다"); // 이 문장을 수행할 경우 밑에 no의 번호 문장을 수행하여야 해서 모순이 생긴다
				// 예외를 던진다 => 직접 예외의 catch를 호출 가능
			}
			System.out.println("no="+no);
		}catch(IllegalArgumentException e) // IllegalArgumentException : 입력값이 잘못된 경우
		{
			System.out.println(e.getMessage()); // e.getMessage() = 음수는 사용할 수 없다
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e) // 상속도에서 위에 있는 큰 클래스는 뒤에 배치 => 다른 하위 클래스보다 앞에 배치 시에 오류 발생
		{
			System.out.println(e.getMessage());
		}
		// 반드시 실행되는 문장이 있는 경우
		System.out.println("프로그램 종료");
		
	}

}
