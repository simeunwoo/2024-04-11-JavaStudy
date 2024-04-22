import java.util.Scanner;
/*
 * 	for문 => UpDown 게임
 * 	난수 발생 => 난수를 맞추는 프로그램
    --- 힌트 : Up/Down
 * 	----------------------------- 반복 횟수가 명확하지 않다 => while
 * 	=> 종료 : break
 * 	=> 잘못 입력 시 : continue
 * 	----------------------- 반복제어문
 */
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 1. 난수 발생
		int com=(int)(Math.random()*100)+1; // 1~100 사이의 임의의 정수 추출
		while(true) // 무한루프
		{
			System.out.print("1~100 사이의 정수 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("다시 해");
				continue; // while문 처음(조건식)으로 이동
			}
			// 2. 힌트 제공
			if(com>user)
			{
				System.out.println("Up");
			}
			else if(com<user)
			{
				System.out.println("Down");
			}
			else // com==user
			{
				System.out.println("Yessssssssss!!!!!!!!!!!");
				break; // 정답을 맞췄으므로 더 이상 실행할 필요가 없기 때문에 break로 종료한다
			}
		}
		System.out.println("프로그램 종료");
	}

}
