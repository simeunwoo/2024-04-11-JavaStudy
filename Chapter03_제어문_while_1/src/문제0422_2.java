import java.util.Scanner;

public class 문제0422_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) >> ");
		int a=scan.nextInt();
		
		if(a<1 || a>12)
		{
			System.out.println("다시 쓰세요");
		}
		else
		{
		switch(a)
		{case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");}
		}
	}

}
