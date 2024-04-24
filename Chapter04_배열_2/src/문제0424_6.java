
public class 문제0424_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[] num= {94,85,95,88,90};
		int min=100;
		int max=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
				min=num[i];
			if(num[i]>max)
				max=num[i];
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min); */

	//	(다른 방법)
		int[] num= {94,85,95,88,90};
		int max=num[0];
		int min=num[0];
		for(int i:num)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);
	}

}
