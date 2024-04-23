
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Korea";
		System.out.println(msg.replace("a", "b")); // Hello Koreb
									// msg.replace("a", "b") : 단어 'a'를 'b'로 바꿔라
		
		msg="홍길동honggildong";
		System.out.println(msg.replaceAll("[가-힣]", "")); // honggildong
									// msg.replaceAll("[가-힣]", "")
									// : 단어 '가~힣'(한글 전체)를 없애라
		// 한글 => [가-힣]
		// 알파벳 => [A-Z], [a-z]
		// 숫자 => [0-9] => 크롤링
	}

}
