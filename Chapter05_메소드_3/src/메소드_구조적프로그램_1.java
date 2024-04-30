/*
 * 	달력
 * 	---
 * 	1. 절차적 언어
 * 	2. 메소드 => 구조적 프로그램
 * 					|
 * 				  클래스 => 객체지향 프로그램
 * 	최소한 => 3개
 * 	입력 부분 => 메소드
 * 	---------------
 * 	처리 부분 => 메소드 : 세분화
 * 	출력 부분 => 메소드
 * 	---------------
 */
import java.util.Scanner;
public class 메소드_구조적프로그램_1 {
	// 1. 입력 부분 => 반복 제거
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	
	// 2. 처리 부분
	static int getWeek(int year,int month)
	{
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		// 2-2. 전월까지의 총 일수 구하기
		int[] lastday={31,28,31,30,31,30,
					31,31,30,31,30,31};
		// 윤년일 경우 => 2월은 29일까지 있다 => 메소드화
		if(isYear(year))
		{
			lastday[1]=29; // 윤년일 경우 // isYear(year) => true
		}
		else
		{
			lastday[1]=28; // 윤년이 아닐 경우 // isYear(year) => false
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		// 2-3. +1 (1일자의 요일 확인)
		total++;
		// 2-4. 요일 구하기 => 총일수%7
		int week=total%7;
		
		return week;
	}
	
	// 윤년 공식 => 메소드화 => 다른 클래스에서 사용 가능
	static boolean isYear(int year)
	{
		if((year%4==0) && (year%100!=0) || (year%400==0))
			return true; // 윤년일 경우
		else
			return false; // 윤년이 아닐 경우
	}
	
	// 3. 출력 부분
	static void print(int year,int month,int week)
	{
		int[] lastday={31,28,31,30,31,30,
				31,31,30,31,30,31}; // 2.2 부분에서 복붙하기
		
		System.out.println(year+"년 "+month+"월 ");
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(String w:strWeek)
		{
			System.out.print(w+"\t"); // \t : 4칸씩 띄어쓰기
		}
		System.out.println();
		// 실제 달력을 출력
		for(int i=1;i<=lastday[month-1];i++)
		{
			// 3.1 공백 출력 => 처음 1번만 출력
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			// 일요일이면 => 다음줄에 출력
			// 3.2 요일 확인
			week++;
			if(week>6) // 일요일일 경우
			{
				System.out.println(); // 다음줄에 출력
				week=0;
			}
		}
	}
	
	static void process()
	{
		int year=input("연도");
		int month=input("월");
		
		int week=getWeek(year,month);
		print(year,month,week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process(); // 메소드 리턴값
		
/*		// 1. 입력 부분
		Scanner scan=new Scanner(System.in);
		// 1-1. 연도 입력
		System.out.print("연도 입력:");
		int year=scan.nextInt();
		// 1-2. 월 입력
		System.out.print("월 입력:");
		int month=scan.nextInt(); // 반복 제거
		
		// 2. 처리 부분 => 요일 구하기
		// 2-1. 전년도까지의 총 일수 구하기 => 윤년 공식 활용
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		// 2-2. 전월까지의 총 일수 구하기
		int[] lastday={31,28,31,30,31,30,
					31,31,30,31,30,31};
		// 윤년일 경우 => 2월은 29일까지 있다
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{
			lastday[1]=29; // 윤년일 경우
		}
		else
		{
			lastday[1]=28; // 윤년이 아닐 경우
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		// 2-3. +1 (1일자의 요일 확인)
		total++;
		// 2-4. 요일 구하기 => 총일수%7
		int week=total%7;
		
		// 3. 출력 부분
		System.out.println(year+"년 "+month+"월 ");
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(String w:strWeek)
		{
			System.out.print(w+"\t"); // \t : 4칸씩 띄어쓰기
		}
		System.out.println();
		// 실제 달력을 출력
		for(int i=1;i<=lastday[month-1];i++)
		{
			// 3.1 공백 출력 => 처음 1번만 출력
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			// 일요일이면 => 다음줄에 출력
			// 3.2 요일 확인
			week++;
			if(week>6) // 일요일일 경우
			{
				System.out.println(); // 다음줄에 출력
				week=0;
			}
		} */
/*
연도 입력:1999
월 입력:2
1999년 2월 
일	월	화	수	목	금	토	
	 1	 2	 3	 4	 5	 6	
 7	 8	 9	10	11	12	13	
14	15	16	17	18	19	20	
21	22	23	24	25	26	27	
28	
 */

}

}
