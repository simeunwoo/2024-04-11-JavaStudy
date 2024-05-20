package com.sist.main;

public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// try~catch => 수행 (웹에서 필수 => 네트워크와 관련), 오라클 연동 ...
		// 웹, 파일, 오라클 => 예외 처리는 문법 (반드시 추가)
		/*
		 * 	파일을 읽어서 데이터 출력 => 코딩 테스트했을 때 try-catch절이 없으면 0점 처리
		 * 	try
		 * 	{
		 * 		FileReader fr=new FileReader("경로명")
		 * 		int i=0;
		 * 		while((i=fr.read())!=-1)
		 * 		{
		 * 			System.out.print((char)i);
		 * 		}
		 * 		fr.close()
		 * 	}catch(IOException e)
		 */
		
		try
		{
			System.out.println("문장 1");
			System.out.println("문장 2");
			System.out.println("문장 3");
			System.out.println("문장 4");
			System.out.println("문장 5"); // 에러가 없으므로 catch는 건너 뛴다
		}catch(ArithmeticException e) { // catch는 에러가 발생할 시에만 수행
			System.out.println("에러 발생 => 복구");
		}
		System.out.println("문장 6");
		System.out.println("문장 7");
		System.out.println("프로그램 종료");
/*
문장 1
문장 2
문장 3
문장 4
문장 5
문장 6
문장 7
프로그램 종료
 */
		System.out.println("====================");
		try
		{
			System.out.println("문장 1");
			System.out.println("문장 2");
			System.out.println("문장 3");
			System.out.println(10/0); // 에러 발생
			//////////////////////////// => 요 try절 내의 밑의 문장들은 스킵하고 catch절로 간다
			System.out.println("문장 4");
			System.out.println("문장 5");
		}catch(ArithmeticException e) { // 에러 발생 시에 catch절이 없을 경우 그 문장에서 비정상 종료
										// 에러 발생 시에 이에 적절한 예외 처리 클래스가 없는 경우에도 그 문장에서 비정상 종료
			System.out.println("에러 발생 => 복구");
		}
		System.out.println("문장 6");
		System.out.println("문장 7");
		System.out.println("프로그램 종료");
/*
문장 1
문장 2
문장 3
에러 발생 => 복구
문장 6
문장 7
프로그램 종료
 */
/*
############# catch절에 문제가 있을 경우 #############
문장 1
문장 2
문장 3
Exception in thread "main" ... (에러 코드 발생 => 이후 비정상 종료)
 */
	}
}
