/*
 * 	month
 * 	1~12 => 계절 별 분류 => else (잘못된 입력인 경우)
 */
import java.util.Scanner;
public class 제어문_조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("월 입력(1~12):"); // 월 입력(1~12):4
		int month=scan.nextInt();
		
		if(month>=1 && month<=12)
		{
			if(month==1||month==2||month==12)
				System.out.println("겨울");
			if(month>=3 && month<=5)
				System.out.println("봄"); // 봄
			if(month>=6 && month<=8)
				System.out.println("여름");
			if(month>=9 && month<=11)
				System.out.println("가을");
		}
		else
		{
			System.out.println("잘못 입력 되었다");
		}
	}

}
