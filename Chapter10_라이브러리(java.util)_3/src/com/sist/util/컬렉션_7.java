package com.sist.util;

import java.util.ArrayList;

/*
 *	ArrayList
 *	---------
 *	1. 데이터 중복을 허용 (오라클은 데이터 중복 허용)
 *		=> 구분자 : 인덱스로 구분한다 (자동 추가, 자동 관리) => 0~ (순차적으로 만들어준다)
 *		오라클 => id, 게시물 번호, 영화 번호, 장바구니 번호
 *		=> 중복이 없는 데이터 첨부 => PRIMARY KEY
 *		=> 자동으로 인덱스 번호가 추가되지 않는다
 *
 *	2. 기능 (메소드) => 라이브러리는 메소드
 *		1) *** 추가 => add(데이터)
 *		2) 수정 => set(int index,데이터)
 *		3) 삭제 => remove(int index)
 *		4) *** 저장 개수 => size() => 댓글, 장바구니 ...
 *		5) *** 읽기 => get(int index)
 *		6) *** 전체 삭제 : clear()
 *		7) *** 데이터 존재 여부 : isEmpty()
 *
 *	3. ArrayList가 여러개인 경우
 *		영화 목록 / 예약 목록
 *		쇼핑 목록 / 결제
 *      -------  ---- 상품 번호 / ID
 *      1) 상품명
 *      2) 가격
 *      3) 상품 번호
 *      파일 = 테이블
 *      ---------------------------
 *      => retainAll() : 교집합
 *      => removeAll() : 차집합
 *      => addAll() : 전체 복사
 *      => subList() : 부분적 복사
 *      --------------------------- JOIN, SUBQUERY => 여러개의 테이블 연동
 */
public class 컬렉션_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("유재석");
		list.add("박명수");
		list.add("정준하");
		list.add("유재석");
		list.add("유재석");
		System.out.println("현재 저장된 개수:"+list.size()); // 현재 저장된 개수:5
		list.remove("유재석");
		System.out.println("현재 저장된 개수:"+list.size()); // 현재 저장된 개수:4 => 오잉??? => 중복의 문제가 있음
	}

}
