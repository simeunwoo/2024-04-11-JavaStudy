// 국어 영어 수학 => 총점, 평균 (연산자), 학점 (if냐 switch냐)
// AI => 개발자 점점 안뽑힘
import java.util.Scanner;
public class 제어문_선택문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// println, print : 출력 (라이브러리)
		System.out.print("국어 점수:");
		int kor=scan.nextInt();
		System.out.print("영어 점수:");
		int eng=scan.nextInt();
		System.out.print("수학 점수:");
		int math=scan.nextInt();
		
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		
		char score=' ';
		int avg=(kor+eng+math)/30; // 0~10
		switch(avg)
		{
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		System.out.println("학점:"+score);
		// 프로그램은 어떤 과정이든 상관없이 결과값만 잘 나오면 된다
		// => 과정에 있어 정답은 없다 => 여러가지 경우의 수
	}

}
