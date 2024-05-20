package com.sist.main;
// 266page => 예외 처리 상속도
// 상위 예외 처리 클래스일수록 => 예외 처리 기능을 많이 가지고 있다
// catch절 1개로 여러개를 처리할 경우 : Exception (모든 예외 처리 기능을 가지고 있다)
// 실행 시 예외는 RuntimeException
/*
 * 	웹 개발자 => 예외 처리는 필수
 * 
 *	CheckedException : 컴파일 시에 예외 처리가 있는지 확인 => 반드시 예외 처리를 해서 사용
 *	---------------- 파일 입출력, 오라클 연동, 크롤링, 네트워크, 웹
 *	UnCheckedException : 실행 시에 예외 처리를 처리하기 때문에 => 생략 가능
 *
 *	=> 예외 처리의 종류 (267page)
 *
 *		ClassNotFoundException : 클래스를 찾을 수 없는 경우
 *		---------------------- Class.forName("패키지명.클래스명"); => CheckedException => JSP, Spring
 *		IOException : 입출력 => 메모리 입출력, 파일 입출력, 네트워크 입출력
 *		SQLException : ******* 핵심 (오라클 실행 => SQL)
 *		-------------------------------------------- 웹은 포기
 *		=> HTML/CSS : 윈도우 화면 UI
 *		InterruptedException : 쓰레드 관련
 *		MalformedURLException : 네트워크 관련
 *		-------------------------------------------- CheckException : 반드시 예외 처리
 *
 *		RuntimeException
 *			= NumberFormatException : 정수 변환 => Integer.parseInt()
 *			= 
 *			=
 *			=
 *			=
 */
public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
