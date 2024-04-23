
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="ABCDEFG";
		System.out.println(msg.substring(2,6)); // CDEF (2번부터 5번까지)
		System.out.println(msg); // ABCDEFG
		
		// 결론 : substring을 했다고 해서 msg의 원본은 바뀌지 않는다
		
		// 단, 이렇게 설정하면 msg의 원본이 바뀐다
		System.out.println(msg=msg.substring(2,6)); // CDEF
		System.out.println(msg); // CDEF
		
		// 위와 같이 원본을 훼손하고 싶지 않다면 아래와 같이 한다
	/*	String msg="ABCDEFG" // ABCDEFG
		String m=msg.substring(2,6); // CDEF
		System.out.println(m); // CDEF
		System.out.println(msg); // ABCDEFG
		 */
		
		int a=10;
		int b=20;
		String s1=String.valueOf(a); // 모든 데이터형을 문자열로 변경
		String s2=String.valueOf(b); // 정수 => 문자열로 변경
		// 윈도우, 웹 => 정수, 실수, 논리 => 데이터형이 없다 => 문자열로 가야
		// 자바 => 원래 상태로 복귀 => 처리
		/*
		 * 	입력창 : <input type=text> <input type=number>
		 *	윈도우 : JTextField
		 */
	}

}
