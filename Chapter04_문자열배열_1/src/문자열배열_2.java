// startsWith (시작 문자열이 같은 경우) / endsWith (끝 문자열이 같은 경우) => Cookie
// 자동 완성기
import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books={
			"자바와 오라클",
			"자바로 시작하는 웹프로그램",
			"자바와 JSP",
			"JSP와 오라클",
			"JSP와 Ajax",
			"Ajax와 JQuery",
			"혼자 배우는 자바",
			"자바 프로그래밍",
			"오라클 AND 자바",
			"최신 자바"
		};
		// 데이터 모음
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:"); // 검색어 입력:자바
		String fd=scan.next();
		for(String book:books)
		{
		//	if(book.startsWith(fd)) // '자바'로 시작하는 단어를 찾아라
		//	contains()을 활용해도 좋지 않겠는가!?
		//	if(book.endsWith(fd)) // '자바'로 끝나는 단어를 찾아라
			if(book.startsWith(fd) || book.endsWith(fd)) // '자바'로 시작하고 끝나는 단어를 찾아라
			{
				System.out.println(book); // startsWith 사용 => 자바와 오라클...자바 프로그래밍
										  // endsWith 사용 => 혼자 배우는 자바...최신 자바
				try
				{
					Thread.sleep(1000); // 잠깐 멈췄다 출력할 때 사용 => 1000만큼 기다렸다가 하나씩 출력
				}catch(Exception ex) {}
			}
		}
	}

}
