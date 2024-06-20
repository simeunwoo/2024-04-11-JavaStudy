package com.sist.client;
import java.io.Serializable;
// ObjectInputStream / ObjectOutputStream 
// 저장되는 데이터
import java.util.*;

import javax.swing.JPanel;
/*
JLabel id,regdate,hit,title;
JTexcontentrea content;				
*/
	/*
	아이디 / 작성일
	조회수
	제목 / 내용
	 */
public class ReviewBoard extends JPanel implements Serializable{
    private String id; // 구분자 => 상세,수정,삭제 
    private Date regdate=new Date(); 
    private int hit;
    private String title;
    private String content;
    private int bno;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	   
}