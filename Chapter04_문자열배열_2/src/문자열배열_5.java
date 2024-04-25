import java.io.FileReader;
import java.util.Scanner;
public class 문자열배열_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("c:\\java_data\\데이터모음\\seoul_location.txt");
		// fr => 한글자씩 읽는다 => ASC 코드로 읽는다 => 정수를 char로 변경
		String data="";
		int i=0;
		while((i=fr.read())!=-1) // -1 파일 끝 (EOF)
		{
			data+=(char)i;
		}
		fr.close();
		System.out.println(data);
		String[] location=data.split("\n");
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 목록");
			System.out.println("2. 명소 검색");
			System.out.println("3. 주소 검색");
			System.out.println("4. 종료");
			System.out.println("===============");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==4)
			{
				System.out.println("프로그램 종료");
				break; // while문 종료
			}
			else if(menu==1)
			{
				for(String loc:location)
				{
					String[] locData=loc.split("\\|");
					System.out.println("명소 이름:"+locData[1]);
					System.out.println("명소 소개:"+locData[2]);
					System.out.println("위치:"+locData[3]);
					System.out.println("========================================================");
				}
			}
			else if(menu==2)
			{
				System.out.print("검색어 입력:");
				String fd=scan.next();
				for(String loc:location)
				{
					if(loc.contains(fd))
					{
						String[] locData=loc.split("\\|");
						System.out.println("명소 이름:"+locData[1]);
						System.out.println("명소 소개:"+locData[2]);
						System.out.println("위치:"+locData[3]);
						System.out.println("========================================================");
					}
				}
			}
			// 메소드로 처리 => 중복 제거, 재사용
			else if(menu==3)
			{
				System.out.print("주소 입력:");
				String address=scan.next();
				for(String loc:location)
				{
					if(loc.contains(address)) // contains(address) => 메소드
					{
						String[] locData=loc.split("\\|");
						System.out.println("명소 이름:"+locData[1]);
						System.out.println("명소 소개:"+locData[2]);
						System.out.println("위치:"+locData[3]);
						System.out.println("========================================================");
					}
				}
			}
		}
	}

}
