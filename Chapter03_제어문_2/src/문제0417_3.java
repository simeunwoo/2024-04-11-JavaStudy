import java.util.Scanner;

public class 문제0417_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a;
		a=scan.nextInt();
		
		if(a>=0)
		{
			System.out.println("a="+a);
		}
		else
			System.out.println("a="+(-a));
	}
	// System.out.println(Math.abs(num));; // 양수만 출력
										  // abs(절댓값)
}
