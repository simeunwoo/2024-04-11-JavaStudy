import java.util.Scanner;

public class 문제0417_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=(int)(Math.random()*90)+10;
		System.out.print("2자리수정수입력(10~99)>>");
		a=scan.nextInt();
		
		if(a>=10 && a<=99)
		{
			if(a/10==a%10)
				System.out.println("10의자리와 1의자리가 같습니다.");
			else
				System.out.println("10의자리와 1의자리가 다릅니다.");
		}
		else
			System.out.println("잘못된 값입니다.");
	}

}
