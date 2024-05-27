package com.sist.map;
import java.util.*;
public class SiteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1. 로그인 / 2. 회원 가입 / 3. 공지 사항 / 4. 게시판 / 5. 맛집 : ");
		int menu=scan.nextInt();
		if(menu==1)
		{
			LoginModel model=new LoginModel();
			System.out.println(model);
			model.execute();
		}
		else if(menu==2)
		{
			JoinModel model=new JoinModel();
			System.out.println(model);
			model.execute();
		}
		else if(menu==3)
		{
			NoticeModel model=new NoticeModel();
			System.out.println(model);
			model.execute();
		}
		else if(menu==4)
		{
			BoardModel model=new BoardModel();
			System.out.println(model);
			model.execute();
		}
		else if(menu==5)
		{
			FoodModel model=new FoodModel();
			System.out.println(model);
			model.execute();
		}
		else
		{
			System.out.println("메뉴가 존재하지 않는다");
		}
/*
예)
1. 로그인 / 2. 회원 가입 / 3. 공지 사항 / 4. 게시판 / 5. 맛집 : 1
com.sist.map.JoinModel@59a6e353
로그인 관련 요청 ...

===> (menu 1~5 모두 같은 메모리 주소를 가진다)
 */
	}

}
