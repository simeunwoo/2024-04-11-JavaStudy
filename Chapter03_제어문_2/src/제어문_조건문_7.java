/*
 * 	1. 형식 => 어떤 곳에서 사용
 * 	2. 흐름 파악 => 동작 순서
 * 	3. 응용
 * 	---------------------
 * 	1) 제어문 : 프로그램 제어
 * 			  --------- 요청한 내용만 출력, 반복 수행, 선택된 내용만 출력
 * 						-------------  ------  -------------
 * 								ㅣ		반복문		선택문
 * 							필요 시에 건너뛸 수도 있다(if)
 * 
 * 			반복문 => 중단->break / 다시 시작->continue
 * 
 * 		=> 조건문 : 오류처리, 건너뛴다 ... 사용자 요청에 맞는 내용만 출력
 * 			단일조건문 : 독립적인 문장 (조건에 맞는 모든 문장을 수행, 1개만 수행 X)
 * 				=> true에 수행, false면 건너뛴다
 * 			선택조건문 : true/false => 나눠서 처리
 * 				=> if~else 형식 => if는 true에 수행, else는 false에 수행
 * 			다중조건문 : 여러개의 조건 중에 1개만 출력 => 58page
 * 			형식)
 * 				if (조건문)
 * 				{
 * 					조건문 => true 문장 수행 => 종료
 * 						false
 * 				}		  ㅣ
 * 				else if (조건문)
 * 				{
 * 					조건문 => true 문장 수행 => 종료
 * 						false
 * 				}		  ㅣ
 *  			else if (조건문)
 * 				{
 * 					조건문 => true 문장 수행 => 종료
 * 						false
 * 				}		 ㅣ
 *  			else (조건문)
 * 				{
 * 					해당 조건이 없는 경우에 수행 문장 => 필요 시에만 처리 (생략이 가능)
 * 				}
 *				--------------- 한개의 문장
 *				if~else => 단일조건문 => 다중조건문
 *										ㅣ
 *									   게임 => 키 선택
 *									   메뉴 => 대체 switch~case
 *		-----------------------------------------------------
 * 
 */
// 성적 계산 => 다중 조건문 => 자주 풀어본다 (응용력 상승을 위해)
import java.util.Scanner;
public class 제어문_조건문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 클래스 메모리 저장 => new
		// System.in => 키보드 입력값
		System.out.print("국어 점수:"); // 국어 점수: // print()->바로옆에코딩
		int kor=scan.nextInt();					//	println()->바로밑에코딩
		System.out.print("영어 점수:"); // 영어 점수:
		int eng=scan.nextInt();
		System.out.print("수학 점수:"); // 수학 점수:
		int math=scan.nextInt();
		
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		// 요청 => 학점 => 다중조건문
	}

}
