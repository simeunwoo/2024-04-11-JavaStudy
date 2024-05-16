package com.sist.music;
import java.io.*;
public class GenieMusic extends MusicSystem {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\geniegenie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) // 파일의 끝
			{
				sb.append((char)i);
			}
			fr.close();
			
			// buffer => 임시 기억 장소 => 누적
			String data=sb.toString();
			// String은 문자의 제한이 없다
			String[] mdata=data.split("\n");
			i=0;
			for(String s:mdata) {
		//		System.out.println(s);
				if(i>50) break;
				
				musics[i]=new Music();
				String[] temp=s.split("\\|"); // 정규식 => ^, $, ., ?, |, +, *
				/*
				 * 	21|
				 * 	사건의 지평선|
				 * 	윤하 (YOUNHA)|
				 * 	YOUNHA 6th Album Repackage 'END THEORY : Final Edition'|
				 * 	//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/614/128/82614128_1648619377015_1_140x140.JPG/dims/resize/Q_80,0|BBdC1rl5sKY\u0026pp=ygUT7IKs6rG07J2YIOyngO2PieyEoA%3D%3D
				 */
				musics[i].setMno(temp[0]);
				musics[i].setTitle(temp[1]);
				musics[i].setSinger(temp[2]);
				musics[i].setAlbum(temp[3]);
				musics[i].setPoster(temp[4]);
				
				i++;
			}
		}catch(Exception ex) {}
	}

}
