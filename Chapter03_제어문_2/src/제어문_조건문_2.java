// 3개의 난수 발생 => 1~100 => 최댓값, 최솟값
// 제어문 => 단일 조건문
public class 제어문_조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		int num3=(int)(Math.random()*100)+1;
		System.out.println("num1="+num1); // num1=54
		System.out.println("num2="+num2); // num2=4
		System.out.println("num3="+num3); // num3=78
		
		int max=num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		System.out.println("Max="+max); // Max=78
		
		int min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		System.out.println("Min="+min); // Min=4
	}

}
