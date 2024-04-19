// 초를 받아서 => 시간 / 분 / 초 출력 ===============> 구글 입사 온라인 시험 문제 출신
// 63	1분 3초 => 라이브러리 (시간 => 초단위)
import java.util.Scanner;
public class 자바제어문_조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("초 입력:");
		int num=scan.nextInt();
		
		int hour=num/3600;
		System.out.print(hour+"시 ");
		int min=num%3600/60;
		System.out.print(min+"분 ");
		int sec=num%3600%60;
		System.out.print(sec+"초");
	}

}
