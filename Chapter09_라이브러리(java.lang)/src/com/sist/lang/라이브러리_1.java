package com.sist.lang;
/*
 * 	라이브러리 => 자바에서 지원하는 클래스
 * 			=> J2SE : 기본
 * 			   J2EE : 웹에서 사용하는 라이브러리 => servlet-api => JSP
 * 				외부에서 지원하는 클래스 => Jsoup / SimpleJSON / CSV / Spring
 * 	=> java.lang => import를 생략할 수 있다 (자바의 기본 클래스) = 가장 많이 사용되는 라이브러리
 * 		= Object
 * 		= String
 * 		= Math
 * 		= System
 * 		= StringBuffer
 * 		= Wrapper : 데이터형을 클래스화해서 사용이 쉽게
 * 			= Integer ***
 * 			= Double ***
 * 			= Boolean ***
 * 			= Float
 * 			= Byte
 * 	=> java.util => 필수적으로 import 사용
 * 		= Scanner
 * 		= Calendar / Date ***
 * 		= StringTokenizer ***
 * 		= Collection
 * 			= List : ArrayList ***, LinkedList, Vector
 * 			= Set : HashSet ***, TableSet
 * 			= Map : Hashtable, HashMap
 * 	=> java.io => 입출력
 * 				FileInputStream *** / FileOutputStream
 * 				FileReader *** / FileWriter ***
 * 				InputStream / OutputStream
 * 				--------------------------
 * 				BufferedReader *** / BufferedWriter
 * 				BufferedInputStream / BufferedOutputStream
 * 	=> java.net => URLEncoder *** / URLDecoder
 * 				   Socket / ServerSocket
 * 				   URL
 * 	=> java.sql => 오라클
 * 		= Connection ************************************ (심하게 중요)
 * 		= Statement ************************************
 * 		= ResultSet ************************************
 * 	--------------------------------------------------------
 * 	=> 2차 자바 (웹)
 * 		= HttpServletRequest : 브라우저에서 전송한 값을 자바에서 받을 때 사용
 * 		= HttpServletResponse : 자바에서 브라우저 결과값 전송
 * 		= HttpSession : 서버에 정보 저장
 * 		= Cookie : 클라이언트 브라우저에 저장
 * 
 * 	1~8장 => 그대로 적용
 * 	----- 기본 문법
 * 	=> 라이브러리 + 사용자 클래스 = 프로그램이 제작
 *     -------------------
 *     => 문법과 어휘
 *     => 숙어, 문장 => 라이브러리 (자바를 사용하여 프로그램을 만들 수 있게 미리 제작한 클래스의 집합)
 *        -------- 회화                                     ------------------
 *     => java.lang / java.util / java.io / java.sql       API (Application Program Interface)
 *        ------------------------------------------- 290page
 *        => 사용하기 위하여 반드시 import를 사용해서 클래스 읽기 (제외 : java.lang은 제외)
 *        
 *  => java.lang
 *  
 *  	Object
 *  	1) 모든 클래스의 상속을 내린 클래스 (최상위 클래스) => extends Object가 생략되어 있음
 *  	2) Object가 가지고 있는 기능 (제공된 메소드)
 *  		= toString() *** => 객체를 문자열로 변환 => String
 *  			원형) public String toString()
 *  			=> 문자열 변환 => (String), toString(), valueOf()
 *  		= clone() *** : 메모리를 복제 (새로운 메모리 생성) =============> (Ctrl+C) + (Ctrl+V) 느낌
 *  					 참조 => 공동으로 사용
 *  					 => 메모리 주소 이용 (배열/클래스)
 *  					 => 아바타
 *  		= finalize() : 소멸자 => 메모리에서 해제 => 자동으로 호출
 *  		= 객체 비교 : equals(), hashCode() ***
 *  	class A
 *  	{
 *  		int a;
 *  		int b;
 *  	}
 *  
 *  	A aa=new A(); // a=0, b=0
 *  	A cc=aa.clone(); ===> cc.a=0 / cc.b=0
 *  	aa.a=100;
 *  	aa.b=200;
 *  
 *  	A bb=aa.clone(); ===> bb.a=100 / bb.b=200
 */
import java.util.*;
public class 라이브러리_1 {
	public 라이브러리_1()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[] arr= {10,20,30};
		int[] temp=arr; // 참조 => 같은 주소를 제어하면 => 동시에 변경 => 별칭
		
		System.out.println("=== arr ===");
		System.out.println(Arrays.toString(arr));
		System.out.println("=== temp ===");
		System.out.println(Arrays.toString(temp));
		System.out.println("=== temp 변경 ===");
		temp[0]=100;
		temp[1]=200;
		temp[2]=300;
		System.out.println("=== temp ===");
		System.out.println(Arrays.toString(temp));
		System.out.println("=== arr ===");
		System.out.println(Arrays.toString(arr)); */
		// 같은 메모리 공간을 제어 => 참조
		// 메소드를 통하여 데이터를 변경할 때 => Call By Reference (메모리 주소에 의한 참조)
/*
=== arr ===
[10, 20, 30]
=== temp ===
[10, 20, 30]
=== temp 변경 ===
=== temp ===
[100, 200, 300]
=== arr ===
[100, 200, 300]
 */
		int[] arr= {10,20,30};
		int[] temp=arr.clone(); // clone : 복제 + 새로운 메모리 생성
		System.out.println("=== arr ===");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		System.out.println("=== temp ===");
		System.out.println(Arrays.toString(temp));
		System.out.println(temp);
		System.out.println("=== temp 변경 ===");
		temp[0]=100;
		temp[1]=200;
		temp[2]=300;
		System.out.println("=== arr ===");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		System.out.println("=== temp ===");
		System.out.println(Arrays.toString(temp));
		System.out.println(temp);
/*
=== arr ===
[10, 20, 30]
[I@6504e3b2
=== temp ===
[10, 20, 30]
[I@515f550a
=== temp 변경 ===
=== arr ===
[10, 20, 30]
[I@6504e3b2
=== temp ===
[100, 200, 300]
[I@515f550a
 */
	}

}
