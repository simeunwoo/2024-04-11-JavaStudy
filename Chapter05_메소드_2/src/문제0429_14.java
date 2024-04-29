import java.util.Scanner;

public class 문제0429_14 {
	static void a(int num)
	{
		System.out.println(num);
		String s=String.valueOf(num);
		// valueOf => 모든 데이터형을 문자열로 변환
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		a(num);
	}

}
