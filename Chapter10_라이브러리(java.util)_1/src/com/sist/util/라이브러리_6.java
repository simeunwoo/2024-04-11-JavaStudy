package com.sist.util;

import java.util.StringTokenizer;

// StringTokenizer : 문자열 분리
/*
 * 	nextToken() : 분리된 데이터를 가지고 오는 경우
 * 	hasMoreTokens() : 분리된 데이터만큼 루프
 * 	counterToken() : 분리된 개수
 */
public class 라이브러리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors="red,green,blue,black,white,yellow,magenta,pink,gray";
		StringTokenizer st=new StringTokenizer(colors,",");
		// new StringTokenizer(colors) => 공백
		System.out.println("color의 개수:"+st.countTokens()); // 9개가 된다
		
/*		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken()); */
/*
color의 개수:9
red
green
blue
black
white
yellow
magenta
pink
gray
 */
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		System.out.println("color의 개수:"+st.countTokens()); // 0개가 된다
/*
red
green
blue
black
white
yellow
magenta
pink
gray
color의 개수:0
 */
		/*
		 * 	hasMoreTokens() => 329page => 이미지 => 전체 분리된 데이터를 가지고 올 떄
		 * 
		 * 	--- cunsor ----------------
		 * 	before / first
		 * 	---------------------------
		 * 	red => st.nextToken() => true
		 * 	---------------------------
		 * 	green => st.nextToken() => true
		 * 	---------------------------
		 * 	blue => st.nextToken() => true
		 * 	---------------------------
		 * 	...
		 * 	---------------------------
		 * 	after / last st.nextToken() => false => 종료
		 * 	---------------------------
		 */
	}

}
