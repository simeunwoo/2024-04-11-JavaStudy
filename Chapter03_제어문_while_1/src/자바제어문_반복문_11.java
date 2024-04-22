/*
 * 	while : 선조건 => 한번도 수행을 못할 수 있다
 * 
 * 	do~while : 후조건 => 무조건 최소 한번은 수행
 * 	(75page)
 * 
 * 	초기값
 * 	while(조건식)
 * 	{
 * 		반복 수행 문장
 * 		증가식
 * 	}
 * 	
 * 	int i=10;
 * 	while(i<=5) => 시작과 동시에 false => 종료 => 한번도 수행을 못할 수 있다
 * 	{}
 * 	----------- 수행을 못한다
 * 
 * 	int i=10; -------- 1
 * 	do
 * 	{
 * 		반복 실행 문장 --- 2
 * 		증가식 --------- 3
 * 	}
 * 	while(i<=5); ----- 4 => 나중에 조건 검색 => 한번 이상 반드시 수행
 * 
 * 	while을 보완하기 위해 do~while => C/C++에서 많이 사용
 * => 자바에서는 사용 빈도가 거의 없다
 */
public class 자바제어문_반복문_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.out.println("=== for ===");
		for(i=1;i<=10;i++)
			System.out.print(i+" ");
		
		System.out.println("\n=== while ===");
		i=1; // i=11인 상태이므로 i=1로 초기화한다
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println("\n=== do~while===");
		i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}
		while(i<=10);
		
	}

}
