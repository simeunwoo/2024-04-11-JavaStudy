import java.util.*;
public class 문제0425_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[5];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("변경 전:");
		System.out.println(Arrays.toString(alpha)); // [H, C, G, T, K]
		System.out.println("변경 후:");
		Arrays.sort(alpha); // ASC => 오름차순
		System.out.println(Arrays.toString(alpha)); // [C, G, H, K, T]
		for(int i=alpha.length-1;i>=0;i--) // DESC => 내림차순
		{
			System.out.print(alpha[i]+" "); // T K H G C 
		}
		// => 선택 정렬 / 버블 정렬 => 이차 for문
	}

}
