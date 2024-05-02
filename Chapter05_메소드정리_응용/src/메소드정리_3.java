
public class 메소드정리_3 {
	static void swap(int[] arr)
	{
		// 메모리 주소 자체를 넘겨준다 => 같은 메모리에서 값을 변경 => 원본 자체가 변경
		System.out.println("변경 전:arr[0]="+arr[0]+",arr[1]="+arr[1]); // 변경 전:arr[0]=100,arr[1]=200
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp; // 값 교환
		System.out.println("변경 후:arr[0]="+arr[0]+",arr[1]="+arr[1]); // 변경 후:arr[0]=200,arr[1]=100
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// call by reference 방식 => 메모리 주소 자체를 변경
		// => 배열 / 클래스
		int[]temp= {100,200};
		swap(temp);
		System.out.println("main=>temp 값:temp[0]="+temp[0]+",temp[1]="+temp[1]);
		// main=>temp 값:temp[0]=200,temp[1]=100
	}

}
