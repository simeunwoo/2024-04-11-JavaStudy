import java.util.Scanner;

public class 문제0419_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
/*		System.out.print("첫번째 주사위 결과:");
		int a=scan.nextInt();
		System.out.print("두번째 주사위 결과:");
		int b=scan.nextInt();
		int total=(a+b);
		
		if(total==6)
		{
			if(a>=1 && a<=5)
			{
				System.out.println("첫번째 결과:"+a+", 두번째 결과:"+b+", 합:6");
			}
			else
			{
				System.out.println("경우에 맞지 않다");
			}
		}
		else
		{
			System.out.println("경우에 맞지 않다");
		} */
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i+j==6)
				{
					System.out.printf("[%d,%d]\n",i,j);
				}
			}
		}
	}

}
