
public class 문제0418_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a=1;a<=10;a++)
		{
		   if(a%2==0)
			   sum-=a;
		   else
			   sum+=a;
		}
		
		System.out.println("1-2+3..-10까지의 합:"+sum);
	}

}
