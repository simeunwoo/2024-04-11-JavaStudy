// 리턴형 (O), 매개변수 (O)
import java.util.Scanner;
public class 메소드_2 {
	// 큰 데이터형으로 선언 가능
	static boolean isLogin(String id,String pwd)
	{
		// 매개변수는 갯수의 제한이 없다 => 여러개 사용 가능
		// 리턴형은 1개만 사용 가능
		
		// 매개변수가 많은 경우 => 배열, 클래스 => 3개 이상일 때
		final String ID="admin";
		final String PWD="1234";
		/*
		 * 	메소드 안에 선언되는 변수, 상수 => 메소드 안에서만 사용 가능
		 * 					=> 매개변수도 메소드 안에서만 사용 가능
		 */
		boolean bCheck=false;
		if(id.equals(ID) && pwd.equals(PWD))
		{
			bCheck=true;
		}
		else
		{
			bCheck=false;
		}
		
		return bCheck; // 사용자 요청에 대한 결과값 (사용자한테 넘겨준다)
		// 리턴에 사용하는 데이터형과 실제 전송하는 값이 일치하거나,
		// 리턴형이 더 크거나 해야한다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		System.out.print("비밀번호 입력:");
		String pwd=scan.next();
		// 기능 요청
		// 메소드에서 넘겨주는 결과값을 받는다
		boolean bCheck=isLogin(id,pwd);
		// 숫자인 경우 => 큰 데이터형으로 받을 수 있다
		// int(리턴형) => long, double
		// 기능 처리 => 윈도우, 브라우저에 출력
		if(bCheck)
		{
			System.out.println(id+"님 로그인 되었다");
		}
		else
		{
			System.out.println("다시 해 : 아이디나 비밀번호가 틀렸다");
		}
	}

}
