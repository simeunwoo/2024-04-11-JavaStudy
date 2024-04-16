/*
 * 		국어 영어 수학 점수를 입력 받아서
 * 		총점, 평균
 * 		학점 => 100~90 : A
 * 			   89~80 : B
 * 			   79~70 : C
 * 			   69~60 : D
 * 				59~	: F
 */

import java.util.Scanner;

public class 제어문_단일조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		// 필요한 변수 선언
		int kor,eng,math;
		char score='A';
		
		// 입력값을 받아서 초기화
		System.out.println("국어 점수:"); // 국어 점수:76
		kor=scan.nextInt();
		
		System.out.println("영어 점수:"); // 영어 점수:87
		eng=scan.nextInt();
		
		System.out.println("수학 점수:"); // 수학 점수:93
		math=scan.nextInt();
		
		// 국어, 영어, 수학 점수의 범위를 0~100 사이로 제한하는 문장도 만들어야 한다
		
		// 학점 계산
		int avg=(kor+eng+math)/3;
		
		if(avg>=90 && avg<=100)
		{
			score='A';
		}
		if(avg>=80 && avg<=89)
		{
			score='B';
		}
		if(avg>=70 && avg<=79)
		{
			score='C';
		}
		if(avg>=60 && avg<=69)
		{
			score='D';
		}
		if(avg<=59)
		{
			score='F';
		}
		
		System.out.println("학점:"+score+"학점"); // 학점:B학점
		
		// 출력
		System.out.println("=== 결과값 ==="); // === 결과값 ===
		System.out.println("국어 점수:"+kor); // 국어 점수:76
		System.out.println("영어 점수:"+eng); // 영어 점수:87
		System.out.println("수학 점수:"+math); // 수학 점수:93
		System.out.println("총점:"+(kor+eng+math)); // 총점:256
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0); // 평균:85.33
		// => \n => new Line => ln
		// => \t => tab => 일정 간격을 둔다
	}

}
