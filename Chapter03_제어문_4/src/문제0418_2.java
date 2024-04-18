import java.util.Scanner;

public class 문제0418_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		System.out.print("+,-,*,/");
		char c=scan.next().charAt(0);
		System.out.print("정수 입력:");
		int b=scan.nextInt();
		
		switch(c)
		{
		case '+':
			System.out.printf("%d + %d = %d",a,b,(a+b));
			break;
		case '-':
			System.out.printf("%d - %d = %d",a,b,(a-b));
			break;
		case '*':
			System.out.printf("%d * %d = %d",a,b,(a*b));
			break;
		case '/':
			if(b==0)
				System.out.println("0으로 못 나눔");
			else
				System.out.printf("%d / %d = %d",a,b,(a/b));
			break;
		}
	}

}
