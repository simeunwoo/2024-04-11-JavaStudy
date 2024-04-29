import java.util.Scanner;

public class 문제0429_7 {
	static void word(String msg)
	{
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		//	System.out.println(new StringBuffer(msg).reverse());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String abc=scan.next();
		word(abc);
	}

}
