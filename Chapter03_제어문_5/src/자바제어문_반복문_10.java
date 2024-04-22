// 1~100까지의 합을 구해서 출력
public class 자바제어문_반복문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			int sum=0;
			sum+=i;
			System.out.println("sum="+sum); // sum=1(\n)sum=2(\n)...sum=100
		}
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			System.out.println("i="+i+",sum="+sum); // i=1,sum=1...i=100,sum=5050
	}
		System.out.println("1~100 사이의 정수 합:"+sum); // 1~100 사이의 정수 합:5050
	}
}
