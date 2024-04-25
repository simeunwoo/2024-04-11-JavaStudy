// 약간의 오류가 있을 수 있음
public class 문제0425_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[100];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10);
		}
		int[] result=new int[10];
		for(int i=0;i<a.length;i++)
		{
			result[a[i]]++;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+":"+result[i]);
		}

	}
	

}
