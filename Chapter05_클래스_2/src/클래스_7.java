// 맛집 데이터형을 만들어서 => 값을 대입 후에 출력
class FoodHouse
{
	double score;
	String name;
	String loc;
	String menu;
}
public class 클래스_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodHouse f1=new FoodHouse();
		f1.score=4.0;
		f1.name="새벽집 청담동점";
		f1.loc="청담동";
		f1.menu="꽃등심(150g), 양념갈비(260g), 생고기(150g), 불고기(200g), 샤브샤브(160g)";
		String[] menus=f1.menu.split(","); // 문자열 배열
		
		System.out.println("평점:"+f1.score);
		System.out.println("업체명:"+f1.name);
		System.out.println("위치:"+f1.loc);
		System.out.println("=== 메뉴 ===");
		for(String m:menus)
		{
			System.out.println("o "+m.trim()); // trim : 양쪽의 공백 제거
		}
		// 많이 있다 => FoodHouse[]로 배열을 잡는다
/*
평점:4.0
업체명:새벽집 청담동점
위치:청담동
=== 메뉴 ===
o 꽃등심(150g)
o 양념갈비(260g)
o 생고기(150g)
o 불고기(200g)
o 샤브샤브(160g)
 */
		
	}

}
