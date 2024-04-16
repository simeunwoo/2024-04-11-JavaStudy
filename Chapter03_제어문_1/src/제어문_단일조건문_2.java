/*
 *	컴퓨터 / 사용자 => 가위바위보
 *		   ---- 입력
 *	---- 난수
 *	=> 임의로 설정
 *		0 => 가위
 *		1 => 바위
 *		2 => 보
 */
import java.util.Scanner;
public class 제어문_단일조건문_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터
		int user;
		System.out.print("가위(0),바위(1),보(2):"); // 0 (사용자가 임의로 결정)
		Scanner scan=new Scanner(System.in);
		user=scan.nextInt();
		
		if(user==0)
			System.out.println("사용자:가위"); // 사용자:가위 (user==0)(사용자가 임의로 결정)
		if(user==1)
			System.out.println("사용자:바위");
		if(user==2)
			System.out.println("사용자:보");
		
		int com=(int)(Math.random()*3); // 0, 1, 2
		
		if(com==0)
			System.out.println("컴퓨터:가위");
		if(com==1)
			System.out.println("컴퓨터:바위"); // 컴퓨터:바위 (com==1)(컴퓨터가 임의로 결정)
		if(com==2)
			System.out.println("컴퓨터:보");
		/*
		 * 	게임 결과 출력
		 *
		 *		com => 0 (가위)
		 *				user => 0 (가위) => 무 => 0 = com - user
		 *						1 (바위) => 사용자 승 => -1
		 *						2 (보) => 컴퓨터 승 => -2
		 *		com => 1 (바위)
		 *				user => 0 (가위) => 컴퓨터 승 => 1
		 *						1 (바위) => 무 => 0
		 *						2 (보) => 사용자 승 => -1
		 *		com => 2 (보)
		 *				user => 0 (가위) => 사용자 승 => 2
		 *						1 (바위) => 컴퓨터 승 => 1
		 *						2 (보) => 무 => 0
		 *
		 *		컴퓨터 승 : -2, 1
		 *		사용자 승 : -1, 2
		 *		무 : 0
		 */
		System.out.println("===== 결과 ====="); // ===== 결과 =====
	/*	if(com==0 && user==0)
			System.out.println("무");
		if(com==0 && user==1)
			System.out.println("사용자 승");
		if(com==0 && user==2)
			System.out.println("컴퓨터 승");
		if(com==1 && user==0)
			System.out.println("컴퓨터 승"); // 컴퓨터 승
		if(com==1 && user==1)
			System.out.println("무");
		if(com==1 && user==2)
			System.out.println("사용자 승");
		if(com==2 && user==0)
			System.out.println("사용자 승");
		if(com==2 && user==1)
			System.out.println("컴퓨터 승");
		if(com==2 && user==2)
			System.out.println("무"); /////// =======> 첫번째 방법
			*/
		int result=com-user;
		if(result==-2 || result==1)
			System.out.println("컴퓨터 승"); // 컴퓨터 승
		if(result==-1 || result==2)
			System.out.println("사용자 승");
		if(result==0)
			System.out.println("무"); /////// =======> 두번째 방법
	}

}
