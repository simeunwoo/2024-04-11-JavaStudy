/*
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 	1차 => 줄수 4개 => 1~4
 * 	2차 => ★ => 5개 => 1~5
 * 
 * 		ABCD
 * 		EFGH
 * 		IJKL
 * 		MNOP
 * 
 * 		ABCD
 * 		ABCD
 * 		ABCD
 * 		ABCD
 * 
 *	 	★★☆★★
 * 		★★☆★★
 * 		★★☆★★
 * 		★★☆★★
 * 
 * 		☆★★★★
 * 		★☆★★★
 * 		★★☆★★
 * 		★★★☆★
 * 		★★★★☆
 * 
 * 		★★★★☆
 * 		★★★☆★
 * 		★★☆★★
 * 		★☆★★★
 * 		☆★★★★
 * 
 * 		♠♥♣◈
 * 		♠♥♣◈
 * 		♠♥♣◈
 * 		♠♥♣◈
 */

public class 중첩_for_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		char c='A';
		for(int k=1;k<=4;k++)
		{
			for(int l=1;l<=4;l++) // char a='A' 이렇게 하면 65부터 시작해서 문제 발생
			{
				System.out.print(c++); // 첫줄을 다 돌리면 c='E' 상태가 된다
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		for(int m=1;m<=4;m++)
		{
			char d='A';
			for(int n=1;n<=4;n++)
			{
				System.out.print(d++); // 첫줄을 다 돌려도 그 다음줄을 시작할 때 d='A'로 돌아온다
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		for(int o=1;o<=4;o++)
		{
			for(int p=1;p<=5;p++)
			{
				if(p==3)
					System.out.print("☆");
				else
					System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==i)
					System.out.print("☆");
				else
					System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j+i==6)
					System.out.print("☆");
				else
					System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		String[] a={"♠","♥","♣","◈"};
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j]);
			}
			System.out.println();
		}
				
	}

}
