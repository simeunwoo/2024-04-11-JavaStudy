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
 */
public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
