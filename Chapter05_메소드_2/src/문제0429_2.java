// 리턴형 (O) / 매개변수 (X)
public class 문제0429_2 {
	static int number()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;	
		}
		return sum; // '값 = 리턴형에 사용되는 데이터형'이 동일해야 한다
		// 특별한 경우에는 return 값이 작을 수도 있다
		// 값 <= 리턴형에 사용되는 데이터형 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(number()); // 리턴형이 있는 경우
	}

}
