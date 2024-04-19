import java.util.Scanner;

public class 문제0419_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("입력:");
		char c=scan.next().charAt(0);
		
		if(c>='0' && c<='9')
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
