import java.util.Scanner;
// C언어 => include / C# => using / python => import / JavaScript => import
// 기존에 만든 클래스를 불러온다, 라이브러리 읽기
// 같은 폴더에 있는 경우에는 생략 => 다른 폴더에 있는 경우에만 사용
public class 연산자_입력값처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학 점수를 입력 받아서 => 총점, 평균
		// 저장할 메모리 공간
		int kor,eng,math,total;
		double avg;
		
		// 사용자로부터 입력값을 받아서 변수에 초기화
		// 키보드 입력값 읽기
		Scanner scan=new Scanner(System.in);
		
		System.out.println("국어,영어,수학 입력:"); // 국어,영어,수학 입력:78,64,57(직접 입력)
											   // => 한번에 입력 <방법 1>
		
		// System.out.println("국어 점수:"); // 국어 점수:78(직접 입력) => 한개씩 입력 <방법 2>
		kor=scan.nextInt();
		
		// System.out.println("영어 점수:"); // 영어 점수:64(직접 입력)
		eng=scan.nextInt();
		
		// System.out.println("수학 점수:"); // 수학 점수:57(직접 입력)
		math=scan.nextInt();
		
		// 처리
		// 사용자 요청 => 프로그램에서 요청 처리 결과를 보여준다 => 연산자
		
		total=kor+eng+math;
		avg=total/3.0;
		
		System.out.println("===== 결과 ====="); // ===== 결과 =====
		System.out.println("총점="+total); // 총점=199
		System.out.printf("평균:%.2f",avg); // 평균=66.33
	}

}
