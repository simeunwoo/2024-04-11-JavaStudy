/*
 * 	1~100 사이의 정수를 10개 추출
 * 	=> 최댓값 / 최솟값 구한다
 * 	=> 변수는 2개 : 최댓값, 최솟값
 * 	=> for문은 10바퀴 돌린다 (10개 추출하므로)
 */
public class 자바제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1; // max 설정 때 가장 낮은 수 설정
		int min=100; // min 설정 때 가장 높은 수 설정
		
		// => 반복 수행 => 임의의 정수 10개 추출
		for(int i=0;i<10;i++) // 출력하고 상관 없다
		{
			// => 임의의 정수 추출
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" "); // 77 1 6 53 26 19 54 1 89 71
			// 최댓값, 최솟값
			if(max<num)
				max=num; // 최댓값 구하기
			if(min>num)
				min=num; // 최솟값 구하기
		}
		/*
		 * 	int max=1;
		 * 	int a=10;
		 * 	int b=20;
		 * 	int c=30;
		 * 
		 * 	if(max<a)
		 * 		max=a => max는 0->10
		 *  if(max<b)
		 * 		max=b => max는 10->20
		 *  if(max<c)
		 * 		max=c => max는 20->30
		 */
		System.out.println();
		System.out.println("최댓값:"+max); // 최댓값:89
		System.out.println("최솟값:"+min); // 최솟값:1
	}

}
