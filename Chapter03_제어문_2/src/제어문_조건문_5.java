/*
 * 	if~else
 * 	=> if => 정상수행문자
 * 	=> else => 오류, 잘못된 입력일 경우
 */
// 사칙연산 => 연산자를 잘못 입력한 경우 ... 처리
import java.util.Scanner;
public class 제어문_조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a,b;
		char op=' ';
		System.out.print("첫번째 정수 입력:"); // 첫번째 정수 입력:17
		a=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/):"); // 연산자 입력(+,-,*,/):+
		op=scan.next().charAt(0); // 문자를 앞에서부터 1개 받는 경우
		//							=> +-, +(, ++로 입력해도 +로 나옴
		System.out.print("두번째 정수 입력:"); // 두번째 정수 입력:31
		b=scan.nextInt();
		
		if(op=='+' || op=='-' || op=='*' || op=='/')
		{
			// 정상 수행
			if(op=='+')
				System.out.printf("%d + %d = %d\n",a,b,a+b); // 17 + 31 = 48
			if(op=='-')
				System.out.printf("%d - %d = %d\n",a,b,a-b);
			if(op=='*')
				System.out.printf("%d * %d = %d\n",a,b,a*b);
			if(op=='/')
			{
				if(b==0)
					System.out.printf("0으로 나눌 수 없다");
				else
					System.out.printf("%d / %d = %d\n",a,b,a/b);
			}
		}
			else
		{
			// 연산자가 없는 경우
			System.out.println("잘못된 연산자이다");
		}
	}

}
