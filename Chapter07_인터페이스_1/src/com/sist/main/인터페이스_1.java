package com.sist.main;
/*
 * 	1. 인터페이스란?
 * 	> 추상 클래스의 일종 => 특수한 클래스 => 상속 시에 상위 클래스 역할
 * 		추상 클래스 => 미완성된 클래스 => 상속을 내려서 구현하여 사용 => 자신이 메모리 할당을 할 수 없다
 * 	> 추상 클래스의 단점을 보완
 * 		단일 상속에서 다중 상속으로 변경
 * 		추상 클래스는 구현된 메소드 / 구현이 안된 메소드 => 인터페이스는 구현이 안된 메소드만
 * 	> 역할
 * 		1) 서로 다른 클래스를 연결하여 사용
 * 		2) 관련 클래스를 묶어서 한개의 객체명으로 제어
 * 		3) 설계와 관련 => 재사용 (기능 설계)
 * 		4) ------------------------------- 모든 개발자가 동일한 메소드를 재정의 : 표준화
 * 			표준화 : 라이브러리 => System.out.println() / Math.random() / nextInt() ...
 * 			소스의 통일화 => 분석이 쉽다 : 유지 보수를 쉽게 만들기 때문에 => 스프링 : 대표적인 소스의 통일화
 * 	= 요구 사항 분석 => 인터페이스
 * 	= 아이템 선정 => 참조할 사이트 (벤치 마킹) => 기능 추출 : 인터페이스 / 데이터 추출 : 크롤링 (사용자 정의 데이터형)
 * 	= 사이트에 사용할 데이터 크롤링 => 오라클에 저장
 * 		데이터베이스 설계 => 데이터 수집 => 구현 => JSP / Spring => 테스트 => 오류 발생 여부 확인 => 배포 => 발표
 * 
 * 	2. 인터페이스의 구성 요소 => (static과 같은 건 들어가지 않는다)
 * 	[접근지정어] interface 인터페이스명
 * 	{
 * 		----------------------------
 * 		변수 => 상수 => (247page)
 * 		int a; => 오류 발생
 * 		int a=10; => 초기화를 반드시 한다
 * 		# 생략
 * 			(public static final) int a=10;
 * 		(public static final) : 자동 추가
 * 		----------------------------
 * 		구현이 안된 메소드
 * 		=> void aaa();
 * 			void bbb();
 * 		# 생략
 * 			(public abstract) void aaa();
 * 		(public abstract) : 자동 추가
 * 		----------------------------
 * 		구현된 메소드 (JDK1.8 ~)
 * 		=> default void ccc()
 * 			{
 * 				// 구현이 가능
 * 			}
 * 		=> public default void ccc() // 컴파일러에 의하여 자동으로 public 추가
 * 		=> 오버라이딩 : 접근지정어를 축소할 수 없다
 * 		----------------------------
 * 		*** 인터페이스는 상수/메소드 => public
 * 		*** 단점
 * 			=> 관련된 클래스를 모아서 관리
 * 			=> 결합성이 낮은 프로그램
 * 				=> 클래스와 클래스를 연결 => 수정할 때 에러 부분
 * 				=> 인터페이스는 고정 => 수정 => default 메소드 제공
 * 	}
 * 
 * 	인터페이스 : default / public => 다른 클래스를 묶어서 관리 => 인터페이스에서 기본형은 public
 * 
 * 	3. 인터페이스의 장점
 * 		1) 기능 설계 => 메소드 설계 => 개발 기간을 단축할 수 있다
 * 		2) 메소드가 동일하다 (모든 개발자가 동일한 메소드 구현) : 표준화 => 분석이 쉽다
 * 		3) 인터페이스 한개로 여러개의 클래스를 관리
 * 		4) 유지 보수가 쉽다
 * 		5) 독립적으로 사용이 가능 (클래스 == 클래스)
 * 			=> 리모컨의 역할을 수행한다 : 원격
 * 			=> 카페
 * 			=> 면접 98%
 * 			=> 클래스가 여러개 (관련) => 게시판, 갤러리 게시판, 댓글형 게시판 ... : CRUD
 * 			=> 결합성이 낮은 프로그램
 * 			=> 표준화 작업
 * 
 * 	4. 인터페이스 상속 (249page)
 * 	=> 인터페이스와 인터페이스 상속
 * 		interface A
 * 		interface B extends A
 * 
 * 		interface A
 * 		interface B extends A
 * 		interface C extends B
 * 	---------------------------- 단일 상속
 * 		interface A
 * 		interface B
 * 		interface C extends A,B
 * 	---------------------------- 다중 상속 (253page)
 * 	=> 인터페이스와 클래스 상속
 * 		interface A
 * 		class B implements A // implements : A가 가지고 있는 메소드를 구현하여 사용한다
 * 	=> 다중 상속 (250page)
 * 		interface A
 * 		interface B
 * 		class C implements A,B
 * 
 * 		interface A
 * 		interface B
 * 		class C
 * 		class D extends C implements A,B // extends : 클래스 상속, implements : 인터페이스 상속
 * 
 * 		# 윈도우
 * 		class A extends JFrame implements ActionListener, KeyListener, MouseListener
 * 										  ========================================== 이벤트 (사용자의 행위) => 인터페이스로 제작
 * 	컬렉션 => interface로 되어 있다
 * 	
 *	*** 클래스 상속 => extends
 *	*** 인터페이스 상속 => implements
 *
 *	*** 클래스 ===extends(확장)===> 클래스
 *	*** 인터페이스 ===implements(구현)===> 클래스
 *	*** 인터페이스 ===extends(확장)===> 인터페이스
 *
 *	*** 클래스 ===> 인터페이스 (X, 존재하지 않는다)
 * 
 * 	5. 인터페이스 활용
 * 	--------------> 객체 지향의 마지막
 * 	=> 예외 처리 (형식)
 * 	=> 라이브러리 (암기) => 메소드 => 기능, 원형 (리턴형 / 매개 변수)
 * 	   ------------ 컬렉션 (배열 대신) => 웹
 * 					 | 고정이 아니다 => 개수 => 제네릭스 (자동 형변환)
 * 	=> 웹 (데이터베이스 연동)
 * 		  ------------- 브라우저 => 데이터형 클래스
 * 	=> 틀을 만든다 : 스프링 (메인보드) => 실무
 * 				  ------------ 스프링부트 (단점 => 교재)
 * 	=> AWS에 호스팅 => 리눅스 명령어 야간
 * 
 * 	* 웹 프로그램
 * 	자바 : 변수 (데이터형), 연산자. 제어문
 * 		= 묶어서 사용
 * 		1) 명령문 묶기 => 메소드
 * 		2) 변수 묶기 => 배열 (1차원), 클래스
 * 		= 객체 지향 프로그램 : 권장
 * 		1) 데이터 보호 : 캡슐화 => getter/setter
 * 		2) 인터페이스 : 클래스 여러개를 묶어서 관리 => 결합성이 낮은 프로그램
 * 		3) 오버라이딩 => 인터페이스는 오버라이딩을 주로 사용
 * 		= 프로그램이 비정상 종료 방지 : 예외 처리
 * 		= 사용자 정의 + 라이브러리 => 조립
 * 		  ------------------------- 사용처
 * 		= 2차 자바 : 오라클 연동 => JDBC
 * 		= 3차 자바 : 웹 연동 => J2EE (JSP)
 * 							---------- JSP가 사라지는 느낌 : 타임리프, VusJS
 * 							=> 1차 프로젝트
 * 		= 4차 자바 : 스프링.스프링부트 : 어노테이션 / XML
 * 							=> 2차 프로젝트
 * 		= 서버단
 * 			개인 프로젝트
 * 			스브링부트 => React-Query
 * 			장고(: 파이썬 => 예측, 통계) => Redux
 */
