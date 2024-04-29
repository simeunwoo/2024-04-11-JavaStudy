
public class 문제0429_9 {
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0)) // 윤년 조건
			bCheck=true;
		else
			bCheck=false;
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=isYear(2024);
		if(bCheck==true)
			System.out.println("윤년"); // 윤년
		else
			System.out.println("노 윤년");
	}

}
