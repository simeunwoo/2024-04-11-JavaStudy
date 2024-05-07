// 벤치 마킹 => 프로그램에 맞는 데이터만 설정 => 메소드 설정
/*
 * 		프로젝트
 * 		=> 모방 CGV
 * 		=> 불편한 부분 / 추가되는 내용
 * 						| 카페/술집/맛집
 * 		   --------------------
 * 		=> 캠핑장 예약
 * 			=> 근처 맛집/레시피 이런게 보통 없으니까 이런걸 추가 (이런게 프로젝트)
 */
class Recipe
{
	String title;
	String chef;
	String star;
	int hit;
	// 변수는 배열/클래스
	int[] reserve={13,14,15,20,25};
	// Reply r; => 댓글
}
// 레시피가 많은 경우
// Recipe[] recipes=new Recipe[200]; => 데이터형이라 배열 사용이 가능
// 사용자 정의 데이터형 => 배열/형변환 => 일반 변수와 동일하게 취급
public class 클래스_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe r1=new Recipe();
		r1.title="도시락 반찬으로 최고! 스팸감자조림♡";
		r1.chef="냠냠간단요리";
		r1.star="★★★★★";
		r1.hit=46000;
		System.out.println("레시피명:"+r1.title); // 레시피명:도시락 반찬으로 최고! 스팸감자조림♡
		System.out.println("셰프명:"+r1.chef); // 셰프명:냠냠간단요리
		System.out.println("별점:"+r1.star); // 별점:★★★★★
		System.out.println("조회수:"+r1.hit); // 회수:46000
		
		for(int i:r1.reserve)
		{
			System.out.print(i+" "); // 13 14 15 20 25 
		}
	}

}
