package com.sist.io;
// 데이터 읽기
import java.util.*;
import java.io.*;
public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null;
		try
		{
			// 객체 생성
			FileInputStream fis=new FileInputStream("c:\\java_data\\std.txt");
			ois=new ObjectInputStream(fis);
			ArrayList<Student> list=(ArrayList<Student>)ois.readObject();
			// 제네릭까지 데이터형
			for(Student s:list)
			{
				System.out.println(s.getHakbun()+" "
						+s.getName()+" "
						+s.getKor()+" "
						+s.getEng()+" "
						+s.getMath());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
	}

}
