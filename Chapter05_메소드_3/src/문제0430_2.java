/*	static : 모든 사람이 공유하는 느낌 => static을 안 쓸수도 있다
 * 	형식)
 * 		static 리턴형 메소드명(매개변수)
 * 		------ 메소드는 반드시 메모리에 저장 => 사용 가능
 * 		------ JVM(가상머신)에 의해서 자동으로 저장
 * 		{
 * 			return 값;
 * 		}
 * 		static int aaa(int a)
 * 		{
 * 			int b=10; => 전송
 * 			return b;
 * 		}
 * 		static int[] bbb(int[] arr)
 * 		{
 * 			return arr;
 * 		}
 * 		static int input()
 * 		{
 * 			Scanner scan=new Scanner(System.in);
 * 			System.out.print("입력:")
 * 			int a=scan.nextInt();
 * 			return a; => scan.nextInt()도 가능
 * 		}
 * 		static int input()
 * 		{
 * 			Scanner scan=new Scanner(System.in);
 * 			System.out.print("입력:")
 * 			return scan.nextInt;
 * 		}
 * 
 * 		고려 사항
 * 		=> 1. 리턴형
 * 		=> 2. 매개변수
 * 		=> 3. 변수명, 메소드명이 동일할 때도 있다 => 가급적이면 사용하지 않는다
 * 
 * 		버블 정렬 => 뒤에서부터 고정
 * 
 * 		30 10 40 20 50
 * 		-- --
 * 		10 30
 * 		   -- --
 * 		   30 40
 * 			  -- --
 * 			  20 40
 * 				 -- --
 * 				 40 50
 * 		-------------- for문 1바퀴
 * 		10 30 20 40 50
 * 		-- --		==
 * 		10 30
 * 		   -- --
 * 		   20 30
 * 			  -- --
 * 			  30 40
 * 		-------------- for문 2바퀴
 * 		10 20 30 40 50
 * 		-- --	 == ==
 * 		10 20
 * 		   -- --
 * 		   20 30
 * 		-------------- for문 3바퀴
 * 		10 20 30 40 50
 * 		-- -- == == ==
 * 		10 20
 * 		-------------- for문 4바퀴
 * 		10 20 30 40 50
 * 		
 */
public class 문제0430_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("변경 전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n변경 후:");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
