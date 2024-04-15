/*
 * 	비교연산자 => 숫자에서만 사용이 가능 (문자열은 비교가 불가능)
 * 	X "aaa"=="aaa" => equals()
 * 	*** 비교연산자는 결과값 => true/false => 조건문에서 주로 사용
 * 	== 같다
 * 		자바스크립트 (===)
 * 		오라클 (=)
 * 	! 같지 않다
 * 	< 작다 => 왼쪽에 있는 데이터 기준
 * 	> 크다
 * 	<= 작거나 같다 (<, ==)
 * 	>= 크거나 같다 (>, ==)
 * 
 * 	6==7 => false
 * 	6!=7 => true
 * 	6>7 => false
 * 	6<7 => true
 * 	6<=7 => true (6<7, 6==7)
 * 	6>=7 => false (6>7, 6==7)
 * 
 * 	### char
 * 	'A'=='B' / 'A'!='B'...
 * 
 * 	1) 단항연산자 / 산술연산자 / 비교연산자 / 대입연산자 / 논리연산자 / 형변환
 * 		변수 / 연산자 / 제어문 => 묶음
 */
public class 연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 비교
		int a=(int)(Math.random()*100)+1; // 1~100 사이의 임의의 수를 추출
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a+",b="+b); // a=75,b=30
		
		System.out.println("====== 비교 ======"); // ====== 비교 ======
		
		System.out.println("a==b:"+(a==b)); // a==b:false
		System.out.println("a!=b:"+(a!=b)); // a!=b:true
		System.out.println("a<b:"+(a<b)); // a<b:false
		System.out.println("a>b:"+(a>b)); // a>b:true
		System.out.println("a<=b:"+(a<=b)); // a<=b:false // a<b와 a==b 중에서 하나라도 맞으면 true
		System.out.println("a>=b:"+(a>=b)); // a>=b:true // a<b와 a==b 중에서 하나라도 맞으면 true
											// 44page
		System.out.println("====== 알파벳 비교 ======"); // ====== 알파벳 비교 ======
		
		char c=(char)((int)(Math.random()*26)+97); // Math.random()*26 => 0~25
		char d=(char)((int)(Math.random()*26)+97);
		// Math.random(), *26, (int), +, (char) 순으로 계산 // 97 => 'a'
		System.out.println("c="+c+",d="+d); // c=m,d=q
		
		System.out.println("c==d:"+(c==d)); // c==d:false
		System.out.println("c!=d:"+(c!=d)); // c!=d:true
		System.out.println("c<d:"+(c<d)); // c<d:true
		System.out.println("c>d:"+(c>d)); // c>d:false
		System.out.println("c<=d:"+(c<=d)); // c<=d:true
		System.out.println("c>=d:"+(c>=d)); // c>=d:false
	}

}
