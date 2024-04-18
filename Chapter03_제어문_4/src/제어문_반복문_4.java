/*
 * 	for
 * 	---
 * 	제어문 => 조건(부정연산자,비교연산자,논리연산자)
 * 	1. 조건
 * 	2. 시작 => 정수/문자
 * 	3. 증가/증감
 * 	4. 출력물(반복적)
 * 
 *		 1	  2 	4
 *	for(초기값;조건식;증감식)
 *	{
 *		반복	 수행	  문장 3
 *	}
 *	1-2-3-4 2-3-4 2-3-4 2-3-4 => 2번 false면 종료
 *
 *	*** 무한루프 : 계속 반복
 *	for(;;) => 무한루프형식 (무한 스크롤) => 자바에서 (X) => 자바스크립트
 *												=> 타입스크립트
 *												=> 우대사항
 *	반복문을 제어
 *	=> continue : 특정부분 제외
 *	   break : 반복문 중단
 *
 *	list-wrap
 */
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;
public class 제어문_반복문_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("여행 가고 싶다");
		String data=scan.next();
		int k=1;
		for(int i=1;i<=4;i++)
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240418&hh=14&rtm=Y&pg"+i).get();
			Elements title=doc.select("table.list-wrap a.title");
			Elements singer=doc.select("table.list-wrap a.artist");
			for(int j=0;j<title.size();j++)
			{
				if(title.get(j).text().contains(data))
				{
				System.out.println(k++);
				System.out.println(title.get(j).text());
				System.out.println(singer.get(j).text());
				
				}
			}
		}
	}

}
