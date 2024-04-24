
public class 문제0424_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=(int)(Math.random()*100)+1;
			if(a[i]>=1 && a[i]<=10)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
