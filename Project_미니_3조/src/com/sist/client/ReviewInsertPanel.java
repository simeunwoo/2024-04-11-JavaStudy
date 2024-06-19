package com.sist.client;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class ReviewInsertPanel extends JPanel {

    JLabel titleLa,subLa,contentLa,recomLa;
    JTextField subtf;
    JTextArea ta;
    JComboBox<String> box;
    JButton b; // 작성 완료
    /*
    타이틀
    제목
    내용
    사원 추천하기
     */
    public ReviewInsertPanel()
    {
    	setLayout(null);
    	titleLa=new JLabel("제품 후기",JLabel.CENTER);
    	titleLa.setFont(new Font("휴먼모음T",Font.BOLD,35));
    	titleLa.setBounds(175, 50, 930, 40);
    	add(titleLa);
    	
    	subLa=new JLabel("제목",JLabel.RIGHT);
    	subLa.setBounds(250, 118, 90, 30);
    	add(subLa);
    	
    	subtf=new JTextField();
    	subtf.setBounds(365, 120, 550, 30);
    	add(subtf);
    	
    	recomLa=new JLabel("사원 추천하기",JLabel.RIGHT);
    	recomLa.setBounds(250, 600, 90, 30);
    	add(recomLa);
    	
    	box=new JComboBox();
    	box.addItem("010");
    	box.setBounds(365, 600, 90, 30);
    	add(box);
    	
    	contentLa=new JLabel("내용",JLabel.RIGHT);
    	contentLa.setBounds(250, 160, 90, 30);
    	add(contentLa);
    	
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	js.setBounds(365, 165, 550, 420);
    	add(js);
    	
    	b=new JButton("입력 완료");
    	b.setBounds(765, 600, 150, 30);
    	add(b);
    	
    	setSize(1280, 720);
    }
}