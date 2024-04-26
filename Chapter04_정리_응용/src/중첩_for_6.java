/*
 * 	1. 중복없는 난수 => 응용
 * 	-------------------
 * 	숫자 야구 게임
 * 	-----------
 * 	1. 난수 => 3개 3 6 9
 * 	2. 사용자 입력 => 7 8 9 => 3 6 9에 대하여 1S
 * 	3. 힌트
 * 	   같은 자리 => S (Strike)
 * 	   다른 자리 => B (Ball)
 * 
 * 	2장 => 연산자
 * 	3장 => 제어문
 * 	4장~ => (연산자+제어문) 묶음
 * 
 * 	1) 묶음
 * 		변수 여러개를 묶어서 관리
 * 		변수 여러개 => 제어문 사용이 어렵다 => 배열 (이름이 1개 => 구분자는 인덱스 : 0번부터 순차적으로)
 * 		-------- 평문을 사용한다
 * 
 * 		*** 배열은 변수가 3개 이상일 경우 (단, 사용 용도가 같을 경우)
 * 			ex) 나이, 학번, 학년 => 사용 용도가 다르다 => 그냥 일반 변수들로 해야 된다
 * 		==> 명령문 : 메소드 (아직 안배운 과정, 곧 배울 것임)
 * 			1개에 대한 정보 묶기
 * 			클래스
 * 			--------------- + 프로그램 1개 완성
 * 
 * 		난수 100개
 * 		int a1=(int)(Math.random()*100)+1;
 * 		...
 * 		int a100=(int)(Math.random()*100)+1;
 * 
 * 		최댓값 / 최솟값
 * 		int max=a1;
 * 		if(max<a2)
 * 			max=a2;
 * 		...
 * 		if(max<a100)
 * 			max=a100; =======> 굉장히 비효율 => 묶어서 배열로 활용하기
 * 
 * 		UpCasting => 데이터형을 크게 만든다 / 정수->실수, 문자->정수
 * 		DownCasting => 데이터형을 작게 만든다 / 실수->정수, 정수->문자
 * 
 * 		건너뛴다 : 단일조건문
 * 		선택한 내용만 처리 : 다중조건문, 선택문
 * 		오류 처리 : 조건문
 */
import java.util.Scanner;
public class 중첩_for_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컴퓨터가 난수를 발생 => 1~9 사이의 중복이 없는 숫자 3개
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			// 중복 여부 확인
			for(int j=0;j<i;j++) // 생성된 난수만큼만 비교
			{
				if(com[i]==com[j]) // 같은 수가 있는지 확인 => 비교연산/논리연산 만
				{
					i--; // 다시 난수를 발생한다
					break; // j가 있는 for문만 종료 => i++로 이동한다
				}
			}
		}
	//	System.out.println(Arrays.toString(com)); // [9, 7, 4]
		
		// 사용자가 입력한 데이터 저장
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		
		// 2. 사용자 입력 요청
		while(true) // 반복 횟수가 없다 => 무한루프 => 정답에 종료
		{
			System.out.print("세자리 정수를 입력해라:");
			int input=scan.nextInt();
			// 오류 처리 => 세자리 정수가 입력되지 않은 경우
			if(input<100 || input>999)
			{
				System.out.println("☞ 다시 해 : 세자리잖아");
				// while문의 처음으로 이동
				continue;
			}
			// 세자리 정수를 입력한 경우
			user[0]=input/100; // 백의 자리
			user[1]=(input%100)/10; // 십의 자리
			user[2]=input%10; // 일의 자리
			
			// 오류 처리 2개
			// 오류 처리 1. 같은 수인 경우는 안된다
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("☞ 다시 해 : 같은 수면 안된다");
				continue;
			}
			// 오류 처리 2. 0을 입력하면 안된다 ex) 036(X)
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("☞ 다시 해 : 0은 안된다");
				continue;
			}
			
			// 정상 입력이 되었다면
			// 3. 비교 => 힌트
			int s=0, b=0; // s는 숫자와 자리수가 맞는 경우 (Strike)
						  // b는 숫자와 자리수가 맞지 않는 경우 (Ball)
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) // user
				{
					if(com[i]==user[j]) // 같은 수가 존재하는지 확인
					{
						if(i==j) // 같은 수인데 자리도 같다면
							s++;
						else // 같은 수이지만 자리가 다르다면
							b++;
					}
				}
			}
			// 힌트 제공
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);

			// 4. 정답 여부 확인 => 정답이면 종료 (break) / 오답이면 다시 입력 (continue)
			if(s==3)
			{	System.out.println("정답!!!!!!!!!!!!!");
			break;
			}
/* (출력 결과)
세자리 정수를 입력해라:123
Input Number:123,Result:0S-1B
세자리 정수를 입력해라:456
Input Number:456,Result:0S-1B
세자리 정수를 입력해라:369
Input Number:369,Result:1S-0B
세자리 정수를 입력해라:358
Input Number:358,Result:1S-1B
세자리 정수를 입력해라:375
Input Number:375,Result:3S-0B
정답!!!!!!!!!!!!!

			 */
		}
	}

}
