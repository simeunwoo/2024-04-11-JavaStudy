
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="HELLO";
		
	//	if(s1.equals(s2)) // s1과 s2가 같냐? => 같은 경우 : true / 다른 경우 : false
	/*	if(s1.equalsIgnoreCase(s2)) // equalsIgnoreCase : 대소문자 구분 X => 포털사이트 검색기
		{							// equals : 대소문자 구분 O => 비밀번호
									// 둘 다 결과값은 true/false => 조건문에서 주로 사용
			System.out.println("s1과 s2는 같다"); // s1과 s2는 같다 (equalsIgnoreCase를 사용할 경우)
		}
		else
		{
			System.out.println("s1과 s2는 다르다");	 // s1과 s2는 다르다 (equals를 사용할 경우)
												// 결국, 대소문자를 구별한다 ('hello'와 'HELLO'는 다르다)
		}
		*/
		
		String msg="Hello Java";
		for(int i=msg.length()-1;i>=0;i--) // 리버스 느낌 (거꾸로)
		{
			System.out.print(msg.charAt(i)); // avaJ olleH
		}
		// length() 문자 갯수 => index=0 => 따라서 legnth()에서 -1을 한다
	}

}
