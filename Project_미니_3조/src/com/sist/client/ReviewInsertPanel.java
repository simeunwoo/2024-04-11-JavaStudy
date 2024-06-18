package com.sist.client;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class ReviewInsertPanel extends JPanel {

    JLabel titleLa,subLa,recomLa;
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
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	titleLa.setBounds(10, 15, 930, 40);
    	add(titleLa);
    	
    	subLa=new JLabel("제목",JLabel.RIGHT);
    	subLa.setBounds(150, 80, 90, 30);
    	add(subLa);
    	
    	subtf=new JTextField();
    	subtf.setBounds(265, 80, 200, 30);
    	add(subtf);
    	
    	recomLa=new JLabel("사원 추천하기",JLabel.RIGHT);
    	recomLa.setBounds(470, 80, 150, 30);
    	add(recomLa);
    	
    	box=new JComboBox();
    	box.addItem("010");
    	box.setBounds(265, 395, 90, 30);
    	add(box);
    	
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	js.setBounds(265, 430, 450,170);
    	add(js);
    	
    	b=new JButton("입력 완료");
    	b.setBounds(470, 290, 150, 30);
    	add(b);
    	
    	setSize(1280, 720);
    }
}
