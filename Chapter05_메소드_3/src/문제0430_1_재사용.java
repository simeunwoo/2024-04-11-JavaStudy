
public class 문제0430_1_재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=문제0430_1.jeongsu(50);
		// num => 이진법 제작 메소드로 전송
		int[] binary=문제0430_1.binary(num);
		// binary[]를 넘겨준다 => 출력 요청
		문제0430_1.print(binary);
/*
0~32767까지의 정수 입력:50
0000 0000 0011 0010
*/
	}

}
