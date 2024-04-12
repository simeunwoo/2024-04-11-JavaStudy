/*
 * 		>>> 값을 교환
 * 		int a=100;
 * 		int b=200;
 * 		int temp=a; temp=100
 * 			a=b (a값을 b에 대입하라) => a=200
 * 			b=a (b값을 a에 대입하라) => b=100
 */
public class 변수_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		int temp=a;
		a=b; // a=200
		b=temp; // b=a => b=200
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
