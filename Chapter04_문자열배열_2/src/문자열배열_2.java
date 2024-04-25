// split
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red,blue,black,yellow,white,pink,magenta";
		String[] colors=color.split(",");
		for(String c:colors)
		{
			System.out.print(c+" "); // red blue black yellow white pink magenta 
		}
		System.out.println();
		String name="홍길동|심청이|춘향|박문수|이순신|강감찬";
	//	String[] names=name.split("|");
		String[] names=name.split("\\|"); // regex => 이걸 써야지 '|'도 split()에 의하여 잘린다
		/*
		 * 	정규식에서 사용하는 기호
		 * 	? => 둘중에 한개
		 * 	| => 여러개 중에 한개 선택 => A|B|C
		 * 	. => 임의의 한글자
		 * 	+ => 한개 이상의 문자가 있는 경우
		 * 	* => 0개 이상의 문자
		 * 	^ => 시작
		 * 	$ => 끝
		 */
		for(String n:names)
		{
//			System.out.print(n+" "); // 홍 길 동 | 심 청 이 | 춘 향 | 박 문 수 | 이 순 신 | 강 감 찬 (| 사용)
									// 홍길동 심청이 춘향 박문수 이순신 강감찬 (\\| 사용)
									// 결론 : '|'는 split()으로 안 잘린다 (앞에 \\를 붙여야 한다
			System.out.println(n+" "); // 홍(다음줄)길(다음줄)동(다음줄)|(다음줄)심(다음줄)... (| 사용)
										// 홍길동(다음줄)심청이(다음줄)... (\\| 사용)
			
		}
	}

}
