
public class 문제0422_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int 갯수=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
				{sum+=i;
				갯수++;}
		}
		System.out.println("7의 배수 갯수:"+갯수);
		System.out.println("7의 배수 합:"+sum);
	}

}
