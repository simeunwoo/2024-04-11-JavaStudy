// 임의의 정수 2개를 메소드로 전송 => Max, Min을 찾아서 넘겨준다
// ------ 매개변수				 ---- ---- 리턴형 (리턴형은 1개만 되므로 따로 따로 구한다)

import java.util.*;

public class 메소드_2 {
	static int abc(int a,int b)
	{
		int abc=a;
		if(a<b)
			abc=b;
		return abc; // abc(a,b)는 리턴값이 된다
	}
	
	static int def(int a,int b)
	{
		int def=a;
		if(a>b)
			def=b;
		return def; // def(a,b)는 리턴값이 된다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a+",b="+b);
		// 최댓값
		int m=abc(a,b); // m은 리턴값이 된다
		System.out.println("abc="+m);
		// 최솟값
		int n=def(a,b);
		System.out.println("def="+n); // n은 리턴값이 된다
	}

}
