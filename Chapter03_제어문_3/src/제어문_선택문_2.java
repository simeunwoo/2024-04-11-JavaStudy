
public class 제어문_선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3); // 0,1,2 => 고정되었으므로 default는 필요 없다
		// 정수 중에서 상수형도 가능 (상수도 정수 개념에 포함)
		switch(com) // 정수
		{
			case 0: // case에 0,1,2를 넣는 순서는 상관 없다
					// 다만, 분석이나 추가하는데 있어 주로 순차적으로 서술하긴 한다
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break; // 여기서 break가 없다면 => 바위와 보 동시 수행 가능
			case 2:
				System.out.println("보");
				// 맨 밑에는 break를 넣어도 되고 안 넣어도 됨
			// default 생략이 가능 (0,1,2 외에 다른 경우가 생길 일이 없으므로)
		}
	}

}
