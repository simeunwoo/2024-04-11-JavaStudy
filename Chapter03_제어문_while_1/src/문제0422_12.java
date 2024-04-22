
public class 문제0422_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int min=100;
		for(int i=1;i<=5;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" ");
			if(max<num)
			{
				max=num;
			}
			if(min>num)
			{
				min=num;
			}
		}
		System.out.println();
		System.out.println("최댓값:"+max+", 최솟값:"+min);
	}

}
