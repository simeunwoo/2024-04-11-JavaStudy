package com.sist.util;
import java.util.*;
// 사용자 정의
public class 컬렉션_3 {
static class Student
{
	private int hakbun;
	private String name;
	private int kor,eng,math;
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
	
	// 자동으로 디폴트 생성자가 생성이 안된다 ...
	// 사용자 입력값을 받아서 초기화
	public Student(int hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 매개 변수가 있는 생성자가 있는 경우에는 디폴트 생성자를 만들어 놓고 시작한다 (그래야 제어가 편리)
	public Student()
	{
		// 초기화 => 모든 학생 정보가 같은 값을 가지고 저장이 된다
	}
	// 데이터 추가
	
}

class A
{
	int a,b;
	public A()
	{
		a=10;
		b=20;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		// Object => Student 변경
		list.add(new Student(1, "홍길동", 90, 80, 70));
		list.add(new Student(2, "박문수", 70, 87, 73));
		list.add(new Student(3, "이순신", 74, 90, 70));
		list.add(new Student(4, "이산", 22, 65, 77));
		list.add(new Student(5, "심청이", 90, 40, 85));
		System.out.println("=== 데이터 출력 ===");
		// 배열/컬렉션 => for-each를 이용하여 출력
		/*
		 * 	%d => 정수
		 * 	%f => 실수
		 * 	%c => 문자
		 * 	%s => 문자열
		 * 
		 * 	%-3d
		 * 		000
		 * 		1--
		 * 
		 * 	%3d
		 * 		000
		 * 		--1
		 */
		for(Student std:list)
		{
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
			// 웹 => String.format("%-3d%-5s%-5d%-5d%-5d\n")
		}
/*
=== 데이터 출력 ===
1  홍길동  90   80   70   
2  박문수  70   87   73   
3  이순신  74   90   70   
4  이산   22   65   77   
5  심청이  90   40   85  
 */
		
		System.out.println("=== 데이터 추가 ===");
		
		// Student 추가
		Student s=new Student();
		
		s.setHakbun(6);
		s.setName("강감찬");
		s.setKor(78);
		s.setEng(90);
		s.setMath(100);
		list.add(s);
		
		for(Student std:list)
		{
			
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
			
		}
/*
=== 데이터 추가 ===
1  홍길동  90   80   70   
2  박문수  70   87   73   
3  이순신  74   90   70   
4  이산   22   65   77   
5  심청이  90   40   85   
6  강감찬  78   90   100 
 */
		
		System.out.println("=== 데이터 추가 2 ===");
		list.add(new Student(7, "춘향이", 89, 80, 91));
		
		for(Student std:list)
		{
			
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
			
		}
/*
=== 데이터 추가 2 ===
1  홍길동  90   80   70   
2  박문수  70   87   73   
3  이순신  74   90   70   
4  이산   22   65   77   
5  심청이  90   40   85   
6  강감찬  78   90   100  
7  춘향이  89   80   91  
 */
		
		System.out.println("=== 데이터 출력 ===");
		
		for(int i=0;i<list.size();i++)
		{
			Student std=list.get(i); // 형변환 없이 사용 가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
			
		}
/*
=== 데이터 출력 ===
1  홍길동  90   80   70   
2  박문수  70   87   73   
3  이순신  74   90   70   
4  이산   22   65   77   
5  심청이  90   40   85   
6  강감찬  78   90   100  
7  춘향이  89   80   91  
 */
		
		System.out.println("=== 학생 수정 ===");
		list.set(1, new Student(2,"수정",90,96,97));
		
		for(int i=0;i<list.size();i++)
		{
			Student std=list.get(i); // 형변환 없이 사용 가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getMath());
			
		}
/*
=== 학생 수정 ===
1  홍길동  90   80   70   
2  수정   90   96   97   
3  이순신  74   90   70   
4  이산   22   65   77   
5  심청이  90   40   85   
6  강감찬  78   90   100  
7  춘향이  89   80   91 
 */
	}

}
