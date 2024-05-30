package com.sist.main;
/*
 * 	=> 변수 / 배열 / 연산자 / 제어문 / 메소드
 * 
 * 	# 클래스 구성 요소
 * 
 * 	=> 접근지정어
 * 		= private : 자신의 클래스 안에서만 접근 가능
 * 			멤버 변수에서 주로 사용
 * 		= default : 같은 패키지에서 다른 클래스에서 사용 가능
 * 			=> 윈도우 => 컴포넌트 (JButton, JTextfield ...)
 * 		= protected : 같은 패키지에서 다른 클래스에서 사용 가능
 * 			상속이 있는 경우 => 다른 패키지까지 접근 가능
 * 		= public : 모든 클래스에서 사용 가능
 * 
 * 	=> class 선언
 * 		[접근지정어] class ClassName
 * 			public => 다른 클래스와 연동
 * 		[접근지정어] 데이터형 변수명
 * 			private => 데이터 보호
 * 		[접근지정어] 생성자()
 * 			public => 다른 클래스와 연동
 * 		[접근지정어] 리턴형 메소드명()
 * 			public => 다른 클래스와 통신
 * 		[접근지정어] interface 인터페이스명
 * 			public => 다른 클래스에서 구현 후 사용
 * 
 * 	=> 제어어
 * 		= static : 공통적인 => 모든 객체가 공통으로 사용
 * 		= abstract : 미완성된 => 상속을 내려서 => 구현한 클래스를 이용
 * 		= final : 마지막 => 클래스 (종단 = 상속을 내릴 수 없는 클래스)
 * 						  메소드 (종단 = 오버라이딩이 불가능)
 * 						  변수 (상수 = 값을 변경할 수 없다)
 * 		[접근지정어] [제어어] ~~
 * 		--------------------
 * 		[제어어] [접근지정어] ~~
 * 		--------------------
 * 		접근 범위
 * 		private < default < protected < public (=> : 확장 / <= : 축소)
 * 		=> 오버라이딩 => 접근지정어의 확장은 가능 / 축소는 불가능
 * 
 * 	=> static 메소드 / static 블록에서는 인스턴스를 사용할 수 없다
 * 		=> 인스턴스를 사용하기 위해서는 반드시 메모리 할당 시 사용 : 매개 변수
 * 	=> 인스턴스 메소드 / 인스턴스 블록에서는 인스턴스 변수 / static 변수 사용이 가능
 * 	ex)
 * 		class A
 * 		{
 * 			int a;
 * 			public static void display()
 * 			{
 * 				a=200; // 오류
 * 				A aa=new A(); // 메모리 할당 시 사용
 * 				aa.a=200;
 * 			}
 * 		}
 * 		A aa=new A();
 * 		aa.a=100;
 * 
 *          오버로딩(새로운 기능 추가)   오버라이딩(기존의 기능을 변경)  (면접 99%)
 *  ===========================================================
 *  메소드명         동일                   동일
 *  ===========================================================
 *  리턴형          관계 없음                동일
 *  ===========================================================
 *  매개 변수     개수/데이터형이 다르다         동일
 *  ===========================================================
 *  접근지정어       관계 없음                확장만 가능
 *  ===========================================================
 *  상태          같은 클래스 내            상속이 있는 상태 (=> 포함된 경우 => 익명의 클래스)
 *  ===========================================================
 *  미완성된 클래스 => 반드시 상속을 내려서 구현 후에 사용
 *  
 *                추상 클래스             인터페이스  (면접 75%)        => 둘 다 ===> 공통적인 기능 설계 => 표준화
 *  ===========================================================        => 서로 다른 클래스 연결 (리모컨)
 *  상속           단일 상속              다중 상속 => 추상 클래스의 단점 보완      => 관련된 클래스 여러개를 묶어서 사용
 *  ===========================================================        => 결합성이 낮은 프로그램 제작 가능
 *  사용 방법    extends 추상클래스명       implements 인터페이스명               => 요구 사항 분석 => 설계도
 *  ===========================================================
 *  변수           멤버 변수                상수
 *  ===========================================================
 *  메소드          구현된 메소드           구현이 안된 메소드
 *                구현이 안된 메소드       (1.8 => 구현된 메소드 사용 가능 => default, static)
 *  ===========================================================
 *  접근지정어     접근지정어 전체 사용 가능     public만 사용 가능
 *  ===========================================================
 *  *** 인터페이스가 중심
 *  => 컬렉션
 *  => 데이터베이스
 *  => 인터페이스는 이벤트 처리 (윈도우) => 행위를 했을 때 처리 (키보드 입력 / 버튼 클릭 / 마우스 클릭 ...)
 *  	=> ActionListener : JButton, JMenu, JRadio ...
 *  	=> MouseListener (모든 컴포넌트가 가능) : JTable
 *  	=> KeyListener (모든 컴포넌트가 가능) : JTextField
 *  *** 구현을 하지 않고 내려주는 이유
 *  => 프로그램마다 구현하는 기능이 다르기 때문에
 *  => 버튼 : 로그인 / 취소 / 회원 가입 / 계산기 / 검색 ...
 *  => 프로그램에 맞게 구현해서 사용
 *  => 설계된 메소드만 전송
 *     --------------- 구현이 안된 메소드
 *  
 *  # 컬렉션
 *  
 *             Collection
 *                 |
 *  ---------------------------------------
 *  |                |                    |
 *  List            Set                  Map
 *  |                |                    |
 *  ArrayList
 *  LinkedList
 *  Vector
 *  
 *  ArrayList list=new ArrayList()
 *  LinkedList list=new LinkedList()
 *  Vector list=new Vector()
 *  
 *  ===> 더 간편한 방법
 *  
 *  List list=new ArrayList()
 *       list=new LinkedList()
 *       list=new Vector()
 *       
 *  객체지향의 객체란? ===> 면접 90%
 *  캡슐화 vs 은닉화 ===> 면접 가능성 多
 *  상속 vs 포함 ===> 면접 가능성 多
 *  ------------------------------
 *  예외 처리의 종류, 목적 ===> 면접 가능성 多
 *  컬렉션 ===> 면접 가능성 多
 *  
 *  #
 *  변수 : 필요 데이터 => 출력 화면
 *  	=> 목록 (X) => 요약
 *  	=> 상세 보기
 *  메소드 : 어떤 기능 => 메뉴
 *  생성자 : 오버로딩
 *  	=> 초기화 / 시작과 동시에 처리 => 자동 로그인 / 보안 / 데이터베이스 드라이버 등록 ...
 *  
 *  # 예외 처리
 *  목적 : 사전에 에러를 방지하는 프로그램
 *  정의 : 비정상 종료를 방지하고 정상 종료를 수행하게 만든다
 *  
 *  => 직접 처리 : 프로그래머가 직접 에러를 처리 => 에러 복구
 *      try ~ catch ~ finally => 거의 대부분 사용
 *                               ------------
 *                                웹 => DB 연동 (java.sql => CheckedException)
 *  => 간접 처리 : 에러 발생에 대해 선언만 => 사용 시에 반드시 예외 처리 후 사용
 *  			에러 떠넘기기
 *  	throws
 *  -------------------------------------------------------------------------
 *  try ~ catch는 여러개 사용 가능 => 순서가 존재
 *	=> 상속 => 위로 올라갈수록 크다 => 위로 올라갈수록 예외 처리하는 범위가 커진다
 *
 * 	               상속
 *
 *                Object
 *                  |
 *               Throwable : Exception / Error
 *                  |
 *  --------------------------
 *  |                        |
 *  Error                 Exception
 *  => 처리가 불가능          => 처리가 가능 => 소스 상에서 변경 가능
 *                        => 서버 IP / 파일명이 틀리다 / 배열 범위 초과 / 0으로 나눈다 ...
 *                           |
 *              -----------------------------------------
 *              |                                       |
 *         CheckedException                     UnCheckedException
 *              |                                       |
 *           java.io                             RuntimeException
 *               => IOException                      => NumberFormatException => Integer.parseInt()
 *               => FileNotFoundException            => NullPointerException
 *           java.sql                                => ArrayIndexOutOfBoundsException => StringTokenizer
 *               => SQLException
 *           java.lang
 *               => ClassNotFoundException
 *               => Class.forName()
 *               => InterruptedException
 *
 *	throws => 순서가 없다
 *  ====================> 통합 시 => Exception / Throwable
 *                        
 * 	오라클 연동 : 예외 처리를 가지고 있다
 * 	--------
 * 	JDBC : 자바에서 제공하는 라이브러리
 * 	 |
 * 	DBCP : 웹에서 주로 사용하는 기술
 * 	 |
 * 	ORM : 실무에서 사용하는 기술
 *  --- MyBatis (실무 85%) / (참고로 15%는 JPA)
 *  
 *  # 라이브러리
 *  
 *  java.lang
 *  java.util
 *  java.text
 *  java.io
 *  java.sql
 *  ----------------- javax.servlet.http... JSP
 *  ----------------- org.springframework... Spring
 */
class Sawon
{
	// static보다 => 인스턴스를 사용해야 편리하다
	// static은 공통 메소드
	// 인스턴스 => 멤버 메소드 => 멤버는 멤버만 사용 가능하게 만든다
	// => 윈도우 => this
	int sabun;
	String name;
/*	public static void setData()
	{
		Sawon s=new Sawon();
		s.sabun=10;
		s.name="홍길동";
	} */
	public static void setData(Sawon s) // 방법 1 // static에서는 동일한 객체를 사용하기 위하여 매개 변수를 이용해서
	{
		s.sabun=10;
		s.name="홍길동";
	}
	public Sawon() // 방법 2 : 방법 1과 같은 출력 결과 나옴 => 방법 2가 더 간편하다
	{
		setData(this);
	}
}
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon ss=new Sawon();
//		ss.setData();
//		System.out.println("ss.sabun="+ss.sabun); // ss.sabun=0
//		System.out.println("ss.name="+ss.name); // ss.name=null
		
		ss.setData(ss);
		System.out.println("ss.sabun="+ss.sabun); // ss.sabun=10
		System.out.println("ss.name="+ss.name); // ss.name=홍길동
	}

}
