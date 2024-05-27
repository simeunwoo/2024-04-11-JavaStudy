package com.sist.io;
import java.io.*;
import java.util.*;
import java.text.*;
/*
 * 	File 관련
 * 
 * 	1. 생성자 => 경로명 : 폴더 정보 읽기
 * 				File dir=new File("c:\\javaDev");
 * 			=> 경로명/파일명 : 파일에 대한 정보
 * 				File dir=new File("c:\\javaDev\\파일명");
 * 
 * 	2. 폴더 생성 : mkdir
 * 	   파일 생성 : createNewFile()
 * 
 * 	3. 폴더 삭제 : delete() => 폴더 안에 파일/폴더가 있는 경우 => 삭제가 안된다 => 먼저 폴더 안에 있는 파일/폴더를 삭제 후에 최종 삭제를 해야 한다
 *     파일 삭제 : delete() => 삭제
 *     
 *  4. 폴더 안에 있는 파일/폴더의 정보 읽기 : listFiles() : File[]
 *  
 *  5. 파일명 : getName(), 경로명 : getPath()
 *  
 *  6. 파일 크기 : length()
 */
public class 라이브러리_4 {
	// 코딩이 된 상태 => throws
	// 코딩이 시작 => try~catch
	// io/sql/net => 클래스 => CheckedException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		try
		{
			File dir=new File("c:\\javaDev");
			
			// 파일 정보 읽기
			File[] list=dir.listFiles(); // c:\\javaDev에 있는 모든 파일 읽기
			
			for(File file:list)
			{
				if(file.isFile()) // 파일이라면
				{
					System.out.print(file.getName()+"     ");
					String s=file.length()/1024!=0?file.length()/1024+"KB":file.length()+"Bytes";
					System.out.print(file.length()+"bytes     ");
					System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
					System.out.println();
				}
				else // 디렉토리(폴더)라면
				{
					System.out.print(file.getName()+"     ");
					System.out.print("파일 폴더     ");
					System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
					System.out.println();
				}
			}
		}catch(Exception ex) {} */
/*
apache-tomcat-9.0.88     파일 폴더     2024-04-09 01:22:30
eclipse-jee-2024-03-R-win32-x86_64     파일 폴더     2024-04-11 10:20:40
geniegenie.txt     42923bytes     2024-05-10 03:18:01
git.txt     40bytes     2024-04-11 10:44:02
javaStudy     파일 폴더     2024-05-27 11:33:30
jsoup-1.17.2.jar     445706bytes     2024-04-18 02:11:00
lombok-1.18.32.jar     2046305bytes     2024-05-08 09:03:45
MainClass.class     424bytes     2024-04-11 09:46:07
MainClass.java     134bytes     2024-04-11 11:43:44
movie.txt     558907bytes     2024-04-11 02:37:21
movie2.txt     465597bytes     2024-04-11 02:25:50
말달리자.gif     148467bytes     2024-04-17 11:38:59
 */
		try
		{
			File dir=new File("c:\\javaDev");
			
			// 파일 정보 읽기
			File[] list=dir.listFiles();
			
			for(File file:list)
			{
				if(file.isFile())
				{
					System.out.print(file.getName()+"     ");
					String s=file.getName();
					s=s.substring(s.lastIndexOf(".")+1); // 확장자
					System.out.println(s+"파일");
				}
				else
				{
					
				}
			}
		}catch(Exception ex) {}
/*
geniegenie.txt     txt파일
git.txt     txt파일
jsoup-1.17.2.jar     jar파일
lombok-1.18.32.jar     jar파일
MainClass.class     class파일
MainClass.java     java파일
movie.txt     txt파일
movie2.txt     txt파일
말달리자.gif     gif파일
 */
	}

}
