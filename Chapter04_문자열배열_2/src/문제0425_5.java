import java.util.*;
public class 문제0425_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int 짝수=0;
		int 홀수=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100)+1;
			
			if(a[i]%2==0)
			{
				짝수+=a[i];
			}
			if(a[i]%2!=0)
			{
				홀수+=a[i];
			}
		}
		System.out.println(Arrays.toString(a)); // [80, 10, 39, 79, 88, 86, 26, 85, 54, 84]
		System.out.println("짝수 합:"+짝수); // 짝수 합:428
		System.out.println("홀수 합:"+홀수); // 홀수 합:203
	}

}
