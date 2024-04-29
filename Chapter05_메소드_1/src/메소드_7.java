// char 리턴 => 알파벳을 전송 => 대문자->소문자 / 소문자->대문자
public class 메소드_7 {
	static char upper(char c) // 소->대
	{
		return (char)(c-32); // 'a'(97) => 'A'(65)
	}
	
	static char lower(char c) // 대->소
	{
		return (char)(c+32);
	}
	
	static char upperLower(char c) // 소->대 + 대->소
	{
		char res=' '; // 결과값이 여러개인 경우 => 변수 선언 => 경우의 수
		if(c>='A' && c<='Z')
			res=(char)(c+32);
		else
			res=(char)(c-32);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		char c=upper('m');
		System.out.println(c); // M
		c=lower('M');
		System.out.println(c); // m
		*/
		
		char c=upperLower('A');
		System.out.println(c); // a
		c=upperLower('a');
		System.out.println(c); // A
		
		// 메소드명 => 기능
		// 매개변수 => 리턴형
	}

}
