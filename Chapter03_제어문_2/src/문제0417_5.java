import java.util.Scanner;

public class 문제0417_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=(int)(Math.random()*101); // 0~100

		if(a>=90)
		{
			System.out.println("A학점입니다");
		}
		else if(a>=80 && a<90)
		{
			System.out.println("B학점입니다");
		}
		else if(a>=70 && a<80)
		{
			System.out.println("C학점입니다");
		}
		else if(a>=60 && a<70)
		{
			System.out.println("D학점입니다");
		}
		else if(a<60)
		{
			System.out.println("F학점입니다");
		}
	}

}
