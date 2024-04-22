
public class 자바제어문_반복문_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; // 변수 사용 시 반드시 for문 밖에 설정
		for(i=1;i<=10;i++) // i는 10까지만 작동하고 11이 되면 작동 X
		{
			System.out.print(i+" "); // 1 2 3 4 5 6 7 8 9 10 
		}
		// i 변수는 메모리에서 삭제
		System.out.println("i="+i); // i=11 (종료 시점이 for문에서 i가 11이 되었을 때이므로)
	}
// 최종 출력 : 1 2 3 4 5 6 7 8 9 10 i=11
}
