/*
 * 	대입연산자 => 메모리에 저장
 * 			   ---- 변수
 * 
 * 	= => int a=10;
 * 			 10을 a라는 메모리에 저장 (대입)
 * 	  => 형변환
 * 			int a='A'
 * 			----- ---
 * 			  4	   2	=> 작은 값은 대입이 가능
 * 				=> 'A' => 65로 변경 후에 저장 (char => int)
 *
 * 			long l=20;
 * 			------ --
 * 			  8	   4
 * 				=> 20 => 20L로 변경 후에 저장 (int => long)
 * 			
 * 			double d=20;
 * 				=> 20 => 20.0로 변경 후에 저장 (int => double)
 * 
 *		= 대입연산자
 *		---------
 *		복합대입연산자
 *
 *		+=
 *			int a=10;
 *			a+=1; (a를 1만큼 증가한다) => a=a+1; => a=11;
 *			a+=10; (a를 10만큼 증가한다) => a=a+10; => a=20;
 *		-=
 *			int a=10;
 *			a-=1; (a를 1만큼 감소한다) => a=a-1; => a=9;
 *			a-=10 (a를 10만큼 감소한다) => a=a-10; => a=0;
 *		*=
 *			int a=10;
 *			a*=2; (a를 2만큼 곱한다) => a=a*2; => a=20;
 *		/=
 *			int a=10;
 *			a/=3; (a를 3만큼 나눈다) => a=a/3; => a=3;
 *
 *		int a=10;
 *		a++;
 *		a++;
 *		a++;
 *		a++;
 *		a++;
 *
 *		a+=5; (a++를 5번 한다는 뜻 = a를 5만큼 증가한다는 뜻)
 *
 *		=> 누적, 문자열 결합
 */
public class 연산자_대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println("a="+a); // a=15
		
		int b=10;
		b+=5;
		System.out.println("b="+b); // b=15
		/*
		 *  한개 증가 / 한개 감소
		 *    ++	   --
		 *  여러개 증가 / 여러개 감소
		 *    +=	   -=
		 *    
		 *  int a=10;
		 *  a++ / ++a / a+=1 / a=a+1 => 1개 증가
		 *  
		 *  int a=10;
		 *  a-- / --a / a-=1 / a=a-1 => 1개 감소
		 *  
		 *  int a=10;
		 *  a+=5 => a=a+5 => 5개 증가
		 *  a-=5 => a=a-5 => 5개 감소
		 */
		int score1=10;
		int score2=5;
		score1+=score2; // score1=score1+score2 => score1=10+5=15
		System.out.println("score1="+score1); // score1=15
		score1-=score2; // score1=score1-score2 => score1=15-5-10
		System.out.println("score1="+score1); // score1=10 (변경된 score1을 이용한 결과값)
		
		// 변수값이 변경 => ++, --, +=, -=
		// 나머지 연산자는 변수값 변경이 안된다
		int m=10;
		m++; // 11
		m+=10; // 21
		int n=20;
		System.out.println(n=m+n); // 41
		System.out.println("n="+n); // n=41
	}

}
