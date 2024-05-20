package com.sist.main;
/*
 * 	try절 => 정상 수행이 가능한 문장
 * 	catch 절 => try 안에 문장을 수행하는 과정에서 에러가 발생 시에 처리
 * 			=> 여러개 사용 가능
 * 			=> 예외 처리 클래스의 순서가 있다 : (크기 => 상속 => 상속도) : 위로 올라갈수록 에러 처리의 기능이 많다
 * 
 * 	Exception
 * 	|
 * 	RuntimeException
 * 	|
 * 	NumberFormatException, NullPointerException, ClassCastException
 * 
 * 	@ 크기
 * 	Exception > RuntimeException > NumberFormatException, NullPointerException, ClassCastException
 */
import java.util.*;
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			A a=new A();
			B b=(B)a; // 오류 발생 => ClassCastException
		}
		catch(ArithmeticException e) // 0으로 나눌 때 오류 처리
		{
			
		}
		catch(ArrayIndexOutOfBoundsException e) // 배열 범위 초과 시에 오류 처리
		{
			
		}
		catch(NumberFormatException e) // 문자열을 정수로 변환할 때 오류 처리
		{
			
		}
		catch(RuntimeException e)
		{
			// ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException, ClassCastException, ...
			// => RuntimeException으로 해결 가능 (전체를 잡아주는 예외 처리)
			// => RuntimeException을 사용하면 위의 catch절 여러개를 굳이 사용 안하고 생략해도 된다
		}
		System.out.println("프로그램 종료");
	}

}
