/*
 * 1. replaceAll : 정규식 => 문자 패턴을 이용해서 찾아서 변경
 * 				   ----
 * 				   split() => GPT
 * 				   맛있게 맛있는 맛있고... => 맛있*
 * 				   ㅋㅋ ㅎㅎ => 맛있다는 거야 뭐야? => 알 길이 없음 (최근 드러나는 단점)
 * 2. substring : 
 * 3. indexOf
 */
import java.util.Scanner;
public class 문자열배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] 과일={
				"사과:apple",
				"배:pear",
				"밤:chestnut",
				"잣:pine nut",
				"호두:walnut",
				"도토리:acorn",
				"귤:tangerine",
				"딸기:strawberry",
				"파인애플:pineapple",
				"포도:grape",
				"복숭아:peach",
				"살구:apricot",
				"매실:Japanese apricot",
				"자두:plum",
				"키위:kiwi",
				"토마토:tomato",
				"블루베리:blueberry",
				"앵두:cherry",
				"바나나:banana",
				"오렌지:orange",
				"수박:watermelon",
				"멜론:melon",
				"참외:oriental melon",
				"망고:mango",
				"레몬:lemon",
				"석류:pomegranate",
				"자몽:grapefruit",
				"대추:jujub",
				"감:persimmon",
				"곶감:dried persimmon",
				"리치:litchi",
				"모과:quince",
				"오디:mulberry",
				"유자:citron",
				"무화과:fig",
				"호박:pumpkin",
				"오이:cucumber",
				"양파:onion",
				"마늘:garlic",
				"생강:ginger",
				"무:radish",
				"쑥:mugwort",
				"당근:carrot",
				"인삼:ginseng",
				"산삼:wild ginseng",
				"더덕:deodeok",
				"죽순:bamboo shoot",
				"파프리카:paprika",
				"피망:pimiento",
				"부추:chives",
				"파:green onion",
				"감자:potato",
				"고구마:sweet-potato",
				"가지:eggplant",
				"옥수수:corn",
				"후추:pepper",
				"고추:chili, hot pepper",
				"배추:Chinese cabbage",
				"양배추:cabbage",
				"상추:lettuce",
				"양상추:lettuce",
				"시금치:spinach",
				"콩:bean",
				"땅콩:peanut",
				"깨:sesame",
				"깻잎:sesame leaf",
				"콩나물:bean sprouts",
				"버섯:mushroom",
				"미역:seaweed",
					
		};
		Scanner scan=new Scanner(System.in);
		System.out.print("과일명 입력:"); // 사과 / melon
		String fd=scan.next();
		for(String f:과일)
		{
			if(f.contains(fd)) // equals()를 주면 전체 단어를 다 써야해서 번거로움
								// "미역:seaweed"를 다 써야한다
								// startsWith()를 써도 좋음
			{
			//	System.out.println("영어는 "+f.replaceAll("[^A-za-z]", "")); // 영어는 apple / 영어는 watermelon
																			//				영어는 melon
																			//				영어는 orientalmelon
				/*
				 *	정규식 => 문자열의 패턴
				 *	[A-Za-z] => 알파벳 전체
				 *	[^A-Za-z] => 알파벳을 제외하고
				 *	^[A-Za-z] => 알파벳으로 시작
				 *	[A-Za-z]$ => 알파벳으로 끝
				 *
				 *	img[scr%='jpg']
				 */
				System.out.println("영어는 "+f.substring(f.indexOf(":")+1)); // (replaceAll() 설정 시와 같은 결과 출력)
			}
				
		}
		// 영문 단어 중에 가장 긴, 짧은 이름을 가진 단어를 찾아라
		String[] 영어과일명=new String[과일.length];
		for(int i=0;i<과일.length;i++)
		{
			영어과일명[i]=과일[i].substring(과일[i].indexOf(":")+1);
			// 필요한 문자만큼 자르는 경우 : substring
			// 원하는 문자의 위치 => indexOf
			// String => 문자를 쉽게 제어할 수 있게 만든 클래스
			/*
			 * 	*** 문자열의 갯수 => length()
			 * 	*** 배열의 갯수 => length
			 */
		}
		for(String ef:영어과일명)
		{
			System.out.println(ef);
		}
		
		int max=0;
		for(String ef:영어과일명)
		{
			if(max<ef.length())
				max=ef.length();
		}
		int min=100;
		for(String ef:영어과일명)
		{
			if(min>ef.length())
				min=ef.length();
		}
		
		for(String ef:영어과일명)
		{
			if(ef.length()==max)
				System.out.println("가장 긴 영어과일명:"+ef); // 가장 긴 영어과일명:chili, hot pepper
			if(ef.length()==min)
				System.out.println("가장 짧은 영어과일명:"+ef); // 가장 짧은 영어과일명:fig
		}
	}
}
