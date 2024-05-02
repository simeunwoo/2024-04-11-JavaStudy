import java.util.Calendar;
import java.util.Scanner;
///////////////////////////////////// 오류가 있음
public class 달력만들기_전역변수 {
	static int year,month,week,lastday;
	
	// 1. 사용자 입력 => default => Date
	static void userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:");
		year=scan.nextInt();
		
		System.out.print("월 입력:");
		month=scan.nextInt();	
	}
	
	// 2. 요일 구하기 => 사용자 정의 / 라이브러리
	static void getWeek()
	{
		Calendar cal=Calendar.getInstance();
		// Calendar 클래스 메모리 할당
		// 추상 클래스
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		// 요일
		int week=cal.get(Calendar.DAY_OF_WEEK);
		week=week-1;
		
		// 마지막 날
		int lastday=cal.getActualMaximum(Calendar.DATE);
	}
	
	static void print()
	{
		String[] strWeek= {"일","월","화","수","목","금","토"};
		
		System.out.println(year+"년 "+month+"월");
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday;i++)
		{
			if(i==1) // 시작 => 요일까지 공백 출력
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				System.out.println();
				week=0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userInput();
		getWeek();
		print();
	}

}
