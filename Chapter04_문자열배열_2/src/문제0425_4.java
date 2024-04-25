
public class 문제0425_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50};
		int sum=0;
	/*	for(int i=0;i<arr.length;i++) =====> 첫번째 방법
		{
			sum+=arr[i];
		}
		*/
		for(int i:arr) // =====> 두번째 방법
		{
			sum+=i;
		}
		System.out.println("sum="+sum); 
	}

}
