package com.sist.client;
import java.awt.Font;

// detail.jsp
import javax.swing.*;
public class ReviewDetailPanel extends JPanel{
     JLabel titleLa,idLa,dayLa,hitLa,subLa;
     JLabel id,day,hit,sub;
     JTextArea ta;
     JButton b;
/*
아이디 / 작성일
조회수
제목 / 내용
 */
     public ReviewDetailPanel()
     {
    	 titleLa=new JLabel("제품 후기",JLabel.CENTER);
     	 titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30));
     	 setLayout(null);
    	 titleLa.setBounds(160, 15, 620, 50);
    	 add(titleLa);
    	 
    	 idLa=new JLabel("아이디",JLabel.CENTER);
    	 idLa.setBounds(160, 90 , 80, 30);
    	 id=new JLabel("",JLabel.CENTER);
    	 id.setBounds(95, 75, 120, 30);
    	 add(idLa);add(id);
    	 
    	 dayLa=new JLabel("작성일",JLabel.CENTER);
    	 dayLa.setBounds(480, 90 , 80, 30);
    	 day=new JLabel("",JLabel.CENTER);
    	 day.setBounds(305, 75, 200, 30);
    	 add(dayLa);add(day);
    	 
    	 hitLa=new JLabel("조회수",JLabel.CENTER);
    	 hitLa.setBounds(160, 125 , 80, 30);
    	 hit=new JLabel("",JLabel.CENTER);
    	 hit.setBounds(95, 110, 120, 30);
    	 add(hitLa);add(hit);
   
    	 subLa=new JLabel("제목",JLabel.CENTER);
    	 subLa.setBounds(160, 140 , 80, 30);
    	 sub=new JLabel("");
    	 sub.setBounds(95, 145, 400, 30);
    	 add(subLa);add(sub);
    	 
    	 ta=new JTextArea();
    	 ta.setEditable(false); // 비활성화 
    	 ta.setBounds(160, 165, 485, 250);
    	 add(ta);
    	 
    	 JPanel p=new JPanel();
    	 b=new JButton("목록으로");
    	 p.add(b);
    	 p.setBounds(160, 440, 485, 35);
    	 add(p);
    	 
    	 setSize(960, 700);
     }
 /*	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		new ReviewDetailPanel();
 	}*/
}