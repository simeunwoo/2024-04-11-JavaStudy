// 점수 >=60 <=100 => true
public class 연산자_논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*100)+1; // 1~100 사이의 난수 발생
		System.out.println("난수값:"+score); // 난수값 : 73
		boolean bCheck=(score>=60) && (score%2==0); // false
		// 								짝수 조건 (2로 나눌 때 나머지가 0)
		System.out.println(bCheck);
		
		// score가 40이상이고 score가 홀수라면
		boolean cCheck=(score>=40) && (score%2==1);
		System.out.println(cCheck); // true
		boolean dCheck=(score>=40) && (score%2!=0); // (score%2==1) = (score%2!=0) => 같은 뜻
		System.out.println(dCheck); // true
		
		int a=10;
		a++;
		a=100;
		a++;
		a=200;
		a++;
		a=300;
		a--;
		System.out.println(a); // 299 (결론이 중요)
		// 변수 => 필요 시마다 변경 가능
		// main이 종료 시 까지 메모리가 유지
	}

}
