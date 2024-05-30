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
 *		Object : 최상위 클래스
 *			= toString() : 객체를 문자열로 변경
 *			= finalize() : 소멸자
 *			= clone() : 복제
 *		String : 문자열 저장
 *			= equals() : 문자열이 같은 경우 (==는 주소값 비교)
 *			= contains() : 검색 (포함된 단어)
 *			= startsWith() : 서제스트 (자동완성기)
 *			= indexOf() / lastIndexOf() : 지정된 문자 위치를 찾는 경우 => 인덱스 번호
 *			= valueOf() : 모든 데이터형을 문자열형으로 변경
 *			= substring() : 문자열을 자르는 경우
 *			= length() : 문자 개수 확인
 *			= trim() : 좌우의 공백 제거
 *		---------------------------------------- 웹 => 문자열
 *		StringBuffer : 문자열 결합
 *			= append() : 최적화
 *			= toString() : 저장된 모든 데이터를 문자열
 *		Math : 수학
 *			= random() : 임의로 값 추출
 *			= ceil() : 올림
 *		Wrapper : 기본형을 클래스화 => 제네릭에서 사용 (제네릭 : 클래스만 지정 가능)
 *			Integer <= int => parseInt()
 *			Double <= double => parseDouble()
 *			Boolean <= boolean => parseBoolean()
 *			Byte <= byte
 *
 *			Integer i=10; // 오토박싱
 *			int ii=i; // 언박싱
 *			------------------------- 호환이 된다
 *			=> 웹, 윈도우는 모든 데이터를 문자열로 인식 (기본형은 없다)
 *
 *  java.util : 프로그램에서 많이 사용하는 클래스의 집합
 *  	Random : Math.Random() => 보완
 *  		=> nextInt(int bounds) : 마지막은 제외
 *  			nextInt(100) => 0 ~ 99
 *  	StringTokenizer : 문자열을 구분자별로 자르는 경우
 *  		=> split()을 보완
 *  		= nextToken() : 자른 단어를 읽어 올 때
 *  		= hasMoreTokens() : 자른 개수만큼 루프
 *  		= countTokens() : 자른 개수
 *  	Date : 오라클의 데이터형과 호환 => 기능이 없다
 *  	Calendar : Date에 없는 기능을 보완 => 요일, 마지막날 => 달력
 *  	Collection : 배열의 단점을 보완 => 고정적~>가변형
 *  
 *  List / Set / Map
 *  ----         ---
 *  ArrayList    HashMap
 *               => 중복 제거 => HashSet => 웹소켓
 *               
 *  	List : 데이터 중복 허용, 순서가 있다
 *  		=> 인덱스 (0번부터 시작) (삭제, 추가 => 자동 변경) => 순차적으로 유지
 *  		= ArrayList : 데이터베이스 => 추출한 데이터를 브라우저로 전송, 윈도우
 *  			= add() : 추가
 *  			= size() : 저장 개수
 *  			= get() : 데이터 읽기
 *  			= clear() : 전체 삭제
 *  			= isEmpty() : 존재 여부
 *  	Set : 데이터 중복을 허용하지 않는다, 순서가 없다
 *  		= HashSet : 웹소켓 => 브라우저에서 채팅, 접속자마다 쪽지 전송 => 접속자가 중복이 되면 안된다
 *  			= add(값) : 추가
 *  			= size() : 저장 개수
 *  			= get() : 데이터 읽기
 *  			= clear() : 전체 삭제
 *  			= isEmpty() : 존재 여부
 *  	Map : 키, 값을 동시에 저장, 키는 중복할 수 없다, 값을 중복이 가능
 *  		= HashMap : 클래스를 모아서 관리, 웹에 전송, 웹에서 응답, 쿠키 저장, 세션에 저장 
 *  			= put(키,값) : 추가
 *  			= size() : 저장 개수
 *  			= get() : 데이터 읽기
 *  			= clear()
 *  			= isEmpty()
 *  
 *  *** 저장된 데이터형 => 프로그래머가 어떤 데이터를 저장할 지 모른다
 *                    -------------------------------
 *                    => 어떤 데이터든 상관 없이 받을 수 있게 제작 => Object
 *                    => 리턴형 / 매개 변수 => Object로 되어 있다
 *                                        -------
 *                                        | 가장 큰 데이터형이다 => 형변환을 해서 사용
 *                                        
 *  *** Object를 전체 변경이 가능하게 만든다 (프로그램에 맞는 데이터형으로 변경)
 *      => 데이터형을 통일화
 *      => 가독성이 좋다 => 데이터 확인이 가능
 *      => 형변환이 없기 때문에 간결하다
 *      => 제네릭
 *         <클래스>
 *         => <int> (X)
 *         => <Integer>
 *      컬렉션은 =>제네릭을 이용해서 제어한다
 *  	
 *  java.text
 *  	= DecimalFormat : 숫자 변환 => new DecimalFormat("###,###,###,###")
 *  	= SimpleDateFormat : 날짜 변환 => new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
 *  	  ----------------- format() : 변경
 *  	= String.format("%d%d",1,2) => printf()와 동일
 *  
 *  java.io
 *  	= FileInputStream / FileOutputStream : 다운로드 / 업로드
 *  	= FileReader / FileWriter : 파일에 한글이 있는 경우에 제어
 *  	= BufferedReader / BufferedWriter : 메모리에 파일의 내용을 읽어 놓고 제어, 제어 속도가 빠르다
 *  
 *  	FileInputStream, FileReader, BufferedReader => read(), close()
 *  	FileOutputStream, FileWriter, BufferedWriter => write()
 *  
 *  	-1 : EOF (파일의 끝)
 *  
 *  java.sql
 *  	1. 드라이버 등록
 *  	= Class.forName(드라이버명)
 *  	2. 오라클 연결
 *  	= Connection
 *  	3. 오라클로 명령어 전송 => 오라클을 배우는 것이 아니라 => 자바에서 오라클을 제어하는 언어를 배운다
 *  		SQL : 명령어 => 구조화된 질의 언어
 *  			= DML : 데이터 조작 언어 => 프로그래머가 주로 사용 (DBA => 담당)
 *  			= DDL : 정의 언어
 *  			= DCL : 제어 언어
 *  			= TCL : 트랜잭션 언어 (일괄 처리)
 *  	= PreparedStatement
 *  	4. 결과값 얻기
 *  	= ResultSet
 *  
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
