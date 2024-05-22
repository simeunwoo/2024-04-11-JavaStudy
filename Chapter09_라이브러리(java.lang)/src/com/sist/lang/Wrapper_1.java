package com.sist.lang;
/*
 * 	Wrapper : 모든 기본형 데이터형을 클래스화 => 기능 부여 => 사용이 쉽게
 * 	-------
 * 	*** Integer : int를 클래스화
 * 		문자열 => 정수로 변환
 * 		Integer.parseInt(String)
 * 	------------------------------------
 * 	*** Double : double을 클래스화
 * 		문자열 => 실수로 변환
 * 		Double.parseDouble(String)
 * ------------------------------------
 * 	*** Boolean : boolean을 클래스화
 * 		문자열 => 논리형으로 변경
 * 		Boolean.parseBoolean(String)
 * ------------------------------------
 * 	Float : float을 클래스화
 * ------------------------------------
 * 	Byte : byte를 클래스화
 * 
 * 	오토박싱 / 언박싱
 * 	-------------
 * 	Integer i=10; => 오토박싱
 * 	int ii=i; => 언박싱
 * 	-------------
 * 	Integer / int 교환이 가능
 * 
 * 	제네릭스 : 데이터형을 변경 => 이미 만들어져 있는 라이브러리의 데이터형 변경 => 메소드의 리턴형 / 매개 변수
 * 	=> 등록 => 클래스만 가능
 * 	<데이터형>
 * 	<int> (X) => <Integer>
 * 	=> 라이브러리 매개 변수/리턴형이 변경될 수 있다 => 형변환 없이 사용
 */
class A<T>
{
	T t;
	public T getT()
	{
		return t;
	}
	public void seT(T t)
	{
		this.t=t;
	}
}
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=100; // 오토박싱
		System.out.println(i); // 100
		int ii=i; // 언박싱
		System.out.println(ii); // 100
		// 형변환 없이 사용
		
		String s="1000";
		System.out.println(s+1); // 10001
		System.out.println(Integer.parseInt(s)+1); // 1001
		
		A<String> a=new A();
	}

}
