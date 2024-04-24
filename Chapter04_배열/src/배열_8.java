import java.util.Calendar;
import java.util.Scanner;

public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:"); // 연도 입력:1999
		int year=scan.nextInt();
		System.out.print("월 입력:"); // 월 입력:2
		int month=scan.nextInt();
		System.out.print("일 입력:"); // 일 입력:10
		int day=scan.nextInt();
		
		System.out.println("=== API 이용 ==="); // === API 이용 ===
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		String[] strWeek={"","일","월","화","수","목","금","토"};
		// week=>0, week=>1
		int week=cal.get(Calendar.DAY_OF_WEEK);
	//	System.out.println(week); // 4 => "수"
		System.out.println(year+"년 "+month+"월 "+day+"일은 "+strWeek[week]+"요일이다"); // 1999년 2월 10일은 수요일이다
	}

}
