import java.util.Scanner;

public class 문제0418_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum=0;
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		for(int i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+a+"까지의 합:"+sum);
	}

}
