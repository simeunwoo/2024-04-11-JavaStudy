/*
 * 	반복문 = 데이터베이스에서 데이터를 읽어 올 때
 * 			파일 읽기 / HTML 화면 출력
 * 
 * 	for-each : 배열 출력, 컬렉션 출력
 * 		=> 출력 전용
 * 		형식) for(배열에 저장된 데이터를 받을 변수:배열)
 * 				 ---------------------- ---
 * 					|					|
 * 				 -------- 데이터형 일치 -------
 * 			=> 자바스크립트 : forEach, each, map
 * 			   -------- for-of
 */
// 3명의 국어 영어 수학 점수를 입력 받아서 총점, 평균, 학점, 등수(2차 for문) 출력
import java.util.Scanner;
public class 중첩_for_7 {
///////////////////////////////////////////////////////////////////// 오류가 있음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 프로그램에 필요한 변수/배열 선언 => 저장 공간 catch
		String[] name=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];
		// 배열은 용도별로 나눠서 저장
				
		// 2. 사용자 입력
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<kor.length;i++)
		{
			System.out.print("이름 입력:");
			name[i]=scan.next();
			System.out.print((i+1)+"번째 국어:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 영어:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 수학:");
			math[i]=scan.nextInt();
			System.out.print((i+1)+"번째 총점:");
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/(double)kor.length;
			
			switch(total[i]/30)
			{
			case 10: case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
		// 순위 결정 => 등수 구하기 알고리즘 = 정보처리문제 / 중소 기업 코딩 테스트 ***
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		
		// 3. 입력된 데이터를 처리 => 요청 처리
		// 4. 처리된 데이터를 화면 출력 (사용자)
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-7s%-5d%-5d%-5d%-5d%-7.2f%3c\n", // '-'는 왼쪽 정렬, '+'는 오른쪽 정렬
					kor[i],eng[i],math[i],total[i],avg[i],score[i]);
		}
		// => 변수 선언 => 프로그램의 85%를 차지
	}

}
