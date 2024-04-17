import java.util.Scanner;

public class 문제0417_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a;
		a=scan.nextInt();
		
		if((a%4==0 && a%100!=0) || (a%400==0))
		{
			System.out.println(a+"년도는 윤년입니다");
		}
		else
		{
			System.out.println(a+"년도는 윤년이 아닙니다");
		}
	}

}
