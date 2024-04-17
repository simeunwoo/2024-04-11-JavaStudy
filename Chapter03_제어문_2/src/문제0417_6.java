import java.util.Scanner;

public class 문제0417_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a;
		char b=' ';
		a=scan.nextInt();
		
		if(a>=90 && a<=100)
		{
			b='A';
		}
		else if(a>=80 && a<90)
		{
			b='B';
		}
		else if(a>=70 && a<80)
		{
			b='C';
		}
		else if(a>=60 && a<70)
		{
			b='D';
		}
		else if(a>=0 && a<60)
		{
			b='F';
		}
		System.out.println(b+"학점입니다");
	}

}
