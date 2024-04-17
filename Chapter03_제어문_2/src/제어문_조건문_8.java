// 숫자를 입력 받아서 => 3의 배수, 5의 배수, 7의 배수 => 단일조건문
// 조건 여러개를 동시에 수행 => 단일조건문 (따로따로 수행)
// 조건 1개만 수행 => 다중조건문
import java.util.Scanner;

public class 제어문_조건문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수:"); // 정수:15
		int num=scan.nextInt();
		
		if(num%3==0) // 3의 배수
		{
			System.out.println(num+"는(은) 3의 배수"); // 15는(은) 3의 배수
		}
		if(num%5==0)
		{
			System.out.println(num+"는(은) 5의 배수"); // 15는(은) 5의 배수
		}
		if(num%7==0)
		{
			System.out.println(num+"는(은) 7의 배수");
		}
	}

}
