/*
 * 	65page
 * 
 * 	반복 제어문
 * 		= for ***(많이 쓰임) => 화면 출력 = 갯수 확정 => 반복 횟수 지정
 * 		= while => 데이터베이스 = 무한 스크롤 => 반복 횟수 지정이 없는 상태
 * 	--------------------------------------------------------- 한번도 수행을 못할 수도 있다
 * 																=> 조건 : 선조건
 * 		= do~while => 빈도수가 거의 없다
 * 	--------------------------------------------------------- 무조건 한번 이상 수행
 * 																=> 조건 : 후조건
 * 
 * 	=> for
 * 	형식)				ㅣ true => 반복수행문장
 * 					ㅣ false => 종료
 * 				1	  2		4
 * 			for(초기값;조건식;증가식) => 2차 for문까지 알 필요가 있다 => 코딩 테스트 단골****************
 * 			{
 * 				반복 수행문장 3
 * 			}
 * 
 * 	=> while
 * 	형식)		초기값 ------------- 1
 * 			while(조건식) ------ 2 => false면 종료
 * 			{
 * 				반복 수행문장 ---- 3
 * 				증가식 --------- 4 => 조건식으로 이동
 * 			}
 * 
 *  => do~while
 *  형식)		do {
 *  			반복문장
 *  			증가식
 *  		} while(조건식)
 *  
 *  => 자바의 모든 프로그램은 (변수/연산자/if,for) = 영어로 따지면 (알파벳) 느낌
 *  => 관련된 내용끼리 묶어서 사용 : (배열/클래스/메소드) = 영어로 따지면 (단어/문장/회화) 느낌 => 재사용
 *  
 *  ==============================================================================
 *  
 *  ### for : 반복문 => 가장 많이 사용되는 반복문
 *  	=> for-each
 *  
 *  	1) 형식
 *  		for(초기값;조건식;증가식)
 *  		{
 *  			반복 수행 문장
 *  		}
 *  		초기값 : 시작점 int i=1
 *  		조건식 : 끝점 i<=10
 *  		증가식 : i++
 *  	2) 동작 순서
 *  		for(①초기값;②조건식;③증가식)
 *  		{
 *  			반복 수행 문장 ④
 *  		}
 *  		①->②->④->③->②->④->③->②->④->③->②->...
 *  			  -------  -------  ------- => ②에서 false면 종료
 *  
 *  		①->②에서 false => for문 종료
 *  				true => 반복문장 수행
 *  	3) 구현
 */
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo");
		System.out.println("Hello Sim Eun-Woo"); */
		
	/*	for(int i=1;i<=10;i+=2) // 1,3,5,7,9
		{
			System.out.println(i+":Hello Sim Eun-Woo");
		} */
		
		for(int i=10;i>=1;i--) // 초기값은 첫번째 값, 마지막 값이 될 수 있다
								// => 따라서 증가식은 경우에 따라 증감식이 될 수도 있다
			System.out.println(i+"위");
		// 방문 => cookie에 저장 클릭한 순서로 저장 => 뒤에서부터 출력
		// 웹 => 최신순 (뒤에서부터 출력 = 거꾸로 출력)
	}

}
