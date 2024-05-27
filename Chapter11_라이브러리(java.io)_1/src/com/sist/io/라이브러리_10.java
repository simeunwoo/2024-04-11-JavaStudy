package com.sist.io;
/*
 *  파일 읽기 => FileInputStream => 1byte (한글 깨짐)
 *  		=> FileReader => 2byte (한글 정상적으로)
 *  => 한글을 읽을 때 1byte => 2byte 변경해서 읽기 => BufferedReader
 */
import java.io.*;
public class 라이브러리_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try
		{
			// 읽을 파일을 설정
			fis=new FileInputStream("c:\\java_data\\데이터모음\\seoul_location.txt");
			// 영문, 숫자, 특수 문자는 상관이 없다 => 영어가 아닌 다른 언어는 다 깨진다
	/*		int i=0;
			String data="";
			while((i=fis.read())!=-1) // 파일이 끝날 때까지
			{
				data+=(char)i;
			}
			System.out.println(data);
			*/
			
			BufferedReader br=new BufferedReader(new InputStreamReader(fis)); // 1byte를 2byte로 변경해서 사용하겠다는 뜻
			
			String data="";
			long start=System.currentTimeMillis();
			while(true)
			{
				String s=br.readLine(); // 한줄씩 읽기
				if(s==null)
					break; // 문장이 끝났다는 뜻
				data+=s+"\n";
			}
			long end=System.currentTimeMillis();
			System.out.println(data);
			System.out.println("걸린 시간:"+(end-start));
		}catch(Exception ex)
		{
			ex.printStackTrace(); // 에러 확인 => 복구
		}
		finally
		{
			// 파일 => 서버 => 데이터베이스 연결 => 에러, 정상 => 반드시 닫는다
			try
			{
				fis.close();
			}catch(Exception ex) {}
		}
/*
1|양화진외국인선교사묘원|양화진외국인선교사묘원은 서울 마포구 합정동에 위치한 외국인 선교사들의 공동묘지이다.|04084 서울 마포구 양화진길 46 (합정동, 양화진홍보관)
2|호림박물관 (신사분관)|호림박물관 신사분관은 총 세 개의 건물로 이루어져 있으며, 그중 5층 규모의 박물관동 2, 3, 4층에서 고미술품을 비롯한 현대 작가들의 기획전을 전시하고 있다.|06021 서울 강남구 도산대로 317 (신사동, 호림아트센터 1빌딩)
3|갤러리 학고재|갤러리 학고재는 ‘옛것을 배워 새것을 만든다’는 이념을 담고 있다. 갤러리 학고재의 본관 건물은 전통 한옥으로, 신관 건물은 21세기 건축 양식으로 만들어져 개성 있게 조화를 이루고 있다.|03053 서울특별시 종로구 삼청로 50 (소격동)
...
273|코엑스|이 컨벤션센터는 국제회의와 국제적 리셉션, 업무 세미나와 소규모 회의 같은 대형 이벤트를 제공하는 콘퍼런스홀이 특징이다.|06164 서울 강남구 영동대로 513 (삼성동, 코엑스)

걸린 시간:18

===> 걸린 시간이 18 => 0.018초 걸렸다는 뜻
*/
	}

}
