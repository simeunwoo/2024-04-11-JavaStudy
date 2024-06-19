
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
     	 titleLa.setFont(new Font("휴먼모음T",Font.BOLD,35));
     	 setLayout(null);
    	 titleLa.setBounds(175, 50, 930, 40);
    	 add(titleLa);
    	 
    	 idLa=new JLabel("아이디",JLabel.CENTER);
    	 idLa.setBounds(410, 100 , 80, 30);
    	 id=new JLabel("",JLabel.LEFT);
    	 id.setBounds(500, 100, 300, 30);
    	 add(idLa);add(id);
    	 
    	 dayLa=new JLabel("작성일",JLabel.CENTER);
    	 dayLa.setBounds(410, 135 , 80, 30);
    	 day=new JLabel("",JLabel.LEFT);
    	 day.setBounds(500, 135, 150, 30);
    	 add(dayLa);add(day);
    	 
    	 hitLa=new JLabel("조회수",JLabel.CENTER);
    	 hitLa.setBounds(665, 135 , 40, 30);
    	 hit=new JLabel("",JLabel.LEFT);
    	 hit.setBounds(715, 135, 120, 30);
    	 add(hitLa);add(hit);
   
    	 subLa=new JLabel("제목",JLabel.CENTER);
    	 subLa.setBounds(410, 170 , 80, 30);
    	 sub=new JLabel("");
    	 sub.setBounds(500, 170, 400, 30);
    	 add(subLa);add(sub);
    	 
    	 ta=new JTextArea();
    	 ta.setEditable(false); // 비활성화 
    	 ta.setBounds(410, 205, 460, 410);
    	 add(ta);
    	 
    	 JPanel p=new JPanel();
    	 b=new JButton("목록으로");
    	 p.add(b);
    	 p.setBounds(400, 625, 485, 35);
    	 add(p);
    	 
    	 setSize(1280, 720);
     }
 /*	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		new ReviewDetailPanel();
 	}*/
}
