package com.sist.controller;
/*
 * 	패키지 => 관련된 클래스를 모아서 검색이 쉽게
 * 	---- import를 사용하여 불러온다
 * 	---- 패키지가 있어야 분업이 가능 => 여러명이 동시에 작업
 * 
 * 	패키지명 : 키워드는 사용 불가능
 * 	com(org).회사명.클래스기능
 * 	---------------------
 * 	com.sist.int => 오류
 * 			 ---
 * 	=> 소문자로 사용
 * 	=> 숫자는 앞에 사용 금지
 * 	=> 공백을 사용할 수 없다
 * 	=> 특수문자 (_,$) => 보통 사용하지 않는다
 * 	=> 패키지는 폴더 단위 => 다른 이름의 패키지 안에는 같은 이름의 클래스가 가능
 * 	=> 클래스를 기능별 분리
 * 	controller / dao / manager / vo ...
 * 		controller : 제어 (연결)
 * 		dao : 데이터 관리
 * 		manager : 외부에서 데이터 읽기 (파일, 크롤링)
 * 		vo : 사용자 정의 데이터형을 모아준다
 * 
 * 		# 네트워크
 * 		-----------
 * 		server
 * 		-----------
 * 		client
 * 		-----------
 * 		commons
 * 		-----------
 * 
 * 		# 웹
 * 		-----------
 * 		user
 * 		-----------
 * 		admin
 * 		-----------
 * 
 * 		=> 패키지는 폴더
 * 		   자바 자료 => 오라클 정리, 웹
 * 		   오라클 자료
 * 		   웹 자료
 * 		=> 관련된 클래스를 모아서 관리 => 쉽게...
 * 
 * 		=> private / public
 * 			private : 멤버변수 (손실, 변경 방지)
 * 			public : 클래스, 메소드, 생성자
 * 			------------------------------ 다른 클래스에서 사용 불가능
 * 										=> 기능을 설정 (메소드)
 * 			읽기 (get변수명()) / 저장 (set변수명())
 * 	
 * 		### 회원 (*** 비공개가 필요한 중요 정보일 경우)
 * 		id ***
 * 		pwd ***
 * 		name ***
 * 		sex 
 * 		birthday ***
 * 		email ***
 * 		tel ***
 * 		address
 * 		content
 * 		동의 여부
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
