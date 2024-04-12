/*
 * 		돈 : 5600원
 * 			=> 지출 => 점심비 : 3000원
 * 					  커피 : 1500원
 * 					  심심풀이 : 250원
 */
public class 변수_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int all=5600;
		int lunch=3000;
		int coffee=1500;
		int fun=250;
		System.out.println(+all); // 5600
		System.out.println(-lunch); // -3000
		System.out.println(-coffee); // -1500
		System.out.println(-fun); // -250
		System.out.println(+all-lunch-coffee-fun); // 850
		System.out.println(+all-lunch-coffee-fun+"원"); // 850원
	}

}
