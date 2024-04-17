/*
 * 	단일조건문의 단점
 * 
 * 	if(조건문)
 * 	{
 * 	}
 * 	--------
 * 	if(조건문)
 * 	{
 * 	}
 * 	-------- 독립문장 => 속도가 느리다
 * 				=> 다중조건문처럼 한번에 빠지지 못하고 하나하나 다 출력하고 빠져야한다
 * 
 * 	=> 단일조건문 (한개를 중점적?으로 쓸 때)
 *  짝수냐 홀수냐? => 다중조건문 (여러개 쓸 때) => 짝수면 홀수여부를 무시하고 바로 true로 끝
 *  
 *  선택조건문 => true/false => 나눠서 처리 (if/else)(뒤에 무시 X)
 *  	형식)
 *  	if(조건문)
 *  	{
 *  		조건이 true일 때 처리
 *  	}
 *  	else
 *  	{
 *  		조건이 false일때 처리
 *  	}
 *  
 *  	***
 *  	if(조건문)
 *  	{
 *  	}
 *  	--------- => 단독문장
 *  	if(조건문)
 *  	{
 *  	}
 *  	else
 *  	{
 *  	}
 *  	---------
 */
// 짝수 => num%2==0 / 홀수 => num%2!=0
/*
 * 	if
 * 	=> 정상 수행
 * 	else
 * 	=> 오류 => 입력 문제
 * 	-----------------
 * 	오류
 * 	1) 프로그래머의 실수 => 실수를 잡기 어렵다 => 예외처리
 * 	2) 사용자 입력 => if~else로 잡을 수 있다
 */
public class 제어문_조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*100)+1;
		System.out.println("num="+num); // 36
		if(num%2==0)
		{ // true일 때 처리
			System.out.println(num+"는(은) 짝수이다"); // 36는(은) 짝수이다
		}
	//	if(num%2!=0) => 첫번째 방법
		else // => 두번째 방법
		{ // false일 때 처리
			System.out.println(num+"는(은) 홀수이다");
		}
	}
}
