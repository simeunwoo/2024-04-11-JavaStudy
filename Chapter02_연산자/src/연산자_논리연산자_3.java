/*
 * 	|| (or) (&&는 'and' 연산자)
 * 	   (조건) || (조건)
 * 	   -----	-----
 * 		 ㅣ		 ㅣ
 * 		-----------
 * 			 ㅣ
 * 			결과값 => 병렬연산자 => 조건 중에 한개 이상이 true면 true가 되는 연산자
 * 					범위를 벗어난 경우에 주로 처리
 * 					score>=60 && score<70
 * 					score>=60 || score>70
 */
public class 연산자_논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*100)+1; // 1~100 추출
		System.out.println("score:"+score); // score:37
		boolean bCheck=(score<30) || (score>70); // score => 1~29 or 71~100일 때 false
		System.out.println(bCheck); // false => 37은 둘 다 속하지 않으므로 false
	}

}
