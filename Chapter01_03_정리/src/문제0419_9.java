
public class 문제0419_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a2=0,a3=0;
		for(int i=0;i<=12;i++)
		{
			
			if(a2%2==0)
				{a2+=i;}
			if(a3%3==0)
				{a3+=i;}
		}
		System.out.println("2의 배수의 합:"+a2);
		System.out.println("3의 배수의 합:"+a3);

}
}