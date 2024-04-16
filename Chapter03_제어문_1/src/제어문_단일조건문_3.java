/*
 * 	if (조건문) => 웹 (page를 나눈 경우, 상세보기, 검색)
 * 		=> 사람 => 한 눈에 볼 수 있는 이미지 => 15~20개 정도
 * 	54page
 * 	조건문 형식)
 * 		if (조건문) => true/false => 부정연산자(!), 비교연산자, 논리연산자
 * 		{
 * 			실행 문장 => 조건이 true일 때만 수행이 된다
 * 		}
 * 		-------------------------------------------------------
 * 		연산자 사용법
 * 		산술연산자 => 일반 계산
 * 		-------
 * 		비교연산자
 * 		논리연산자
 * 		부정연산자
 * 		------- 조건문, 반복문
 * 		증감연산자
 * 		------- 반복문
 * 		대입연산자 => 결과값 받기
 */
public class 제어문_단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=(int)(Math.random()*100)+1; // 1~100 중에서 난수 (임의의 수) 추출
		System.out.println("1.num="+num); // 1.num=94
		if(num>=50)
			sum+=num; // sum=sum+num => ex) 장바구니 금액 / 결제 금액
		
		num=(int)(Math.random()*100)+1; // num 값이 나왔으므로 앞에 int를 생략한다
		System.out.println("2.num="+num); // 2.num=44
		if(num>=50)
			sum+=num; // sum=sum+num
		
		num=(int)(Math.random()*100)+1;
		System.out.println("3.num="+num); // 3.num=95
		if(num>=50)
			sum+=num; // sum=sum+num
		
		System.out.println("=== 결과 ==="); // === 결과 ===
		System.out.println("sum="+sum); // sum=189 (=94+95)
	}

}
