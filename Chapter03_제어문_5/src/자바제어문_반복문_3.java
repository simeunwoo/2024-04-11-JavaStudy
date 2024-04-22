/*
 * 	1~100까지의 정수 => 3의 배수 갯수, 5의 배수 갯수, 7의 배수 갯수
 * 	-----			 ---------  ----------  ----------
 * 					 변수
 * 					=> 3,5,7 => 공통으로는 15(3,5), 21(3,7), 35(5,7)
 * 					=> 단일 조건문 사용
 */
public class 자바제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0;
		int a5=0;
		int a7=0;
		// 갯수 누적 : (++), 합 : (+=)
		for (int i=1;i<100;i++)
		{
			if(i%3==0)
				a3++;
			if(i%5==0)
				a5++;
			if(i%7==0)
				a7++;
		}
		System.out.println("1~100까지 중 3의 배수의 갯수:"+a3);
		System.out.println("1~100까지 중 5의 배수의 갯수:"+a5);
		System.out.println("1~100까지 중 7의 배수의 갯수:"+a7);
	}

}
