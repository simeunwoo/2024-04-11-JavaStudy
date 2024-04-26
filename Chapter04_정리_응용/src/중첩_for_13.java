// 알파벳 난수 10개 => 버블 정렬 (DESC)
// 중복 없는 알파벳
import java.util.Arrays;
public class 중첩_for_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++) // 임의의 알파벳 10개 선정
		{
			alpha[i]=(char)((Math.random()*26)+65);
			for(int j=0;j<i;j++)
			{
				if(alpha[j]==alpha[i]) // 중복이 없게 한다
				{
					i--; // 원상 복귀
					break;
				}
			}

		}
		
		for(int i=0;i<alpha.length-1;i++) // 버블 정렬 - DESC(내림차순)
		{
			for(int j=0;j<alpha.length-1-i;j++)
			{
				if(alpha[j]<alpha[j+1]) // ex) j => 10, j+1 => 20
				{
					char temp=alpha[j]; // temp => 10
					alpha[j]=alpha[j+1]; // j => 20
					alpha[j+1]=temp; // j+1 => 10
				}
			}
		}
		System.out.println(Arrays.toString(alpha)); // [Y, W, V, S, R, P, M, G, E, B]
	}

}
