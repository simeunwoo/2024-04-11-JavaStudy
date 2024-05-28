package com.sist.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * 	ObjectInputStream / ObjectOutputStream
 *  => 객체 단위 저장
 *     ----------
 *      
 *      직렬화             역직렬화
 *                     ----------
 *                       -----
 *                       -----
 *                       -----
 *                       -----
 *                       -----
 *                     ----------
 *  ------------------------------
 *    |     |     |     |     |    ===> 직렬화
 *  ------------------------------     
 */
class Student implements Serializable // Serializable : 직렬화
{
	private int hakbun;
	private String name;
	private int kor,eng,math;
	public Student(int hakbun, String name, int kor, int eng, int math) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 디폴트 생성자
	public Student() {}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"홍길동",90,87,70));
		list.add(new Student(2,"이순신",70,64,78));
		list.add(new Student(3,"심청이",91,80,80));
		list.add(new Student(4,"김두한",92,88,89));
		list.add(new Student(5,"박문수",90,85,93));
		// 객체 단위 저장 => list를 통으로 저장
		ObjectOutputStream oos=null;
		try
		{
			File file=new File("c:\\java_data\\std.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			// ObjectOutputStream 생성 => FileOutputStream
			FileOutputStream fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
		}
		catch(Exception ex)
		{
			ex.printStackTrace(); // 에러 확인
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}

}
