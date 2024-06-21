package com.sist.client;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sist.common.ImageChange;
import com.sist.dao.GoodsDAO;
import com.sist.dao.GoodsVO;
import com.sist.dao.MemberDAO;

public class GoodsDetailPanel extends JPanel implements ItemListener{
	public JLabel la1, la2, la3, la4, la5, la6, la7, la8, laId;
	public JButton b1, b2;
	public JComboBox<Integer> box;
	public JComboBox<String> boxEmp;
	JLabel pLa, tLa;
	ControlPanel cp;
	int no = 0;
	GoodsDAO dao;
	MemberDAO dao2;
	public GoodsDetailPanel(ControlPanel cp) {
		this.cp = cp;
		dao = GoodsDAO.newInstance();
		dao2 = MemberDAO.newInstance();
		String[] list = dao2.getEmp();
		setLayout(null);
		la1 = new JLabel();
		la1.setBounds(10, 15, 450, 550);
		add(la1);
		
		la2 = new JLabel();
		la2.setBounds(470, 15, 400, 45);
		add(la2);
		
		laId = new JLabel();
		
		la3 = new JLabel();
		la3.setBounds(470, 70, 350, 30);
		add(la3);
		
		la4 = new JLabel();
		la4.setBounds(470, 110, 60, 30);
		add(la4);
		
		la5 = new JLabel();
		la5.setBounds(540, 110, 120, 30);
		add(la5);
		
		la6 = new JLabel();
		la6.setBounds(470, 150, 120, 30);
		add(la6);

		la7 = new JLabel();
		la7.setBounds(600, 150, 120, 30);
		add(la7);
		
		la8 = new JLabel();
		la8.setBounds(470, 190, 120, 30);
		add(la8);
		

		b1 = new JButton("장바구니");
		b2 = new JButton("목록");
		JPanel p = new JPanel();
		
		p.add(b1); p.add(b2);
		p.setBounds(470, 400, 350, 35);
		add(p);
		
		pLa = new JLabel("금액");
		pLa.setBounds(470, 270, 200, 30);
		add(pLa);
		
		tLa = new JLabel("구매 총 금액");
		tLa.setBounds(470, 310, 200, 30);
		add(tLa);
		
		box = new JComboBox<Integer>();
		box.addItem(1);
		box.addItem(2);
		box.addItem(3);
		box.addItem(4);
		box.addItem(5);
		box.addItem(6);
		box.addItem(7);
		
		box.setBounds(470, 230, 200, 30);
		add(box);
		
		boxEmp = new JComboBox<String>(list);
		boxEmp.setBounds(470, 350, 100, 35);
		add(boxEmp);
		
		box.addItemListener(this);
	}
	public void print(int no) {
		laId.setText(String.valueOf(no));
		GoodsVO vo = dao.goodsDetailData(no);
		System.out.println(vo.getGoods_name());
		try {
			URL url = new URL(vo.getGoods_poster());
			Image img = ImageChange.getImage(new ImageIcon(url), 450, 550);
			la1.setIcon(new ImageIcon(img));
		} catch (Exception e) {}
		la2.setText("<html><fong size=12><b>" + vo.getGoods_name() + "</b></font></html>");
		la3.setText("<html><font color = gray>" + vo.getGoods_sub() + "</font></html");
		la4.setText("<html><font color = magenta>" + vo.getGoods_discount() + "</font></html>");
		la5.setText(vo.getGoods_price());
		la6.setText("<html><font color = green></font></html>");
		la6.setText("<html><font color = green>" + vo.getGoods_first_price() + "</font></html>");
		la7.setText("배송 : " + vo.getGoods_delivery());
		pLa.setText("가격 : " +vo.getGoods_price());
		tLa.setText("구매 총 가격 : " + vo.getGoods_price());
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == box){
			String price = pLa.getText();
			price = price.substring(price.indexOf(":") + 1);
			price = price.replaceAll("[^0-9]", "");
			
			int account = box.getSelectedIndex() + 1;
			int total = Integer.parseInt(price) * account;
			
			DecimalFormat df = new DecimalFormat("##,###,###");
			String s = df.format(total);
			tLa.setText("구매 총 가격 : " + total + "원");
		}
		
	}
}