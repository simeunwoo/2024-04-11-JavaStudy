import java.util.Scanner;

public class 문제0418_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int b=scan.nextInt();
		// if(b<0 && b>100)
		// System.out.println("잘못 입력");
		// continue; ===> 이런 방식 : 유효성 검사
		int a=b/10;
		
		switch(a)
		{
		case 10:
			if(b!=100)
				System.out.println("잘못 입력");
			else
				System.out.println("A학점입니다");
			break;
		case 9:
			System.out.println("A학점입니다");
			break;
		case 8:
			System.out.println("B학점입니다");
			break;
		case 7:
			System.out.println("C학점입니다");
			break;
		case 6:
			System.out.println("D학점입니다");
			break;
		case 5,4,3,2,1,0:
			System.out.println("F학점입니다");
			break;
		default:
			System.out.println("잘못 입력");
		}
	}

}
