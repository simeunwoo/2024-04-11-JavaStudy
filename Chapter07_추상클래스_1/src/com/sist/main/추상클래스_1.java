package com.sist.main;
/*
 * 	클래스의 종류
 * 
 * 	1) 추상 클래스
 * 		형식)
 * 		public abstract class ClassName // abstract : 추상적인 (공통적인)
 * 		{
 * 			
 * 		}
 * 		공통으로 사용되는 메소드를 선언
 * 		=> 자신의 클래스를 메모리 할당을 할 수 없다 : 미완성 클래스 => new를 사용할 수 없다
 * 		=> 상속 받아서 => 오버라이딩을 하고 사용한다
 * 		=> 요구 사항 (기능 설정) => 선언만 가능
 * 
 * 	2) 인터페이스
 * 
 * 	3) 내부 클래스
 * 		=> Thread => 네트워크 (마지막)
 * 		=> 클래스 안에 클래스 설정 => 멤버 변수, 멤버 메소드를 쉽게 사용
 * 		class A
 * 		{
 * 			변수, 메소드
 * 			class B
 * 			{
 * 				A가 가지고 있는 변수, 메소드 사용이 가능 => A 객체를 생성할 필요가 없다
 * 			}
 * 		}
 * 
 * 		class A
 * 		{
 * 			// 익명의 클래스 => 상속 없이 오버라이딩이 가능 => 윈도우 프로그램
 * 			B b=new B() {
 * 				public void display()
 * 				{
 * 				}
 * 			}
 * 		}
 * 		class B
 * 		{
 * 			public void display(){}
 * 		}
 * 
 * 		*** 상속이 있어야 오버라이딩이 가능 => 익명의 클래스 오버라이딩
 * 			스프링에서는 상속을 권장하지 않는다
 * 			=> 제약이 존재 (상위 클래스에 맞게 ...)
 * 			=> 메모리가 커진다 (상위 클래스 메모리 할당 => 하위 클래스 메모리 할당)
 * 			=> 처리 속도가 늦다
 * 			=> 재사용을 한다 => 상위 클래스의 소스 코드를 모르는 상태에서 재정의를 한다 => 가독성이 떨어진다
 * 			
 * 
 * 	4) 종단 클래스 => 사용 빈도는 거의 없다 => 라이브러리에 존재 => 확장할 수 없다 (고정)
 * 					java.lang => String, System, Math, Wrapper ... => 상속 받을 수 없다
 * 					=> public final class String
 */
public class 추상클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
