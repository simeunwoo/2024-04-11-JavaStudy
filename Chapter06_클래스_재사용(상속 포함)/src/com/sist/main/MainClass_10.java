package com.sist.main;
/*
 * 	206page : 오버로딩 / 207page : 오버라이딩, 상속에서의 접근지정어
 * 
 * 	(오버로딩 / 오버라이딩 : 라이브러리 => 면접 확률 97%), 7장 (추상 클래스 / 인터페이스 : Spring 기반 => 면접 확률 85%)
 * 
 * 	### 오버로딩 : 중복 메소드 정의 => 같은 기능
 * 		ex) print(int), print(char), print(char[]) ... =======> print로 통일
 * 			버스, 버스=>일반버스, 버스(좌석), 버스(마을), 버스(고속 엔진)
 * 	= 상태 : 같은 클래스 내에서
 * 	class A
 * 	{
 * 		public void aaa(){} => aaa()로 저장
 * 		public void aaa(int a){} => aaa(int)로 저장
 * 		public void aaa(char c){} = public void aaa(char k){} : 같은 메소드 => aaa(char)로 저장
 * 		public void aaa(int a, int b){} => aaa(int, int)로 저장
 * 		public int aaa(double d){} => aaa(double)로 저장
 * 		void aaa(float f){} => aaa(float)로 저장
 * 	}
 * 	= 메소드명 : 동일
 * 	= 매개 변수 : 개수, 데이터형이 다르다
 * 	= 리턴형 : 관계 없다
 * 	= 접근지정어 : 관계 없다
 * 
 * 	### 오버라이딩 : 기존의 클래스를 상속 받아서 재정의 => 메소드 기능을 변경
 * 	= 상태 : 상속
 * 	= 메소드명 : 동일
 * 	= 매개 변수 : 동일
 * 	= 리턴형 : 동일
 * 	= 접근 지정어 : 동일 or 확대만 가능
 * 
 * 	오버라이딩 => 상속
 * 		예외 조건) static : 상속은 안된다 => 사용이 가능하게 만든다 (공유)
 * 				private : 상속은 가능 => 접근이 불가능
 * 					=> protected
 * 				생성자
 * 				초기화 블록
 * 				-------------
 * 				멤버 변수 (인스턴스) ===> 변수값 변경 (변수 오버라이딩)
 * 				메소드 ==============> 기능 변경 (메소드 오버라이딩)
 * 				------------- 상속
 * 
 * 	메소드의 종류
 * 	1. 인스턴스 메소드 : NEW에 의하여 따라 저장
 * 	2. 공통 메소드 : static => 상속의 예외 조건 => 변경 (전체 변경) => 오버라이딩이 안된다
 * 	3. 종단 메소드 : 확장이 불가능 => 변경이 불가능 => final
 * 	---------------------------------------------------------------------
 * 	권장 사항) 메소드의 접근지정어는 가급적이면 public 사용
 * 
 * 	접근지정어
 * 	public : 생성자, 클래스, 메소드, 인터페이스 => 다른 클래스와 연결
 * 	private : 멤버변수 => 데이터 노출 방지 (데이터 보호)
 * 			=> 다른 클래스에서 사용 => 변수 기능의 메소드 제작 : 메모리 저장 (set변수명()) / 메모리에 읽어 오기 (get변수명())
 * 
 * 	=> class A
 * 		{
 * 			private String name;
 * 			private boolean login;
 * 			public void getName()
 * 			public void isLogin()
 * 		}
 * 
 * 	class B
 * 	{
 * 		A a=new A();
 * 	}
 * 
 * 	> class 영역
 * 	static 메소드 : 기본은 static 메소드, static 변수만 사용 가능
 * 		=> 인스턴스 메소드, 인스턴스 변수는 사용할 수 없다
 * 	인스턴스 메소드 : 인스턴스 메소드, 인스턴스 변수, static 변수, static 메소드 전부 사용 가능
 */
class ABC
{
	public void display1() {} // 멤버 메소드 (오버라이딩이 가능)
	public static void display2() {} // 공통 메소드
	public final void display3() {} // 종단 메소드 => 더 이상 변경할 수 없는 메소드
}
class BCD extends ABC
{
	public void display1() {} // 멤버 메소드
	public static void display2() {} // 공통 메소드
//	public final void display3() {} // 종단 메소드 => 오류 (이미 앞에서 설정이 완료됨)
}
// 인스턴스 메소드, 인스턴스 변수 => 중심 / static은 데이터베이스에서만 주로 사용 => MyBatis
class DGB
{
	// this. => DGB가 가지고 있는 변수
	// 생성자, 멤버 메소드에만 존재 => static 메소드는 this가 없다 => 멤버 변수를 사용할 수 없다
	private String name;
	private boolean login;
	private static int age;
	
	public void display()
	{
		this.name="홍길동";
		name="";
		age=100;
	}
/*	public static void aaa()
	{
		name=""; // 오류
				// 클래스의 멤버 변수가 아니다 => class DGB가 가지고 있는 멤버가 아닌 static, 즉 공통으로 사용하기 때문

		System.out.println(age); // 그런데 이것은 사용이 가능하다
		
		display(); // 오류
		
		DGB d=new DGB();
		display();
		d.name=""; // 이건 가능하다 => 그러나 가급적이면 사용하지 않기를 권고
	} */
	public String getName() {
		return name;
	}
	// 변수가 충돌되지 않으면 this. 생략 가능
	public void setName(String n) {
		name = n; // 여기서 name은 지역 변수가 없을 경우에 앞에 this를 생략해도 되고 안해도 된다 => this.name도 가능
		// 지역 변수 우선 순위
		// 지역 변수, 매개 변수 => 매개 변수
	}
	// 읽기
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	
	
}
public class MainClass_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
