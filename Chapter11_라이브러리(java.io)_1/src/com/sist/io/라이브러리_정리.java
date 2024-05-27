package com.sist.io;
/*
 * 	java.io
 * 	특징 : 데이터 이동 통로를 만들어서 데이터를 입출력한다
 *       ------------
 *       | 스트림 : 단점 (단방향이다)
 *                 | 읽기/쓰기를 따로 만들어서 처리 => 네트워크는 읽기/쓰기를 동시에 처리 (쓰레드)
 *                                            --------------------------------
 *                                            채팅 => 서버에서 보내는 값 / 서버로 보내는 값
 * 	IO => InputStream / OutputStream
 * 		 송신/수신 => 1byte => 자바에서는 각국의 언어를 사용할 수 있게 2byte를 사용할 수 있게 제작
 *       -------
 *       1byte => 바이트 스트림
 *       	~InputStream. ~OutputStream
 *       2byte => 문자 스트림
 *       	~Reader, ~Writer
 *       상속도
 *          InputStream           OutputStream
 *              |                      |
 *          FileInputStream       FileOutputStream
 *          BufferedInputStream   BufferedOutputStream
 *          
 *          Reader          Writer
 *             |               |
 *          FileReader      FileWriter
 *          BufferedReader  BufferedWriter
 *          
 *        => ObjectInputStream / ObjectOutputStream
 *           객체 단위 저장
 *           => 직렬화/역직렬화
 *        --------------------------------------------------
 *        메모리 입출력 : Scanner
 *        파일 입출력 : IO
 *        네트워크 입출력 : IO
 *        *** io 사용 시 반드시 예외 처리를 한다 (CheckedException)
 *        
 *        입출력
 *        ----------------------- 바이트 스트림 ------------------------
 *        => 입력 메소드 : read() => 한글자 읽기
 *        => 출력 메소드 : write() => 한글자 출력 write(byte[]) write(int)
 *        ---------------------------------------------------------- 파일 닫기 : close()
 *        FileInputStream / FileOutputStream
 *        => 웹 : 파일 업로드 / 파일 다운로드 / 파일 복사
 *        ------------------------ 문자 스트림 ------------------------
 *        => 읽기 메소드 : read(), read(char[])
 *        => 쓰기 메소드 : write(char), write(char[]), write(String)
 *        ----------------------------------------------------------
 *        FileReader / FileWriter
 *        => 크롤링 후에 파일에 저장 / 카페, 블로그 ... 로그 파일 => 분석 (추천)
 *        ------------------------ 필터 스트림 ------------------------
 *        파일에 있는 데이터를 메모리에 한번에 이동 후에 사용 가능 => 속도가 빠르다 Buffered~
 *        => 읽기 메소드 : readLine() => 한줄씩 읽어 온다
 *        => 쓰기 메소드 : write(String)
 *        ----------------------------------------------------------
 *        BufferedReader / BufferedWriter
 *        => 한번에 데이터를 한줄씩 읽는 경우에 주로 사용
 *        => 명사/조사 => 파일을 이용
 *           ------- 형태소 분석 : 꼬꼬마(서울대) => 라이브러리
 *                              R / korean-text
 *                              => 채봇
 *        ----------------------------------------------------------
 *        => FileReader => r (읽기 모드)
 *        => FileWriter => w (쓰기 모드) : create => 덮어쓴다, a (쓰기 모드) : append => 기존의 데이터 결합
 *                         -------------------------------------------------------------------
 *                         생성자 new FileWriter("파일명",true) ===> a
 *                              new FileWriter("파일명") ===> w
 *        => 파일을 읽어서 => ArrayList에 저장 후에 데이터를 활용
 *        => Properties : 파일의 확장자 : .properties
 *                        구분자가 있기 때문에 사용하기 편리하다 => 사용자 정의
 *                        외부 라이브러리에서 주로 사용 : 보안
 *                        -----------
 *                        | 데이터베이스 관련 (MyBatis, JPA, Spring)
 *                                                        | => XML, Annotation
 *                        *** 필수적으로 사용 : 스프링 부트 (환경 설정)
 *                                           | properties 파일 / yml 파일을 주로 이용
 *        작성법
 *        변수=값
 *        --- key 역할을 수행 => 중복을 허용하지 않는다
 *        --- 값은 중복 허용이 된다
 *        id=admin
 *        --------------- Map 방식
 *        => 데이터베이스 정보 : 오라클 위치, 사용자명, 비밀번호 => 누구나 데이터베이스에 접근 가능
 *        => Validation : 유효성 검사
 *        -------------------------------------------------------------------
 *        => 라이브러리로 제작 : 등록만 하면 읽어 온다
 *        => 컬렉션 + IO
 *           ---------- 배열 (X)
 *           1. 데이터 수집 : 파일에 저장 => List로 저장 => 사용
 *                                    -----------------
 *                                    | 프로그램 구동 시마다 데이터 수집을 계속해야 된다
 *                                    | 데이터 수집 없이 파일만 읽는다
 *           2. 데이터 수집 시 중복된 데이터 => 제거 => Set
 *           3. 관리하는 클래스가 많은 경우 => new 메모리 누수 현상 => 한개의 메모리만 사용 가능하게 만든다 => 싱글턴 : Map
 *        => 컬렉션
 *           Collection
 *               |
 *      ----------------------------------
 *      |                |               |
 *      List            Set             Map
 *      |                |               |
 *      ArrayList      HashSet         HashMap
 *      => 데이터를 저장   => 중복 제거       => 클래스 관리
 *      1) add()       1) add()        1) put()
 *      2) size()      2) size()       2) isEmpty()
 *      3) get()       3) isEmpty()    3) size()
 *      4) isEmpty()   4) clear()      4) get()
 *      5) clear()                     5) keySet()
 *                                     6) values()
 *      ---------------------------------------------------------
 *      1. network
 *      2. sql
 *      ---------------------------------------------------------
 *      3. J2EE => 웹 관련
 *      4. 외부 라이브러리 : Jsoup ... mvnrepository.com
 *      5. Spring
 *      6. python 연동
 *      ---------------------------------------------------------
 */
public class 라이브러리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
