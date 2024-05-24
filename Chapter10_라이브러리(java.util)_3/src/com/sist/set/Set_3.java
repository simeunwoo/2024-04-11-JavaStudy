package com.sist.set;
import java.util.*;
public class Set_3 {
static class Student
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode(); // 메모리 주소
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student)
		{
			// instanceof => 객체 비교
			// 오른쪽이 크거나 같으면 true
			// 객체명 instanceof 클래스
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return false;
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set=new HashSet<Student>();
		Student s1=new Student("홍길동",20);
		Student s2=new Student("홍길동",20);
		
		System.out.println("s1="+s1.hashCode());
		// s1=com.sist.set.Set_3$Student@515f550a => s1=com.sist.set.Set_3$Student@1db8166c (hashCode() 효과)
		System.out.println("s2="+s2.hashCode());
		// s2=com.sist.set.Set_3$Student@7b1d7fff => s2=com.sist.set.Set_3$Student@1db8166c (hashCode() 효과)
		
		set.add(s1);
		set.add(s2);
		
		for(Student ss:set)
		{
			System.out.println(ss.getName()+","+ss.getAge());
		}
/*
홍길동,20

===> equals() 덕에 중복 출력을 제거할 수 있게 됨
 */
		// 클래스의 객체를 찾기
		String ss="";
		Object obj=new Object();
		StringBuffer sb=new StringBuffer();
		if(ss instanceof Object)
			System.out.println("String 클래스는 Object보다 작다"); // String 클래스는 Object보다 작다
		if(obj instanceof String) // => 수행 X
			System.out.println("Object 객체는 String보다 작다");
		if(sb instanceof Object)
			System.out.println("StringBuffer 클래스는 Object보다 작다"); // StringBuffer 클래스는 Object보다 작다
//		if(ss instanceof StingBuffer) => 오류
//			System.out.println("StringBuffer 클래스는 Object보다 작다");
		/*
		 * 	Object
		 * 	|
		 * 	-------------
		 * 	|			|
		 * 	String		StringBuffer
		 * 	------------------------- 비교가 불가능 => 클래스 비교 (상속, 포함)
		 * 
		 * 	상속 : 상속을 내리는 클래스 > 상속을 받는 클래스
		 * 	포함 : 포함하고 있는 클래스 > 포함되어 있는 클래스
		 * 
		 * 	instanceof
		 * 	=> 예)
		 *	animal instanceof Animal: animal 객체가 Animal 클래스의 인스턴스인지 확인
		 */
	}

}
