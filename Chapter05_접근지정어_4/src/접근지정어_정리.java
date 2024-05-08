/*
 * 		데이터 저장 ===> 데이터 처리 (요청) ===> 화면에 출력
 * 
 * 	데이터 저장 => (파일 / 오라클)
 * 	1. 변수
 * 	2. 배열
 * 	3. 클래스
 * 
 * 	데이터 처리 => (클래스)
 * 	1. 연산자
 * 	2. 제어문
 * 	3. 메소드
 *
 *	화면에 출력
 *	1. 명령프롬프트 => System.out.prinln()
 *	2. 윈도우 => JFrame
 *	3. 브라우저 => HTML
 *
 *	1) 묶는 방법
 *		= 데이터 묶기
 *			= 배열
 *			= 클래스 : 변수만 설정, getter/setter
 *		= 명령문 묶기 : 메소드만 묶기 => ~Manager
 *		= 동시(데이터+명령문)에 묶기 : 클래스
 *
 *	2) 사용 범위를 지정 : 접근지정어
 *		private : 자신의 클래스 내에서만 접근 가능 => 데이터를 감출 때 (은닉화)
 *		default : 같은 패키지 안에서만 접근 가능
 *		protected : 같은 패키지 안에서만 접근 가능 + 상속을 받은 경우 다른 패키지까지 접근 가능
 *		public : 패키지 상관 없이 모든 클래스에서 접근 가능
 *
 *		*** private (비공개) / public (공개)
 *
 *		class Main
 *		{
 *			public JButton b=new JButton("로그인");
 *		}
 *		
 *		class Member
 *		{
 *			private String id;
 *			private String pwd;
 *		}
 *
 *		*** 윈도우 관련 => Button/TextField => 공개
 *		*** 개인 정보/영화 정보 ... => 비공개
 *		*** 실제가 아니라 가상 => 키워드 사용
 *			int : 4byte / double : 8byte ...
 *
 *	# 패키지(폴더 느낌) : 관련 클래스를 묶어서 관리 => 찾기(검색)
 *	  ------------ 분업이 쉽게
 *	형식)
 *		회사
 *			com.회사명.구분자
 *		그룹
 *			org.회사명.구분자
 *		학교
 *			ac.회사명.구분자
 *	---------------------
 *	1) 패키지는 클래스 구분 폴더
 *
 *	2) 식별자 사용 :
 *		알파벳 (소문자로 사용)
 *		숫자는 앞에 사용 불가
 *		키워드는 사용 불가
 *		특수문자는 사용 빈도가 거의 없다
 *		공백이 있으면 안된다
 *
 *	3) 실무
 *		com.회사명.dao => 오라클(데이터베이스)
 *		com.회사명.manager => 파일, 이메일, 뉴스(외부에서 API)
 *		com.회사명.vo => 데이터형(사용자 정의)
 *		com.회사명.service => BI(통합) => 조립
 *		com.회사명.controller => 브라우저와 연결
 *	=> 패키지는 반드시 첫번째 줄에 사용한다 => 한번만 사용 가능
 *	=> 패키지를 불러오는 방법
 *		import com.회사명.dao.*; => dao 폴더 안에 있는 모든 클래스를 불러온다
 *		import com.회사명.dao.BoardDAO => BoardDAO 한개만 불러오는 경우
 *	=> 패키지를 만들면
 *		패키지가 다를 경우 같은 이름의 클래스를 생성할 수 있다
 *		예)
 *		com.sist.dao => Board.java
 *		com.sist.vo => Board.java
 *		=> 충돌
 *		import java.util.*; => Date
 *		import java.sql.*; => Date
 *
 *		Date date=new Date(); => 오류 발생
 *
 *		=> 이럴 땐 import java.util.Date;와 같은 방법을 써야 한다
 *
 *	변수		연산자	제어문
 *			------------
 *				 |
 *				메소드
 *	--------------------
 *			 |
 *			클래스
 *			---- 클래스를 여러개 묶어서
 *				 ----------------
 *						 |
 *						패키지
 *
 *	=> 관련된 내용 : 127page
 *
 *	*** 멤버변수 (지역변수 제외) => private
 *	*** 클래스, 메소드, 생성자 => 다른 클래스와 연결 => public
 *
 *	클래스 : 설계
 *	메소드 : 기능 설정
 *	생성자 : 시작점, 초기화
 *	변수 : 화면을 출력할 데이터를 모아준다
 *
 *	자바 => 인터페이스, 예외 처리, 추상 클래스 => 추가 => 7장
 *	=> 객체지향 프로그램 : 유지보수 : 수정, 추가
 *	=> 캡슐화, 상속, 수정, 추가 => 다형성 : 수정 및 추가
 *	*** 필수가 아니라 객체 지향 프로그램의 권장
 *		*** 유일하게 사용
 *			--------- 캡슐화
 *			=> 변수는 private => 사용 가능하게 getter/setter
 */
import java.util.Scanner;
public class 접근지정어_정리 {

	static Scanner scan=new Scanner(System.in); // static 사용!!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub

}

}
