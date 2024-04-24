
public class 문제0424_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10)+1;
			System.out.print(a[i]+" ");
			b+=a[i];
		}
		System.out.println();
		System.out.println(b/10.0);
	}

}
