package com.sist.set;
import java.util.*;
/*
	 * 	List
	 * 	|
	 * 	ArrayList
 */
public class Set_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"홍길동","이순신","심청이","춘향이","박문수","강감찬",
				"을지문덕","이순신","춘향이","이산","김두한"
		};
		// 배열을 ArrayList로 변경
		List<String> list=Arrays.asList(names);
		// 리턴형 => 클래스형 (상위, 하위) => 형변환을 해야 한다
		System.out.println("=== ArrayList ===");
		
		for(String name:list)
		{
			System.out.println(name);
		}
/*
=== ArrayList ===
홍길동
이순신
심청이
춘향이
박문수
강감찬
을지문덕
이순신
춘향이
이산
김두한
 */
		
		// 중복을 제거한 다음에 출력
		// => ArrayList
		
		// 1. 중복 제거
		Set<String> set=new HashSet<String>();
		set.addAll(list);
		
		// 2. list에 저장
		ArrayList<String> list2=new ArrayList<String>();
		list2.addAll(set);
		
		System.out.println("=== 중복 제거 후 ArrayList ===");
		
		for(String name:list2)
		{
			System.out.println(name);
		}
/*
=== 중복 제거 후 ArrayList ===
홍길동
이산
심청이
을지문덕
김두한
춘향이
강감찬
이순신
박문수

(===> 중복 제거를 하고 나면 보통 순서는 무작위로 나온다)
 */
	}

}
