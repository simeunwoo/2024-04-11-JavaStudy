import java.util.Scanner;

public class 문제0417_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int a;
		a=scan.nextInt();
		
		if(a>=0)
		{
			System.out.println(a+"는(은) 양수입니다");
		}
		else
		{
			System.out.println(a+"는(은) 음수입니다");
		}
	}

}
