package com.sist.util;

import java.io.FileInputStream;
import java.util.Properties;

public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Properties 클래스 생성 => CheckedException => 무조건 예외 처리를 하고 사용한다
		try
		{
			Properties prop=new Properties(); // Map key=값 (key는 중복할 수 없다)
			
			// 파일 읽기
			prop.load(new FileInputStream("c:\\java_data\\db.properties"));
			
			// 값 읽기
			String driver=prop.getProperty("driver");
			String url=prop.getProperty("url");
			String username=prop.getProperty("username");
			String password=prop.getProperty("password");
			
			System.out.println("Driver:"+driver); // Driver:oracle.jdbc.driver.OracleDriver
			System.out.println("URL:"+url); // URL:jdbc:oracle:thin:@localhost:1521:XE
			System.out.println("UserName:"+username); // UserName:hr
			System.out.println("Password:"+password); // Password:happy
		}catch(Exception ex) {}
		// Map 방식 => 구분자, 값을 동시에 저장
	}

}
