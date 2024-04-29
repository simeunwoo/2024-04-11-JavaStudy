
public class 문제0429_5 {
	static char alpha(char c)
	{
		if(c<'a' || c>'z')
			System.out.println("다시 해");
		return (char)(c-32);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=alpha('a');
		System.out.println(c);
	}

}
