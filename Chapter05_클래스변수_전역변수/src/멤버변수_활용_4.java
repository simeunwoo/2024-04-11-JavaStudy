class Human{ // Human이라는 데이터형을 제작 => 한개의 정보만 가지고 잇다
			//						=> 따로 저장 시에는 new 메모리 생성
	static String name; // static을 여기다 사용하면 일어나는 일을 알아보자
	static String sex; // new 사용 시 다른 메모리 생성
						// static => 공통으로 사용하는 메모리 생성
}
public class 멤버변수_활용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong=new Human();
		hong.name="홍길";
		hong.sex="남자";
		
		Human shim=new Human();
		shim.name="심청";
		shim.sex="여자";
		
		System.out.println(hong.name); // 심청
		System.out.println(hong.sex); // 여자
		
		// static은 공간이 하나다
	}

}
