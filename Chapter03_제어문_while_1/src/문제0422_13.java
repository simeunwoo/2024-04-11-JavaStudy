
public class 문제0422_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*10)+1;
			sum+=num;
			System.out.print(num+" ");	
		}
		System.out.println();
		System.out.printf("평균은 %.2f",sum/10.0);
	}

}
