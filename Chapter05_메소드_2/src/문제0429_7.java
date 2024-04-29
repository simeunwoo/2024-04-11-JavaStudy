import java.util.Scanner;

public class 문제0429_7 {
	static void word(String s)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String abc=scan.next();
		for(int i=abc.length()-1;i>=0;i--)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		word();
	}

}
