package com.sist.user;
import java.util.Scanner;

import com.sist.manager.GenieManager;
import com.sist.vo.Genie;

public class UserMain_Genie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		GenieManager gm=new GenieManager();
		
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 목록");
			System.out.println("2. 검색");
			System.out.println("3. 상세 보기");
			System.out.println("4. 종료");
			System.out.println("===============");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==1)
			{
				int total=gm.genieTotalPage();
				System.out.print("1~"+total+" 사이의 페이지 입력:");
				int page=scan.nextInt();
				// 데이터를 읽어오라고 요청
				Genie[] genie=gm.genieListData(page);
				for(Genie g:genie)
				{
					System.out.println(g.getRank()+"."+g.getTitle());
				}
			}
			else if(menu==2)
			{
				System.out.print("검색어 입력:");
				String title=scan.next();
				Genie[] genie=gm.genieFindData(title);
				for(Genie g:genie)
				{
					System.out.println(g.getRank()+"."+g.getTitle());
				}
			}
			else if(menu==3)
			{
				System.out.print("번호 입력:");
				int mno=scan.nextInt();
				Genie ggg=gm.genieDetailData(mno);
				System.out.println("순위:"+ggg.getRank());
				System.out.println("제목:"+ggg.getTitle());
				System.out.println("가수명:"+ggg.getName());
				System.out.println("앨범:"+ggg.getAlbum());
			}
			else if(menu==4)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else
			{
				System.out.println("다시 해라");
			}
		}
	}
}
