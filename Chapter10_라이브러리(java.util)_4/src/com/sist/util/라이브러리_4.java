package com.sist.util;
import java.util.*;
/*
 * 	1. ArrayList
 * 	------------------
 * 	2. HashSet
 * 	3. HashMap
 * 	------------------ Iterator를 주로 이용한다
 * 	4. Properties
 */
public class 라이브러리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("사과");
		set.add("배");
		set.add("수박");
		set.add("파인애플");
		set.add("참외");
		// => 실무에서 한번만 쓰고 버릴 때 => 주로 iterator() 사용
		// set/map => list는 주로 for-each
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
/*
배
수박
사과
참외
파인애플

===> Set이라 순서는 정해지지 않는다
 */
	}

}
