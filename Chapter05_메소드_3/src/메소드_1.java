/*	자바의 핵심 : 변수, 메소드
 * 
 * 	메소드
 * 		=> 기능
 * 		=> 클래스 안에 존재 => 독립적으로 사용 불가능
 * 		=> C/C++/Python => 단독으로 사용 가능 => 함수
 * 		=> 사용자로부터 입력값(요청값)을 받아서 처리한 결과를 반환
 * 					----------		 --------
 * 					 매개변수=>()		  리턴형
 * 		=> 기능 처리
 * 		   ------- 웹(메뉴,동작) => 키보드(입력), 메뉴 클릭, 버튼 클릭, 이미지 클릭
 * 								------------------------------------
 * 									| 메소드
 * 									| 검색 => 검색 결과 (리턴형)
 * 
 * 		1. 형식
 * 
 * 		리턴형 메소드명(매개변수...) => 선언부
 * 		{
 * 			// 구현부
 * 			...
 * 			...
 * 			return 값 (변수, 배열명, 클래스 객체)
 * 			// return은 생략 가능 => 결과값 없이 메소드 자체에 처리하는 경우 => void
 * 		}
 * 
 * 		# 리턴형 (처리 결과값) : 사용자 요청에 대한 처리 결과
 * 						기본형 (byte, int, char, long, double)
 * 						결과값이 많은 경우 : 배열, 클래스, 컬렉션(웹)
 * 						1개만 설정 가능 (배열, 클래스도 1개 => 메모리 주소)
 * 						*** 단, 파이썬에서만 여러개 설정 가능
 * 
 * 		# 매개변수 (사용자 요청값) : 사용자로부터 받는 값
 * 							기본형, 배열, 클래스
 * 							여러개 설정 가능
 * 							로그인 => id,pwd / 검색 => 검색어
 * 							회원가입 => id,pwd,name,sex,birthday,email,... => 배열, 클래스
 * 								|(3개 이상 초과하지 않는다)
 *
 *		# 메소드명 : 변수의 식별자와 동일
 *
 *		# 구현
 *		{
 *			변수 / 연산자 / 제어문 => 결과값 얻기
 *		}
 * 
 * 		def func:
 * 			...
 * 			...
 * 			return a,b,c
 * 
 * 		=> a,b,c=func()
 * 
 * 		2. 유형
 * 		----------------------
 * 			리턴형	매개변수
 * 		----------------------
 * 			 O		  O => String => String substring(int, int)
 * 		----------------------
 * 			 O		  X => Math => double random()
 * 		----------------------
 * 			 => 자체 처리 : 출력 => void
 * 			 X		  O => System => void print(String s)
 * 		----------------------
 * 			 X		  X => 출력 => System => System.out.println() => 다음줄에 출력
 * 		----------------------
 * 
 * 		3. 활용 => 메소드 호출
 * 			1) 리턴형이 있는 경우 : 데이터형 변수=메소드명() => 변수 처리
 * 			2) 리턴형이 없는 경우 : 메소드명()
 * 			3) 매개변수가 있는 경우 : 메소드명(값)
 * 			4) 매개변수가 없는 경우 : 메소드명()
 *
 *		4. 주의점
 *			메소드가 호출되는 경우 => 메소드의 처음부터 명령문을 수행
 *			-----------------------------------------
 *			매개변수는 설정된 순서로 값을 주입
 *			(int, char, double) => (10, 'A', 10.0)
 *			메소드에 선언된 변수 / 매개변수 => Stack 공간에 저장 => 메모리 자체에서 처리
 *				=> 메소드가 종료되면 자동으로 사라진다 : 지역변수 (메소드 안에서 사용되는 변수)
 *				=> 지역변수는 반드시 초기화하여 사용한다
 */
import java.util.Scanner;
public class 메소드_1 {
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		return scan.nextInt(); // 내가 입력한 정수는 리턴값이 된다
	}
	
	static int rand()
	{
		return (int)(Math.random()*100)+1; // 난수는 리턴값(rand())이 된다
	}
	
	static char good()
	{
		return (char)((Math.random()*26)+65); // 임의의 알파벳은 리턴값(good())이 된다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int num=input(); // num은 리턴값이 된다
	//	System.out.println("num="+num);
		
		int num=rand(); //  num은 리턴값이 된다
		System.out.println("num="+num);
		char c=good(); // c는 리턴값이 된다
		for(int i=0;i<10;i++)
		{
			char cc=good(); // 리턴값을 불러온다 => cc는 리턴값이 된다
			System.out.print(cc+" "); // 임의의 알파벳으로 10개가 나온다
		}
		System.out.println();
		System.out.println("c="+c);
	}

}
