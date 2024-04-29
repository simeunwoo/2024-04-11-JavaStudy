// 좌우대칭이 되려면 문자갯수는 항상 짝수개여야 한다...? /////////////////// 오류 있음
import java.util.Scanner;
public class 문제0429_6 {
	static void word(String msg)
	{
		if(msg.length()%2!=0) // 문자갯수가 홀수일 경우
		{
			System.out.println("잘못된 입력");
			return; // 메소드 종료 => return은 원하는 위치에서 사용 가능
		}
		boolean bCheck=true;
		for(int i=0;i<=msg.length()/2;i++)
		{
			char c1=msg.charAt(i);
			char c2=msg.charAt(msg.length()-1-i);
			/*
			 * 		AB | BA
			 * 		01 | 23
			 */
			if(c1!=c2)
			{
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
		{
			System.out.println("좌우 대칭이다");
		}
		else
		{
			System.out.println("좌우 대칭이 아니다");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("입력:");
		String msg=scan.next();
		System.out.println(msg);
	}

}
