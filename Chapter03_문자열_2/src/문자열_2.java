// contains
/*
 * 	JDBC => DBCP => MyBatis => (JPA)
 * 	Ajax => Vue => React => Redux => React-Query => Next
 * 									 ------------------- 요즘 기술
 * 	MSA (히든 카드)(요즘 대기업 주요 기술)
 */
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 문자열_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1. 노래명 검색, 2. 가수명 검색:"); // 1. 노래명 검색, 2. 가수명 검색:1
		int menu=scan.nextInt();
		int k=1;
		if(menu==1)
		{
			System.out.print("노래명 입력:"); // 사
			String fd=scan.next();
			for(int i=1;i<=4;i++)
			{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
				Elements title=doc.select("table.list-wrap a.title");
				Elements singer=doc.select("table.list-wrap a.artist");
				for(int j=0;j<title.size();j++)
				{	// 포함 여부 확인
					if(title.get(j).text().contains(fd)) // title 자리에 singer로 바꿔도 출력 가능 (가수명으로 검색)
					{
					System.out.println(k+"."+title.get(j).text()
							+"("+singer.get(j).text()+")");// '사'가 포함된 노래 제목 13개가 순서대로 나온다 (가수명도 뒤에 딸려 나옴)
					k++;									// ex) 1.미안해 미워해 사랑해(Crush),...
					}
				}
			}
		}
		else if(menu==2)
		{
			
		}
	}

}
