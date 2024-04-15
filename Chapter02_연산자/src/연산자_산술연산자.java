import java.util.*; // 자바에서 지원하는 라이브러리를 읽어온다
public class 연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의로 변수 지정 => int a=100
		// 변수 선언
		int num1,num2; // 지금 사용하면 오류 발생 => 변수는 초기화 (값 지정)
		// 초기화
		Random r=new Random(); // 임의의 수를 컴퓨터에서 추출해준다
		num1=r.nextInt(101); // 0~100 사이의 정수 추출 (마지막은 제외)
		num2=r.nextInt(101);
		System.out.println("num1="+num1); // num1=22 (임의의 수 지정됨)
		System.out.println("num2="+num2); // num2=78 (임의의 수 지정됨)
		// +
		int plus=num1+num2;
		System.out.println("plus="+num1+num2); // plus=2278
		System.out.println("plus="+(num1+num2)); // plus=100 => ()는 최우선 순위 연산자
		// 연산 우선 순위 : () => *, /, % => +, -
		System.out.println(5+5*10); // 55
		System.out.println((5+5)*10); // 100
		
		int minus=num1-num2;
		System.out.println("minus="+minus); // -56
		
		int gopagi=num1*num2;
		System.out.println("gopagi="+gopagi); // 1716
		
		int a=10;
		int b=3;
		System.out.println(a/b); // 3 (소수점은 제외)
		System.out.println(a%b); // 1
		System.out.println(a/(double)b); // 3.333333333333333
										 // int => double로 변경 / (double)변수명 => 데이터형 변경
										 // 값이 있는 경우 => .0
		System.out.println(-a%-b); // -1 (왼쪽의 a의 부호를 따라간다)
	}

}
