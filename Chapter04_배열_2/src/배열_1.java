/*
 * 	1. 배열 생성
 * 		=> 같은 데이터형만 모아서 관리
 * 		=> 데이터형[] 배열명;
 * 		   --------
 * 		=> 데이터형 배열명[]; => 사용은 가능하나 권장 사항은 X (C/C++)
 * 
 * 	2. 초기화
 * 		=> 데이터형[] 배열명={값,값,...} => 변경하지 않는 데이터형
 * 		=> 데이터형[] 배열명=new 데이터형[갯수]
 * 			=> 기본 디폴트 값
 * 				int => 0
 * 				char => '\0'
 * 				double => 0.0
 * 				long => 0L
 * 				boolean => false
 * 
 * 	3. 저장 갯수 확인
 * 		=> length => 배열명.length
 * 
 *  4. 데이터 변경
 *  	=> 연속적인 메모리 공간
 *  	   --------------
 *  		=> 인덱스 번호를 이용하여 데이터를 변경, 읽기
 *  		=> 변수, 배열
 *  		   --------
 *  			읽기/쓰기
 *  			배열 => 읽기/쓰기(수정)
 *  		=> 인덱스 번호는 0번부터 시작한다
 *  
 *  		int[] arr=new int[3]
 * 						  arr[0] arr[1] arr[2]
 * 			arr --------> --------------------
 * 							0		0		0
 * 						  -------------------- 저장된 크기가 동일 (데이터형이 같은)
 * 							|		|		|
 * 						  arr[0]  arr[1]  arr[2]
 * 			=> 값을 변경
 * 				arr[0]=100
 * 				arr[1]=200
 * 				arr[2]=300
 * 				---------- 일반 변수 취급
 * 				* 인덱스는 0부터 순차적으로 되어 있다
 * 					=> 반복문을 사용하기 편리하다
 * 					=> 5개 지정하면 => 변경할 수 없다 : 고정적 (가변형 => 클래스 제작)
 * 					=> 소스량을 줄일 수 있다
 * 					=> 소프트웨어 라인
 * 					   ----------- 하루 개발 코딩량
 *  					400 => 1500줄 => 250줄 => 주석 (X)
 *  5. for-each
 *  	형식) => 92page
 *  	for(데이터형 변수명:배열명)
 *  	{	---------------- 인덱스 번호가 아니라 => 실제 배열에 저장값
 *  		배열 데이터형과 변수명의 데이터형 일치
 *  		형변환을 할 수 없다
 *  	}
 *  	=> 배열값을 변경하거나 초기화 (X)
 *  	=> Only => 출력만 한다
 *  	=> 웹에서 주로 사용
 *  	-------------------------
 *
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 10개 저장 => 용도가 같은 경우 => 배열 / 일반 변수
		int[] arr=new int[10]; // 변수 10개와 같은 효과 // 초기값을 모르는 상태
		// arr 이름으로 10개의 데이터를 제어
		// char 5개 => 'A'~'E'
		char[] alpha= {'A','B','C','D','E'}; // 초기값을 아는 상태
		// 데이터형 변환
		double[] data={10.5,20.5,30.5,40.5,50};
		// double d=50 => d=50.0
		// 작은 데이터형은 추가가 가능
		for(double d:data)
		{
			System.out.print(d+" "); // 10.5 20.5 30.5 40.5 50.0 
		}
		System.out.println();
		int[] arr2={'A','B','C','D','E'}; // 현재 {} => int, byte, char 가능
		// 65 66 67///
		for(int i:arr2)
		{
			System.out.print(i+" "); // 65 66 67 68 69 
		}
		System.out.println();
		char[] ch= {65,66,67,68,69};
		// int <=> char 형변환 없이 저장 가능
		for(char c:ch)
		{
			System.out.print(c+" "); // A B C D E 
		}
		System.out.println();
		boolean[] boo=new boolean[5];
		for(boolean b:boo)
		{
			System.out.print(b+" "); // false false false false false (초기값)
		}
		System.out.println();
		String[] str=new String[5];
		// 클래스 => null (null은 주소가 없는 경우)
		for(String s:str)
		{
			System.out.print(s+" "); // null null null null null (초기값)
		}
		System.out.println();
		double[] dd=new double[5];
		for(double d:dd)
		{
			System.out.print(d+" "); // 0.0 0.0 0.0 0.0 0.0 (초기값)
		}
	}

}
