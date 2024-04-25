
public class 문제0425_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*26)+65;
			char b=(char)a[i];
			System.out.print(b+" ");
			
		}
		
	}

}
