/*
 * 	단항연산자
 *
 * 		= 증감연산자 : ++, -- => 1개 증가, 1개 감소
 * 			int a=10;
 * 			a++ => (a+1) => 11
 * 			int a=10;
 * 			a-- => (a-1) => 9
 * 
 * 			==> 전치 연산 : 먼저 증가 후에 대입
 * 				++a
 * 				--a
 * 			==> 후치 연산 : 대입 후에 나중에 증가
 * 				a++
 * 				a--
 * 
 *  		int a=10;
 *  		int b=++a;
 *  		1) a값을 증가
 *  		2) 증가값을 b에 대입
 *  		----------- a=11, b=11
 *  		int a=10;
 *  		int b=a++;
 *  		1) a값을 b에 대입
 *  		2) a값 1개 증가
 *  		----------- a=11, b=10
 *  		*** 이 때 a값은 전치/후치 상관 없이 무조건 1개 증가
 *  
 *  		int a=10;
 *  		int b=++a + ++a + a++
 *  		a => 13 (a값은 3번 증가)
 *  		b => 35 (= 11 + 12 + 12)
 *  
 *  		int a=10;
 *  		int b=a++ + a++ + a++;
 *  		a => 13
 *  		b => 33 (= 10 + 11 + 12)
 *  
 *  		int a=10;
 *  		int b=++a + ++a + ++a;
 *  		a => 13
 *  		b => 36 (= 11 + 12 + 13)
 *  
 *  		int a=10;
 *  		int b=a++ + ++a + a++;
 *  		a => 13
 *  		b => 34 (= 10 + 12 + 12)
 *  
 *  		=> 누적, 제어문(반복문), 총알에 사용
 * 
 * 		= 부정연산자
 * 
 * 		= 형변환연산자 (boolean 제외)
 */
public class 연산자_단항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a + ++a + a++;
		System.out.println("a="+a+",b="+b); // a=13,b=35
		
		int a1=10;
		a1++;
		a1++;
		a1++;
		System.out.println("a1="+a1); // a1=13
		
		int b1=10;
		b1--; // b1-1 = 9
		b1--; // b1-1 = 8
		b1--; // b1-1 = 7
		System.out.println("b1="+b1); // b1=7
		
		int c=10;
		++c;
		++c;
		++c;
		System.out.println("c="+c); // c=13 => 결과값 대입이 아닌 단독일 경우 똑같이 증가
		
		int d=10;
		--d;
		--d;
		--d;
		System.out.println("d="+d); // d=7
	}

}
