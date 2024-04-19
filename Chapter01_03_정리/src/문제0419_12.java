
public class 문제0419_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num="+num);
			if(num%3==0)
				a++;
			if(num%5==0)
				b++;
		}
		System.out.println("3의 배수의 개수:"+a);
		System.out.println("5의 배수의 개수:"+b);
		// 합:sum+=i , 갯수:++
	}

}
