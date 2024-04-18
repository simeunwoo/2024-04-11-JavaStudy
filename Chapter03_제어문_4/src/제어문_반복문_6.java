
public class 제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. A~Z까지 출력
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" "); // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		}
		System.out.println(); // 다음 줄로 이동 (println의 역할)
		for(char c='a';c<='z';c++)
		{
			System.out.print(c+" "); // a b c d e f g h i j k l m n o p q r s t u v w x y z
		}
		System.out.println();
		for(char c='Z';c>='A';c--)
		{
			System.out.print(c+" "); // Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
		}
	}

}
