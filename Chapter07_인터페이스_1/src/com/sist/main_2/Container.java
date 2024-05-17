package com.sist.main_2;
import java.util.*;
/*
 * 	class 동물 => 데이터형 (동물)
 * 	class 사람 extends 동물
 * 			=> 사람, 동물
 * 
 * 	interface 동물 => 다중 상속이 가능한 클래스 (특수한 클래스) => 상위 클래스
 * 	class 사람 implements 동물
 * 			=> 사람, 동물
 * 
 * 	관련
 * 	=> 웹 : 요청 받아서 => 처리 후에 => 결과값을 브라우저로 전송
 * 	=> 인터페이스로 모아서 처리
 */
public class Container {
	// => 상속을 받으면 모든 데이터형이 상위 클래스의 데이터 타입을 갖고 있다
	Model[] models= {new BoardModel(),
			new FoodModel(),
			new RecipeModel(),
			new SeoulModel(),
			new NoticeModel()};
	
	public Model getModel(int no)
	{
		return models[no-1];
	}
}
