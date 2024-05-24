package com.sist.util;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 	ArrayList
 * 	=> add(), remove(), set(), size(), get(), isEmpty(), clear()
 * 	=> ArrayList에는 1개만 저장
 * 	=> ArrayList가 2개 이상인 경우 => JOIN
 * 		= retainAll() : 2개의 List에서 같은 값을 읽어 오는 경우 => ex) 장바구니 => 중복 구매 
 * 		= addAll() : 전체 데이터를 복사
 * 		= removeAll() : 한쪽에 없는 데이터만 출력
 * 		= subList() : 부분 복사
 * 		= asList() : 배열 => ArrayList로 변경
 * 		------------------------------------ 교재에 없는 내용
 */
public class 컬렉션_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		// addAll() => set => 복사가 가능
		for(String s:list)
			System.out.print(s+" "); // A B C D E 
		System.out.println();
		// asList는 클래스는 첨부 불가능 => 기본형 / String만
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		for(String s:list2)
			System.out.print(s+" "); // A B C D E 
	}

}
