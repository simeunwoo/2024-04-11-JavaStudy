/*
 * 		국어 영어 수학 => 총점 / 평균 / 학점 (ABCDF)
 * 		=> 변수 6개, 정수 4개(국어,영어,수학,총점), 실수 1개(평균), 문자 1개(학점)
 */
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=80;
		int math=75;
		int total=kor+eng+math;
		double avg=total/3.0; // 정수/정수=정수(소수점 불가능) => 정수/정수+소수점=실수(소수점 가능)
		System.out.println("국어 점수:"+kor); // 국어 점수:90
		System.out.println("영어 점수:"+eng); // 영어 점수:80
		System.out.println("수학 점수:"+math); // 수학 점수:75
		System.out.println(total=+kor+eng+math); // 245
		System.out.printf("평균:%.2f",avg); // 평균:81.67 // .2f => 소수점 이하 2자리까지 (반올림)
	}

}
