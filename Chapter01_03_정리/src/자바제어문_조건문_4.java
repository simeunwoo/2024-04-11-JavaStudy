// if~else

import java.util.Scanner;
import javax.swing.*;
public class 자바제어문_조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String id=JOptionPane.showInputDialog("ID 입력:");
		String pwd=JOptionPane.showInputDialog("비밀번호 입력:");
		final String ID="admin"; // 이렇게 입력해야 로그인이 된다는 뜻
		final String PWD="1234";
		
		if(ID.equals(id) && PWD.equals(pwd))
		{
			// 로그인
			JOptionPane.showMessageDialog(null, id+"씨 로그인했다\n메인으로 이동한다");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 틀렸다\n다시해");
		}
	}

}
