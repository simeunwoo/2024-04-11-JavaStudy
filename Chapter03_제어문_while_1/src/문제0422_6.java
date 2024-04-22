
public class 문제0422_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int 갯수=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
				{sum+=i;
				갯수++;}
		}
		System.out.println("갯수:"+갯수);
		System.out.println("합:"+sum);
	}

}
