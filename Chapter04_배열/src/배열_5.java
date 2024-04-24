// 알파벳을 임의로 10개 저장 => char[]
import java.util.*; // 이 문장은 class 위에 있어야 한다
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		// 초기화
		System.out.println("배열의 갯수:"+alpha.length); // 배열의 갯수:10
		for(int i=0;i<alpha.length;i++) // length : 배열의 갯수
		{
			// 0~9 => 인덱스 번호는 무조건 0번부터 시작
			alpha[i]=(char)((Math.random()*26)+65); // 65~90는 'A'~'Z'를 의미
		}
		System.out.println("=== for-each:실제 저장된 데이터를 읽어 온다 ==="); // === for-each:실제 저장된 데이터를 읽어 온다 ===
		// 용도 : 출력할 때 주로 사용
		for(char c:alpha)
		{
			System.out.print(c+ " "); // H R K P K G X L O C 
		}
		System.out.println();
		System.out.println("=== 일반 for문:인덱스 번호를 이용하여 읽기 ==="); // === 일반 for문:인덱스 번호를 이용하여 읽기 ===
		// 용도 : 데이터 값 변경이나 초기화, 출력을 할 때 주로 사용
		for(int i=0;i<alpha.length;i++)
		{
			System.out.print(alpha[i]+" "); // H R K P K G X L O C 
		}
		System.out.println("\n=== 자바에서 제공하는 API를 이용하여 읽기 ==="); // === 자바에서 제공하는 API를 이용하여 읽기 ===
		Arrays.sort(alpha); // 지금 이 문장 없어도 밑의 출력값은 똑같이 나온다
		System.out.println(Arrays.toString(alpha)); // [G, I, V, D, K, L, N, I, D, X]
	}

}
