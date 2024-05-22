package com.sist.lang;
/*
 * 	java.lang / java.util / java.io / java.net / java.sql
 * 	----------  ----------                       -------- 웹 관련 핵심 라이브러리
 * 
 * 	java.io : 파일 업로드 / 다운로드 (자료실)
 * 	java.net : 브라우저에서 한글 인식 => 인코딩 / 디코딩 => 한글 깨짐 방지
 * 	
 * 	라이브러리 => 자바에서 지원하는 클래스의 집합 (API)
 * 	          ---------- 사용법, 사용 용도
 * 	=> 프로그램은 라이브러리 + 사용자 정의 => 조립 => 라이브러리는 변수는 존재하지 않고 => 메소드 (어떤 기능)
 * 
 * 	java.lang : 자바의 기본적으로 사용이 많은 클래스를 모아서 관리 => import 생략 가능
 * 	(292page)
 * 		= Object : 자바의 모든 클래스(사용자 정의)의 상위 클래스 => 최상위 클래스
 * 					=> 모든 클래스는 Object로부터 상속을 받는다
 * 					=> 생략이 가능 => extends Object
 * 					=> 데이터형 중에 가장 큰 데이터형 => 모든 데이터를 받아서 저장이 가능
 * 					=> 라이브러리의 메소드의 리턴형은 대부분이 Object => 객체 형변환
 * 					class A (extends Object)
 * 					{
 * 						int a;
 * 						int b;
 * 						public void display(){}
 * 					}
 * 					=> Object obj=new A();
 * 						obj는 a, b, display() => 가지고 있지 않는다
 * 					=> A a=(A)obj
 * 					=> 상위 클래스는 하위 클래스의 변수/메소드에 접근이 불가능하다 => 형변환 => 데이터형의 크기 변경
 * 		= String
 * 		= System
 * 		= Math
 * 		= Wrapper
 * 		= StringBuffer
 * 
 * 	상속 : 상속을 내리는 클래스 > 상속을 받는 클래스
 *		=> 상속을 내리는 클래스 : 상속 받은 클래스의 추가된 기능에 접근 불가능
 *		=> 상속을 받는 클래스 : 추가된 기능, 상속 받은 기능
 *	포함 : 포함하고 있는 클래스가 크가
 *		class A
 *		{
 *		}
 *		class B
 *		{
 *			public void display()
 *			{
 *				A a=new A(); => 포함 클래스가 아니다 (지역 변수)
 *			}
 *		}
 *		class C
 *		{
 *			A a=new A(); => 포함 클래스 => 멤버일 경우에만
 *		}
 *
 *	= 제공하는 기능 (메소드)
 *
 *	1. *** toString() : 객체를 문자열화 (묵시적, 명시적) => 객체의 주소
 *		class A
 *		A a=new A();
 *		System.out.println(a) => 묵시적 => toString() 생략 가능
 *		System.out.println(a.toString()) => 명시적
 *		=> 가장 많이 오버라이딩 => 변수의 값을 출력
 *
 *	2. hashCode() : 객체의 메모리 주소값을 리턴형
 *		데이터 값이 같은 경우 => 같은 사람 ...
 *
 *	3. *** clone() : 객체를 복제 => 새로운 메모리를 만들 때 필요한 객체의 내용을 그대로 복사
 *		ProtoType 패턴 => 이모티콘 / 아바타
 *
 *	4. finalize() : 소멸자 => 객체 메모리 해제 => 자동 호출
 *		=> 호출이 안되면 메모리에 남아 있다 ...
 *		=> System.gc() : 사용하지 않는 메모리를 회수 요청
 *		=> 웹 / 애플리케이션에서는 사용하지 않는다 => 멀티미디어 (동영상, 화상 채팅, CCTV)
 *
 *	5. *** equals() : 객체를 비교할 때 => 일반적으로는 메모리 주소값을 보지만 (디폴트) => equals()는 멤버 변수값을 비교 (오버라이딩)
 *		=> equals()를 활용하면 두 객체의 주소값은 달라도 멤버 변수의 값은 같아지게 된다
 *
 *	객체의 생명 주기
 *	------------
 *	1) 객체에 대한 설계 : class
 *	2) 객체 생성 : new 생성자()
 *	3) 객체 활용 : .(변수/메소드)
 *	4) 객체 소멸 : 객체=null => null은 더 이상 사용하지 않는다는 뜻 => GC 대상 (메모리 회수 대상) => 바로 회수하지 않는다 (프로그램 종료 시에 회수)
 *				*** new를 많이 사용하면 => 누적 => 부하
 */
