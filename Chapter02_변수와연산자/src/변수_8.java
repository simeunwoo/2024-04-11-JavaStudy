/*
 * 		30 20 40 50 10
 * 		--------------	'10 20 30 40 50'로 만들기
 * 		10 20 30 40 50
 * 		-------------- 	Select Sort
 * 		
 * 		
 * 		
 */

import java.util.Arrays;

public class 변수_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,20,40,50,10};
		System.out.println("변경전:");
		System.out.println(Arrays.toString(arr)); // 변경전:
												  // [30, 20, 40, 50, 10]
		Arrays.sort(arr);						  // 변경전:
												  // [30, 20, 40, 50, 10]
												  // 변경후:
												  // [10, 20, 30, 40, 50]

		/*
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}*/										  // /*/ 내의 구간은 위에 Arrays.sort(arr);로 간추릴 수 있다
		System.out.println("변경후:");
		System.out.println(Arrays.toString(arr)); // 변경후:
		                   						  // [10, 50, 40, 20, 30]
	}

}
