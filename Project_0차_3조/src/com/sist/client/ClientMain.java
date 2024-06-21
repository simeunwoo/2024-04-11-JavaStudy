package com.sist.client;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.dao.BoardDAO;
import com.sist.dao.BoardVO;
import com.sist.dao.EmpMemberDAO;
import com.sist.dao.EmpVO;
import com.sist.dao.GoodsDAO;
import com.sist.dao.MemberDAO;
import com.sist.dao.MemberVO;
import com.sist.dao.ZipDAO;
import com.sist.dao.ZipVO;


public class ClientMain extends JFrame implements ActionListener, MouseListener, Runnable{
	LoginPanel login = new LoginPanel();
	CardLayout card = new CardLayout();
	MainPanel mp = new MainPanel();
	JoinPanel jp = new JoinPanel();
	PostFindFrame pff = new PostFindFrame();

	String myId;

	Socket s; // 통신기기 => 핸드폰 
	OutputStream out; // 서버로 전송 
	BufferedReader in; // 서버로부터 값을 받는다 
	boolean check = false;

	public ClientMain() {
		setLayout(card);
		setSize(1280, 720);
		setVisible(true);

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		add("LOGIN", login);
		add("CONTROL", mp);
		add("JOIN", jp);

		mp.mp.exitBtn.addActionListener(this);		// 나가기 버튼
		mp.mp.boardBtn.addActionListener(this);		// 게시판 이동 버튼
		mp.mp.chatBtn.addActionListener(this);		// 채팅방 이동 버튼
		mp.mp.findBtn.addActionListener(this);		// 사원 검색 버튼
		mp.mp.searchBtn.addActionListener(this);	// 상품검색 버튼
		mp.mp.homeBtn.addActionListener(this);		// 쇼핑몰 홈 버튼
		mp.mp.empBtn.addActionListener(this);		// 사원목록 버튼

		mp.cp.dp.b1.addActionListener(this);		//
		mp.cp.dp.b2.addActionListener(this);		//

		mp.cp.fp.tf.addActionListener(this);		// 검색창 엔터로 검색
		mp.cp.fp.b.addActionListener(this);			// 검색버튼 눌러서 검색
		mp.cp.fp.table.addMouseListener(this);		// 상세보기 위해 회원 클릭

		mp.cp.cp.b1.addActionListener(this);
		mp.cp.cp.b2.addActionListener(this);
		mp.cp.cp.ob.addActionListener(this);
		mp.cp.cp.sendTf.addActionListener(this);
		mp.cp.cp.tf.addActionListener(this);
		
		mp.cp.ep.table.addMouseListener(this);
		mp.cp.ep.table2.addMouseListener(this);
		
		mp.cp.fp.table.addMouseListener(this);

		login.btnClose.addActionListener(this);		// 로그인 종료창
		login.btnLogin.addActionListener(this);		// 로그인 버튼
		login.btnSignUp.addActionListener(this);	// 회원가입

		jp.b1.addActionListener(this);			// 중복체크
		jp.b2.addActionListener(this);			// 우편번호 검색
		jp.b3.addActionListener(this);			// 회원가입
		jp.b4.addActionListener(this);			// 취소

		pff.btn1.addActionListener(this);
		pff.tfAddress.addActionListener(this);
		pff.table.addMouseListener(this);
		
		mp.cp.blp.insertBtn.addActionListener(this);
		
		mp.cp.bip.b1.addActionListener(this);
		mp.cp.bip.b2.addActionListener(this);
		mp.cp.blp.table.addMouseListener(this);
		
		mp.cp.bdp.b1.addActionListener(this);
		mp.cp.bdp.b2.addActionListener(this);
		
		mp.cp.bup.b1.addActionListener(this);
		mp.cp.bup.b2.addActionListener(this);
		
		mp.cp.edp.list.addActionListener(this);
		mp.cp.edp.update.addActionListener(this);
		
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mp.mp.exitBtn) {
			try {
				out.write((Function.EXIT + "|\n").getBytes());
			} catch (Exception e2) {
			}
		}
		else if(e.getSource() == login.btnClose) {
			JOptionPane.showMessageDialog(this, "프로그램 종료");
			this.dispose();
			System.exit(0);
		}
		else if(e.getSource() == mp.mp.findBtn) {
			mp.cp.card.show(mp.cp, "FIND");
		}
		else if(e.getSource() == mp.mp.homeBtn) {
			mp.cp.card.show(mp.cp, "HOME");
		}
		else if(e.getSource() == mp.mp.empBtn) {
			mp.cp.card.show(mp.cp, "LIST");
		}
		else if(e.getSource() == mp.mp.searchBtn) {
			mp.cp.card.show(mp.cp, "SEARCH");
		}
		else if(e.getSource() == mp.mp.chatBtn) {
			mp.cp.card.show(mp.cp, "CHAT");
		}
		else if(e.getSource() == mp.mp.boardBtn) {
			mp.cp.blp.print();
			mp.cp.card.show(mp.cp, "BLIST");
		}
		else if(e.getSource() == mp.cp.blp.insertBtn) {
			mp.cp.bip.printBox(login.tfId.getText());
			mp.cp.card.show(mp.cp, "BINSERT");
		}
		else if(e.getSource() == jp.b1) {
			MemberDAO dao = MemberDAO.newInstance();
			String id = jp.idtf.getText().trim();
			if(id.length() < 1) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				jp.idtf.setText("");
				jp.idtf.requestFocus();
				return;
			}
			boolean bCheck = dao.checkId(id);
			if(bCheck) {
				JOptionPane.showMessageDialog(this, "사용 가능한 아이디 입니다");
				jp.b1.setVisible(false);
				jp.idtf.setEditable(false);
				check = true;
			}
			else {
				JOptionPane.showMessageDialog(this, "이미 사용중인 아이디 입니다");
				jp.idtf.setText("");
				jp.idtf.requestFocus();
				check = false;
			}
		}
		else if(e.getSource() == jp.b2) {
			pff.setVisible(true);
		}
		else if(e.getSource() == jp.b3) {
			MemberVO vo = new MemberVO();
			MemberDAO dao = MemberDAO.newInstance();
			if(!check)
			{
				JOptionPane.showMessageDialog(this, "아이디 중복확인을 해주세요");
				jp.idtf.requestFocus();
				return;
			}
			String id = jp.idtf.getText().trim();
			String pwd = String.valueOf(jp.pf.getPassword()).trim();
			if(pwd.length() < 1) {
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
				jp.pf.requestFocus();
				return;
			}
			String name = jp.nametf.getText().trim();
			if(name.length() < 1) {
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				jp.nametf.requestFocus();
				return;
			}
			String sex = "";
			if(jp.rb1.isSelected())
				sex = "남자";
			else
				sex = "여자";
			String post = jp.posttf.getText();
			if(post.length() < 1) {
				JOptionPane.showMessageDialog(this, "우편번호를 입력하세요");
				return;
			}
			String addr1 = jp.addrtf1.getText();
			String addr2 = jp.addrtf2.getText();
			String phone = "010-" + jp.teltf.getText();
			String email = jp.emailtf.getText().trim();
			if(email.length() < 1) {
				JOptionPane.showMessageDialog(this, "이메일주소를 입력하세요");
				jp.emailtf.requestFocus();
				return;
			}
			String birthday = jp.yeartf.getText() + "/" + jp.monthbox.getSelectedItem() + "/"
					+ jp.daytf.getText();
			if(birthday.length() < 1) {
				JOptionPane.showMessageDialog(this, "생년월일을 입력하세요");
				jp.yeartf.requestFocus();
				return;
			}
			vo.setId(id);
			System.out.println(vo.getId());
			vo.setPwd(pwd);
			System.out.println(vo.getPwd());
			vo.setName(name);
			System.out.println(vo.getName());
			vo.setSex(sex);
			System.out.println(vo.getSex());
			vo.setPhone(phone);
			System.out.println(vo.getPhone());
			vo.setPost(post);
			System.out.println(vo.getPost());
			vo.setAddr1(addr1);
			System.out.println(vo.getAddr1());
			vo.setAddr2(addr2);
			System.out.println(vo.getAddr2());
			vo.setEmail(email);
			System.out.println(vo.getEmail());
			vo.setBirthday(birthday);
			if(login.rbEmp.isSelected())
				vo.setEmpno(Integer.parseInt(jp.emptf.getText()));
			//
			dao.memberInsert(vo);
			JOptionPane.showMessageDialog(this, "회원 등록 성공");
			card.show(getContentPane(), "LOGIN");
		}
		else if(e.getSource() == jp.b4) {
			jp.addrtf1.setText("");
			jp.addrtf2.setText("");
			jp.yeartf.setText("");
			jp.daytf.setText("");
			jp.monthbox.setSelectedIndex(1);
			jp.emailtf.setText("");
			jp.emptf.setText("");
			jp.idtf.setText("");
			jp.nametf.setText("");
			jp.posttf.setText("");
			jp.teltf.setText("");
			jp.idtf.setEditable(true);
			card.show(getContentPane(), "LOGIN");
		}
		else if ((pff.btn1 == e.getSource()) || (pff.tfAddress == e.getSource())) {
			ZipDAO dao = ZipDAO.newInstance();
			String dong = pff.tfAddress.getText();
			dong = dong.trim();
			if (dong.charAt(dong.length() - 1) == '동') {
				dong = dong.substring(0, dong.length() - 1);
			}
			if (dong.length() < 1) {
				JOptionPane.showMessageDialog(pff, "글자를 입력하세요");
				pff.tfAddress.requestFocus();
			}
			ArrayList<ZipVO> list = dao.zipFind(dong);
			pff.model.setNumRows(0);
			for (ZipVO z : list) {
				Vector<String> v = new Vector<String>();
				v.add(z.getZipcode());
				v.add(z.getSido() + " " + z.getGugun() + " " + z.getDong() + " " + z.getBunji());
				pff.model.addRow(v);
			}
		}
		
		//아이디 입력 여부 확인
		else if(e.getSource() == login.btnLogin) {			
			MemberDAO dao = MemberDAO.newInstance();
			try {
				String id = login.tfId.getText().trim();
				if(id.length() < 1) {
					JOptionPane.showMessageDialog(login, "아이디를 입력하세요");
					login.tfId.requestFocus();
					return;
				}
				// 비밀번호 입력 여부 확인
				String pwd = String.valueOf(login.pfPwd.getPassword()).trim();
				if(pwd.length() < 1) {
					JOptionPane.showMessageDialog(login, "비밀번호를 입력하세요");
					login.pfPwd.requestFocus();
					return;
				} 
				// 아이디, 비밀번호로 DB 접근, 결과 확인
				// 아이디, 비밀번호 전부 맞은경우 => 해당 id에 admin을 result에 저장
				// 아이디 틀릴경우 NO ID
				// 비밀번호 틀릴경우 NO PWD
				String result = dao.memberLogin(id, pwd);
				// ID 틀린 경우
				if(result.equals("NO ID")) {
					JOptionPane.showMessageDialog(login, "아이디가 존재하지 않습니다");
					login.tfId.setText("");
					login.pfPwd.setText("");
					login.tfId.requestFocus();
					return;
				}
				// 비밀번호 틀린경우
				else if(result.equals("NO PWD")) {
					JOptionPane.showMessageDialog(login, "비밀번호가 틀렸습니다");
					login.pfPwd.setText("");
					login.pfPwd.requestFocus();
					return;
				}
				// 로그인 성공
				else {
					try
					{
						//1. 소켓 => 전화 걸기 
						s=new Socket("localhost",2226); // 조별 
						out=s.getOutputStream();
						System.out.println("id="+id);
						in=new BufferedReader(new InputStreamReader(s.getInputStream()));
						out.write((Function.LOGIN+"|"+id+"\n").getBytes());

					}catch(Exception ex) {ex.printStackTrace();}

					// 서버로 들어오는 값을 받아서 출력 
					new Thread(this).start(); // run을 호출 
					// rbNemp =  일반회원 라디오 버튼
					// 일반 회원 선택 후 로그인 한 경우 패널 이동
					if(login.rbNemp.isSelected()) {	
						mp.mp.empBtn.setVisible(false);
						mp.mp.findBtn.setVisible(false);
						card.show(getContentPane(), "CONTROL");
					}
					// rbEmp =  사원 라디오 버튼
					// 사원 선택 후 로그인 한 경우 패널 이동
					else {	
						mp.mp.searchBtn.setVisible(false);
						mp.mp.homeBtn.setVisible(false);
						// result에 들어간 admin 값이 N인 경우	=> 권한 없음
						if(result.toUpperCase().equals("N")) {
							System.out.println("관리자권한 X");
						}
						// result에 들어간 admin 값이 Y인 경우	=> 권한 있음
						else if(result.toUpperCase().equals("Y")) {
							System.out.println("관리자권한 O");
							card.show(getContentPane(), "CONTROL");
							mp.cp.card.show(mp.cp, "LIST");
						}
					}
				}
			}catch(Exception e1) {}
		}
		else if(e.getSource() == login.btnSignUp) {
			if(login.rbNemp.isSelected()) {
				jp.emptf.setVisible(false);
				jp.empLa.setVisible(false);
			}
			else {
				jp.emptf.setVisible(true);
				jp.empLa.setVisible(true);
			}
			jp.b1.setVisible(true);
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource() == mp.cp.dp.b1) {
			int stack = (int)(mp.cp.dp.box.getSelectedItem());
			String empno_temp = mp.cp.dp.boxEmp.getSelectedItem().toString();
			int empno = Integer.parseInt((empno_temp.substring(0, empno_temp.indexOf("."))));
			String goods_id = mp.cp.dp.laId.getText();
			MemberDAO mDao = MemberDAO.newInstance();
			GoodsDAO gDao = GoodsDAO.newInstance();
			System.out.println(Integer.parseInt(goods_id));
			mDao.updatePerformance(empno, stack);
			gDao.ordersInsert(login.tfId.getText(), Integer.parseInt(goods_id));
			JOptionPane.showMessageDialog(this, "구매 완료");
			mp.cp.card.show(mp.cp, "HOME");
		}
		else if(e.getSource() == mp.cp.dp.b2) {
			mp.cp.card.show(mp.cp, "HOME");
		}
		else if(e.getSource()==mp.cp.bdp.b1)
		{
					BoardDAO dao = BoardDAO.newInstance();
					BoardVO vo=dao.boardUpdateData(mp.cp.bdp.no);
					mp.cp.bup.printBox(login.tfId.getText());
					mp.cp.bup.subtf.setText(vo.getTitle());
					mp.cp.bup.ta.setText(vo.getContent());
					mp.cp.card.show(mp.cp, "BUPDATE");
		}
		else if(e.getSource()==mp.cp.bdp.b2)
		{
			mp.cp.blp.print();
			mp.cp.card.show(mp.cp, "BLIST");
		}

		else if(e.getSource() == mp.cp.fp.b || e.getSource()== mp.cp.fp.tf) {
			EmpMemberDAO dao = EmpMemberDAO.newInstance();
			String name = mp.cp.fp.tf.getText();
			if(name.length() < 1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하시오");
				mp.cp.fp.tf.requestFocus();
				return;
			}
			String select = mp.cp.fp.cb.getSelectedItem().toString();
			String option = "";
			if(select.equals("부서명")) {
				option = "dname";
			}
			else if(select.equals("사원명"))
				option = "ename";
			else if(select.equals("직위"))
				option = "job";
			ArrayList<EmpVO> list = dao.empFindData(name, option);
			if(list.size() < 1) {
				JOptionPane.showMessageDialog(this, "검색된 결과가 없습니다");
			}
			else {
				// 테이블 전체 삭제
				for (int i = mp.cp.fp.model.getRowCount()-1; i >= 0; i--) {
					mp.cp.fp.model.removeRow(i);
				}
				System.out.println(list.size());
				for (EmpVO vo : list) {
					try {
						Object[] obj = {
								vo.getEmpno(),
								vo.getEname() ,
								vo.getJob(),
								vo.getSal(),
								vo.getHiredate(),
								vo.getDvo().getDname(),
								vo.getDvo().getLoc(),
								vo.getPerformance()
						};
						mp.cp.fp.model.addRow(obj);
					} catch (Exception ex) {}
				}
			}
		}
		else if(e.getSource()==mp.cp.cp.tf)
		{
			String msg=mp.cp.cp.tf.getText();
			if(msg.length()<1)
				return;

			String color=mp.cp.cp.box1.getSelectedItem().toString();

			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}

			mp.cp.cp.tf.setText("");
			mp.cp.cp.tf.requestFocus();
		}
		else if(e.getSource()==mp.cp.cp.b1)
		{
			String you=mp.cp.cp.box2.getSelectedItem().toString();
			if(!you.equals("상담자"))
			{
				try
				{
					out.write((Function.ONEINIT+"|"+you+"|"+myId+"\n").getBytes());
				}catch(Exception ex){}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "상담자를 선택하세요!!");
			}
		}
		else if(e.getSource() == mp.cp.cp.sendTf) {
			String youId = mp.cp.cp.youTf.getText();
			String msg = mp.cp.cp.sendTf.getText();
			if(msg.length() < 1)
				return;
			try {
				out.write((Function.ONETOONE + "|" + youId + "|" + msg + "\n").getBytes());
			} catch (Exception e2) {}
			mp.cp.cp.sendTf.setText("");
			mp.cp.cp.sendTf.requestFocus();
		}
		else if(e.getSource()==mp.cp.cp.tf)
		{
			String msg=mp.cp.cp.tf.getText();
			if(msg.length()<1)
				return;

			String color=mp.cp.cp.box1.getSelectedItem().toString();

			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}

			mp.cp.cp.tf.setText("");
			mp.cp.cp.tf.requestFocus();
		}

		else if(e.getSource()==mp.cp.bip.b1)
		{
			System.out.println("check");
			String subject=mp.cp.bip.subtf.getText();
			if(subject.length()<1)
			{
				mp.cp.bip.subtf.requestFocus();
				return;
			}
			String content=mp.cp.bip.ta.getText();
			if(content.length()<1)
			{
				mp.cp.bip.ta.requestFocus();
				return;
			}
			
			BoardVO vo=new BoardVO();
			vo.setId(login.tfId.getText());
			vo.setTitle(subject);
			vo.setContent(content);
			
			mp.cp.bip.dao.boardInsert(vo);
			
			mp.cp.bip.subtf.setText("");
			mp.cp.bip.ta.setText("");
			mp.cp.blp.print();
			mp.cp.card.show(mp.cp, "BLIST");
		}
		else if(e.getSource()==mp.cp.bip.b2)
		{
			mp.cp.bip.subtf.setText("");
			mp.cp.bip.ta.setText("");
			mp.cp.card.show(mp.cp, "BLIST");
		}
		
		else if(e.getSource()==mp.cp.bup.b1)
		{
			BoardDAO dao = BoardDAO.newInstance();
			String subject=mp.cp.bup.subtf.getText();
			if(subject.length()<1) // NOT NULL => 강제로 입력 => 웹 (유효성 검사 => 자바스크립트)
			{
				mp.cp.bup.subtf.requestFocus();
				return;
			}
			String content=mp.cp.bup.ta.getText();
			if(content.length()<1)
			{
				mp.cp.bup.ta.requestFocus();
				return;
			}
			
			// 데이터를 모아서 DAO로 전송
			BoardVO vo=new BoardVO();
			vo.setBno(mp.cp.bdp.no);
			vo.setId(login.tfId.getText());
			vo.setTitle(subject);
			vo.setContent(content);
			
			dao.boardUpdate(vo);
			
			// 데이터베이스 연동
			
			// 이동
				JOptionPane.showMessageDialog(this, "수정이 완료되었습니다");
				mp.cp.bdp.print(mp.cp.bdp.no);
				mp.cp.card.show(mp.cp, "BDETAIL");
		}
		else if(e.getSource()==mp.cp.bup.b2)
		{
			mp.cp.card.show(mp.cp, "BDETAIL");
		}
		else if (e.getSource() == mp.cp.edp.list) {
			mp.cp.card.show(mp.cp, "LIST");
		} else if (e.getSource() == mp.cp.edp.update) {
			mp.cp.card.show(mp.cp, "EUPDATE");
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == mp.cp.fp.table) {
			if(e.getClickCount() == 2) {
				int row = mp.cp.fp.table.getSelectedRow();
				String no = mp.cp.fp.model.getValueAt(row, 0).toString();
				mp.cp.fp.tf.setText("");
				mp.cp.card.show(mp.cp, "LIST");
			}
		}
		else if (pff.table == e.getSource()) {
			if (e.getClickCount() == 2) {
				int row = pff.table.getSelectedRow();
				String post = (String) pff.table.getValueAt(row, 0);
				String Address = (String) pff.table.getValueAt(row, 1);
				jp.addrtf1.setText(Address);
				jp.posttf.setText(post);
				pff.dispose();
			}
		}
		else if(e.getSource()==mp.cp.blp.table)
		{
			if(e.getClickCount()==2)
			{
				// 선택된 위치 
				BoardDAO dao = BoardDAO.newInstance();
				int row=mp.cp.blp.table.getSelectedRow();
				String no=mp.cp.blp.model.getValueAt(row, 0).toString();
				BoardVO vo=dao.boardDetailData(Integer.parseInt(no));
				mp.cp.bdp.no = Integer.parseInt(no);
				mp.cp.bdp.id.setText(vo.getId());
				mp.cp.bdp.day.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
				mp.cp.bdp.hit.setText(String.valueOf(vo.getHit()));
				mp.cp.bdp.sub.setText(vo.getTitle());
				mp.cp.bdp.ta.setText(vo.getContent());
				// 화면 이동 
				mp.cp.card.show(mp.cp, "BDETAIL");
			}
		}
		else if(e.getSource() == mp.cp.ep.table) {
			if(e.getClickCount() == 2) {
				int row=mp.cp.ep.table.getSelectedRow();
				System.out.println(row);
				String no=mp.cp.ep.model.getValueAt(row, 0).toString();
				System.out.println(no);
				mp.cp.edp.print(no);
				mp.cp.card.show(mp.cp, "EDETAIL");
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<mp.cp.hp.imgs.length;i++)
		{
			if(e.getSource()==mp.cp.hp.imgs[i])
			{
				mp.cp.hp.imgs[i].setBorder(null);
			}
		}
	}
	
	@Override
	public void run() {
		try
		{
			while(true)
			{
				String msg=in.readLine(); // 서버 응답값 
				System.out.println("Server =>"+msg);
				StringTokenizer st=new StringTokenizer(msg,"|");
				int delimit=Integer.parseInt(st.nextToken());
				switch(delimit)
				{
				case Function.LOGIN:
				{
					String[] data= {
							st.nextToken(),
							st.nextToken(),
							st.nextToken()
					};
					mp.cp.cp.model.addRow(data);
					String admin=st.nextToken();

					if(!myId.equals(data[0]) && admin.equals("y"))
					{

						mp.cp.cp.box2.addItem(data[0]);
					}


				}
				break;
				case Function.MYLOG:
				{
					myId=st.nextToken();
					String name=st.nextToken();
					String admin=st.nextToken();
					if(admin.equals("y"))
					{
						mp.cp.cp.b1.setEnabled(false);
					}
					setTitle(name+"님의 채팅창");
				}
				break;
				case Function.CHAT:
				{
					String message=st.nextToken();
					String color=st.nextToken();
					mp.cp.cp.initStyle();

					mp.cp.cp.append(message, color);
				}
				break;
				case Function.ONEINIT:
				{
					String userId=st.nextToken();
					int sel=JOptionPane.showConfirmDialog(this,userId+"님이 상담을 요청하셨습니다",
							"상담요청",JOptionPane.YES_NO_OPTION);
					if(sel==JOptionPane.YES_OPTION)
					{
						out.write((Function.ONEYES+"|"+userId+"\n").getBytes());
					}
					else
					{
						out.write((Function.ONENO+"|"+userId+"\n").getBytes());
					}
				}
				break;
				case Function.ONENO:
				{
					String adminId=st.nextToken();
					JOptionPane.showMessageDialog(this, adminId+"님이 거절하셨습니다");
				}
				break;
				case Function.ONEYES:{
					String id = st.nextToken();
					mp.cp.cp.youTf.setText(id);
					mp.cp.cp.pan.setVisible(true);
				}
				break;
				case Function.ONETOONE:{
					mp.cp.cp.ta.append(st.nextToken() + "\n");
				}
				break;
				case Function.EXIT:{
					String yid = st.nextToken();
					for(int i = 0 ; i < mp.cp.cp.model.getRowCount() ; i++) {
						String s = mp.cp.cp.model.getValueAt(i, 0).toString();
						if(s.equals(yid)) {
							mp.cp.cp.model.removeRow(i);
							break;
						}
					}
					for(int i = 0 ; i < mp.cp.cp.box2.getItemCount() ; i++) {
						String s = mp.cp.cp.box2.getItemAt(i);
						if(s.equals(yid)) {
							mp.cp.cp.box2.removeItemAt(i);
							break;
						}
					}
				}
				break;
				case Function.MYEXIT:{
					System.exit(0);
				}
				}
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}
}