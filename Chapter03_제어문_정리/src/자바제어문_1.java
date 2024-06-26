/*
 * 	1. 변수 : 데이터 한개만 저장하는 메모리 공간
 * 		=> 여러개 (배열, 클래스)
 * 		=> 데이터형 (정수, 실수, 문자, 논리)
 * 		=> 식별자 : 변수명 설정 *** 대소문자 구분 Name!=name
 * 		=> 약속 (문법)
 * 		   -------- => 리팩토링
 * 			1. 클래스, 인터페이스명은 대문자로 시작한다
 * 				class Main
 * 				=> Main main=new Main()
 * 				   -------------------- 웹에서는 한글이 깨진다 => 이름을 알파벳
 * 				=> 두개의 단어를 이용할 경우 (대문자, _)
 * 					MainClass
 * 					-	-
 * 					File_name
 * 			2. 변수, 메소드 => 소문자 시작
 * 			3. 상수 => 모든 알파벳이 대문자
 * 			4. 들여쓰기
 * 	-------
 * 	2. 연산자 : 요청 처리 => 변수를 가공한다
 * 		1) 단항연산자
 * 		=> 증감연산자 (++, --)
 * 		=> 부정연산자 (!)
 * 		=> 형변환연산자 (type)
 * 		2) 이항연산자
 * 		=> 산술연산자 (+, -, *, /, %)
 * 		=> 비교연산자 (==, !=, >, <, >=, <=)
 * 		=> 논리연산자 (&&, ||)
 * 		=> 대입연산자 (=, +=, -=)
 * 		3) 삼항연산자
 * 		=> (조건)?값1:값2 => if~else => 웹, 게임 (소스를 줄일 경우)
 * 	3. 제어문 : 프로그램 자체 제어
 * 		=> 필요한 내용만 출력 (아니면 건너뛴다) => 조건문
 * 		=> 소스가 반복적일 경우 => 반복문
 * 		=> 반복문에 제어 => 반복문 종료, 반복문에서 제외
 * 		1) 조건문
 * 		=> 단일조건문 : 조건에 맞는 경우에만 출력
 *			if(조건문) => true/false => 부정/비교/논리연산자
 *			{
 *				true => 문장을 수행
 * 			} => false면 건너 뛴다
 * 			*** 여러개 사용 시에는 독립으로 사용이 된다 => 모든 조건을 검색
 * 		=> 선택조건문
 * 			=> true/false일 경우 나눠서 처리 => 웹, 윈도우에서 가장 많이 사용
 * 			예) 로그인(O) => main
 *				로그인(X) => 로그인 요청 => 회원가입
 *				if~else
 * 		=> 다중조건문
 * 	------- 한개의 기능 설정 => 메소드
 * 	---------------------------- + 통합 (클래스)
 * 	클래스 : 데이터형 / 통합
 * 					=> 웹 출력 (브라우저 : HTML)
 * 
 * 	String : 문자열을 저장하는 데이터형 (웹에서 가장 많이 사용)
 * 	브라우저 => 자바로 값 전송
 * 	-------------------- => 무조건 문자열
 * 
 *	whlie : 무한 반복 (반복 횟수를 모르는 경우)
 *		=> 초기값에서 false면 조건식으로 가기도 전에 종료 가능
 *		=> 서버 프로그램 (Back-End)
 *		=> 파일 읽기 / 데이터베이스 / 빅데이터 (챗봇)
 * 	반복제어문 : break, continue
 * 	break => 제어문을 종료 => 반복문, 선택문
 * 	continue => 반복문에서만 사용 => 제외
 * 
 * 	
 * 	###	for, while => break를 사용하면 종료
 * 	### for => continue => 증가식으로 이동
 * 	### while => continue => 조건식으로 이동
 *
 *	### while(조건문) => 주의점 : continue를 잘못 사용하면 무한루프에 빠질 수 있다
 *
 *		int i=1;
 *		while(i<=5)
 *		{
 *			if(i==3) continue; => 무한루프의 덫 => while(true)
 *			System.out.println(i)
 *			i++;
 *		}
 *
 *		i=1 => i<=5 => 1 => i++
 *		i=2 => i<=5 => 2 => i++
 *		i=3 => continue => i<=5 (무한루프의 덫)
 *
 */
public class 자바제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== for-break 반복문 중단 ===");
		for(int i=1;i<=5;i++)
		{
			if(i==3)
				break; // 3일 때 종료 명령
			System.out.println("i="+i); // i=1, i=2 // i=3 (X) => 앞에서 break 했기 때문
		}
		
		System.out.println("=== while=break 반복문 중단===");
		int i=1;
		while(i<=5)
		{
			if(i==3)
				break;
			System.out.println("i="+i);
			i++;
		}
		
		System.out.println("=== do~while 반복문 중단===");
		i=1;
		do
		{
			if(i==3)
				break;
			System.out.println("i="+i);
			i++;
		}
		while(i<=5);
	}

}
