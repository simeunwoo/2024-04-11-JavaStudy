import java.util.Scanner;

public class 문제0430_3 {
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:");
		int a=scan.nextInt();
		return a;
	}
	
	static void isYear(int year) {
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
			System.out.println("윤년");
		else
			System.out.println("노윤년");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner scan=new Scanner(System.in);
		// => 클래스 => 키보드를 입력 받아서 메모리에 저장
		// System.in : 키보드 입력값 / System.out : 화면 출력
		//		 inputStream			 outputStream
		// System.in을 이용하여 키보드 입력값을 가지고 올 수 있다
		//		=> 모든 문자를 정수형
		System.out.print("연도 입력:");
		int year=scan.nextInt();
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
			System.out.println("윤년");
		else
			System.out.println("노윤년"); */
		
		int year=input();
		isYear(year);
	}

}
