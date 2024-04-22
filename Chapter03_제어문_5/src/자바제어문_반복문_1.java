/*
 * 	1) 형식
 * 	2) 동작 순서 => 이미지
 * 	3) 출력물
 * 	------------------
 * 	조건문 : 프로그램을 제어 => 사용자 입력 => 처리 (검색), 맛집, 여행지, 우편번호
 * 		= 단일조건문 : if => 단독으로 사용 => 부정연산자, 비교연산자, 논리연산자 => 결과값:true/false
 * 						=> 조건이 true일 경우에 처리 / false면 건너뛴다
 * 		= 선택조건문 : 두개를 나눠서 처리 => true/false / if~else문 : 가장 많이 사용되는 조건문
 * 		= 다중조건문 : 조건에 맞는 경우에만 1번 수행 / if~else if~else if~...~else문
 * 						=> true일 경우 수행하고 종료 / false일 때 다음으로
 * 						=> 마지막에 else는 생략 가능, 조건이 없는 경우 무조건 수행
 * 
 * 	*** 다중조건문은 1개의 조건만 수행
 * 		=> 만약 여러개의 조건을 수행하려면 => 단일조건문을 여러개 사용한다
 * 
 * 	반복문 : 여러개의 반복적인 소스코딩이 있는 경우 사용 / ex) 상품 목록, 영화 목록,...
 * 			출력 내용이 같은 것이 아니라 => 출력 형식이 같은 경우
 * 		=> 10개만 출력 => for : 반복 횟수가 지정된 경우
 * 		=> 웹 화면 UI는 보통 for를 주로 이용
 * 		=> 무한스크롤 : 반복 횟수가 없는 경우 => while
 * 		=> 웹 => for / while
 * 		=> do~while => 반드시 1번 이상 수행 (조건 => 후조건)
 * 
 * 	1) for => 2차 for (중첩 for)
 * 			 =================> 코딩 테스트가 많이 나옴
 * 		= 반복 횟수 지정
 * 		= 형식)
 * 				 1	  2		4
 * 			for(초기값;조건문;증가식)
 * 			{		  |
 * 				반복 수행문 3
 * 			}
 * 		= 순서)
 * 			1 - 2 - 3 - 4 - 2 - 3 - 4 - 2 - 3 - 4 - ... => 2가 false면 종료
 * 				---------	---------	---------
 * 				for문 1바퀴		2바퀴			3바퀴
 * 	2) 예:
 * 		1~10까지 출력
 * 		초기값 : 시작 (어디부터 시작)
 * 		조건식 : 어디까지 증가할 지 지정
 * 		증가식 : 시작값부터 증가
 * 		실행 문장 : true일 때마다 수행
 * 
 * 		for(int i=1;i<=10;i++) => 10번 반복
 * 			-----------------
 * 		
 * 		for(char c='A';c<='Z';c++) => A~Z
 * 		for(int i=10;i>=0;i--) => 감소 => 최신 등록된 데이터 읽기
 * 		for(char c='Z';c='A';c--)		
 */
public class 자바제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" "); // 1 2 3 4 5 6 7 8 9 10 
		}
		System.out.println(); // 다음줄 출력
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" "); // 10 9 8 7 6 5 4 3 2 1 
			
		}
		System.out.println();
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" "); // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
		}
		System.out.println();
		for(char c='Z';c>='A';c--)
		{
			System.out.print(c+" "); // Z Y X W V U T S R Q P O N M L K J I H G F E D C B A 
		}
		// 웹 => 주로 일차 for문 중심 ...
	}

}
