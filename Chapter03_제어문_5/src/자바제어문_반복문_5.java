/*
 * 	A~Z 사이에서 => 사용자가 입력한 알파벳이 몇번째 있는지 확인
 */

import java.util.Scanner;

public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		char c=scan.next().charAt(0);
		if(c>='A' && c<='Z')
			System.out.println(c+"는 "+(c-64)+"번째 알파벳입니다!");
		else
			System.out.println("잘못 적었어");
		
/*		int i=1; // 위치 확인
		for(char a='A';a<='Z';a++)
		{
			if(c==a)
				break; // 종료 => i 변수를 이용해서 ~번째 확인
			i++;
		}
		System.out.println(c+"는 "+i+"번째 알파벳입니다!"); // 요거 뭔가 이상함 => 수정 필요 */
	}

}
