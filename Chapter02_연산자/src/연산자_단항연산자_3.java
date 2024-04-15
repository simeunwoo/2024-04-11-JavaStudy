/*
 *  형변환 연산자
 *  ----------- (데이터형) => boolean은 제외
 *  	UpCasting => 데이터형을 크게 만든다
 *  	DownCasting => 데이터형을 작게 만든다
 *  
 *  	===============> UpCasting
 *  	byte < char < int < long < float < double
 *  	<=============== DownCasting 
 *  
 *  	예)	'A' = > char
 *  		(int)'A' => int => 65
 *  
 *  		===> UpCasting
 */
public class 연산자_단항연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형변환 (데이터형) => (int), (double), (char),...
		System.out.println('A'); // A
		System.out.println((int)'A'); // 65
		
		System.out.println(98); // 98
		System.out.println((char)98); // b
		
		System.out.println(10.5); // 10.5
		System.out.println((int)10.5); // 10
/*
 * 	10.5 + 10.5 => 21.0
 * 	(int)(10.5 + 10.5) => 21
 * 
 * 	(int)10.5 + (int)10.5 => 10 + 10 => 20
 * 
 * 	double d=123456.78
 * 	int i=123456
 * 	(int)((d-i)*100) = 77
 * 		*** int와 double의 bit가 달라서 0.78은 0.7799999...가 되어서 최종값이 77이 된다
 * 		*** int와 float는 bit가 같아서 그대로 최종값이 77이 된다
 */
		double d=123456.78;
		int i=123456;
		System.out.println((int)((d-i)*100)); // 77
		
		float f=123456.78F;
		int ii=123456;
		System.out.println((int)((f-ii)*100)); // 78
		
		int rand=(int)(Math.random()*100)+1; // 1~100
		//			   -------------		   => (), *, 형변환, + 순으로 계산한다
		//				0.0 ~ 0.99
		System.out.println("rand="+rand); // 40 (1~100 사이에서 랜덤으로 나온다)
	}

}
