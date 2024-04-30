// 	연도를 입력 받아서 윤년인지 확인하는 프로그램을 작성
// 	연도 입력 : 2024
// 	윤년이다
public class 메소드_재사용_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=메소드_7.input("연도"); // 연도 입력:2024
		boolean bCheck=메소드_7.isYear(year);
		if(bCheck)
			System.out.println("윤년이다"); // 윤년이다
		else
			System.out.println("윤년이 아니다");
	}

}
