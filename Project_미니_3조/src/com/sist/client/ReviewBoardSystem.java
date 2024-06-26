package com.sist.client;
/*
 *   1. 목록 출력 => 검색 => SELECT ==> READ 
 *   2. 게시물 추가 => 추가 => INSERT ==> CREATE
 *   3. 상세보기  => 조건 => SELECT  ==> READ
 *   4. 수정   => 수정  => UPDATE  ==> UPDATE
 *   5. 삭제   => 삭제  => DELETE  ==> DELETE 
 *   ------------------------------------------ CRUD : 메모리 / 파일 / 데이터베이스 
 *                                                    ------ ----  --------- 오라클 
 *                                                    컬렉션   ObjectInput/OUTput 
 */
import java.util.*;
import java.io.*;
public class ReviewBoardSystem {
   // 데이터 저장 => 모든 사용자 공통으로 사용 
   private static ArrayList<ReviewBoard> list=new ArrayList<ReviewBoard>();
   ControlPanel cp;
   
   public ReviewBoardSystem(ControlPanel cp)
   {
	  
	//   boardGetData();
   }
   
 /*  public void boardGetData()
   {
	   ObjectInputStream ois=null;
	   try
	   {
		   FileInputStream fis=new FileInputStream("c:\\java_data\\board.txt");
		   ois=new ObjectInputStream(fis);
		   list=(ArrayList<Board>)ois.readObject();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();// 에러 확인 
	   }
	   finally
	   {
		  try
		  {
			  ois.close();
		  }catch(Exception ex) {}
	   }
   } */
   // 저장 
   public void boardSave()
   {
	   ObjectOutputStream oos=null;
	   try
	   {
		   FileOutputStream fos=new FileOutputStream("c:\\java_data\\board.txt");
		   oos=new ObjectOutputStream(fos);
		   oos.writeObject(list);// 파일에 객체 단위로 저장 
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
   public void boardInsert(ReviewBoard board)
   {
	   board.setBno(boardSequence()+1);
	   list.add(board);
	   boardSave();
   }
   // 목록 => 페이지 나누기 => *** 면접 => 인라인뷰 
   public ArrayList<ReviewBoard> boardList(int page)
   {
	   ArrayList<ReviewBoard> bList=new ArrayList<ReviewBoard>();
	   int j=0; // 10개씩 => j<10 => j++
	   int pagecnt=(page*10)-10; // 시작위치 
	   /*
	    *    (page*10)-10  => 1=>0
	    *                  => 2=>10   
	    *    1page => 0~9
	    *    2page => 10~19
	    *    3page => 20~29 
	    *    
	    *    WHERE rownum BETWEEN 1 AND 10 ORDER BY no DESC
	    */
	   ArrayList<ReviewBoard> temp=
			   new ArrayList<ReviewBoard>();
	   for(int i=list.size()-1;i>=0;i--)
	   {
		   temp.add(list.get(i));
	   }
	   // sort => 
	   for(int i=0;i<temp.size();i++)
	   {
		   
		   if(j<10 && i>=pagecnt)
		   {
			   ReviewBoard b=temp.get(i);
			   bList.add(b);
			   j++;
		   }
	   }
	   return bList;
   }
   public int boardTotalPage()
   {
	   // SELECT CEIL(COUNT(*)/10.0) FROM board
	   return (int)(Math.ceil(list.size()/10.0));
   }
   // 상세보기 
   public ReviewBoard boardDetail(int no)
   {
	   
	   ReviewBoard board=new ReviewBoard();
	   /*
	    *  SELECT * FROM board
	    *  WHERE no=1
	    */
	   for(ReviewBoard b:list)
	   {
		   if(b.getBno()==no)
		   {
			   b.setHit(b.getHit()+1);// 조회수 증가 
			   board=b;
			   boardSave();
			   break;
		   }
	   }
	   return board;
   }
   public ReviewBoard boardUpdateData(int no)
   {
	   
	   ReviewBoard board=new ReviewBoard();
	  
	   for(ReviewBoard b:list)
	   {
		   if(b.getBno()==no)
		   {
			   
			   board=b;
			   break;
		   }
	   }
	   return board;
   }
   // 추가 => 게시물 / 장바구니 / 예약 boardSave
   // 수정 => 장바구니 / 예약  boardSave
   public void boardUpdate(int no,ReviewBoard board)
   {
	   int index=0;
	   for(int i=0;i<list.size();i++)
	   {
		   ReviewBoard b=list.get(i);
		   if(b.getBno()==no)
		   {
			   index=i; // 인덱스 번호 구하기 
			   break;
		   }
	   }
	   list.set(index, board);
	   boardSave();// 파일에 저장 
   }
   // 삭제 => 취소 
   public void boardDelete(int no)
   {
	   int index=0;
	   for(int i=0;i<list.size();i++)
	   {
		   ReviewBoard b=list.get(i);
		   if(b.getBno()==no)
		   {
			   index=i; // 인덱스 번호 구하기 
			   break;
		   }
	   }
	   list.remove(index);
	   // 파일에 다시 저장 
	   boardSave(); // 반복 제거 
	   /*
	    *   1. 메소드 
	    *      = 기능 설정 => 기능에 관련된 명령문을 모아서 관련 => 재사용이 가능 
	    *      = 반복을 제거 
	    *      = 에러처리 , 수정이 편리하게 만든다 
	    */
   }
   // 검색 => 영화 / 상품 / 게시물 
   public ArrayList<ReviewBoard> boardFind(String subject)
   {
	   ArrayList<ReviewBoard> bList=new ArrayList<ReviewBoard>();
	   for(ReviewBoard b:list)
	   {
		   if(b.getTitle().contains(subject))
		   {
			   bList.add(b);
		   }
	   }
	   return bList;
   }
   
   // sequence => 자동 증가번호 
   /*
    *   이론 => 교재 
    *   ---
    *    | 실무하고 다르다 
    */
   public int boardSequence()
   {
	   int max=0;
	   // 종료하지 않는 프로그램을 제작 => 임의로 (예외처리는 반드시 하는 것은 아니라 => 에러 방지)
	   try
	   {
		   // list => 처음에는 null
		   for(ReviewBoard b:list) // 오류 발생 
		   {
			   if(b.getBno()>max)
				   max=b.getBno();
		   }
	   }catch(Exception ex) 
	   {
		   System.out.println(ex.getMessage());
	   }
	   return max;
   }
}