/*
 * 	70page
 * 	=> for문과 동일한 반복문
 * 	=> 몇회 반복해서 원하는 값을 얻는다
 * 	   ------ for
 * 	=> 반복 횟수가 명확하지 않을 때
 * 	   ------------------ while
 * 	=> 개발자의 사용하는 % (for를 쓰던 while 쓰던 상관 없다, 대신 효율적으로 사용하자)
 * 
 * 	while
 * 		파일 읽기, 데이터베이스 읽기, 네트워크 서버 => Back-End (while)
 * 		화면 출력, 페이지 나누기 => Front-End (for)
 * 
 * 	형식)
 * 		 초기값
 * 		 while(조건식)
 * 		 {
 * 			반복 수행 문장
 * 			증가식
 * 		 }
 * 	순서)
 * 		 초기값 ------------- 1
 * 		 while(조건식) ------ 2
 * 		 {
 * 			반복 수행 문장 ---- 3
 * 			증가식 ---------- 4 -----> 2번으로 이동
 * 		 }
 * 
 * 		 1 - 2 - 3 - 4 - 2 - 3 - 4 - 2 - 3 - 4 - ... => 2번이 false면 종료
 * 
 * 		while문은 1차까지만 수행할 수 있으면 된다
 * 
 * 		for문과 while문은 서로 언제나 바꿔서 사용할 수 있다
 * 
 * 		while은 무한루프 시에 주로 사용
 * 		for(;;)
 * 		while(true) : *** 주로 사용
 * 
 * 		1) 1~10 출력
 * 			for(int i=1;i<=10;i++)
 * 			{
 * 				System.out.print(i+" ");
 * 			}
 * 			
 * 			int i=1;
 * 			while(i<=10)
 * 			{
 * 				System.out.print(i+" ");
 * 				i++;
 * 			}
 * 
 * 	자바가 어려워?
 * 	=> 오라클(이 어려워?) => SQL(이 어려워)?
 * 	=> HTML/CSS/JavaScript (")
 * 	=> JSP (")
 * 	=> Spring (")
 * 	=> Spring-Boot (")
 * 	=> Python (")
 * 	=> React (")
 * 
 * 	===> 위 것들 중에서 1개라도 내 주종목으로 삼으면
 * 	===> 그쪽 계열 전문 회사로 취직하면 된다(좋다)
 * 	===> 그래도 자바는 기본적인 편이라 잘 배워두면 좋음
 * 
 * 			
 */
public class 자바제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for문 ====="); // ===== for문 =====
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" "); // 1 2 3 4 5 6 7 8 9 10 		
			}
		System.out.println();
		System.out.println("===== while문 ====="); // ===== while문 =====
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" "); // 1 2 3 4 5 6 7 8 9 10 
			i++;
		}
		System.out.println();
		System.out.println(i); // 11
	}

}
