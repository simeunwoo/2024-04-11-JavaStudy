/*
 * 	단일조건문
 * 	형식)
 * 		if (조건문) => 반드시 true/false => 부정연산자, 비교연산자, 논리연산자만 사용
 * 		{
 * 			실행 문장 => 조건 true일 때만 수행
 * 		}
 *	1) 정수를 입력 받아서 짝수/홀수 처리
 */
import java.util.Scanner;
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.print("정수 입력:"); // 17 // println에서 ln을 뺀다
		// 입력 요청 => 변수에 저장
		num=scan.nextInt();
		
		if(num%2==0) // 짝수 조건 / ; 찍으면 안됨 (한 문장이 안 끝났기 때문, 끝났을 때가 한 문장)
		{
			// false
			System.out.println(num+"는(은) 짝수이다");
		}
		if(num%2!=0) // 홀수 조건
		{
			// true
			System.out.println(num+"는(은) 홀수이다"); // 17는(은) 홀수이다
		}
	}

}
