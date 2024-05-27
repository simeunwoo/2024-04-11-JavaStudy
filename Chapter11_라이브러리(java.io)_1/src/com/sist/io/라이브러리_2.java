package com.sist.io;
import java.util.*;
import java.io.*;

public class 라이브러리_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 파일 생성 => 같은 폴더에는 같은 파일명이 생성되지 않는다 (당연한 거임) => 파일은 중복이 안되니 => 파일이 구분자가 될 수 있다
		File file=new File("c:\\java_data\\student.txt");
		
		// 생성 여부 확인
		if(!file.exists()) // 파일이 없다면 (! 유의)
		{
			// 파일을 만든다
			file.createNewFile(); // CheckException => 반드시 예외 처리
			System.out.println("파일이 생성되었다");
		}
		else
		{
			System.out.println("이미 존재하는 파일");
		}
	}

}
