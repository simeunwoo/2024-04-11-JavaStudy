import java.util.Scanner;

public class 문제0417_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		System.out.print("+,-,*,/ 입력:");
		System.out.print("정수 입력:");
		int a,b;
		char c=' ';
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.next().charAt(0);
		
		if(c=='+')
		{
			System.out.printf("%d + %d = %d",a,b,a+b);
		}
		if(c=='-')
		{
			System.out.printf("%d - %d = %d",a,b,a-b);
		}
		if(c=='*')
		{
			System.out.printf("%d * %d = %d",a,b,a*b);
		}
		if(c=='/')
		{
			if(b==0)
			System.out.println("0으로 나눌 수 없다");
			else
			System.out.printf("%d / %d = %d",a,b,a/b);
		}
	}

}
