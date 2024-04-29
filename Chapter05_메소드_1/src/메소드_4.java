// => 리턴형 (X) => 매개변수 (O)
//	  -------- 메소드 자체에서 출력
// 단 입력을 받아서 해당 단을 출력

// 메소드 => 그 전에 배웠던 것들을 기능별로 분리 => 다른 데서 사용할 수 있게 만든다고 보면 된다
import java.util.*;
public class 메소드_4 {
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
	// void => 결과값(리턴형)이 없을 때 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	gugudan(2); // 반복 제어 => 구조적 프로그램 (단락)
		System.out.println("============");
		gugudan(3);
		System.out.println("============");
		gugudan(4);
		System.out.println("============");
		gugudan(5); */
/*
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
============
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
============
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36
============
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
 */
		for(int i=2;i<=9;i++)
		{
			gugudan(i); // 항상 호출 시 처음부터 수행
			System.out.println("============");
		}
	}

}
