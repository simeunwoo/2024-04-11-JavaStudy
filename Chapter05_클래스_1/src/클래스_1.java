/*
 * 	클래스
 * 	= 사용자 정의 데이터형 : 데이터만 모아서 관리
 * 					   ---- 다른 데이터를 모아서 관리
 * 	= 액션 클래스 : 메소드를 여러개 모아서 관리
 * 
 * 	*** 클래스는 한개에 대한 정보
 * 	class 학생
 * 	{
 * 		이름
 * 		학년 int
 * 		학점 char
 * 		주소 String
 * 		전화
 * 		나이
 * 	}
 */
// 데이터형 => 형변환
// 개발자마다 틀리다 (프로그램에 맞게)
class Student
{
	String name;
	int age;
	// 인스턴스변수 : 메모리 공간을 따로(각자) 생성 => 객체변수
	static String school_name;
	// 공유변수 : 한개의 메모리 공간에서 사용
}
// => 저장
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		//		---- 객체(사용자 정의 데이터형에 대한 변수명)
		// 이 공간 안에는 name,age,school_name 총 3개의 데이터가 있다
		hong.name="홍길동";
		hong.age=25;
		hong.school_name="쌍용";
		Student sim=new Student();
		sim.name="심은우";
		sim.age=20;
		sim.school_name="SIST";
		Student park=new Student();
		park.name="박문수";
		park.age=30;
		park.school_name="SIST강북";
		
		System.out.println("===== hong 영역 =====");
		System.out.println("이름:"+hong.name);
		System.out.println("나이:"+hong.age);
		System.out.println("학교명:"+hong.school_name);
		System.out.println("===== sim 영역 =====");
		System.out.println("이름:"+sim.name);
		System.out.println("나이:"+sim.age);
		System.out.println("학교명:"+sim.school_name); // !!!!!!!!!!!!!!!
		System.out.println("===== hong 영역 =====");
		System.out.println("이름:"+park.name);
		System.out.println("나이:"+park.age);
		System.out.println("학교명:"+park.school_name); // !!!!!!!!!!!!!!!
/*
===== hong 영역 =====
이름:홍길동
나이:25
학교명:SIST강북
===== sim 영역 =====
이름:심은우
나이:20
학교명:SIST강북
===== hong 영역 =====
이름:박문수
나이:30
학교명:SIST강북
 */
	}

}
