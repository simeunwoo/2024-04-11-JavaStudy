package com.sist.manager;
import java.io.*;

import com.sist.vo.Genie;

public class GenieManager {
	private static Genie[] genies=new Genie[200];
	
	public GenieManager()
	{
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\geniegenie.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close();
			
			String data=sb.toString();
			
			String[] temp=data.split("\n");
			i=0;
			for(String s:temp)
			{
				String[] genie=s.split("\\|");
				genies[i]=new Genie();
				genies[i].setRank(genie[0]);
				genies[i].setTitle(genie[1]);
				genies[i].setName(genie[2]);
				genies[i].setAlbum(genie[3]);
				genies[i].setPoster(genie[4]);
				
			}
		}catch(Exception ex) {}
	}
	public Genie[] genieListData(int page)
	{
		int total=genieTotalPage();
		int leng=20;
	
		Genie[] genie=new Genie[leng];
		
		int j=0;
		int pagecnt=(20*page)-20;
		
		for(int i=0;i<genies.length;i++)
		{
			if(j<20 && i>=pagecnt)
			{
				genie[j]=new Genie();
				genie[j]=genies[i];
				j++;
			}
		}
		
		return genie;
	}
	
	public int genieTotalPage()
	{
		return (int)(Math.ceil(genies.length/20.0));
	}
	
	// 상세보기
	public Genie genieDetailData(int mno)
	{
		return genies[mno-1];
	}
	
	// 검색
	public Genie[] genieFindData(String title)
	{
		int count=0;
		for(Genie g:genies)
		{
			if(g.getTitle().contains(title))
			{
				count++;
			}
		}
		
		Genie[] genie=new Genie[count]; // 동적
		int i=0;
		for(Genie g:genies)
		{
			if(g.getTitle().contains(title))
			{
				genie[i]=g;
				i++;
			}
		}
		
		return genie;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
