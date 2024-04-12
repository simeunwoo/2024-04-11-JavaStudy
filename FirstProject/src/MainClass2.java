//  출력 형식
/*
 *      = System.out.println()
 *      				===== ln() => new Line
 *      = System.out.println("Hello ")
 *      = System.out.println("Java")
 *      Hello
 *      Java
 *      = System.out.print() => 옆으로 출력
 *        System.out.print("Hello ")
 *        System.out.print("Java")
 *        Hello Java
 *      = System.out.printf()
 *      서식이 있는 출력
 *      %d => 정수
 *      %f => 실수
 *      %c => 문자
 *      %s => 문자열
 *     = 자바에서 표현법
 *     정수표현법
 *        = 10진법(0~9) - 10, 20, ...
 *        = 8진법(0~7) - 010(= 10진법 기준 8)(앞에 0을 붙이는 8진법 표현)
 *        = 16진법 - 0x10(= 10진법 기준 16)(앞에 0x를 붙이는 16진법 표현) => 색상에 주로 사용
 *        = 2진법 - 0b10(=10진법 기준 2)(앞에 0b를 붙이는 2진법 표현)
 *        ================================================================================
 *        	10 => 32bit (int) / 10L => 64bit (long)
 *     실수표현법 => 10.5 , 10.5F
 *               ------  ------ (요런건 32bit -> 4byte)  <1byte -> 8bit (0과 1이 8개)>
 *                저장하는 메모리 크기 = 64bit
 *     문자표현법 => 'A' (한 글자만 허용)
 *     문자열표현법 => "Hello" (여러 문자 가능)
 * 
 * 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("\"심은우\""); // => "심은우" (명령문이 종료할 시 반드시 ; 찍는다)
		//System.out.println("c:\\javaDev\\movie.txt"); // => c:\javaDev\movie.txt
		//System.out.println("홍길동\t남자"); // => 홍길동	남자
		//System.out.println("홍길동\n남자"); // => 홍길동
										 //	   남자
		//System.out.println("홍길동\t");
		//System.out.println("남자\t");
		//System.out.println("26");
		/*
		 *  ★ => (ㅁ 자 누르고 한자 키 누르면 나옴)
		 *  ★★
		 *  ★★★
		 *  ★★★★
		 *  ★★★★★
		 * 
		 * <<<<<<<<< 알 고 리 즘 >>>>>>>>>
		 * 
		 *  줄수(i)  별표(j)   => i=j => j=i
		 *  1		1
		 *  2		2
		 *  3		3
		 *  4		4
		 *  5		5
		 *  
		 *  줄수(i)  별표(j)   => 역순이면 + => i+j=6 => j=6-i
		 *  1		5
		 *  2		4
		 *  3		3
		 *  4		2
		 *  5		1
		 */
		/*
		 * for(int i=0;i<=5;i++) { for(int j=0;j<=5-i;j++) { System.out.print("*"); }
		 * System.out.println(); }                                                         
		 */
		System.out.println("10 20 30 40 50");
		System.out.printf("%3d%3d%3d%3d%3d",10,20,30,40,50); // => 3앞에 +면 오른쪽 정렬, -면 왼쪽 정렬 (3은 한칸에 들어가는 문자 개수가 3개라는 뜻, 띄어쓰기 포함)


	}

}