import java.util.*;

class Sawon
{
	private int sabun;
	private String name;
	// 사용자로부터 값을 받아서 초기화
	public Sawon(int sabun,String name)
	{
		this.sabun=sabun;
		this.name=name;
	}
	// 출력
	@Override // => 반드시 상속 => 재정의 (정의를 변경) => 덮어 쓴다
	public String toString() {
		// TODO Auto-generated method stub
		return "사번:"+sabun+", 이름:"+name; // 메모리 주소값을 변경 => 변수의 초기화 출력
	}
	// => 디폴트 생성자는 없다 (자동 추가가 안된다)
}

class Student
{
	private int hakbun;
	private String name;
	
	public Student(int hakbun,String name) // 생성자 => 디폴트는 사용할 수 없다 (자동 추가가 불가능)
	{
		this.hakbun=hakbun;
		this.name=name;
	}
	// hashCode 변경

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(hakbun,name); // 이 설정으로 밑에 s1과 s2의 메모리 주소값은 같아진다
	}
	
}
/*
 * 	인터페이스 => 클래스 (다중 상속)
 * 	=> 미완성된 클래스 => 완성해서 사용한다 : 상속
 *
 *	인터페이스 ===extends(확장)===> 인터페이스
 *
 *	인터페이스 ===implements(구현)===> 클래스 : 미완성된 메소드를 구현
 *
 *	클래스 ===extends(확장)===> 클래스
 *
 *	클래스 ===(X)===> 인터페이스 : 불가능
 *
 *	= 형식 => 모든 구성 요소 : 변수/메소드 => only public
 *		interface 인터페이스명
 *		{
 *			--------------------------
 *			상수 (변수는 존재하지 않는다)
 *			(public static final) int a=100; // 반드시 선언과 동시에 초기값을 설정 => 변경 불가 (상수이므로)
 *			--------------------------
 *			구현이 안된 메소드
 *			(public abstract) void display();
 *			--------------------------
 *			구현이 된 메소드
 *			(public) default 리턴형 메소드명(매개 변수)
 *			--------------------------
 *		}
 */
class Box implements Cloneable
{
	private int width;
	private int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	// throws 문장에 뒤에 있는 예외 클래스는 => RuntimeException 관련은 없다 => 예외 처리를 하고 사용한다
	// CloneNotSupportedException => CheckedException
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class Member
{
	private int mno;
	private String name;
	// 생성 시에 호출 => 생성자
	public Member(int mno,String name)
	{
		this.mno=mno;
		this.name=name;
		System.out.println("객체 메모리 할당 ...");
	}
	public void print()
	{
		System.out.println("회원 번호:"+mno);
		System.out.println("이름:"+name);
	}
	// 소멸 시에 호출 => 소멸자
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 회수 ...");
	}
	
	// 멤버 변수의 값을 설정 => 여러번 변경 or 한번만 변경
	/*
	 * 	===> 여러번 변경 => 생성자 활용 불가능 => setter
	 * 
	 * 	===> 한번만 변경 => 생성자
	 * 
	 * 	Member m=new Member(1,"aaa");
	 * 	m=new Member(2,"bbb");
	 * 	m=new Member(3,"ccc");
	 * 	------------------------------ 객체가 3번 생성
	 */
}

class Food
{
	private int fno;
	private String name;
	
	public Food(int fno,String name)
	{
		this.fno=fno;
		this.name=name;
		// 지역 변수 우선 순위
		// 지역 변수, 매개 변수 => 멤버 변수
		// 변수명이 같은 경우에는 반드시 구분 => this : 클래스 자신이 갖고 있는 객체 (super : 상속을 내린 클래스의 객체)
		/*
		 * 	메모리
		 * 	-------------------------------
		 * 		-------- super --------
		 * 		상속을 내린 클래스의 변수/메소드
		 * 		=> clone()
		 * 		=> finalize()
		 * 		=> equals()
		 * 		=> toString()
		 * 		=> hashCode()
		 * 		-----------------------
		 * 
		 * 		-------- this ---------
		 * 		추가된 내용
		 * 		-----------------------
		 * 	-------------------------------
		 */
	}

