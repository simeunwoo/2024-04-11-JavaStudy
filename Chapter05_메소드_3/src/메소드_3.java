// => 사용자가 연, 월, 일을 전송하면 => 출력
// => 받아서 출력 / 메소드 출력 => '리턴형 / 리턴형 없이' 모두 가능
import java.util.Scanner;
// 메소드의 목적
// => 재사용 / 반복 제거
public class 메소드_3 {
	// 1. 리턴형 없이
	static void print(int year, int month, int day)
	{
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
	// 2. 리턴형 / 반복 제거
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner scan=new Scanner(System.in); =====> 1. 리턴형 없이
		System.out.print("연도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		System.out.print("일 입력:");
		int day=scan.nextInt();
		print(year,month,day); // 메소드명 자체로 출력 처리 (리턴값 대신) // 1999년 2월 10일
		*/
		
		int year=input("연도"); // =====> 2. 리턴형 / 반복 제거
		int month=input("월");
		int day=input("일");
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}

}
