/*
 * 		byte, char, int, long, float, double
 * 		기타 : boolean
 * 
 * 		1. 데이터형의 크기
 * 			byte < char < int < long < float < double
 * 			=> 크기의 기준 : 수 표현의 갯수
 * 				1 => 1.000000 (float) => 1.000000000000000 (double)
 * 
 * 		int a=10L => 오류 (8byte로부터 4byte를 만들 수 없다)(int는 4byte이고 long(L)은 8byte이기 때문에 알맞지 않다)
 * 		long a=10 => 가능 (4byte로부터 8byte를 만들 수 있다)
 * 		long a=10 => 가능 (8byte로부터 8byte를 만들 수 있다)
 * 		int a='A' => 가능 (문자형 A가 정수형 int의 a로 변형되었다 => 65로 출력된다)(오른쪽에서 왼쪽으로)
 * 		char c=65 => 가능 (A로 출력된다)(오른쪽에서 왼쪽으로)
 * 		double d='A' => 가능 (65.0으로 출력된다)(오른족에서 왼쪽으로)
 * 			==========>>>>> '자동 형변환' / '강제 형변환' : ex) (int)'A'
 * 		
 * 		byte + byte = int
 * 		char + char = int
 * 		float + double = double
 * 			==========>>>>> int 이하는 더하면 무조건 int로 나오고, int를 넘어서면 더할 때 무조건 더 큰 것으로 나온다
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=65; // int => char
		double d='A'; // char => double
		byte b1=10; // int => byte
		byte b2=110; // int => byte
		byte b3=(byte)(b1+b2); // int => byte
	}

}
