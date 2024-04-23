import javax.swing.*;
public class 문자열_4 extends JFrame {
	JTextField tf=new JTextField();
	public 문자열_4()
	{
		add("North",tf);
		tf.setText(String.valueOf(1000)); // 문자열 밖에 안들어가므로 문자열로 변환
		setSize(350,300);	// |- String.valueOf(정수/실수/문자) : 정수/실수/문자를 문자열로 변환
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열_4();
	}

}
