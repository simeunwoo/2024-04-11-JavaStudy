// 문제0430_2 참고
import java.util.*;
public class 실무_정렬 {

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
		Arrays.sort(arr);
		System.out.println("\n변경 후:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		// 번외 => 2진법에 대하여
		int num=10;
		System.out.println();
		System.out.println(Integer.toBinaryString(num)); // 1010
		// 2진법 이용 => Integer.toBinaryString()
	}

}
