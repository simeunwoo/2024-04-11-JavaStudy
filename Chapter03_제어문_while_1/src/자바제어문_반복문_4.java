// while => while이 주로 사용되는 형식 => 무한루프 => while(true)

// for(;;) == while(true)
public class 자바제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(true) // for(;;)와 같은 뜻
		{System.out.println("i="+i);
		i++;
		}
	}

}
