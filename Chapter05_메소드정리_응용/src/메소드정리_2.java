
public class 메소드정리_2 {
	// 매개변수 전송법
	static void swap(int a,int b)
	{
		System.out.println("변경 전:a="+a+",b="+b); // 변경 전:a=100,b=200
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경 후:a="+a+",b="+b); // 변경 후:a=200,b=100
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		swap(a,b); // 전송을 받았을 뿐이다 => 값이 계속 바뀌진 않는다
		System.out.println("main에서의 원본값:a="+a+",b="+b); // main에서의 원본값:a=100,b=200
		// 원본이 저장된 메모리와 전송 받은 메모리가 따로 생성된다 => 영향이 없다
	}

}
