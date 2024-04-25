// 1. 배열의 범위를 벗어나면 => 오류 발생 => 0번 ~ '갯수-1'번
// 2. 프로그래머의 실수가 가장 많은 곳 => 실행 시에 오류가 발생하기 때문
// => ArrayIndexOutOfBoundsException (배열 범위 초과) => 93page
/*
 * 	에러 => 에러 처리 많이 해봐야 실력이 오름 (실무에 도움)
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2}; // arr[0]=1, arr[1]=2, arr[2]=>(없음)
	//	System.out.println(arr[2]); // (오류)
	}

}
