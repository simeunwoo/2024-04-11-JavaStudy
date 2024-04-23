// 멜론:melon
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f="멜론:melon";
		System.out.println("멜론의 영어는?"); // 멜론의 영어는?
		System.out.println("영어는 "+f.substring(f.indexOf(":")+1)); // 영어는 melon
							// substring() : 문자 일부만 잘라서 출력
							// indexOf(":")+1 : ':' 다음 문자부터 출력
		/*
		 * 	substring : 문자열을 자르는 경우에 사용
		 * 
		 * 	Hello Java
		 * 	0123456789 => "Hello Java"는 0~9 존재
		 * 	
		 * 	substring(6) => 6부터 위치한 문자부터 출력 => "Java"
		 * 	substring(3,8) => 3~7에 위치한 문자를 출력 => "lo Ja"
		 * 	substring(int startIndex) => (startIndex ~)
		 * 	substring(int startIndex,int endIndex) => (startIndex ~ endIndex-1)
		 * 	
		 */
		String msg="Hello Java";
		System.out.println(msg.substring(6)); // Java
		System.out.println(msg.substring(3,8)); // lo Ja
		System.out.println(msg.substring(0,7)+"..."); // Hello J...
	}

}
