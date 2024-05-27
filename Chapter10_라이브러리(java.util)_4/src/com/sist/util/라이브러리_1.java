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
 *  	=> TreeSet
 *  		검색 속도가 빠르다 => 애플리케이션
 *  
 *  # Map (349page)
 *  	key, value => 동시에 저장
 *  	---------- 우편 변호 (우편 번호, 실제 주소)
 *  	key : 중복이 불가능
 *  	value : 중복이 가능
 *  	Map<K,V>
 *  	= K => key
 *  	= V => value
 *  	= T => type
 *  	= E => element
 *  	ArrayList<E>
 *  	Vector<E>
 *  	Set<E>
 *  
 *  	1) 사용처
 *  		= Spring : 클래스 관리 (생성~소멸) => 클래스 저장 (사용자)
 *  		= 웹 : 전송 / 응답 / 저장(클라이언트:Cookie,서버:Session)
 *  		= MyBatis : 키->id, 값->sql
 *  	2) 주요 기능
 *  		= put() : 저장 => put(키,값)
 *  		= get() : 읽기 => get(키)
 *  		= clear() : 전체 삭제
 *  	3) 순서가 없다
 *  		= 키 => 구분자로 사용
 *  		= 값 => 모든 값을 설정할 수 있다
 *  -----------------------------------------
 *  ArrayList가 여러개 있는 경우
 *  = 차집합 => removeAll() => MINUS
 *  = 교집합 => retainAll() => INTERSECT
 *  = 합집합 => addAll() => UNION
 *  -------------------------------------> 오라클 : JOIN
 *  오라클
 *  => 로직이 없다 (제어문이 없다) : 명령문 => SQL / PL~SQL
 *  
 *  # Properties
 *  	파일 => .properties => 파일 읽기
 *  	데이터베이스 정보
 *  	map 형식
 *  	=> 변수(key)=값 : 보안 유지
 *  	=> MyBatis
 *  		
 */
import java.util.*;
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String, String>();
		// key:String, value:String => key는 보통 String(구분)을 많이 쓴다
		map.put("id", "admin");
		map.put("pwd", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", String.valueOf(20));
		map.put("pwd", "4567");	// key가 중복되면 => 덮어 쓴다 => 중복을 허용하지 않는다 => Cookie
		// 값을 읽어 온다
	/*	System.out.println("아이디:"+map.get("id")); // 아이디:admin
		System.out.println("비밀 번호:"+map.get("pwd")); // 비밀 번호:4567
		System.out.println("이름:"+map.get("name")); // 이름:홍길동
		System.out.println("성별:"+map.get("sex")); // 성별:남자
		System.out.println("나이:"+map.get("age")); // 나이:20
		*/
	/*	Set<String> s=map.keySet(); // key만 저장 => Set 이용 이유는 중복을 허용하면 안되기 때문
		for(String ss:s)
		{
			System.out.println(ss+":"+map.get(ss));
		} */
/*
sex:남자
name:홍길동
id:admin
pwd:4567
age:20
*/
		Set s=map.keySet();
		for(Object ss:s)
		{
			String key=(String)ss;
			System.out.println(key+":"+map.get(key));
		}
		
/*
sex:남자
name:홍길동
id:admin
pwd:4567
age:20
 */
		// Set : 순서가 없다 => 가급적이면 출력 시에 List를 이용 (순차적이다)
		// => Map은 클래스 관리
	}

}