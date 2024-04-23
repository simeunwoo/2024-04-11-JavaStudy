
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha="ABCDEFGHIJ";
		//			  0123456789
		// 1. CDEFGHIJ를 출력하고 싶다
		// 2. EFG를 출력하고 싶다
		System.out.println(alpha.substring(2)); // CDEFGHIJ
		System.out.println(alpha.substring(4,7)); // EFG
		
		String id=" admin ";
		System.out.println(id+"의 문자 갯수:"+id.length()); //  admin 의 문자 갯수:7
		// " " => space
		id=id.trim(); // trim() : 문자의 좌우 공백 제거 => 검색, 입력
		System.out.println(id+"의 문자 갯수:"+id.length()); // admin의 문자 갯수:5
		
		// " 감자" => 실수 (space)
		
		String msg="Hello Java";
		//			0123456789
		System.out.println(msg.indexOf("a")); // 7 (맨 앞부터 찾는다)
		System.out.println(msg.lastIndexOf("a")); // 9 (맨 뒤부터 찾는다)
		
		String ext="Hello.java";
		System.out.println(ext.substring(6)); // java
		System.out.println(ext.substring(ext.indexOf(".")+1)); // java
											// '.' 다음부터 출력하라는 뜻
							// ext.substring(ext.indexOf(".")+1 => ext.substring(5+1)
							//	=> ext.substring(6) => "java"
		/*
		 * 데이터형
		 * 	정수 : 정수만 저장 => int, long, byte => Integer, Long, Byte
		 * 	실수 : 실수만 저장 => double => Double
		 * 	문자 : 문자 1개만 저장 => char
		 * 	논리 : true/false => boolean => Boolean
		 * 	문자열 : 문자 여러개를 동시에 저장 => String, 기능을 가지고 있다
		 * 								----------------------
		 * 								 문자열을 제어하는 기능을 제공
		 */
		int a=Integer.parseInt("100");
	}

}
