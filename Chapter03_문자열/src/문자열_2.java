// 문자열 => 알파벳을 입력 받아서 => A, a의 갯수가 몇개인지 확인
import javax.swing.*;
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha=JOptionPane.showInputDialog("알파벳 입력:"); // 알파벳 입력:Korea Japan Argentina
		int count=0;
		for(int i=0;i<alpha.length();i++) // length() : 문자 갯수
		{
			char c=alpha.charAt(i); // charAt() : 문자 1개씩 추출
			if(c=='A' || c=='a')
			{
				count++;
			}
		}
	//	System.out.println(alpha+"에서 A,a는 총 "+count+"개이다."); // Korea Japan Argentina에서 A,a는 총 5개이다.
		JOptionPane.showMessageDialog(null, alpha+"에서 A,a는 총 "+count+"개이다.");
												// Korea Japan Argentina에서 A,a는 총 5개이다.
	}

}
