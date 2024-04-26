// API
import java.util.*;
public class 중첩_for_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr)); // [92, 21, 97, 6, 31, 12, 71, 58, 21, 31]
		// 전부 지원하지는 않는다 => 직접 만들어서 사용, 기존의 라이브러리를 수정해서 사용
							//		|					|
						  	//    오버로딩				 오버라이딩	
		
		// 정렬
		Arrays.sort(arr); // Arrays.sort : 오름차순 or 내림차순 가능
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr)); // ASC // [6, 12, 21, 21, 31, 31, 58, 71, 92, 97]
		
		// DESC
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" "); // 97 92 71 58 31 31 21 21 12 6 
		}
	}

}
