package com.sist.util;
/*
 * 	컬렉션 => 데이터 관리 (배열을 대처)
 *                   ---------
 *                   고정 (먼저 메모리 크기를 만들어서 관리 => 추가, 삭제가 어렵다)
 *                                                  ---------------
 *                                                  배열을 새롭게 형성 => copyOf => 보완
 *	= 종류
 *		1) 데이터 중복 가능 여부
 *			데이터 중복 허용 : List => ArrayList, Map => HashMap
 *			데이터 중복 허용 (X) : Set
 *		2) 인덱스 이용 여부
 *			인덱스 사용 => ArrayList
 *			실제 값 사용 => HashSet
 *			key 사용 => HashMap
 *			=> 중복을 허용하지 않는다
 *		*** 데이터 관리 => 반드시 필요 => 구분자
 *	= List
 *		=> 단방향 포인트를 가지고 있다
 *		=> 수정, 삭제가 없는 프로그램을 제작 (데이터베이스)
 *		=> 데이터를 모아서 브라우저에 전송 목적
 *		=> 조회가 간편하다, 검색을 빠르다, 추가를 맨 뒤에 추가하면 속도가 빠르다
 *		=> 웹의 50% => ArrayList
 *	= Map
 *		=> 관리 => 쿠키, 세션, 클래스 관리
 *                         -------- 스프링
 *	= Set
 *		=> 중복 제거 => DISTINCT
 *		=> 코딩 테스트, 웹소켓
 */
public class 컬렉션_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
