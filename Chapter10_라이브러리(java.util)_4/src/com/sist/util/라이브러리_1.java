package com.sist.util;
/*
 * 	java.util : 가장 많이 사용되는 라이브러리
 * 
 * 	=> 난수 : Random => 정수, 지정된 범위
 * 		1. 객체 생성 : Random r=new Random()
 * 		2. 난수 발생 : r.nextInt(100) => 100은 제외 (0~99)
 * 		웹 : 예약일 / 예약 시간 => 난수 활용
 * 
 * 	=> 날짜 : Date / Calendar
 * 		Date : 기능이 없다 => 오라클 / MySQL에서 전송하는 날짜를 받는 경우 (데이터베이스 호환)
 * 		Calendar : 기능 부여 (요일, 마지막 날짜 ...) => 달력 제작
 * 
 * 	=> 변환 : 날짜 변환 / 숫자 변환 => java.text
 * 		날짜 변환 : SimpleDateFormat => format() => 패턴 : new SimpleDateFormat("yyyy/MM/dd")
 * 			=> 연도 : yy/yyyy
 * 			=> 월 : MM/M
 * 			=> 일 : dd/d
 * 			=> 시 : hh/h
 * 			=> 분 : mm/m
 * 			=> 초 : ss/s
 * 		숫자 변환 : DecimalFormat => format() => 패턴 : new DecimalFormat("###,###,###") => 오라클 : (9,999,999)
 * 
 * 	=> 데이터 관리 : 컬렉션 => 자료 구조
 * 		데이터를 쉽고 효율적으로 관리할 수 있게 표준화된 라이브러리 : 컬렉션 프레임워크
 * 		단점 : 모든 데이터를 저장해서 관리할 수 있게 만들어져 있다
 * 			=> 1) 기본형, 2) 클래스 => Object
 * 		Object의 단점
 * 			=> 형변환 후에 사용
 * 			=> 어떤 데이터가 첨부되어 있는지 모름 (가독성이 떨어진다)
 * 		Object의 단점 보완
 * 			=> 형변환 없이 사용 => 소스가 간결해진다 => 제네릭
 * 			=> 가독성이 좋게 만든다
 * 		Generic (제네릭)
 * 			=> 데이터형을 통일화 => <클래스형> => 기본형은 사용할 수 없다 : <int> (X), <double> (X) : Wrapper를 제공
 * 			=> 기본형을 클래스화
 * 				int = Integer
 * 				double = Double
 * 				boolean = Boolean
 * 				=> 1) 제네릭을 사용할 수 있다
 * 				=> 2) 기본형에 기능을 부여
 * 				=> 3) parseInt(), parseDouble(), parseBoolean()
 * 				=> 웹이나 윈도우 => String만 사용 가능 => String을 기본형으로 변경 가능
 * 			=> 데이터를 통일 : 제네릭을 사용하지 않으면 => 모든 메소드의 리턴형과 매개 변수가 Object
 * 				=> Object를 프로그램에서 필요한 데이터형으로 한번에 변경
 * 				=> 사용자 정의 클래스도 가능하다
 * 				=> class Movie
 * 				=> <Movie>
 * 
 * 	컬렉션 : 데이터 관리 (메모리)
 * 		1) 읽기 : 데이터를 가지고 온다
 * 		2) 추가
 * 		---------------------------
 * 		3) 수정
 * 		4) 삭제
 * 		5) 검색
 * 		--------------------------- 데이터가 구분
 * 		=> List : 인덱스
 * 		   set(int index,추가할 데이터)
 * 		   remove(int index)
 * 		=> Set : 인덱스가 없다
 *			=> 실제 저장된 데이터가 구분자다 => 중복이 있으면 안된다
 *		=> Map : 키
 *			키, 값을 쌍으로 저장
 *			키는 중복이 없다 / 값을 중복 허용
 *		=> 오라클 : primary key => 중복이 없는 데이터
 *			id => 회원 가입 : id 중복 체크
 *			=> 번호 (자동 증가 번호)
 * 
 * 	컬렉션 클래스 종류
 * 
 * 	        Collection : interface
 *               |
 * 	-----------------------------------
 * 	|                |                |  : interface
 * 	List            Set              Map
 * 
 * 	# List
 * 		*** ArrayList
 * 		LinkedList - Queue
 * 		Vector
 * 
 * 	# Set
 * 		*** HashSet
 * 		TreeSet
 * 	# Map
 *  	*** HashMap
 *  	Hashtable
 *  
 *  # List
 *  	1) 순서를 가지고 있다 (인덱스 = 자동 처리) => 순차적으로 저장
 *  	2) 중복 데이터 저장을 허용
 *  	3) 주로 사용처 => 데이터베이스 (오라클) *** 웹은 데이터베이스가 핵심이다
 *  	4) 구현된 클래스
 *  	=> ArrayList
 *  		비동기화 처리 (계속 저장만 ...)(순서 없이 읽어오는대로 저장) => 데이터베이스(오라클)에 저장된 데이터를 읽어서 브라우저에 전송
 *  		속도가 빠르다
 *  	=> Vector
 *  		동기화 => 저장이 완료가 되면 다음 저장 : 네트워크의 접속자 정보 (IP, PORT)
 *  		속도가 느리다 => 보완 (ArrayList)
 *  	=> LinkedList / Queue / Stack
 *  		사용 빈도가 거의 없다
 *  	5) ArrayList / Vector / LinkedList는 List라는 인터페이스를 구현
 *  		메소드가 동일 (표준화)
 *  		주요 기능
 *  		= *** add() : 추가
 *  		= remove() : 삭제
 *  		= set() : 수정
 *  		= *** get() : 읽기
 *  		= *** size() : 저장된 개수 확인
 *  		= *** isEmpty() : 데이터의 존재 여부
 *  		= *** clear() : 전체 데이터 삭제
 *  
 *  # Set
 *  	1) 순서가 없다
 *  	2) 데이터 중복을 허용하지 않는다
 *  	3) 구현한 클래스
 *  	=> HashSet
 *  		중복 없는 데이터를 저장
 *  		웹에서 채팅을 할 때 => 접속자 관리
 *  		add(), remove(), clear(), isEmpty()
 *  	=> TreeSet : 검색 속도가 빠르다 => 애플리케이션
 *  
 *  # Map
 *  
 *  # Properties
 *  		
 */
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}