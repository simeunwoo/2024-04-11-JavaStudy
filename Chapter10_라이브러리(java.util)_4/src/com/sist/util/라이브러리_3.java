package com.sist.util;
/*
 * 	데이터를 묶어서 한번에 처리
 * 	= Iterator
 * 		= hasNext() => 위 => 아래
 * 		= next()
 * 		= remove()
 * 		= hasProvious() => 아래 => 위
 */
// => Set / Map => 크롤링 시에 사용
import java.util.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("유재석");
		list.add("박명수");
		list.add("정준하");
		list.add("노홍철");
		list.add("하하");
		
		System.out.println("=== 일반 형식 ===");
		for(String name:list)
		{
			System.out.println(name);
		}
/*
=== 일반 형식 ===
유재석
박명수
정준하
노홍철
하하
 */
		System.out.println("=== 재출력 ===");
		for(String name:list)
		{
			System.out.println(name);
		}
/*
=== 재출력 ===
유재석
박명수
정준하
노홍철
하하
 */
		System.out.println("=== Iterator ===");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			// next() => 데이터를 가지고 온다
			System.out.println(it.next());
		}
/*
=== Iterator ===
유재석
박명수
정준하
노홍철
하하
 */
		System.out.println("=== 재출력 2 ===");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
/*
=== 재출력 2 ===

===> 더 이상 출력되지 않는다
 */
		// 단방향 => 소진이 되면 더 이상 출력할 수 없다 => 따로 다시 설정해야 한다
		System.out.println("=== 다시 출력 ===");
		Iterator<String> it2=list.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
/*
=== 다시 출력 ===
유재석
박명수
정준하
노홍철
하하
 */
		System.out.println("=== ListIterator ===");
		ListIterator<String> it3=list.listIterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}
/*
=== ListIterator ===
유재석
박명수
정준하
노홍철
하하
 */
		System.out.println("=== ListIterator2 ===");
		ListIterator<String> it4=list.listIterator();
		while(it4.hasPrevious())
		{
			System.out.println(it4.previous());
		}
/*
=== ListIterator2 ===
 */
	}

}
