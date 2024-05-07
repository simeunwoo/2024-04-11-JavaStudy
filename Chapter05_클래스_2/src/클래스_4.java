// 초기화 블록 => 자동 호출 => 클래스 블록 안에 {}
import java.util.*;
class Sawon // 또 Student 쓰면 이미 전에 클래스에서 썼기 때문에 오류 나옴
{
	int sabun;
	String name;
	String dept;
	String job;
	String loc;
	int pay;
	
/*	for(int i=0;i<10;i++)
	{
		sabun=i; // 여기서는 제어문 사용이 불가하고 선언만 가능
					=> 사용하려면 초기화 블록을 사용하여 그 안에다 제어문을 사용한다
	} */
	// 초기화 => 파일 읽기, 라이브러리, 데이터베이스 연결 => {} 구현
	{
	/*	sabun=1;
		name="홍길동";
		dept="개발부";
		job="대리";
		loc="서울";
		pay=3600; */
		
		for(int i=0;i<10;i++)
		{
			sabun=i;
		}
	}
	
	// 생성자
	/*
	 * 	=> 멤버변수의 초기화
	 * 	=> 메모리에 저장 시에 호출되는 메소드
	 * 	=> 모든 클래스에 1개 이상 존재
	 * 	=> 없는 경우에는 자동으로 추가
	 * 	특징
	 * 	=> 리턴형이 없다
	 * 	=> 클래스명과 동일
	 * 	=> 생성자는 여러개인 경우도 있다
	 */
	void Sawon() // 생성자 (X) => 일반 메소드 (O)
	{
		
	}
	/*
	 * 	기본 초기값 = 명시적 초기화 = 초기화 블록 = 생성자
	 * 							| static {}
	 * 			   --------------------------- 보통은 생성자를 주로 사용한다
	 * 
	 * 	class A
	 * 	{
	 * 		int a=10;
	 * 		{
	 * 			a=100;
	 * 		}
	 * 		A()
	 * 		{
	 * 			a=200;
	 * 		}
	 * 	}
	 * 	A aa=new A();
	 *
	 *	---- aa ----
	 *		0x100(메모리 주소)
	 *	------------	0x100
	 *					-----------
	 *					 ----a----
	 *					 0 => 10 => 100 => 200 (최종 저장값)
	 *					 ---------
	 *					-----------
	 *
	 *	관련된 데이터가 여러개 저장 시에는 => 메모리 주소를 이용하여 접근한다 => 참조 변수 (배열/클래스)
	 *
	 *	일반 변수는 1개만 이용
	 *
	 *	*** 객체 지향 프로그램은
	 *		여러개의 데이터 + 여러개의 메소드를 한곳에 저장한 후에 동시에 제어
	 *		------------------------ 저장 공간 : 객체 (= 클래스의 인스턴스)
	 *										=> 객체는 메모리에 할당된 실제 데이터이다
	 *	객체 : 한번에 기능을 만들어서 사용
	 *		1) 재사용
	 *		2) 수정 / 추가 관리
	 *		3) 데이터를 보호
	 */
	Sawon() // 생성자 (O) / 앞에 아무 것도 안 붙어있어야 한다
			// => 생성자는 반드시 호출 시에 new 생성자()
	{
	//	System.out.println("메모리에 저장 완료!"); // 메모리에 저장 완료!
		
		Scanner scan=new Scanner(System.in); // 구현
		System.out.print("사번 입력해라:"); // 사번 입력해라:1
		sabun=scan.nextInt();
		System.out.print("이름 입력해라:"); // 이름 입력해라:심은우
		name=scan.next();
		System.out.print("부서 입력해라:"); // 부서 입력해라:분석
		dept=scan.next();
	}
}
public class 클래스_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong=new Sawon(); // 저장 => 메모리 공간이 생긴다
								// => (sabun,name,dept,job,loc,pay : 변수들)
		System.out.println("사번:"+hong.sabun); // 사번:1
		System.out.println("이름:"+hong.name); // 이름:심은우
		System.out.println("부서:"+hong.dept); // 부서:분석
	//	Sawon(); // => 오류
	//	new Sawon(); // 메모리에 저장 완료! // 생성자 => 앞에 new가 있어야 한다
	}

}
