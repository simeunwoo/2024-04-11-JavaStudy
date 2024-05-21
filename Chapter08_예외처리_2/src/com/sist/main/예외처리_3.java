package com.sist.main;
import java.util.*;
// Exception / RuntimeException
// => CheckedException / UnCheckedException
class MinusException extends Exception
{
	// 상속 => 예외 처리 전체를 상속 받아서 처리
	public MinusException(String msg) // MinusException => 사용자 정의 예외 처리
	{
		super(msg);
	}
}
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("양수만 입력:");
		int no=scan.nextInt();
		try
		{
			if(no<0) // 에러 발생이 아니다 => 일부러 발생 (왜냐면, 원래는 0보다 작다고 해서 에러가 발생하는게 아니므로) => throw를 사용한다
			{
				throw new MinusException("음수는 사용 불가");
				// throw => 사용자 정의 예외 처리를 만든 경우 => catch절을 호출한다
			}
			// catch는 자바에서 제공하는 예외 클래스는 인식 => 사용자 정의는 인식하지 못한다 => 예외를 임의로 발생 => throw 활용
		}catch(MinusException e) // MinusException이 인식이 안되므로 호출해서 사용
		{
			System.out.println("에러 메세지:"+e.getMessage());
			System.out.println("=== 에러 발생 위치 ===");
			e.printStackTrace();
		}
	}

}
