/*
 * 	while문
 * 		반복문 => 반복 횟수가 지정이 안된 경우 주로 사용
 * 		형식)
 * 			초기값
 * 			while(조건문)
 * 			{
 * 				반복 수행문장
 * 				증가식
 * 			}
 *
 *	while문이 무한루프를 사용할 때 주로 활용된다고 한다
 */

import java.util.Scanner;

public class 자바제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true) // 72page => 반드시 종료하는 프로그램을 제작 => break
		{
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 뮤직 목록");
			System.out.println("2. 뮤직 검색(곡명)");
			System.out.println("3. 뮤직 검색(가수명)");
			System.out.println("4. 뮤직 보기");
			System.out.println("9. 프로그램 종료");
			System.out.println("===========");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			
/*			if(menu==1) // 첫번째 방법 : 다중조건문 활용
			{
				System.out.println("뮤직 목록을 요청하셨군요");
			}
			else if(menu==2)
			{
				System.out.println("곡명 검색을 요청하셨군요");
			}
			else if(menu==3)
			{
				System.out.println("가수명 검색을 요청하셨군요");
			}
			else if(menu==4)
			{
				System.out.println("동영상을 요청하셨군요");
			}
			else if(menu==9)
			{
				System.out.println("프로그램 종료");
				break; // while문을 종료
					// break => 반복문을 종료 (중단)
					// continue => 조건식으로 이동 => 처음부터 실행할 때 사용
			}
			else
			{
				System.out.println("메뉴 존재 X");
			} */
			
			switch(menu) // 두번째 방법 : 선택조건문 활용
			{
			case 1: // menu==1과 같은 뜻
				System.out.println("뮤직 목록을 요청하셨군요");
				break;
			case 2:
				System.out.println("곡명 검색을 요청하셨군요");
				break;
			case 3:
				System.out.println("가수명 검색을 요청하셨군요");
				break;
			case 4:
				System.out.println("동영상을 요청하셨군요");
				break;
			case 9:
				System.out.println("프로그램 종료");
				System.exit(0); // 프로그램 종료 시 사용 (switch~case 사용 시)
								// 0 : 정상 종료, 1 : 비정상 종료
				// break => switch가 벗어난다 => while문은 계속 수행
				// switch~case 내 break는 사용해도 종료 X => switch 조건문으로 다시 이동 (무한 반복)
			default:
				System.out.println("메뉴 존재 X");
			}
		}
	}

}
