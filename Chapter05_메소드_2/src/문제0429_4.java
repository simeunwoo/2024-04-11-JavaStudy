import java.util.Scanner;

public class 문제0429_4 {

	static void a()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수:");
		int num2=scan.nextInt();
		double num3=num1/num2;
		System.out.printf("%d / %d = %.2f",num1,num2,num3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
	}

}
