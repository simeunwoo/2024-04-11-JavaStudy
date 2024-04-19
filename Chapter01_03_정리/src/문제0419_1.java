import java.util.Scanner;

public class 문제0419_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("변수 입력:");
		int x=scan.nextInt();
		if(x>10 && x<20)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
