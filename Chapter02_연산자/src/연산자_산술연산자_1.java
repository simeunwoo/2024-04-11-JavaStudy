/*
 * 	+
 * 	---
 * 	1) 산술연산자 (더하기 연산자)
 * 		7+7=14
 * 	2) 문자열 결합
 * 		"7"+7 => "77"
 * 		7+"7" => "77"
 * 		7+7+"7" => "147" (앞에서부터 계산)
 * 		7+"7"+7+7 => "7777"
 * 		7+"7"+7*7 => "7749" (곱하기 -> 더하기 순으로 계산)
 * 		() => 우선순위 변경
 * 		/ => 정수/정수=정수
 * 		% => 나머지는 왼쪽 부호를 따라간다
 * 		*** 같은 데이터형끼리 연산이 된다
 * 		int + long => long + long = long
 * 		double + double => double + double = double
 * 		===> 최종 결과값은 가장 큰 데이터형을 결과값으로 처리된다
 * 
 */
public class 연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		int i=10;
		System.out.println(c+i); // 75
		// double + int => double
		double d=10.5;
		System.out.println(i+d); // 20.5 (i=10.0으로 변경 후 계산됨)
		byte b1=10;
		byte b2=20;
		// byte b3=b1+b2; => 오류 => int 이하 데이터형은 연산 결과가 int로 나옴 (byte로 받으므로 오류가 나옴)
		int b3=b1+b2;
		System.out.println(b3); // 30
		
		// char + char = int
		char c1='A';
		char c2='B';
		int c3=c1+c2;
		System.out.println(c3); // 131 (= 65 + 66)
		
		// char + byte + double + float => double
		char d1='A';
		byte d2=100;
		double d3=10.5;
		float d4=10.5F;
		System.out.println(d1+d2+d3+d4); // 186.0
		
		// int + long + float => float
		int e1=100;
		long e2=100L;
		float e3=10.5F;
		System.out.println(e1+e2+e3); // 210.5
		
		// byte < char < int < long < float < double
		// 데이터형이 다른 경우 => 자동 변경
		
	}

}
