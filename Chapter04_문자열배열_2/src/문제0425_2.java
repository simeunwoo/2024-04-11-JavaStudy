
public class 문제0425_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] person= {50,45,35,12,70};
/*		System.out.println("사원(1) "+person[0]);
		System.out.println("사원(2) "+person[1]);
		System.out.println("사원(3) "+person[2]);
		System.out.println("사원(4) "+person[3]);
		System.out.println("사원(5) "+person[4]); */
		
		for(int i=0;i<person.length;i++)
		{
			System.out.println("사원("+(i+1)+") "+person[i]);
		}
		
		int sum=0;
		int min=100;
		int max=0;
		for(int i=0;i<person.length;i++)
		{
			sum+=person[i];
			
			if(min>person[i])
			{
				min=person[i];
			}
			if(max<person[i])
			{
				max=person[i];
			}
		}
		double avg=sum/5.0;
		System.out.println("총점:"+sum);
		System.out.printf("평균:%.2f",avg);
		System.out.println("\n실적 1등:"+max);
		System.out.println("실적 꼴등:"+min);
	}

}
