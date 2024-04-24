/*
 * 	자바 => Application / Web / Mobile
 * 						----
 * 	개발 방법
 * 	------
 * 	  데이터 저장 =============> 데이터 가공 (사용자 요청) =============> 화면에 출력
 * 	  --------	  			  ------------------
 * 		한개 저장 : 변수				명령문을 모아서 관리 => = 사용자 입력 부분
 * 		여러개 저장 : 배열, 클래스							  = 사용자 요청 처리 부분
 * 		*** 배열 (교재 4장)								  = 결과값 도출
 * 		=> 1차원 배열									  -----------------
 * 		=> 같은 데이터를 여러개 모아서 관리 (한개 이름으로 처리)	  1) 재사용
 * 		=> 장점										  2) 유지보수가 편리
 * 		   변수 여러개를 한개의 이름으로 제어 => 반복문 사용이 편리	  -----------------
 * 		   연속적 메모리 공간을 만든다						  ***** 메소드
 * 		   ------------- 인덱스 번호를 사용해서 처리		  -----------------
 * 		=> 단점										  => 변수 / 메소드 => 클래스 (조합)
 * 		   고정적이다 => 추가, 삭제하기가 어렵다 (큰 배열, 작은 배열)
 * 		   같은 데이터형만 모아서 관리
 * 		   => 보완 (가변형, 다른 데이터형을 모아서 관리 => 컬렉션 => 12장)
 * 		*** 클래스 (교재 5장)
 * 		=> 다른 데이터를 여러개 모아서 관리 (한개의 이름으로 처리)
 * 		*** 변수 / 연산자 / 제어문 => 기본 문법
 * 			----------------- 모아서 관리
 * 		*** 변수 => 100개 a1~a100 => 최댓값, 최솟값
 * 				   if문 99번? 보다는 for문 1번이 낫다
 * 			그런데, 단점
 * 		=> 변수 / 배열 / 클래스 => 메모리에 저장 : RAM 프로그램 종료 시 삭제
 * 		   ----------------
 * 			영구적인 저장 장치를 생각함
 * 			= 파일 => 파일 여러개를 연결해서 사용하기 어렵다, 보안에 취약
 * 			= RDBMS => 관계형 데이터 베이스 (교재 15장)
 * 			  파일 => table
 * 			  ------------------------ 오라클 / MySQL / MS-SQL / MariaDB
 *											  -----			   -------
 *											 무료 버전			 	무료 버전
 *										 (3차 프로젝트 때 둘 중에 하나 사용해 볼 듯) 
 * 		***** 메소드
 * 		게시판
 * 		= 목록 출력 기능 => 묶는다
 * 		= 글쓰기
 * 		= 상세보기
 * 		= 삭제
 * 		= 수정
 * 		= 검색
 * 			=> 오더가 요청
 * 		= 댓글형 게시판
 * 		게시판 => 상속 받아서 처리 => 댓글 추가 => 재사용 (유지보수)
 * 
 * 		개발 => 누가 잘 모아서 관리
 * 			   -------------- 수정, 삭제, 추가가 쉽게 만드는 작업
 * 				=> 변수 + 연산자 + 제어문 => 기능별로 모아서 처리
 * 				=> 헌책방 vs 교보문고 => 나누지 않음 vs 기능별 나누기 => 패키지
 * 				=> 코딩 시 교보문고와 같은 방법을 써야
 * 				=> java.io / java.util / javax.swing
 * 				   ---------------------------------
 * 					1차 (O) => 2차 (X)
 * 					JSP		  Spring
 * 					--- Spring 형식
 * 						---------- 구조
 *
 *	1. 변수 여러개를 모아서 관리
 *		int a,b,c,d,e,f,g; => 변수 7개
 *			=> int [] arr=new int[7];
 *		double d1,d2,d3,...;
 *			=> double[] arr=new double[갯수];
 *			=> 배열 데이터형 배열명 = new 저장 갯수
 */
// 84page => 배열 필요성
// 3명의 학생 => 국어, 영어, 수학 => 1. 총점, 2. 평균, 3. 학점
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor1, kor2, kor3;
		int eng1, eng2, eng3;
		int math1, math2, math3;
		int total1, total2, total3;
		double avg1, avg2, avg3;
		char score1, score2, score3;
		
		// 점수 입력 => 낱개로 적으면 점수를 9번 적어야 되서 비효율적임
		System.out.print("첫째 학생의 국어 점수:");
		kor1=scan.nextInt();
		System.out.print("첫째 학생의 영어 점수:");
		eng1=scan.nextInt();
		System.out.print("첫째 학생의 수학 점수:");
		math1=scan.nextInt();
		System.out.print("둘째 학생의 국어 점수:");
		kor2=scan.nextInt();
		System.out.print("둘째 학생의 영어 점수:");
		eng2=scan.nextInt();
		System.out.print("둘째 학생의 수학 점수:");
		math2=scan.nextInt();
		System.out.print("셋째 학생의 국어 점수:");
		kor3=scan.nextInt();
		System.out.print("셋째 학생의 영어 점수:");
		eng3=scan.nextInt();
		System.out.print("셋째 학생의 수학 점수:");
		math3=scan.nextInt();
		// 총점
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		// 평균
		avg1=total1/3.0;
		avg2=total2/3.0;
		avg3=total3/3.0;
		// 학점
		switch(total1/30)
		{
		case 10: case 9:
			score1='A';
			break;
		case 8:
			score1='B';
			break;
		case 7:
			score1='C';
			break;
		case 6:
			score1='D';
			break;
		default:
			score1='F';
		}
		switch(total2/30)
		{
		case 10: case 9:
			score2='A';
			break;
		case 8:
			score2='B';
			break;
		case 7:
			score2='C';
			break;
		case 6:
			score2='D';
			break;
		default:
			score2='F';
		}
		switch(total3/30)
		{
		case 10: case 9:
			score3='A';
			break;
		case 8:
			score3='B';
			break;
		case 7:
			score3='C';
			break;
		case 6:
			score3='D';
			break;
		default:
			score3='F';
		}
		// 결과값 출력
		/*
		 * 	%-5d : 00000 (뒤에서부터)(5칸) / 90 => 90---90---90---...
		 * 	%5d : 00000 (앞에서부터)(5칸) / 90 => ---90---90---90...
		 * 		=> 간격 조절 역할
		 */
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
				kor1,eng1,math1,total1,avg1,score1); // 92   87   99   278    92.67  A  
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
				kor2,eng2,math2,total2,avg2,score2); // 95   79   58   232    77.33  C  
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
				kor3,eng3,math3,total3,avg3,score3); // 89   88   60   237    79.00  C  
	}

}
