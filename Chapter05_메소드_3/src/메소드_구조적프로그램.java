/*
 * 	소스가 많은 경우 => 나열 (X) => 기능별 분리
 * 	문장 => 단락을 나눠서 처리
 * 	----------------------------------
 * 	오류 => 해당 메소드만 찾는다
 * 	수정하기 편리하다
 * 	---------------------------------- 구조적인 프로그램
 * 	메소드
 * 
 * 		= 재사용 => 다른 클래스와 연결
 * 			1. 신뢰성이 뛰어나다 (검증이 된 상태)
 * 			2. 소스량을 줄일 수 있다
 * 			3. 개발 속도가 빨라진다
 * 
 * 		= 반복 제거
 * 			같은 내용 소스 코딩 => 1개로 통합	
 * 			수정하기 편리하다
 * 			# 개발 / 유지 보수
 * 			  SI	 SM
 * 			=> 개발 : 1년 (많은 업무량) / 유지 보수 : 10~15년 (조금씩 하는 적은 업무량)		
 */
// 국어, 영어, 수학, 물리, 국사, 화학 점수를 입력 받아서 출력

import java.util.Scanner;

public class 메소드_구조적프로그램 {
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수:");
		int kor=scan.nextInt();
		System.out.print("영어 점수:");
		int eng=scan.nextInt();
		System.out.print("수학 점수:");
		int math=scan.nextInt();
		System.out.print("물리 점수:");
		int phy=scan.nextInt();
		System.out.print("국사 점수:");
		int his=scan.nextInt();
		System.out.print("화학 점수:");
		int che=scan.nextInt(); */
		
		int kor=input("국어"); // 매개변수(입력값) : "국어"=String msg
								// 리턴값(결과값) : input("국어")
		int eng=input("영어");
		int math=input("수학");
		int phy=input("물리");
		int his=input("국사");
		int che=input("화학");
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("물리 점수:"+phy);
		System.out.println("국사 점수:"+his);
		System.out.println("화학 점수:"+che);
	}

}
