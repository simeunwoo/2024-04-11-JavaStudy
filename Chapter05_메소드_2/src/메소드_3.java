// 매개변수 => 메소드 안에서만 사용 가능 => 지역변수
// 메소드 호출 시에 메모리 저장 => 메소드가 종료되면 자동으로 해제가 된다
public class 메소드_3 {
	static int i=1; // 전역변수 => 프로그램 종료 시 메모리 해제
	static void increment()
	{
	//	int i=1; // 지역변수 (지역변수 우선 순위)
		System.out.println("i="+i);
		++i; // 밤색 => 지역변수 / 파란색 => 클래스 변수
	} // 지역변수 설정 시 호출할 때마다 여기서 끝나 새로 다시 시작해서 계속해서 i=1로 출력됨
			// => 호출 시마다 메모리가 사라지기 때문 => 변수는 자동 삭제 => 다시 생성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	increment(); // i=1 (지역변수 설정 시)
	//	increment(); // i=1 (지역변수 설정 시)
	//	increment(); // i=1 (지역변수 설정 시)
		
		increment(); // i=1 (전역변수 설정 시)
		increment(); // i=2 (전역변수 설정 시)
		increment(); // i=3 (전역변수 설정 시)
	}

}
