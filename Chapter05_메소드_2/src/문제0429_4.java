// 리터럴 (O) / 매개변수 (O)
import java.util.Scanner;

public class 문제0429_4 {

	static double div(int a,int b)
	{
		double d=0.0;
		try
		{
			d=a/(double)b; // 정상 수행
		}catch(Exception e)
		{
			System.out.println("0으로 나눌 수 없다"); // 오류 발생
		}
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("둘째 정수 입력:");
		int num2=scan.nextInt();
		double res=div(num1,num2);
		System.out.println("res="+res);
	}

}
