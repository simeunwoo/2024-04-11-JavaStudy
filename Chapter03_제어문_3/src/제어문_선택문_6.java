/*
 * 	학습 (반복!!!!!!!!!!!!!!!!!!!!!!)
 * 	=> 형식
 * 	=> 코딩 연습 ***** -> 안되는 지점 찾아서 복습!!!
 * 					 -> 에러 처리하면서 배우기
 * 	=> 라이브러리
 * 	=> 구글링 -> 관련된 큰 프로그램 찾기
 * 	--------------------------------------- 이런 방법 지속 => 언제든지 코딩 가능 수준 도달
 */
import java.util.Scanner;
public class 제어문_선택문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); // 64page
		System.out.print("월 입력:");
		int month=scan.nextInt();
		switch(month)
		{
		case 3:	case 4:	case 5:
			System.out.println("봄");
			break;
		case 6:	case 7:	case 8:
			System.out.println("여름");
			break;
		case 9:	case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된 입력이다");
		}
	}

}
