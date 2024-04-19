/*
 * 	반복문 => 중복을 제거할 때 많이 사용
 * 	---- 메소드
 * 	for : 횟수가 지정된 반복
 *			웹 (Back-End => while / Front-End => for)
 *
 *	1. 변수 => 합
 *	2. 조건 / 반복
 *	3. 결과값 출력
 *
 *	반복문 => 1. 반복 횟수 확인
 *			2. 처리 문장
 *			3. 처리된 결과값
 */

import java.util.Scanner;

public class 자바제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~45까지의 정수 중에 6개를 추출해서 출력하는 프로그램 (로또 느낌)
	/*	int num1=(int)(Math.random()*45)+1;
		System.out.print(num1+" ");
		int num2=(int)(Math.random()*45)+1;
		System.out.print(num2+" ");
		int num3=(int)(Math.random()*45)+1;
		System.out.print(num3+" ");
		int num4=(int)(Math.random()*45)+1;
		System.out.print(num4+" ");
		int num5=(int)(Math.random()*45)+1;
		System.out.print(num5+" ");
		int num6=(int)(Math.random()*45)+1;
		System.out.print(num6+" "); */
		
	/*	for(int i=1;i<=6;i++)
		{
			int num=(int)(Math.random()*45)+1;
			System.out.print(num+" ");
		}
		
		int start,end;
		int gop=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		start=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		end=scan.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			gop*=i; // 처리부분
		}
		System.out.println("결과값:"+gop);
		*/
	}

}
