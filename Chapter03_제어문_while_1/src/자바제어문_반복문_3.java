/*
 * 	A-Z => for
 * 	Z-A => while
 */
public class 자바제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='A';c<='Z';c++)
			{System.out.print(c+" ");}
		
		System.out.println();
		char w='Z';
		while(w>='A')
		{
			System.out.print(w+" ");
			w--;
		}
	}

}
