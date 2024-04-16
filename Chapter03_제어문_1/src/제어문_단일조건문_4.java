/*
 * 	Office : 시간 당 12000
 * 	HTML/CSS : 시간 당 13000
 * 	Java - Spring : 시간 당 25000
 * 	Spring-Boot, JPA : 시간 당 32000
 * 	Python
 * 	머신러닝 - 딥러닝 - AI : 시간 당 295000 (데이터 분석)
 * 
 * 	변수 / 연산자 / 제어문 => 데이터베이스 => 웹 사이트
 * 	-----------------------------
 * 		  ㅣ
 * 		 재사용 (게시판) => 메소드
 * 						 ㅣ
 * 						목록 출력
 * 						글쓰기
 * 						상세보기
 * 						수정하기
 * 						삭제하기
 * 						검색
 * 						댓글
 * 						=> 위에 7개 => 클래스
 * 
 *	char => 대문자 / 소문자 / 알파벳이 아니다
 */
import java.util.Scanner;
public class 제어문_단일조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력:");
		char c=scan.next().charAt(0);
		
		// 출력 => 결과값
		// 대문자 => c>='A' && c<='Z'
		// 소문자 => c>='a' && c<='z'
		// 알파벳이 아니다 => !((c>='A' && c<='Z') || (c>='a' && c<='z'))
		
	}

}
