// continue => for문에서 주로 사용 => 제외
public class 자바제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			if(i==3)
				continue; // 3을 제외하고 나머지를 출력 => 1,2,4,5
						  // 증가식 => 제외하고 수행
						  // continue => for문 증가식으로 이동
			System.out.println("i="+i);
		}
		System.out.println("=== while-continue:무한루프 ===");
		int i=1;
		while(i<=5) // while(true) => 횟수가 없는 경우
		{
			if(i==3)
				continue; // 증가하지 못하고 => 조건식으로 이동
						  // continue => while문 조건식으로 이동
			System.out.println("i="+i);
			i++;
		}
		/*	continue, break 문장은 자신의 반복문에서만 제어
		 * 
		 * 	for(int i=1;i<=3;i++)
		 * 	{
		 * 		for(int j=1;j<=3;j++)
		 * 		{
		 * 			if(j==2) break; // j가 있는 for문만 종료
		 * 		}
		 * 	}
		 */
	}

}
