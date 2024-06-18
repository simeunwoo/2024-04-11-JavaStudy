package com.sist.dao;
import java.util.*;
import java.sql.*;
/*
 *	JDBC (자바에서 데이터베이스 연결하는 라이브러리) => java.sql
 * 
 * 		1) 드라이버 등록
 * 		class.forName("드라이버 클래스") => 각 데이터베이스 업체 (오라클, MySQL, MariaDB ...)
 * 		-------------- 클래스의 정보를 읽어서 메모리 할당, 멤버 변수 값 주입, 메소드를 호출 ...
 * 		-------------- ---------------- 리플렉션 (스프링, 스프링부트, MyBatis)
 * 
 * 		2) 데이터베이스 연결
 * 		---------------
 * 		Connection => Connection conn=DriverManager.getConnection(URL,username,password)
 * 					=> conn username/password
 * 					=> URL
 * 						=> jdbc:업체명:드라이버명:@IP:PORT:데이터베이스명
 * 							jdbc:oracle:thin:@localhost:1521:XE
 * 										----- 연결만 해주는 역할 => 속도가 늦다
 * 
 * 		3) SQL 문장을 오라클 전송
 * 			=> SQL 문장을 만든다 => String
 * 				String sql="SELECT~", "INSERT", "UPDATE", "DELETE" => DML => 데이터 제어
 * 				=> DDL => CREATE, ALTER, DROP, RENAME, TRUNCATE, GRANT, REVOKE => 오라클 자체에서 처리
 * 				PreparedStatement ps=conn.preparedStatement(sql)
 * 
 * 		4) SQL 문장 실행 후에 결과값 받기
 * 		-------------------------- SELECT
 * 			INSERT / UPDATE / DELETE => executeUpdate() : commit() 호출하고 있다 => 데이터 갱신
 * 			SELECT => executeQuery() => 실행된 결과값을 읽어 온다
 * 	
 * 			ResultSet rs=ps.executeQuery()
 * 				SELECT id,name,sex
 *          -------------------------------
 *          컬럼명	ID		NAME	SEX
 *          -------------------------------
 *          		=> rs.getString(1) rs.getString(2) rs.getString(3) => getInt() get Date() getDouble()
 *          		=> rs.getString("id") rs.getString("name") rs.getString("sex")
 *          		aaa		홍길동	남자	=====> next()
 *          -------------------------------		|
 *          		bbb		심청이	여자
 *          -------------------------------		|
 *          		ccc		춘향이	여자	=====> previous()
 *          -------------------------------
 *          => JDBC => SQl 관련 (오라클 문법 적용) => 번호가 1번 부터 ...
 * 
 * 		5) 닫기
 * 			rs.close()
 * 			ps.close()
 * 			conn.close()
 * 
 * 	---------------------------------------------------------------------------------
 * 
 * 	1. Connection => 반드시 닫기 수행 (닫기가 안되면 Connection은 사용하지 않는데 오라클 연결 ...)
 * 
 * 	2. 사용자가 Connection을 한개만 사용할 수 있게 만든다 : 싱글턴
 * 
 * 	3. JDBC => 웹 (DBCP) => 라이브러리 등장 (MyBatis / Hibernate)
 * 		=> JDBC : 연결 시마다 => Connection 생성
 * 		=> 웹 (DBCP) : Connection을 미리 연결
 * 		=> MyBatis : 실무
 * 		=> Hibernate : 자동으로 SQL 문장 만들어주는 라이브러리 : JPA
 * 
 * 	=> 주의점 : 문자열로 되어 있다
 *            -------------> 컴파일 시에 에러가 없다 => 실행 시 에러 발생
 *            String sql="SELECT"; => 공백, 오라클 SQL 문장과 약간 다른 것이 있다 (LIKE)
 *            1) SQL => 먼저 오라클에서 실행 => 자바에서 전송
 *                      --------------
 *            2) 웹 => SQL (85%)
 */
public class GoodsDAO {

}
