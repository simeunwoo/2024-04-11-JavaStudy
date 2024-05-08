package com.sist.main;
// Movie 클래스를 불러온다
import com.sist.vo.Movie;
// 클래스가 다른 폴더에 저장된 경우는 반드시 import를 이용해서 불러온다
// 		 ------- 패키지
/*
 * 	private / public
 * 
 * 	변수 => private => 데이터 비공개
 * 		=> 접근이 가능하게 만든다
 * 		=> getXxx(), setXxx()
 * 	메소드 / 클래스 / 생성자 => 다른 클래스에서 연결 => public
 * 
 * 	127page
 */
import java.util.*;
import java.util.Date;
import java.sql.*;
// 패키지가 다르면 같은 이름의 클래스가 나올 수 있음 => 오류가 나와서 커서를 대고 택일을 해야함
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메모리 저장
		Movie movie=new Movie();
	//	com.sist.vo.Movie movie=new com.sist.vo.Movie(); // import를 붙이지 않을 경우 해야 하는 코딩
		Date date=new Date();
	//	java.util.Date date=new java.util.Date(); // 역시 import 대신 할 수 있는 코딩
		// 데이터 초기화
		movie.setRank(1);
		System.out.println("순위:"+movie.getRank());
	}

}
