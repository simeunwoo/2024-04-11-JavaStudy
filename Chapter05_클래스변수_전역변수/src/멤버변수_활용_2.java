/*
 * 	달력 만들기
 * 	1. 연도 / 월 : year/month
 * 	2. 요일 : year/month/week
 * 	3. 출력 : year/month/week
 * 		=> 요 3개의 변수는 멤버변수로 하는 게 편할 것이다
 */
// 멤버변수 없이 메소드 => 리턴형/매개변수가 많이 필요할 것이다
// => 메소드 공통으로 사용되는 변수가 있는지 확인
import java.util.Calendar;
import java.util.Scanner;
public class 멤버변수_활용_2 {
	// 입력
	static int year,month,day,week; // 멤버변수
	
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	
	static int getWeek()
	{
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		week=cal.get(Calendar.DAY_OF_WEEK);
		return week;
	}
	
	static void print()
	{
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		System.out.printf("%d년 %d월 %d일은 %s요일이다\n"
				,year,month,day,strWeek[week]);
	}
	
/*	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	
	static int getWeek(int year,int month, int day)
	{
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		return week;
	}
	
	static void print(int year, int month, int day, int week)
	{
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		System.out.printf("%d년 %d월 %d일은 %s요일이다\n"
				,year,month,day,strWeek[week]);
		// week => 1
	} */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int year=input("연도");
		int month=input("월");
		int day=input("일");
		int week=getWeek(year,month,day);
		print(year,month,day,week);			*/
		
		year=input("연도");
		month=input("월");
		day=input("일");
		week=getWeek();
		print();
	}

}
