/*
 * 	class Sawon
 * 	{
 * 		String name;
 * 		String dept;
 * 	}
 * 	------------------------- 변수가 아니라 데이터형 (Sawon 데이터형) => 사용자 데이터형
 * 	public class MainClass
 * 	{
 * 		Sawon s=new Sawon(); => 모든 메소드에서 사용 가능
 * 		static void aaa()
 * 		{
 * 			Sawon s=new Sawon(); ----
 * 		}							|
 * 		static void bbb()			|
 * 		{							|
 * 			Sawon s=new Sawon(); ---- => 메소드 안에 있는 변수는 호출 후에 사라진다 => 다른 변수
 * 		}							|
 * 		static void ccc()			|
 * 		{							|
 * 			Sawon s=new Sawon(); ----
 * 		}
 * 
 * 
 * 		메소드 안에서만 사용 => 지역변수
 * 		전체 메소드에서 사용 => 멤버변수
 */
public class 멤버변수_활용 {
	static int a=100; // 전역 변수(멤버 변수) => a=100으로 계속 이어진다 (static을 써야 한다)
	static void aaa()
	{
	//	int a=100; // aaa() => 호출 후 => a는 사라진다
		System.out.println("aaa():a="+a);
	//	System.out.println("aaa():a는 사라진다");
		// {} => 블록 안에서만 사용하는 변수 : 지역변수
	}
	static void bbb()
	{
		int a=200; // 각각의 a는 다 다른 변수
		System.out.println("bbb():a="+a);
	//	System.out.println("bbb():a는 사라진다");
	}
	static void ccc()
	{
		int a=300;
		System.out.println("ccc():a="+a);
	//	System.out.println("ccc():a는 사라진다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa();
		bbb();
		ccc();
	}

}
