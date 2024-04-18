/*
 * 	무한루프 (;;)
 *
 *	간단한 게임 : UpDown게임
 *	=> 1~100 사이의 난수 => 맞추는 프로그램
 *	=> 힌트
 *	답이 67 => 55 제시 => Up
 *	=> 1~100 사이의 수 이외를 입력한 경우 => 제외하고 다시 입력 => continue
 *	=> 정답일 경우 => break (for문 종료)
 *	=> 반복제어문 : break, continue
 *	=> 다시 처음부터 실행 => 반복문 / 메소드
 */
import java.util.Scanner;
public class 제어문_반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 1. 난수 발생
		int a=(int)(Math.random()*100)+1; // 1~100 사이의 정수 한개 추출
		// 2. 사용자가 난수를 맞추는 코딩
		int count=0;
		for(;;) // 종료하지 않는 프로그램 => 무한루프 => 반드시 종료하는 프로그램 => q/Q
		{
			// 사용자 입력
			System.out.print("1~100 사이의 정수 ㄱㄱ:");
			int user=scan.nextInt();
			
			if(user<1 || user>100) // 범위를 벗어난 경우
			{
				System.out.println("입력값에 오류가 있는데?");
				continue; // for의 처음부터 다시 돌아가게 하는 기능
			}
			count++;
			// 정상 입력의 경우
			if(a>user)
			{
				System.out.println("입력값보다 더 크다, Up");
			}
			else if(a<user)
			{
				System.out.println("입력값보다 더 작다, Down");
			}
			else
				{System.out.println("Yessssssssssss!!!!!!!");
				break;} // for 종료 => 게임 종료 => System.exit(0) => 맞췄기 때문에 더 이상 진행 필요 X
		}
		System.out.println(105-(count*5)+"점");
	}

}
