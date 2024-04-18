
public class 문제0418_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a=2;a<=100;a+=2)
		{
		sum+=a;} // sum=sum+a
		// sum=0+2 => sum=0+2+4
		// => sum=0+2+4+6 =>...=> sum=0+2+4+6+...+100
		System.out.println("2+4+...100의 합:"+sum);
	}

}
