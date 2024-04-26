import java.util.*;
public class 중첩_for_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		// 중복이 없는 6개의 난수 발생
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[j]==lotto[i])
				{
					i--;
					break;
				}
			}

		}
		System.out.println(Arrays.toString(lotto)); // [30, 37, 19, 43, 29, 31]
		
		// 정렬해서 출력 => 정렬 알고리즘
		for(int i=0;i<lotto.length-1;i++) // 정렬할 때는 1개씩 빼고 정렬하는 걸 잘 이용하여 => length에 1을 뺀다
		{
			for(int j=i+1;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		System.out.println("=== 오늘의 로또 번호 ===");
		// 출력
		for(int i:lotto)
		{
			System.out.print(i+" "); // 19 29 30 31 37 43 
		}
	}

}
