package com.sist.lang;
import java.util.*;
class Sawon
{
	private String name;
	private String sex;
	// 메소드를 통하여 변수에 접근 (읽기/쓰기) => getter/setter => 변수는 은닉화, 메소드를 통하여 접근 => 캡슐화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // this는 Sawon의 객체 => 지역 변수 우선 순위
		// 지역 변수명=멤버 변수명이 같은 경우에 => 구분 => this 이용
		// 변수가 같을 수 있다 => 멤버 변수 (메모리 위치 : Heap), 지역 변수 (메모리 위치 : Stack) => 메모리 위치가 다르므로 같은 변수명을 써도 된다
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	// toString() => 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+name+",성별:"+sex;
	}
	// toString() => default (메모리 주소)
	// => Object에서 오버라이딩은 toString => 멤버 변수값 확인
	// 문자열 변환 => 대부분이 자바에서 지원하는 메소드의 리턴형이 => Object로 되어 있다
	// 클래스 저장 => Object
	
}
public class 라이브러리_Object_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Sawon s=new Sawon(); // 메모리에 name, sex가 저장됨
		s.setName("홍길동");
		s.setSex("남자");
		System.out.println(s); // com.sist.lang.Sawon@515f550a / 주소값 => 자동으로 toString() 호출
								// 이름:홍길동,성별:남자
		System.out.println(s.toString()); // com.sist.lang.Sawon@515f550a / toString() 생략이 가능
											// 이름:홍길동,성별:남자 */
		
/*		ArrayList list=new ArrayList();
		list.add(1);
		list.add(10.5);
		list.add("aaa"); */
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon());
		list.add(new Sawon());
		list.add(new Sawon());
		
//		Object o=list.get(0);
//		int a=(int)list.get(0);
//		double d=(double)list.get(1);
//		String s=(String)list.get(2);\
		String s=list.get(2).toString();
	}

}
