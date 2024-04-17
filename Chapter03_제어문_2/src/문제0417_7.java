//import java.util.Scanner;

public class 문제0417_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner scan=new Scanner(System.in); => 첫번째 방법
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
*/
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int ops=(int)(Math.random()*4); // 0~3
		
		char op=' ';
		if(ops==0) op='+';
		else if(ops==1) op='-';
		else if(ops==2) op='*';
		else if(ops==3) op='/';
		
		int c=0;
		if(op=='+') c=a+b;
		else if(op=='-') c=a-b;
		else if(op=='*') c=a*b;
		else if(op=='/') c=a/b;
		
		System.out.printf("%d %c %d = %d",a,op,b,c);
		// 프로그램 => 개발 없어도 유지보수(재사용) 많음 => 수정/추가
		// 자바는 유지보수에 유용하고 유행함
}
}
