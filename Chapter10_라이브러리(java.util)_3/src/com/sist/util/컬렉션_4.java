package com.sist.util;
import java.util.*;
public class 컬렉션_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("홍길동");
		names1.add("유재석");
		names1.add("박명수");
		names1.add("정준하");
		names1.add("노홍철");
		
		System.out.println("=== names1 출력 ===");
		
		for(String name:names1)
		{
			System.out.println(name);
		}
/*
=== names1 출력 ===
홍길동
유재석
박명수
정준하
노홍철
 */
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("홍길자");
		names2.add("유재순");
		names2.add("박명수");
		names2.add("정준하");
		names2.add("노홍찬");
		
		System.out.println("=== names2 출력 ===");
		
		for(String name:names2)
		{
			System.out.println(name);
		}
/*
=== names2 출력 ===
홍길자
유재순
박명수
정준하
노홍찬
 */
		System.out.println("=== 데이터 복사 ===");
		
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1); // 전체를 데이터 추가
		
		for(String name:temp)
		{
			System.out.println(name);
		}
/*
=== 데이터 복사 ===
홍길동
유재석
박명수
정준하
노홍철
 */
		System.out.println("=== 교집합 ==="); // 오라클 => INTERSECT => JOIN (INNER JOIN)
		temp.retainAll(names2); // => GenieMusic, Melon
		
		for(String name:temp)
		{
			System.out.println(name);
		}
/*
=== 교집합 ===
박명수
정준하
 */
		System.out.println("=== 차집합 ==="); // 오라클 => MINUS => OUTER JOIN (LEFT, RIGHT)
		ArrayList<String> temp2=new ArrayList<String>();
		temp2.addAll(names1);
		temp2.removeAll(names2);
		
		for(String name:temp2)
		{
			System.out.println(name);
		}
/*
=== 차집합 ===
홍길동
유재석
노홍철
 */
		/*
		 * 		1 2 3 4 5 => A
		 * 		3 5 7 8 9 => B
		 * 
		 * 	A와 B의 교집합 => 3 5 => retainAll()
		 * 
		 * 	A-B 차집합 => A만 가지고 있는 데이터 => 1 2 4 => removeAll()
		 * 
		 * 	B-A 차집합 => B만 가지고 있는 데이터 => 7 8 9 => removeAll()
		 */
		
		ArrayList<String> names3=new ArrayList<String>(names1.subList(0,3));
		/*
		 * 			subList(0,3) => 마지막 번호는 제외 => 0, 1, 2
		 * 			------------ 부분적 복사 => ex) 인기 순위 잘라오기, 1번 부터 최신 것 몇개 ...
		홍길동 0
		유재석 1
		박명수 2
		정준하 3
		노홍철 4
		 */
		System.out.println("=== 부분적 복사 === subList(시작 인덱스,마지막 인덱스) ===");
		
		for(String name:names3)
		{
			System.out.println(name);
		}
		// JOIN => ArrayList
/*
=== 부분적 복사 === subList(시작 인덱스,마지막 인덱스) ===
홍길동
유재석
박명수
 */
	}

}
