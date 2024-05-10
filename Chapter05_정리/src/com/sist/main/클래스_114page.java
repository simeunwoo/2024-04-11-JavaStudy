package com.sist.main;
/*
 * 	114page
 * 
 * 	클래스의 구성요소 : 윈도우, 웹, 모바일
 * 	개발자가 클래스를 설계 => 인스턴스(객체)의 과정을 통하여 메모리에 저장
 * 	1. 클래스 설계
 * 	클래스 : 데이터만 관리 (변수 여러개를 모아서 관리) => 웹, 윈도우 => 전송 (데이터를 모아서 한번에 전송) => 상세보기
 * 			데이터 활용 (메소드를 여러개 묶어서 관리) => Manager (사용자 요청 시 => 처리)
 * 			액션 클래스 (동작을 정의)
 * 			데이터 + 메소드 => 혼합
 * 			------------------ 벤치 마킹 => 요구사항
 * 	2. 클래스 설계 내용
 * 	# 데이터 => 멤버변수
 * 	# 기능 => 메소드
 * 	# 필요 시 멤버변수의 초기화 : 생성자, static => static{}
 * 	-----------------------------------------------
 * 	= 멤버변수의 종류
 * 	인스턴스변수 : Heap => 메모리 공간을 만들어 동시에 저장 (연산자 new => 사용이 불가능 (프로그래머 관리))
 * 			=> 메모리를 따로 저장 (여러개가 필요한 경우) => 영화 정보, 회원 정보, 게시물 ...
 * 	정적변수 : Method Area => 모든 객체가 공통으로 사용하는 변수 (1개를 가지고 사용)
 * 			=> 변수 앞에 static => 변경하면 데이터값이 동시에 변경 => 공통으로 사용되는 변수값을 지정
 * 			=> 데이터 전체를 모아서 관리 => 오라클 (공유된 데이터)
 * 	*** 모든 객체의 한번에 변수값을 변경 => static
 * 	*** 게임 => 아바타 => width/height
 * 	*** 변수 => 값을 저장 : 초기화 => 사용 가능
 * 	= 변수의 초기화
 * 		# 인스턴스 초기화 블록
 * 			class A
 * 			{
 * 				int a; // 선언만 가능
 * 				-------------------- 클래스 블록은 선언만 하는 영역 (값 대입은 불가능)
 * 									ex) int a; a=100; (X) => int a=100; (O)
 * 				{
 * 					a=100; // 구현 (제어문, 연산자, 파일 읽기) 가능
 * 				}
 * 			}
 * 		# 정적변수 초기화 블록 => static 변수는 초기화 블록에서 주로 사용
 * 			class A
 * 			{
 * 				static int a=100;
 * 
 * 				static
 * 				{
 * 					a=100; // 명시적인 초기화가 안되는 경우에 사용 => 난수, 제어문 ...
 * 				}
 * 			}
 * 			*** 자동 로그인 (Cookie), 화면 UI
 * 		# 생성자 ~~~> 가장 많이 사용 => 인스턴스 ==================> (166page)
 * 		1) 특징 : 모든 클래스는 생성자가 1개 이상 존재 (없는 경우에는 컴파일러가 자동으로 1개 추가 : 디폴트 생성자 = 매개변수가 없는 생성자)
 * 				클래스명과 동일
 * 				리턴형이 없다 (void를 사용할 수 없다)
 * 				같은 이름으로 여러개의 생성자를 만들 수 있다 : 오버로딩 (중복 메소드 정의)
 * 				=> 같은 이름으로 여러개 만드는 경우
 * 					1. 매개변수의 갯수, 데이터형이 다른 경우
 * 					2. 리턴형, 접근지정어는 관계 없다
 * 				생성자는 단독으로 호출 불가능 => 호출 시 : new 생성자()
 * 		2) 역할 : 멤버변수의 초기화
 * 				시작과 동시에 처리하는 소스가 있는 경우 => 화면 UI, 카카오 (서버 연결), 데이터베이스 연결, 파일 읽기
 * 	---------------------------------------------------------------------------------------
 * 	***** 인스턴스 메소드 안에서는 모든 것을 사용할 수 있다
 * 	***** static 메소드 안에서는 static 변수, static 메소드만 사용 가능
 * 			=> 인스턴스를 사용하고 싶은 경우 => new를 이용하여 메모리 할당 후 사용
 * 
 * 			class A
 * 			{
 * 				int a=10; // 인스턴스
 * 				static int b=20; // 정적
 * 				A() // 인스턴스
 * 				{
 *					=> a, b, aaa(), bbb() 호출 가능
 * 				}
 * 				void aaa(){} // 인스턴스 // a, b, bbb() 호출 가능, 생성자 호출 불가능
 * 				static void bbb(){} // 정적 // b => static은 static 변수, static 메소드만 호출 가능
 * 				A aa=new A();
 * 				aa.aaa(), aa.a
 * 			}
 */
class Student
{
	private String name;
	private String sex;
	private int age;
	
	public Student() // 생성자
	{
		name="홍길동";
		sex="남자";
		age=20;
	}
	
	// 사용자가 입력 받은 값으로 초기화
	public Student(String n,String s,int a) // 생성자는 이렇게 여러개 사용 가능
	{
		name=n;
		sex=s;
		age=a;
	}
	
	public Student(String n)
	{
		// 생성자 호출 => this()
		this(); // 첫줄에 사용해야 한다 => Student()를 호출
		name=n;
	}
	
	public Student(String s,int a)
	{
		this("박문수",s,a); // Student(String n,String s,int a)를 호출
		sex=s;
		age=a;
	}

/*	public Student(String n,int a) // (X)
	{
		
	} */
	
	public void print()
	{
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("나이:"+age);
	}
}

class Member
{
	// 생성자 => default 생성자는 존재하지 않는다
	public Member(String name) // 생성자
	{
		System.out.println("이름:"+name);
	}
}

class Sawon
{
	// public Sawon(){} // 생성자가 존재하지 않는 경우 => 컴파일러가 자동으로 추가
}

class Emp // 이건 지금 당장 몰라도 됨;;
{
	public Emp(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	private String name;
	private String dept;
}

public class 클래스_114page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Student s1=new Student();
		s1.print(); */
/*
이름:홍길동
성별:남자
나이:20
 */
		
	/*	System.out.println("+~+~+~+~+~+~+ 사용자 입력을 받아서 초기화 +~+~+~+~+~+~+");
		Student s2=new Student("심청이","여자",20);
		s2.print(); */
/*
이름:심청이
성별:여자
나이:20
 */
	/*	Student s1=new Student("박문수"); // 이러면 이름만 변경된다
		s1.print();
/*
이름:박문수
성별:남자
나이:20
 */
	/*	Student s2=new Student("여자",30); // 성별과 나이가 변경된다
		s2.print();
/*
이름:박문수
성별:여자
나이:30
 */
	//	Member m=new Member(); // 오류 => Member 쪽의 생성자를 보았을 땐 () 안에 값을 반드시 넣어줘야 한다
		
		Sawon s=new Sawon(); // 생성자는 여러개를 만들 수 있다, 없는 경우에만 생성자가 추가 : 디폴트 생성자 (매개변수가 없음)
		// 클래스 안에서 생성자 호출 시에는 this()를 이용한다
		// this()는 반드시 생성자 안에서만 호출 가능 => 한번만 사용 가능 => 한두번 정도 나온다
	}

}
