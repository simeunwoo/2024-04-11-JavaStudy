
public class 문제0418_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=30;a++)
		{
			if(a%2==0)
			{
				System.out.printf("%d ",a);
				if(a%3==0)
					System.out.println(); // 다음 줄로 넘긴다
			}
				
		}
	}

}
