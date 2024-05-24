package com.sist.util;
import java.util.*;
public class 컬렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>(); // 가변형
		// 추가 => 문자열만 추가
		names.add("심은우"); // 0
		names.add("정유엽"); // 1
		names.add("홍성용"); // 2
		names.add("메시"); // 3
		names.add("호날두"); // 4
		
		System.out.println("=== 저장된 데이터 출력 ===");
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i);
			System.out.println(i+":"+name);
		}
/*
=== 저장된 데이터 출력 ===
0:심은우
1:정유엽
2:홍성용
3:메시
4:호날두
 */
		System.out.println("=== 데이터 추가 후에 인덱스 확인 ===");
		// 추가 => 마지막에 추가를 해야 속도가 빨라진다
		names.add("즐라탄 이브라히모비치"); // 5
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i);
			System.out.println(i+":"+name);
		}
/*
=== 데이터 추가 후에 인덱스 확인 ===
0:심은우
1:정유엽
2:홍성용
3:메시
4:호날두
5:즐라탄 이브라히모비치
 */
		System.out.println("=== 지정된 위치에 추가 ===");
		// add() => 오버로딩 => add(String), add(int index, String)
		names.add(3,"펠레"); // 인덱스 3번 추가 => 뒤에 있는 데이터는 인덱스가 1개씩 증가 (자동)
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i);
			System.out.println(i+":"+name);
		}
/*
=== 지정된 위치에 추가 ===
0:심은우
1:정유엽
2:홍성용
3:펠레
4:메시
5:호날두
6:즐라탄 이브라히모비치
 */
		System.out.println("=== 데이터 수정 ===");
		// set(int index, String)
		names.set(1, "정유엽 수정");
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i);
			System.out.println(i+":"+name);
		}
/*
=== 데이터 수정 ===
0:심은우
1:정유엽 수정
2:홍성용
3:펠레
4:메시
5:호날두
6:즐라탄 이브라히모비치
 */
		System.out.println("=== 데이터 삭제 ===");
		names.remove(2); // 2번은 삭제 => 3번부터의 인덱스 번호가 감소
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i);
			System.out.println(i+":"+name);
		}
/*
=== 데이터 삭제 ===
0:심은우
1:정유엽 수정
2:펠레
3:메시
4:호날두
5:즐라탄 이브라히모비치
 */
		System.out.println("현재 인원:"+names.size()); // 현재 인원:6
		
		System.out.println("=== 전체 삭제 ===");
		names.clear();
		System.out.println("현재 인원:"+names.size()); // 현재 인원:0
	}

}
