
public class 문제0425_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score= {100,90,85};
		System.out.println("1번학생 : "+score[0]);
		System.out.println("2번학생 : "+score[1]);
		System.out.println("3번학생 : "+score[2]);
		int sum=0;
		for(int i=0;i<score.length;i++)
		{
			sum+=score[i];
		}
		System.out.println("총점:"+sum);
	}

}
