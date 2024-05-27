package com.sist.io;
import java.io.*;

public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 폴더 생성
		File dir=new File("c:\\java_project");
		
		// 생성 여부 확인
/*		if(!dir.exists())
		{
			dir.mkdir();
			System.out.println("폴더가 생성되었다");
		}
		else
		{
			System.out.println("이미 존재하는 폴더");
		} */
		
		// 삭제 여부 확인
		if(dir.exists())
		{
			dir.delete();
			System.out.println("폴더가 삭제되었다");
		}
		else
		{
			System.out.println("이미 존재하지 않는 폴더");
		}
	}

}
