package com.sist.main;
import com.sist.manager.*;
import com.sist.vo.Movie;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 목록
		System.out.println("=== 영화 목록 ===");
		for(Movie movie:MovieManager.movies) // movies(public) => 접근이 가능 static => 클래스명으로 접근
		{
			
		}
	}

}
