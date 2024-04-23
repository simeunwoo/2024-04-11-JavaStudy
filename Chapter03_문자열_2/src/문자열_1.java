// contains : 포함된 문자열 읽기 => 결과값 true/false
/*
 * 	searchMainDailyBoxOffice.do // 일일 박스오피스
 * 	searchMainRealTicket.do // 실시간 예매율
 * 	searchMainDailySeatTicket.do // 좌석 점유율 순위
 */
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
public class 문자열_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("===============");
			System.out.println("1. 일일 박스오피스");
			System.out.println("2. 실시간 예매율");
			System.out.println("3. 좌석 점유율 순위");
			System.out.println("4. 종료");
			System.out.println("===============");
			System.out.println("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==1)
			{
				Document doc=Jsoup.connect("https://kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
			//	System.out.println(doc);										//	---------------------------
				String data=doc.toString();										// 나머지 2개의 주소도 여기에 그대로 적으면 출력 가능
				data=data.substring(data.indexOf("["),data.lastIndexOf("]")+1);
			//	System.out.println(data);
				JSONParser jp=new JSONParser();
				JSONArray arr=(JSONArray)jp.parse(data);
				for(int i=0;i<arr.size();i++)
				{
					JSONObject obj=(JSONObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm")); // 1.파묘
																	  // 2.쿵푸팬더4
																	  // 3.범죄도시4
																	  // 4.스턴트맨
																	  // 5.남은 인생 10년
																	  // 6.댓글부대
																	  // 7.고스트버스터즈: 오싹한 뉴욕
																	  // 8.오멘: 저주의 시작
																	  // 9.듄: 파트2
																	  // 10.레옹 
				}
			//	[] => JSONArray. {} => JSONObject
			/*
			 * 	[{},{},...] : ex) 10개 들어가 있음 (영화정보 10편)
			 * 			=> JSON => Vue,React,Ajax => Front-End
			 * 				JavaScript	
			 */
			}
			else if(menu==2)
			{
				
			}
			else if(menu==3)
			{
				
			}
			else if(menu==4)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else
			{
				System.out.println("다시 해");
			}
		}
		
	}

}
