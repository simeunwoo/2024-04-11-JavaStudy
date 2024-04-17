/*
 * 	if~else => 삼항연산자
 * 				(조건)?값:값
 * 				-----
 * 					true
 * 				  ㅣ------- 값1
 * 					false
 * 				  ㅣ------- 값2
 * 
 * 	if(조건문)
 * 	{
 * 		조건 true
 * 	}
 * 	else
 * 	{
 * 		조건 false
 * 	}
 * 
 * 	==============================
 * 
 * 	3개의 정수 (국어,영어,수학)
 * 	=> 학점 : A,B,C,D,F
 * 		=> A+,A0,A- (100~97:+,96~93:0,92~90:-)
 * 
 * 	1. 입력 => 국어,영어,수학 입력 (사용자가 직접)
 * 
 * 	2. 조건에 맞게 학점 부여 (프로그래머가 알맞게 부여 = 사용자의 요청에 대한 처리)
 */
import java.util.Scanner;
public class 제어문_조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); // System.in은 키보드 입력값을 읽어 온다
												// => (사용자->프로그래머)
		/*		1) 정수 : nextInt() => int
		 * 		2) 실수 : nextDouble() => double
		 * 		3) 논리 : nextBoolean() => boolean
		 * 		4) 문자 (X) / 문자열 (O) : next() => String
		 * 		   문자 추출 => next().charAt(index)
		 * 				index 번호 => A B C D E F G ... => A->0,B->1,C->2,...
		 * 							 0 1 2 3 4 5 6 ...
		 * 						  => next().charAt(6) => 'G' => char
		 */
		System.out.print("국어 점수 입력:"); // 국어 점수 입력:95
		int kor=scan.nextInt();
		
		System.out.print("영어 점수 입력:"); // 영어 점수 입력:92
		int eng=scan.nextInt();
		
		System.out.print("수학 점수 입력:"); // 수학 점수 입력:93
		int math=scan.nextInt();
		
		System.out.println("국어 점수:"+kor); // 국어 점수:95
		System.out.println("영어 점수:"+eng); // 영어 점수:92
		System.out.println("수학 점수:"+math); // 수학 점수:93
		System.out.println("총점:"+(kor+eng+math)); // 총점:280
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0); // 평균:93.33
		
		// 학점 => 중첩 조건문
		// 1. 학점 => A,B,C,D,F
		char score='A'; // 'A' 대신 ' ' 가능
		char op='+'; // '+' 대신 ' ' 가능
		// => 지역 변수 => 반드시 초기화 후에 사용
		// 2. operation => op => +,0,-
		int avg=(kor+eng+math)/3;
		if(avg>=90 && avg<=100)
		{
			score='A';
			if(avg>=97)
			{
				op='+';
			}
			if(avg>=93 && avg<97)
			{
				op='0';
			}
			if(avg>=90 && avg<93)
			{
				op='-';
			}
		}
		if(avg>=80 && avg<90)
		{
			score='B';			
		}
		if(avg>=70 && avg<80)
		{
			score='C';
		}
		if(avg>=60 && avg<70)
		{
			score='D';
		}
		if(avg<60)
		{
			score='F';
		}
		System.out.println("학점:"+score+""+op); // 학점:A0 (+op앞에 "" 빼고 했을 때 오류 없었음)
	}

}
