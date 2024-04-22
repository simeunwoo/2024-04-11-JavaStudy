// 사용자로부터 2~9 사이의 정수를 입력 받아서 구구단 출력
// 단 입력이 2~9 사이가 아닐 경우 다시 입력을 하게 만든다
// 블록변수 => {}를 벗어나면 자동으로 삭제
import java.util.Scanner;
public class 자바제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		for(;;)
		{System.out.print("첫번째 정수(2~9):");
		int a=scan.nextInt();
		System.out.print("두번째 정수(2~9):");
		int b=scan.nextInt();
		
		
		if(a>=2 && a<=9)
		{
			if(b>=2 && b<=9)
			
			System.out.println("구구단 결과:"+a+"*"+b+"="+(a*b));
			break;
		}
		else
			{System.out.println("다시 써라");
		continue;}
		}
	}

}
