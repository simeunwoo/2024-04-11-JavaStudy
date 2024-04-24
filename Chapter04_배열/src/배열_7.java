import java.util.Scanner;

public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 연 월 일 => 결과값 : 무슨 요일?
		System.out.print("연도 입력:"); // 연도 입력:1999
		int year=scan.nextInt();
		System.out.print("월 입력:"); // 월 입력:2
		int month=scan.nextInt();
		System.out.print("일 입력:"); // 일 입력:10
		int day=scan.nextInt();
		
		// 요청 처리 => '요일을 확인 해달라'
		/*
		 * 	요일 구하기
		 * 	1. 1년 1월 1일 ~ 요청한 연도의 전년도까지의 총 날 수
		 * 	2. 요청한 전달까지의 날 수
		 * 	3. 요청한 일
		 * 	(다 더한다 : '1.'+'2.'+'3.')
		 * 	4. 총 날 수 % 7 => 요일을 구할 수 있다
		 * 		0~6 => 0:일 ~ 6:토
		 */
		char[] strWeek={'일','월','화','수','목','금','토'};
		int [] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		// 1. 1년 1월 1일 ~ 요청한 연도의 전년도까지의 총 날 수
		int total=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400; // 윤년 계산법이 들어감
		
		// 2. 요청한 전달까지의 날 수
		if((year%4==0 && year%100!=0 || (year%400==0))) // 윤년이라면
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		// 3. 요청한 일
		total+=day;
		// 요일 구하기
		int week=total%7;
		// 결과값 출력
		System.out.println(year+"년 "+month+"월 "+day+"일은 "+strWeek[week]+"요일이다"); // 1999년 2월 10일은 수요일이다
	}

}
