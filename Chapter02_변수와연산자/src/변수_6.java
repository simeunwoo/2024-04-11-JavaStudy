
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue=10; // 구분이 없다 => 단 -128~127 사이의 정수만 가능
		int intValue=20; // 컴퓨터에서는 모든 숫자를 int로 인식 => 단 -21억4천~21억4천 사이의 정수만 가능 (4byte 숫자)
		long longValue=30L; // 구분 => 숫자 뒤에 L, l (8byte 숫자)
		float floatValue=10.5F; // 소수점 6자리까지 계산 (4byte 숫자)
		double doubleValue=10.5; // 소수점 15자리까지 계산 (8byte 숫자)
		// 정수의 디폴트 => int
		// 실수의 디폴트 => double
		// 실제 프로그램에서는 int, double이 가장 많이 사용된다
		// 변수 => 계속 상태가 변경 / 상수 => 고정
		boolean booleanValue=true; // 조건식 => 저장은 true/false만 저장이 가능 (1byte)
		char charValue='A'; // 문자 1개 저장 공간 => 0~65535 (2byte)
		/*
		 *  	byte = char = int = long = double
		 *  	boolean ㅣ
		 *  		  String
		 */
		// 된장국 끓이는 법
		char c1='된';
		char c2='장';
		char c3='국';
		char c4=' ';
		char c5='끓';
		char c6='이';
		char c7='는';
		char c8=' ';
		char c9='법';
		
		System.out.println(c1+""+c2+c3+c4+c5+c6+c7+c8+c9); // 된장국 끓이는 법
		System.out.println(c1+c2+c3+c4+c5+c6+c7+c8+c9); // 331870
		
		String s="된장국 끓이는 법";
		System.out.println(s); // 된장국 끓이는 법 => String은 클래스로 구성되어 있다
	}

}
