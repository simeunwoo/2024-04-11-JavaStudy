import java.util.Scanner;

public class 문제0430_1 {
	// 정수 입력
	static int jeongsu(int a)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767까지의 정수 입력:");
		return scan.nextInt();
	}
	
	// 이진법 처리
	static int[] binary(int num)
	{
		int[] binary=new int[16]; // 16개의 정수가 0으로 초기화
		/*
		 * 	new를 이용하면
		 * 		데이터형 초기화
		 * 		int => 0
		 * 		double => 0.0
		 * 		boolean => false
		 * 		char => '\0'
		 * 		String => null
		 * 	new : 동적 메모리 할당 (실행 시 메모리를 만들어 배치)
		 */
		int index=15; // 뒤에서부터 값을 저장
		while(true) // 반복 횟수를 알 수 없다 (입력된 값에 따라 다르다)
		{
			// 2로 나누고 나머지 값
			binary[index]=num%2;
			// 2로 나누기
			num=num/2;
			// num => 0이 될 때까지 반복
			if(num==0) break;
			
			index--;
		}
		return binary;
	}
	
	// 출력
	static void print(int[] binary)
	{
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=jeongsu(50);
		int[] binary=binary(num);
		print(binary);
	}

}
