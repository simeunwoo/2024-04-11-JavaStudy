package com.sist.main;
// 국어, 영어, 수학 점수를 입력 받아서 => 메소드
// 총점 평균 학점 출력 => 4개
import java.util.*;
class Student
{
	// 메소드의 첫번째 목적 : 반복적인 소스 제거 (메소드의 두번째 목적 : 재사용)
	public int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	
	// 총점
	public int totalData(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	
	// 평균
	public double avgData(int total)
	{
		return total/3.0;
	}
	
	// 학점
	public char scoreData(int avg)
	{
		char c='A'; // default 설정
		switch(avg/10)
		{
		case 10: case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
		}
		
		return c;
	}
	
	// 출력 => return total, avg, score
	// total, avg, score=메소드()
	public void print(int kor,int eng,int math,int total,double avg,char score)
	{
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
	}
	
	// 프로그램 실행
	public void process()
	{
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
		int total=totalData(kor,eng,math);
		double avg=avgData(total);
		char score=scoreData((int)avg);
		
		print(kor, eng, math, total, avg, score);
	}
}
public class 성적계산_메소드형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.process();
/*
국어 점수:89
영어 점수:90
수학 점수:97
총점:276
평균:92.00
학점:A
 */
	}

}
