package com.sist.io;
// FileReader
import java.io.*;
public class 라이브러리_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\java_data\\데이터모음\\seoul_location.txt");
			// 파일 자동 생성이 안된다 => FileWriter / FileOutputStream
			
			int i=0;
			long start=System.currentTimeMillis();
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			long end=System.currentTimeMillis();
			System.out.println(data);
			System.out.println("걸린 시간:"+(end-start));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
/*
1|양화진외국인선교사묘원|양화진외국인선교사묘원은 서울 마포구 합정동에 위치한 외국인 선교사들의 공동묘지이다.|04084 서울 마포구 양화진길 46 (합정동, 양화진홍보관)
2|호림박물관 (신사분관)|호림박물관 신사분관은 총 세 개의 건물로 이루어져 있으며, 그중 5층 규모의 박물관동 2, 3, 4층에서 고미술품을 비롯한 현대 작가들의 기획전을 전시하고 있다.|06021 서울 강남구 도산대로 317 (신사동, 호림아트센터 1빌딩)
3|갤러리 학고재|갤러리 학고재는 ‘옛것을 배워 새것을 만든다’는 이념을 담고 있다. 갤러리 학고재의 본관 건물은 전통 한옥으로, 신관 건물은 21세기 건축 양식으로 만들어져 개성 있게 조화를 이루고 있다.|03053 서울특별시 종로구 삼청로 50 (소격동)
...
273|코엑스|이 컨벤션센터는 국제회의와 국제적 리셉션, 업무 세미나와 소규모 회의 같은 대형 이벤트를 제공하는 콘퍼런스홀이 특징이다.|06164 서울 강남구 영동대로 513 (삼성동, 코엑스)

걸린 시간:18

===> 걸린 시간이 166 => 0.166초 걸렸다는 뜻
*/
	}

}
