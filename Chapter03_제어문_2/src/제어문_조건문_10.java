// 문자를 받아서 => 대문자 / 소문자 / 숫자 / 기타 (다중조건문)

import java.util.Scanner;

public class 제어문_조건문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		char c=scan.next().charAt(0);
		
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"는(은) 대문자");
		}
		else if(c>='a' && c<='z')
		{
			System.out.println(c+"는(은) 소문자");
		}
		else if(c>='0' && c<='9')
		{
			System.out.println(c+"는(은) 숫자");
		}
		else
		{
			System.out.println("아무것도 아니다");
		}
	}

}
