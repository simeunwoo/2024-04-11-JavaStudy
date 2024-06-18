package com.sist.client;
import java.io.Serializable;
// ObjectInputStream / ObjectOutputStream 
// 저장되는 데이터
import java.util.*;
/*
JLabel id,day,hit,sub;
JTextArea ta;				
*/
	/*
	아이디 / 작성일
	조회수
	제목 / 내용
	 */
public class ReviewBoard implements Serializable{
    private String id; // 구분자 => 상세,수정,삭제 
    private Date day=new Date(); 
    private int hit;
    private String sub;
    private String ta;
    private int no;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getTa() {
		return ta;
	}
	public void setTa(String ta) {
		this.ta = ta;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	   
}