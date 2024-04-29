/*
 * 	1. 기능 설정 => 단락 => 처리 => 메소드
 * 		자바 : 메소드 => 클래스 종속
 * 		C/C++ : 함수 => 독립적으로 사용
 * 	2. 데이터 저장 -----------------------> 데이터 처리 (요청) -----------> 요청 결과를 전송
 * 	   --------							--------------
 * 		| 변수(한개)						데이터 가공
 * 		| 배열(여러개)						| 연산자
 * 			=> 같은 데이터형				| 제어문
 * 			=> 인덱스 이용					======= 연산자+제어문 => 메소드 : | 명령문의 집합
 * 		| 클래스(사용자 정의 데이터형)										| 한가지 기능만 수행
 * 			=> 다른 데이터형											| 반복적인 내용을 제거
 * 																	--------------
 * 																=> System.out.println()
 * 																			  ---------
 * 																			=> 출력
 * 																	| 구조적 프로그램 (단락)
 * 																=> 수정, 추가. 삭제가 편리
 * 																	| 재사용 : 다른 클래스에서 사용 가능
 * 	메소드 (Method) : 데이터를 활용하는 기능
 * 
 * 	=> 사용 목적 : 가독성 (기능별로 묶는다) => 에러 시 처리가 편리
 * 				기능별 구분
 * 				재사용성 => 객체지향 프로그램
 * 				속도 (최적화)
 * 	=> 기능별 처리
 * 		= 로그인처리
 * 		= 회원가입
 * 		= 게시판
 * 		= 목록 => 페이징
 * 		= 예약하기
 * 		= 결제
 * 		-------------
 * 	-> 다른 클래스에서 연결 => 메세지 (메소드) => 상호 통신
 * 	-> 필요 시마다 재사용
 * 		정수 => Scanner scan=new Scanner(System.in)
 * 		=> nextInt()
 * 	-> 반복을 제거
 * 		메소드가 호출되면 => 처음부터 실행
 * 
 * 		변수(데이터) = 기능 = 조립
 * 					|
 * 				   메소드
 * 		--------------------
 * 		=> 조립 (웹사이트)
 * 			메인 페이지
 * 			메뉴 / Footer / Content
 * 							|
 * 						  게시판 / 채팅 / 공지 / 예약 / 결제 / 장바구니...
 * 		--------------------------------------------------------
 * 		=> 오버라이딩 / 오버로딩 => 인터페이스 / 추상클래스 / 오라클 연동
 * 
 * 		1. 메소드의 형식 [] => 생략
 * 			[접근지정어][옵션] 리턴형(결과값) 메소드명(매개변수...) => 선언문
 * 			{
 * 				// 구현
 * 			}
 * 
 * 			리턴형(결과값) => 모든 메소드는 리턴형을 가지고 있다
 * 			=> 사용자 요청에 대한 처리 결과를 넘겨준다
 * 			   리턴형은 1개 사용만 가능 => 데이터가 많은 경우에는 묶어서 넘겨준다
 * 									---------------------------
 * 									| 배열 / 클래스
 * 			=> 사용자 요청
 * 			   정수 2개를 전송 => 더한 결과값 => 정수+정수 : 리턴형
 * 
 * 			매개변수(사용자 요청값)
 * 			예) 로그인 요청
 * 				결과값	사용자 요청값 : id, pwd,...
 * 				=> boolean (true/false)
 * 				검색
 * 				---
 *				결과값	사용자 요청값
 *						---------
 *						  검색어
 *				 |
 *				검색 결과 => []
 *			메소드명 (= 변수명과 거의 같은 특징)
 *			------
 *			1) 알파벳, 한글로 시작한다 (대소문자 구분)
 *			2) 숫자 사용이 가능 (앞에 사용 불가)
 *			3) 키워드는 사용 불가
 *			4) 특수 문자 (_, $) 사용 가능
 *			5) 공백은 사용 불가
 *			-------------------------------- 식별자
 *			*** 변수는 중복 사용이 불가능 (한개의 메소드에서 같은 변수는 사용 불가)
 *			*** 메소드는 같은 이름의 사용 가능 . ex) System.out.print;
 *			*** 약속 사항 (자바 개발자끼리) => 메소드는 소문자로 시작한다
 *				=> 단어가 2개일 때 . ex) fileName() => 두번째 시작 단어는 대문자로 시작 (헝거리식 표기법)
 *													또는 '_'로 시작	
 *			*** 결과값 / 요청값을 받는다
 *				----   ----
 *				리턴형   매개변수
 *			--------------------------------------
 *			메소드 유형
 *			--------------------------------
 *				리턴형		매개변수
 *			--------------------------------
 *				 O			  O
 *				String substring(int start,int end)
 *			--------------------------------
 *				 O			  X
 *				double random() => 결과값은 0.0~0.99 => 실수를 리턴
 *			--------------------------------
 * 				 X			  O
 * 				void println("aaa") => 결과값이 없는 경우에 void
 *			--------------------------------
 * 				 X			  X
 * 				void println() => 다음줄에 출력 (기능이 X)
 *			--------------------------------
 *			*** 웹 개발
 *				-----
 *				사이트 => 사용자 입력 => 매개변수
 *						처리 => 화면
 *							  ---- 결과값(리턴형)
 *				=> 사용자 행위 : 입력 / 마우스 클릭 => 매개변수
 *				=> 화면 출력 => 리턴형
 *				=> 사용자 요청 => 처리 => 결과값을 돌려준다
 *				   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 메소드
 * 
 * 		2. 메소드 사용법
 * 
 * 		3. 반복을 제거
 */
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Method"); // void java.io.PrintStream.println(String x)
		Math.random(); // double java.lang.Math.random()
		String s="";
		s.substring(0); // String java.lang.String.substring(int beginIndex)
		// 원형 => 라이브러리 => 메소드 (리턴형 / 매개변수)
	}

}
