
public class 문제0424_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100)+1;
			if(a[i]%3==0)
			{
				System.out.print(a[i]+" ");
			}
				
		}
	}

}
