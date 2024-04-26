/*
 *		★
 *		★★
 *		★★★
 *		★★★★
 *
 *		★★★★
 *		★★★
 *		★★
 *		★
 *
 *		   *
 *		  **
 *		 ***
 *		****
 *		줄수 공백 별표
 *		i	j	k
 *		1	3	1
 *		2	2	2
 *		3	1	3
 *		4	0	4
 *		=> 공백 => i+j=4 => j=4-i
 *		=> 별표 => k=i
 *
 *		****
 *		 ***
 *		  **
 *		   *
 *		줄수 공백 별표
 *		i	j	k
 *		1	0	4
 *		2	1	3
 *		3	2	2
 *		4	3	1
 *		=> 공백 => j=i-1
 *		=> 별표 => i+k=5 => k=5-i
 */
public class 중첩_for_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) // 몇줄이냐?
		{
				for(int j=1;j<=i;j++) // 한줄에 몇개 출력하냐?
				{
					System.out.print("★");
				}
			System.out.println();
		}
		
		System.out.println("=============");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("=============");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=============");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
