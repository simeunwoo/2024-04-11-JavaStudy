/*
 * 	논리연산자 => 결과값은 true/false
 * 	&& => 직렬연산자 => 범위, 기간 포함
 * 		jumsu>=0 && jumsu<=100 / 0~100 사이에 있는지
 * 	|| => 병렬연산자 => 범위, 기간을 벗어난 경우
 * 		jumsu<0 || jumsu>100 => 오류 처리
 * 
 * 	(조건) && (조건)
 *  ----	 ----
 *   ㅣ		  ㅣ
 *   -----------
 *   	  ㅣ
 *   	 결과값
 *   
 *  (조건) || (조건)
 *  ----	 ----
 *   ㅣ		  ㅣ
 *   -----------
 *   	  ㅣ
 *   	 결과값
 *   
 *   ------------------------------------
 *   				 &&			||
 *   ------------------------------------
 *    true true	 	true	   true
 *   ------------------------------------
 *    true false	false	   true
 *   ------------------------------------
 *    false true	false	   true
 *   ------------------------------------
 *    false false	false	   false
 *   ------------------------------------
 *   
 *   # &&에서 하나만 false여도 무조건 false => 최적화연산
 *   # ||에서 하나만 true여도 무조건 true => 최적화연산
 */
public class 연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=9;
		boolean bCheck= x==y && ++y==x; // x==y에서 이미 false이므로 뒤쪽과 상관없이 무조건 false
		//				----
		//				false => 효율적인 연산
		// boolean bCheck= x==y || ++y==x; // 이 경우 x=10, y=10이 나온다
		//				   ----				// ||에서 앞이 false이므로 뒤에도 계산해봐야 한다
		//				   true => 효율적인 연산
		System.out.println("bCheck="+bCheck); // bCheck=false
		System.out.println("x="+x); // x=10
		System.out.println("y="+y); // y=9
		
	}

}
