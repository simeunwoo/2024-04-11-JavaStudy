/*
 * 	중복이 없는 난수
 * 	1~10 => 10개의 난수 발생 => 중복 없이
 */
public class 중첩_for_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 용도가 같은 정수 10개 저장
		int[] arr=new int[10]; // 변수 이름을 1개로 통일 => 구분은 인덱스로
		// 인덱스 번호는 0번부터 'length-1'번까지
		// 제어하기가 편리하다 (읽기/쓰기) => 반복문을 사용하기 때문에 소스 코딩을 줄일 수 있다
		// int a=random() => 500
		// 클래스 => 한개의 이름 => 여러개를 동시에 제어 => 인터페이스
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					i--; // 같은 값이 나오면 다시 i를 1 줄여서 난수를 다시 설정한다
					break;
				}
			}
		}
		// 초기화 완료 => 출력
		for(int i:arr)
		{
			System.out.print(i+" "); // 4 3 10 9 8 6 7 5 2 1 
		}
	}

}
