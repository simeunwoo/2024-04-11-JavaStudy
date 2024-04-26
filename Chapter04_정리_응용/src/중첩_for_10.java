// 알파벳 10개를 임의로 추출한 후 정렬해서 출력 => ASC/DESC (중복해도 됨)
/////////////////////////////////// 오류가 있음
import java.util.*;

public class 중첩_for_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		char[] alpha=new char[10];
		for(int c=0;c<alpha.length;c++)
		{
			alpha[c]=(char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(alpha)); // [H, Z, G, T, G, F, C, J, S, E]
		
		for(int c=0;c<alpha.length-1;c++)
		{
			for(int d=c+1;d<alpha.length;d++)
			{
				if(alpha[c]>alpha[d])
				{
					char temp=alpha[c];
					alpha[c]=alpha[d];
					alpha[d]=temp;
				}
			}
		}
				System.out.println(Arrays.toString(alpha)); // [C, E, F, G, G, H, J, S, T, Z]
		
	}

}
