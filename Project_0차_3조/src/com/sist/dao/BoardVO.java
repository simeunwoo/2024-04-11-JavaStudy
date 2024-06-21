package com.sist.dao;
// ObjectInputStream / ObjectOutputStream 
// 저장되는 데이터
import java.util.*;

import lombok.Data;
/*
JLabel id,regdate,hit,title;
JTexcontentrea content;				
*/
	/*
	아이디 / 작성일
	조회수
	제목 / 내용
	 */
@Data
public class BoardVO{
    private String id; // 구분자 => 상세,수정,삭제 
    private Date regdate=new Date(); 
    private int hit;
    private String title;
    private String content;
    private int bno;
    private int gno;
    private GoodsVO gvo = new GoodsVO();
	
	   
}