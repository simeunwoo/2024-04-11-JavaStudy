// 사칙연산 => 연산을 1번만 수행 => 다중조건문

import java.util.Scanner;

public class 제어문_조건문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 사용변수
		int a,b;
		char op=' ';
		
		System.out.println("첫째 정수:");
		a=scan.nextInt(); // 변수 => 1개의 데이터를 저장하는 공간
		System.out.println("연산자(+,-,*,/):");
		op=scan.next().charAt(0); // charAt(0) => 맨 앞 1자리의 문자만 출력
		System.out.println("둘째 정수:");
		b=scan.nextInt();
		
		if(op=='+')
		{
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if(op=='-')
		{
			System.out.println(a+"-"+b+"="+(a-b));
		}
		else if(op=='*')
		{
			System.out.println(a+"*"+b+"="+(a*b));
		}
		else if(op=='/')
		{
			if(b==0)
				System.out.println("0으로 나눌 수 없다");
			else
				System.out.println(a+"/"+b+"="+(a/b));
		}
		else
			System.out.println("잘못되었다");
	}

}
