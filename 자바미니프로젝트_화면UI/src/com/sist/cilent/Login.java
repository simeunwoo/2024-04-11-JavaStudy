package com.sist.cilent;
/*
 * 	윈도우 (컨테이너)
 * 		= *** JFrame : 기본 윈도우 => 최소화, 최대화, 닫기
 * 		= JWindow : 타이틀 바가 없다
 * 		= *** JPanel : 단독 수행이 불가능 => JFrame, JWindow => 화면 변경
 * 		= JDialog : 검색어를 입력하세요
 * 
 * 	컴포넌트
 * 		= 버튼
 * 			=> 메뉴 : JMenu <ul>
 * 			=> 버튼 : JButton, 라디오 : JRadioButton, 체크 : JCheckBox
 * 				<input type=text>
 * 				<input type=radio>
 * 				<input type=checkbox>
 * 		= 입력창
 * 			=> 한줄 : JTextField, JPassworldField
 * 				<input type=text> <input type=password>
 * 			=> 여러줄 입력 : JTextArea
 * 				<textarea>
 * 		= 라벨 => JLabel <label>
 * 		= 테이블 => JTable <table>
 * 		= 트리 => JTree
 * 
 * 	배치
 * 		= BorderLayout
 * 		= FlowLayout
 * 		= GridLayout
 * 		= CardLayout
 * 		= 사용자 정의 => 직접 배치
 * 
 * 	---------------------------------------------
 * 	1. JFrame 상속
 * 	2. 필요한 컴포넌트를 포함
 * 	3. 생성자 초기화 => 배치
 * 
 * 	// NoireLookAndFeel
 * 
 * 	=> 라벨 2
 * 	=> JTextField
 * 	=> JPassworldField
 * 	=> JButton 2
 */
import javax.swing.*; // javafx
public class Login extends JFrame {
	// 포함 클래스
	/*
	 * 	모든 멤버 변수는 private이 아니다 => 라이브러리는 public으로 설정
	 */
	public JLabel la1, la2; // JLabel : 텍스트나 이미지 표시
	public JTextField tf; // JTextField : 사용자에게 한줄의 텍스트 입력을 받을 때 사용
	public JPasswordField pf; // JPassworldField : 사용자에게 패스워드 입력을 받을 때 사용
	public JButton b1, b2; // JButton : 사용자가 클릭할 수 있는 버튼을 생성
	
	// 초기화 => 화면 배치 => 생성자 => 다른 클래스와 연결 => public
	public Login()
	{
		setTitle("로그인");
		// 초기화
		la1=new JLabel("ID");
		la2=new JLabel("PWD");
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		// 배치
		// 사용자 정의
		setLayout(null); // => BorderLayout
		la1.setBounds(10, 15, 80, 30); // x, y, 가로, 세로
		tf.setBounds(100, 15, 200, 30);
		// 윈도우 추가
		add(la1); add(tf);
		
		la2.setBounds(10, 55, 80, 30);
		pf.setBounds(100, 55, 200, 30);
		// 윈도우 추가
		add(la2); add(pf);
		
		JPanel p=new JPanel();
		p.add(b1); p.add(b2); // 가운데 정렬
		
		p.setBounds(10, 95, 290, 35);
		add(p);
		
		setSize(350, 175); // 윈도우 크기 결정
		setVisible(true); // 출력 여부
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
//		new Login();
		
		// 생성자 호출
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		}catch(Exception ex) {}
		
		new Login();
	}

}
