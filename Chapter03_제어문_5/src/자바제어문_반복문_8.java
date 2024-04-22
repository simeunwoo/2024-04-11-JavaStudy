
public class 자바제어문_반복문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='B';
		for(int i=1;i<=5;i++) // 5번 출력하라는 뜻
		{
		//	char c='B'; // 이 경우 B B B B B 로 나옴
			System.out.print(c+" "); // B C D E F  
			c++;
			// c 변수는 여기까지만 사용 가능
		} // c변수는 여기서부터 사라진다
	}

}
