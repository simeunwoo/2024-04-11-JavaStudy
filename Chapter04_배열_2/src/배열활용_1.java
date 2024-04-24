/*
 * 	배열 => 5
 * 	-----------------------
 * 	|	|	|	|	|	|
 * 	-----------------------
 * 	 --- --- --- --- --- -- => 간격이 동일해야 => 인덱스를 만들 수 있다
 * 							   -------- 단위 : byte
 * 										4byte => int[] / 8byte => double[]
 * 
 *  1) 초기값
 *  	'0번부터 추가?' or '마지막부터 추가?'
 *  
 *  	정수 입력을 받아서 => 2진법을 출력
 *  	8bit => 10 => 00001010 (뒤에서부터 출력이 낫지 않겠는가?)
 */
import java.util.Scanner;
public class 배열활용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767 사이의 정수 입력:"); // 1999 // bit => 16bit (0~2^16-1)
		int input=scan.nextInt();
		// 0, 1 저장
		int[] binary=new int[16];
		int index=binary.length-1; // 15부터 0까지 뒤에서부터 채워준다
		
		System.out.println("=== API 이용 ===");
		System.out.println(Integer.toBinaryString(input)); // 11111001111 // 첫번째 방법
															// => 상위 자리에 불필요한 0은 삭제
		System.out.println(Integer.toOctalString(input)); // 3717 (8진법)
		System.out.println(Integer.toHexString(input)); // 7cf (16진법)
		
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		// 출력
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0) // i!=0은 맨 앞에 띄어쓰기를 하지 않기 위해 만들어졌다
			{
				System.out.print(" "); // 4자리씩 끊어서 확인해보기 위한 방법
			}
			System.out.print(binary[i]); // 0000 0111 1100 1111 // 두번째 방법
		}
	}

}
