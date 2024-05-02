// (메소드정리_4 참고)
import java.util.*;
public class 메소드정리_메소드화 {
	// 1. 3개의 중복 없는 난수 발생
	static void rand(int[] com)
	{
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			// 중복 체크
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--; // 다시 발생 (원상 복귀)
					break;
				}
			}
		}
	}
	
	// 2. 사용자로부터 3개의 정수 입력
	static void inputData(int[] user)
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			// 오류 처리
			if(input<100 || input>999)
			{
				// || => 범위를 벗어난 경우
				System.out.println("세자리라고");
				// 처음 상태로 돌아간다
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 오류 처리
			if(user[0]==user[1] || user[0]==user[1] || user[1]==user[2])
			{
				System.out.println("같은 수가 되겠냐고");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0이 되겠냐고");
				continue;
			}
			break; // 종료
		}
	}
	
	// 3. '난수 vs 사용자 입력값' 비교
	static int compare(int[] com,int[] user)
	{
		int s=0,b=0;
		for(int i=0;i<com.length;i++)
		{
			for(int j=0;j<user.length;j++)
			{
				// i=0 => j=0,1,2
				// i=1 => j=0,1,2
				// i=2 => j=0,1,2
				if(com[i]==user[j]) // 같은 수가 있는가
				{
					if(i==j) // 같은 자리인가 = 스트라이크인가
						s++;
					else // 다른 자리인가 = 볼인가
						b++;
				}
			}
		}
		hint(user,s,b);
		return s;
	}
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	
	// 4. 힌트 제공
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	
	// 전체 메소드 조립
	static void process()
	{
		int[] com=new int[3];
		// 난수
		rand(com); // 배열 주소를 메소드로 전송 => 값을 변경해서 가지고 온다 (Call By Reference)
	//	System.out.println(Arrays.toString(com));
		
		int[] user=new int[3];
	//	inputData(user);
	//	System.out.println(Arrays.stream(user));
		
		while(true)
		{
			inputData(user);
			int s=compare(com,user);
			if(isEnd(s))
			{
				System.out.println("GAME OVER");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(); // 완성된 메소드만 호출
	}

}
