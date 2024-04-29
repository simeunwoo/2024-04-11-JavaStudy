// 리턴형 (O) => 1~n의 합 / 매개변수 (O) => n
import java.util.Scanner;
public class 문제0429_3 {
	static int number(int n) // int n : 사용자의 요청값 (매개변수)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;	
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:\n");
		int n=scan.nextInt();
		int sum=number(n);
		System.out.println("sum="+sum);
		
	}

}