class A
{
	int a; // static이 없으면 변수는 고딕체
	static int b; // static이 있으면 변수는 필기체
	int COLOR; // static이 없으면 변수는 고딕체
	static int COLOR1; // static이 있으면 변수는 필기체
}
interface 도형
{
	String COLOR="black"; // public static final String COLOR="black"; => (public static final) : 자동 추가
	
	// 그리다
	void draw(); // public abstract void draw(); => (public abstract) : 자동 추가
	
//	private void aaa(); // 오류 => private은 오버라이딩을 할 수 없기 때문에 사용 불가
//	default void aaa(); // 오류 => default은 오버라이딩을 할 수 없기 때문에 사용 불가
//	protected void aaa(); // 오류 => protected은 오버라이딩을 할 수 없기 때문에 사용 불가
	// 인터페이스에서 선언 시 => 접근지정어는 public만 선언 가능
}
class 선 implements 도형
{
	// 접근지정어가 축소됨
	public void draw() // 지금 여기는 class 내 이므로 => 접근지정어 기본형이 public이 아닌 default이다 => 따라서 public 생략 불가능
	{
		System.out.println("선을 그린다");
	}
}
class 사각 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
	
}
class 삼각 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 a=new 선();
		a.draw(); // 선을 그린다
		
		a=new 사각();
		a.draw(); // 사각형을 그린다
		
		a=new 삼각();
		a.draw(); // 삼각형을 그린다
	}

}
