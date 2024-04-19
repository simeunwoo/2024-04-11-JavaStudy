/*
 * 	돈까스 : 8000
 * 	칼국수 : 6000
 * 	왕만두 : 5000
 * 	-----------------
 * 	주문 => 돈까스 16인분
 * 		   칼국수 8인분
 * 		   왕만두 1인분
 * 	----------------- 총 계산서를 출력하는 프로그램을 작성
 */

import java.util.Scanner;

public class 자바변수_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("돈까스 값:8000");
		final int don=8000; // 메뉴값이니깐 앞에 final 붙여 상수형으로 만들어도 상관 없다
		System.out.println("칼국수 값:6000");
		final int kal=6000;
		System.out.println("왕만두 값:5000");
		final int wang=5000;
		
		System.out.println("총액:"+((don*16)+(kal*8)+wang));
	}

}
