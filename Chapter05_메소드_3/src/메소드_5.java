import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;



public class 메소드_5 {
	static void find(int type,String fd) throws Exception
	{
		Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
		Elements title=doc.select("div.wrap_song_info div.rank01");
		Elements singer=doc.select("div.wrap_song_info div.rank02");
		// Jsoup => 미리보기에 데이터가 출력된 경우에만 읽는다
		for(int i=0;i<title.size();i++)
		{
			boolean bCheck=false;
			if(type==1)
				bCheck=title.get(i).text().contains(fd);
			else
				bCheck=singer.get(i).text().contains(fd);
			
			if(bCheck)
				System.out.println((i+1)+"."+title.get(i).text()+"["+singer.get(i).text()+"]");
		}
	}
	public static void main(String[] args) throws Exception {
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
				Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
				Elements title=doc.select("div.wrap_song_info div.rank01");
				Elements singer=doc.select("div.wrap_song_info div.rank02");
				for(int i=0;i<title.size();i++)
				{
					System.out.println((i+1)+"."+title.get(i).text());
				}
			}
			else if(menu==2)
			{
				System.out.print("검색어 입력:");
				String fd=scan.next();
				find(1,fd);				
			}
			else if(menu==3)
			{
				System.out.print("가수 입력:");
				String fd=scan.next();
				find(2,fd);
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
