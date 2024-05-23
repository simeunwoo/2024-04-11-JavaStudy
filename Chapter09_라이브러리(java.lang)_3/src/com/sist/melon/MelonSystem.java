package com.sist.melon;
import java.io.*;
public class MelonSystem {
 
   private static Melon[] musics=new Melon[200];

   static
   {
	   FileReader fr=null;
	   try
	   {
		   // CheckedException => 컴파일시에 예외 감시
		   // => 초기화블록은 throws는 사용이 불가능하다 
		   //             ------ 메소드에서만 사용이 가능 (생성자 포함)
		   fr=new FileReader("c:\\javaDev\\geniegenie.txt");
		   int i=0;
		   StringBuffer sb=new StringBuffer();
		   // 데이터 문자열 결합이 많은 경우 => StringBuffer / StringBulider 
		   //                            비동기            동기 
		   //                           ArrayList      Vector 
		   //String data="";
		   while((i=fr.read())!=-1)
		   {
			   sb.append((char)i);
			   //data+=(char)i;
		   }
		   //System.out.println(data);
		   //System.out.println(sb.toString());
		   // String으로 제어 
		   String data=sb.toString();
		   // 분리=> \n
		   String[] temp=data.split("\n");
		   i=0;
		   for(String s:temp)
		   {
			   String[] m=s.split("\\|"); // |=> 정규식 기호 => 일반 문자로 변경 => \\|
			   // 정규식 => . , + , * , | , ? , ^ , $ 
			   musics[i]=new Melon();
			   musics[i].setMno(Integer.parseInt(m[0]));
			   musics[i].setTitle(m[1]);
			   musics[i].setSinger(m[2]);
			   musics[i].setAlbum(m[3]);
			   musics[i].setPoster(m[4]);
			   musics[i].setKey(m[5]);
			   i++;
		   }
	   }catch(Exception ex)
	   {
		   //  에러 발생시 복구 => 확인 
		   ex.printStackTrace(); // FileNotFoundException / IOException => Exception
	   }
	   finally
	   {
		   try
		   {
			   fr.close();
		   }catch(Exception ex) {}
	   }
   }
   public int musicTotalPage()
   {
	   return (int)(Math.ceil(musics.length/20.0));
	   //               올림함수 이용한다 ==> 10.0 => 10 10.1 => 11
   }
   public Melon[] musicListData()
   {
	   return musics;
   }
   //
   public Melon musicDetailData(int mno)
   {
	   Melon m=new Melon();
	   for(Melon mm:musics)
	   {
		   if(mm.getMno()==mno)
		   {
			   m=mm;
			   break;
		   }
	   }
	   return m;
   }
   // 검색 => java.util 
   public Melon[] musicFindData(String fd)
   {
	   int count=0;
	   for(Melon m:musics)
	   {
		   if(m.getTitle().contains(fd)) // boolean => if
		   {
			   count++;
		   }
	   }
	   
	   Melon[] mm=new Melon[count];
	   int i=0;
	   for(Melon m:musics)
	   {
		   if(m.getTitle().contains(fd))
		   {
			   mm[i]=m;
			   i++;
		   }
	   }
	   return mm;
	   
   }
}