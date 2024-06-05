package com.sist.dao;
// => 기능 (오라클 연결 => 사용자 요청에 맞는 데이터를 찾아온다)
import java.util.*; // ArrayList
import java.sql.*; // 오라클에 연결하는 라이브러리
public class ZipcodeDAO {
	// 오라클 연결 클래스
	private Connection conn;
	// SQL 전송하는 클래스 (결과값 받기)
	private PreparedStatement ps; // SQL 전송 => 결과값 읽기
	// 오라클 연결 => URL (오라클 주소) thin => 연결만 하는 드라이버
	/*
	 * 	localhost => 본인 컴퓨터 => IP
	 * 	1521 : PORT, 1433 (MS-SQL), 3306 (MySQL, MariaDB)
	 * 	XE : table에 저장된 데이터베이스 => ORCL / ORA
	 * 	(연습용 => 무료)
	 */
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 1. 드라이버 등록
	// 2. 오라클 연결
	// 3. 오라클 연결 해제
	// 4. 기능 설정
}
