import java.util.Scanner;
// 계산기 (사칙연산)
public class 제어문_반복문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(;;)
		{
			System.out.print("첫째 정수:");
			int num1=scan.nextInt();
			System.out.print("둘째 정수:");
			int num2=scan.nextInt();
			System.out.print("연산자(+,-,*,/):");
			char op=scan.next().charAt(0);
			
			switch(op)
			{
			case '+':
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case '-':
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case '/':
				if(num2==0)
					System.out.println("0으로 나눌 수 없다");
				else
					System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;
		//	case 'q':
		//	case 'Q':
		//		System.out.println("프로그램 종료");
		//		System.exit(0); // 프로그램 자체 종료 => 0 : 정상 종료
											//	=> 0이 아닌 경우 : 비정상 종료
			default:
				System.out.println("잘못 입력했다");
			}
			System.out.print("그만할까?(y/n)");
			char exit=scan.next().charAt(0);
			if(exit=='y')
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(exit=='n')
			{
				continue;
			}
			else
			{
				System.out.println("y와 n 중에서 입력해라");
			}
		}
	}

}
