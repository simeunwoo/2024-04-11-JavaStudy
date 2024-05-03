/*
 * 1|쇼생크 탈출
 * |드라마
 * |https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
 * |팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
 * |2016 .02.24 재개봉, 1995 .01.28 개봉
 * |15세 관람가
 * |프랭크 다라본트
 */
// 파일 입출력 => 데이터 읽기 => 메모리에 저장
import java.io.FileReader;
import java.util.Scanner;
// 사용자 정의 데이터형
class Movie
{
	String mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}
public class 멤버변수_초기화 {
	Movie[] movies=new Movie[1938]; // 선언만 하는 영역
	// int[] arr=new int[5] => 0
	// 멤버 변수 => 프로그램 종료 시까지 유지
	// 초기화 => 시작
	// 파일 읽기 => 구현
	{
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			// 파일 읽기 => 반드시 예외처리, URL
			StringBuffer sb=new StringBuffer();
			// 문자열을 임시로 저장하는 클래스
			// +
			int i=0; // 파일의 글자 읽기 => ASC => 정수형
	//		String m="";
			while((i=fr.read())!=-1) // -1 EOF
			{
				sb.append((char)i);
			//	m+=(char)i;
			}
			fr.close();
			// System.out.println(m);
			String temp=sb.toString();
			// String => 메소드 활용
			String[] movie=temp.split("\n");
			int j=0;
			for(String mm:movie)
			{
				movies[j]=new Movie(); // 클래스 초기화 => 저장할 공간을 확보
				String[] data=mm.split("\\|");
				movies[j].mno=data[0];
				movies[j].title=data[1];
				movies[j].genre=data[2];
				movies[j].poster=data[3];
				movies[j].actor=data[4];
				movies[j].regdate=data[5];
				movies[j].grade=data[6];
				movies[j].director=data[7];
				j++;
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		멤버변수_초기화 m=new 멤버변수_초기화();
		Scanner scan=new Scanner(System.in);
/*
...
1938|니드 포 스피드|액션, 범죄, 드라마, 스릴러|https://movie...
 */
	}

}
