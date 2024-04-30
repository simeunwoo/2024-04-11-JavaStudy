import java.util.Scanner;

public class 메소드_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 뮤직 목록"); // 멜론
			System.out.println("2. 노래명 검색");
			System.out.println("3. 가수명 검색");
			System.out.println("4. 프로그램 종료");
			System.out.println("===========");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==1)
			{
				
			}
			else if(menu==2)
			{
				
			}
			else if(menu==3)
			{
				
			}
			else if(menu==4)
			{
				System.out.println("프로그램 종료");
				break; // for문, while문 => 바로 종료
			}
			else
			{
				System.out.println("다시 해");
				continue; // while문의 조건식으로 이동
			}
		}
	}

}
