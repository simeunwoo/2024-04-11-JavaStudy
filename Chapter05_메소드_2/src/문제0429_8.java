
public class 문제0429_8 {
	static char munje(int score)
	{
		char c=' ';
		switch(score/10)
		{
		case 10: case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=munje(85);
		System.out.println(c); // B
	}

}
