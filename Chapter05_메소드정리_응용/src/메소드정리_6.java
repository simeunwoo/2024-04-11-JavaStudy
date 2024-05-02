/* (메소드정리_5 참고)
 * 
 * 	메소드
 * 		=> 지역변수, 매개변수 => 메소드가 종료되면 자동으로 사라진다
 * 		=> 사라지지 않는 변수 제작 => 매개변수가 필요 없다 => 멤버변수
 */

import java.util.Scanner;

public class 메소드정리_6 {
	// 멤버변수, 공유변수 => 클래스 전체에서 사용
	// 지역변수 : 메소드 안에서 사용 => 리턴형
	// ------ 매개변수 : 메소드 안에서만 사용
	
	static int[] kor=new int[3]; // 요런 것들 => 멤버변수
	static int[] eng=new int[3];
	static int[] math=new int[3];
	static int[] total=new int[3];
	static double[] avg=new double[3];
	static char[] score=new char[3];
	static int[] rank=new int[3];
	// 클래스 블록에 선언되면 모든 메소드는 변수 사용이 가능
	// => 프로그램 종료 시에 메모리에서 해제
	
	static void userInput() // 위에 멤버변수 덕분에 굳이 매개변수를 안 넣어도 됨
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"번째 국어:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			switch(total[i]/30)
			{
			case 10: case 9:
				score[i]='A';
			case 8:
				score[i]='B';
			case 7:
				score[i]='C';
			case 6:
				score[i]='D';
			default:
				score[i]='F';
			}
		}
	}
	
	static void rankChange()
	{
		for(int i=0;i<total.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<total.length;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
	}
	
	static void print()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(kor[i]+" "
					+eng[i]+" "
					+math[i]+" "
					+total[i]+" "
					+avg[i]+" "
					+score[i]+" "
					+rank[i]);
		}
	}
	
	static void process()
	{
		userInput(); // 요 안에도 굳이 안 넣어도 됨 (편리함) / 오히려 넣으면 에러 뜸
		rankChange();
		print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
