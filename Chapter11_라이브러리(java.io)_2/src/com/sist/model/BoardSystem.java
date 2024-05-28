package com.sist.model;

import java.util.*;
import java.io.*;

/*
 * 	1. 목록 출력 => 검색 => SELECT => READ
 * 	2. 게시물 추가 => 추가 => INSERT => CREATE
 * 	3. 상세 보기 => 조건 => SELECT => READ
 * 	4. 수정 => 수정 => UPDATE => UPDATE
 * 	5. 삭제 => 삭제 => DELETE => DELETE
 * 	-------------------------------------- CRUD : 메모리 / 파일 / 데이터베이스
 * 	메모리 : 컬렉션
 * 	파일 : ObjectInput/Output
 * 	데이터베이스 : 오라클
 */
public class BoardSystem {

	private static ArrayList<Board> list=new ArrayList<Board>();
	
	public BoardSystem()
	{
/*		Board b=new Board();
		b.setNo(1);
		b.setName("홍길동");
		b.setSubject("파일을 이용한 CRUD를 배우기");
		// 프로그램 => 데이터 관리 (JSP, Spring, VueJS, ReactJS)
		// => 데이터 분석 => 머신러닝 / 딥러닝 => 응용(AI)
		b.setContent("파일을 이용한 CRUD => 데이터베이스(오라클):읽기,검색,추가,수정,삭제:메모리(컬렉션),파일,데이터베이스");
		b.setRegdate(new Date());
		b.setHit(0);
		b.setPwd("1234");
		list.add(b);
		boardSave(); */ // => /**/ 부분의 주석이 없을 경우 => 창을 끄고 다시 켜면 초기화, 주석이 있을 경우 => 초기화 되지 않고 저장되어 있다 
		boardGetData();
	}
	
	public void boardGetData()
	{
		ObjectInputStream ois=null;
		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\board.txt");
			ois=new ObjectInputStream(fis);
			list=(ArrayList<Board>)ois.readObject();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
	}
	// 저장
	public void boardSave()
	{
	
		ObjectOutputStream oos=null;
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(list); // 파일에 객체 단위로 저장
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}
	public void boardInsert(Board board)
	{
		board.setNo(boardSequence()+1);
		list.add(board);
		boardSave();
	}
	// 목록 => 페이지 나누기 => *** 면접 => 인라인뷰
	public ArrayList<Board> boardList(int page)
	{
		ArrayList<Board> bList=new ArrayList<Board>();
		int j=0; // 10개씩 => j<10 => j++
		int pagecnt=(page*10)-10; // 시작 위치
		/*
		 * 	(page*10)-10 => 1->0, 2->10, 3->20 ...
		 * 
		 * 	1page => 0 ~ 9
		 * 	2page => 10 ~ 19
		 * 	3page => 20 ~ 29
		 * 
		 * 	WHERE rownum BETWEEN 1 AND 10
		 */
		for(int i=0;i<list.size();i++)
		{
			Board b=list.get(i);
			if(j<10 && i>=pagecnt)
			{
				bList.add(b);
				j++;
			}
		}
		return bList;
	}
	public int boardTotalPage()
	{
		// SELECT CEIL (COUNT(*)/10.0) FROM board
		return (int)(Math.ceil(list.size()/10.0));
	}
	
	// 상세 보기
	public Board boardDetail(int no)
	{
		Board board=new Board();
		/*
		 * 	SELECT * FROM board
		 * 	WHERE no=1
		 */
		for(Board b:list)
		{
			if(b.getNo()==no)
			{
				board=b;
				break;
			}
		}
		return board;
	}
	// 추가 => 게시물 / 장바구니 / 예약 boardSave
	// 수정 => 장바구니 / 예약 boardSave
	public void boardUpdate(int no,Board board)
	{
		int index=0;
		for(int i=0;i<list.size();i++)
		{
			Board b=list.get(i);
			if(b.getNo()==no)
			{
				index=i; // 인덱스 번호 구하기
				break;
			}
		}
		list.set(index,board);
		boardSave(); // 파일에 저장
	}
	// 삭제 => 취소
	public void boardDelete(int no)
	{
		int index=0;
		for(int i=0;i<list.size();i++)
		{
			Board b=list.get(i);
			if(b.getNo()==no)
			{
				index=i;
				break;
			}
		}
		list.remove(index);
		// 파일에 다시 저장
		boardSave(); // 반복 제거
		/*
		 * 	# 메소드
		 * 		= 기능 설정 => 기능에 관련된 명령문을 모아서 관련 => 재사용이 가능
		 * 		= 반복을 제거
		 * 		= 에러 처리, 수정이 편리하게 만든다
		 */
	}
	// 검색 => 영화 / 상품 / 게시물
	public ArrayList<Board> boardFind(String subject)
	{
		ArrayList<Board> bList=new ArrayList<Board>();
		for(Board b:list)
		{
			if(b.getSubject().contains(subject))
			{
				bList.add(b);
			}
		}
		return bList;
	}
	// sequence => 자동 증가 번호
	public int boardSequence()
	{
		int max=0;
		// 종료하지 않는 프로그램을 제작 => 임의로 (예외 처리는 반드시 하는 것은 아니라 => 에러 방지)
		try
		{
			// list => 처음에는 null
			for(Board b:list)
			{
				if(b.getNo()>max)
					max=b.getNo();
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return max;
	}
	/*
	 * 	이론 => 교재
	 *  ---
	 *   | 실무하고 다르다
	 */
}
