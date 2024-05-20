package com.sist.main;
/*
 * 	finally
 * 
 * 	예외 처리
 * 	try
 * 	{
 * 		정상 수행 코드
 * 		=> 에러 발생
 * 	}catch(예외 처리 클래스)
 * 	{
 * 		=> 에러에 대한 대비 (사전에 에러 방지) => 에러 복구
 * 	}catch(예외 처리 클래스)
 * 	{
 * 		=> 에러에 대한 대비 (사전에 에러 방지) => 에러 복구 => 다시 입력 (continue)
 * 	finally => 생략이 가능 (필요 시에만 사용)
 * 	{
 * 		파일 닫기 / 서버 닫기 / 오라클 닫기 => 제대로 안 닫으면 => DDOS 공격 위험 !!!
 * 		=> try 수행, catch 수행 => 무조건 수행이 된다
 * 	}
 * 
 * 	흐름
 * 
 * 	# 에러가 없는 상태
 * 
 * 	문장 1
 * 	문장 2
 * 	try
 * 	{
 * 		문장 3
 * 		문장 4
 * 		문장 5
 * 	}catch(예외 처리 클래스)
 * 	{
 * 		문장 6
 * 	}
 * 	finally
 * 	{
 * 		문장 7
 * 	}
 * 
 * 	순서 : 1-2-3-4-5-7
 * 
 * 	# 에러가 있는 상태
 * 
 * 	문장 1
 * 	문장 2 => 에러 1 발생 => 종료
 * 	try
 * 	{
 * 		문장 3
 * 		문장 4 => 에러 2 발생 => catch 이동 후에 finally로 이동 (finally은 어떤 경우에도 무조건 수행)
 * 		문장 5
 * 	}catch(예외 처리 클래스)
 * 	{
 * 		문장 6
 * 	}
 * 	finally => 필요 시에만 사용
 * 	{
 * 		문장 7 => 에러와 상관 없이 무조건 수행
 * 	}
 * 
 * 	에러 1 발생 시 순서 : 1-2
 * 	에러 2 발생 시 순서 : 1-2-3-6-7
 */
public class 예외처리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 에러가 없는 상태
		System.out.println("1");
		System.out.println("2");
		try
		{
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		}catch(Exception e)
		{
			System.out.println("에러 처리 => 6");
		}
		finally
		{
			System.out.println("7");
		}
/*
1
2
3
4
5
7
 */
		// 에러가 있는 상태
		System.out.println("1");
		System.out.println("2");
		try
		{
			System.out.println("3");
			System.out.println(10/0); // catch로 이동
			System.out.println("5");
		}catch(Exception e)
		{
			System.out.println("에러 처리 => 6"); // 에러 확인 => printStackTrace(), getMessage()
		}
		finally
		{
			System.out.println("7"); // 파일 닫기, 오라클 닫기 => 서버 부하가 심하다 => 닫기
		}
/*
1
2
3
에러 처리 => 6
7
 */
	}

}