	@Override
	public boolean equals(Object obj) {
		// f1.equals(f2)
		// Object obj=f2; => Object => fno, name이 존재하지 않는다
		// TODO Auto-generated method stub
		Food f=(Food)obj;
		return name.equals(f.name) && fno==f.fno;
		/*
		class A
		{
			int a,b;
			void display() {}
		}
		class B extends A
		{
		//	int a,b;
		//	void display() {} => 내용 변경이 가능 => 오버라이딩
			
			int c;
			void bbb() {}
			}
		}
		
		A a=new A(); // a,b,display() => 사용 가능
		B b=new B(); // a,b,display(),c,bbb()
		A c=new B(); // a,b,display() => B가 가지고 있는 메소드 호출
		*/
	}
	
	
}

public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Sawon s1=new Sawon(1, "홍길동"); // 데이터베이스에 데이터 읽기 / 파일 데이터 읽기
		System.out.println(s1); // sql.toString() => toString()
		Sawon s2=new Sawon(2, "박문수");
		System.out.println(s2.toString()); */
/*
사번:1, 이름:홍길동
사번:2, 이름:박문수
 */
		Student s1=new Student(1, "홍길동");
		Student s2=new Student(1, "홍길동"); // 여기서 s1과 s2는 다르다 => 둘의 메모리 주소는 다르다
		// new를 사용하면 => 새로운 메모리를 만들어서 사용)
		// 중복을 제거할 때 주로 사용 => 데이터 중복 여부 => hashCode() => 웹에서 데이터 수집
/*		System.out.println("s1:"+s1.hashCode());
		System.out.println("s2:"+s2.hashCode()); */
/* (hashCode() 오버라이딩 이전)
s1:1365202186
s2:476800120
 */
/* (hashCode() 오버라이딩 이후)
s1:54151054
s2:54151054
 */
/*		if(s1.hashCode()==s2.hashCode())
		{
			System.out.println("같은 학생");
		}
		else
		{
			System.out.println("다른 학생");
		} */
		
		Box box1=new Box();
		box1.setWidth(300);
		box1.setHeight(350);
		
		Box box4=box1; // box1에 대한 별칭 => 같은 메모리를 제어할 때 사용
		System.out.println("box1=>"+box1); // box1=>com.sist.lang.Box@626b2d4a
		System.out.println("box4=>"+box4); // box4=>com.sist.lang.Box@626b2d4a
		
		Box box3=new Box(); // 초기값 0으로 설정됨
		System.out.println("box3.width:"+box3.getWidth()); // box3.width:0
		System.out.println("box3.height:"+box3.getHeight()); // box3.height:0
		// clone은 형변환 + 예외 처리가 필요하다
		try {
			Box box2=(Box)box1.clone(); // 복제 => 메모리 주소는 달라지고, 복제되었으므로 값은 같아진다
			System.out.println("box2.width:"+box2.getWidth()); // box2.width:300
			System.out.println("box2.height:"+box2.getHeight()); // box2.height:350
			System.out.println("box2=>"+box2); // box2=>com.sist.lang.Box@4ac68d3e
			// 메모리 주소가 다른 경우에는 새로운 메모리가 생성
			// 제어를 따로 할 때 사용
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 객체 생성
		Member m=new Member(1, "심은우");
		// 객체 활용
		m.print();
		// 객체 소멸
		m=null; // finalize() 호출 => X
		// 객체 메모리 회수 명령
		System.gc(); // 필요한 경우에만 사용
/*
객체 메모리 할당 ...
회원 번호:1
이름:심은우
객체 메모리 회수 ...
 */
		
		Food f1=new Food(1, "중국집");
		Food f2=new Food(1, "중국집");
		// => 재정의 => 오버라이딩을 하기 전까지 => 주소값
		if(f1.equals(f2))
		{
			System.out.println("f1="+f1);
			System.out.println("f2="+f2);
			System.out.println("같은 집");
		}
		else
		{
			System.out.println("f1="+f1);
			System.out.println("f2="+f2);
			System.out.println("다른 집");
		}
/* (equals() 오버라이딩 이전)
f1=com.sist.lang.Food@3d04a311
f2=com.sist.lang.Food@7a46a697
다른 집
 */
/* (equals() 오버라이딩 이후) ========> 주소값이 똑같아지지 않는다 => 주소값은 여전히 다르지만 멤버 변수의 값은 똑같아진다
f1=com.sist.lang.Food@3d04a311
f2=com.sist.lang.Food@7a46a697
같은 집
 */
	}

}
