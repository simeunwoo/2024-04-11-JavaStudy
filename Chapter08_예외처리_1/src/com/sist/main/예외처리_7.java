package com.sist.main;
// 에러 메세지 => 출력
/*
 * 	에러 확인
 * 	getMessage() : 에러 내용만 출력
 * 	printStackTrace() : 에러 위치 확인 (권장 사항)
 * 	-----------------------------------------------------------------------
 * 	Exception : 상속을 내린 모든 클래스의 예외 처리 기능을 가지고 있다
 * 	-----------------------------------------------------------------------
 * 	RuntimeException : 실행 시 예외 처리의 모든 기능을 가지고 있다
 * 	-----------------------------------------------------------------------
 * 	IOException / SQLException / ClassNotFoundException / RuntimeException
 * 	ClassCastException / ArithmeticException / NullPointerException / NumberException
 * 
 * 	상속에서의 크기 : 상속을 내리는 클래스가 받는 클래스보다 더 크다
 * 
 * 	class A
 * 	class B extends A ===> A>B
 * 						===> 클래스에서 클래스 상속은 확장한다
 * 
 * 	interface A
 * 	class B implements A ===> A>B => 인터페이스도 클래스다 (추상 클래스의 일종이기 때문)
 * 						===> 인터페이스에서 클래스 상속은 구현한다 (인터페이스는 구현인 안된 메소드를 가지고 있다)
 * 								=> 구현해서 완성된 클래스를 만들어서 사용
 * 	----------------------------------------------------------------------------------
 * 	=> ClassCastException < RuntimeException < Exception < Throwable
 * 
 * 	예외 처리
 * 	Exception : 예외 처리의 최상위 클래스 => 모든 예외 처리가 첨부되어 있다
 * 	=> 어떤 에러가 발생했는지 확인
 * 		getMessage(), printStackTrace()
 * 		=> 에러 발생 시 처리 : output창
 * 		=> 에러 잡기 => 정시 퇴근을 가른다 => 기술
 */
class AAA
{
	
}
class BBB extends AAA
{
	
}
public class 예외처리_7 {

	String msg; // null => null의 경우 연결하는 주소가 없어서 => 메소드를 사용할 수 없다
	// => NullPointerException

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
	//		int a=Integer.parseInt(" 10"); // 공백 때문에 에러 생성
			
	/*		int[] arr=new int[2];
			arr[0]=10;
			arr[2]=20; // index 초과로 인한 에러 생성 */
			
	/*		예외처리_7 a=new 예외처리_7();
			String s=a.msg.concat("Java");
			System.out.println(s); // 문자열 결합 => + => 에러 생성 */
			
			AAA a=new AAA();
			BBB b=(BBB)a; // 형변환 때 반드시 생성자 일치시켜야
			// ClassCastException
			
		}catch(Exception ex)
		{
			// Exception => 자바에서 지원하는 모든 오류 처리가 가능 => Throwable : Error도 출력 => 웹
	//		System.out.println(ex.getMessage()); // For input string: " 10"
												// Index 2 out of bounds for length 2
												// Cannot invoke "String.concat(String)" because "a.msg" is null
// class com.sist.main.AAA cannot be cast to class com.sist.main.BBB (com.sist.main.AAA and com.sist.main.BBB are in unnamed module of loader 'app')

			
			ex.printStackTrace();
			/*
			java.lang.NumberFormatException: For input string: " 10"
				at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
				at java.base/java.lang.Integer.parseInt(Integer.java:654)
				at java.base/java.lang.Integer.parseInt(Integer.java:786)
				at com.sist.main.예외처리_7.main(예외처리_7.java:14)
				
			===========> " 10" 부분에서 에러가 생성되었음을 알려줌
			 */
			/*
			java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
					at com.sist.main.예외처리_7.main(예외처리_7.java:17)
			 */
			/*
			java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "a.msg" is null
					at com.sist.main.예외처리_7.main(예외처리_7.java:23)

			 */
/*
java.lang.ClassCastException: class com.sist.main.AAA cannot be cast to class com.sist.main.BBB (com.sist.main.AAA and com.sist.main.BBB are in unnamed module of loader 'app')
	at com.sist.main.예외처리_7.main(예외처리_7.java:36)

 */
		}

	}

}
