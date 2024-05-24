package com.sist.util;
import java.util.*;
// 사용자 정의
public class 컬렉션_3 {
class Student
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

	}

}
