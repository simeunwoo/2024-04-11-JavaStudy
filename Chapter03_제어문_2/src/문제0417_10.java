import java.util.Scanner;

public class 문제0417_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("달을입력하세요(1~12)>>");
		int month=scan.nextInt();
		if(month>=1 && month<=12)
		{
			if(month>=3 && month<=5)
				System.out.println("봄");
			else if(month>=6 && month<=8)
				System.out.println("여름");
			else if(month>=9 && month<=11)
				System.out.println("가을");
			else
				System.out.println("겨울");
		}
		else
		{
			System.out.println("잘못된 입력입니다!");
		}
	}

}
