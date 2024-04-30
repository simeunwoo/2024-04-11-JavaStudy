/*
 * 	자바
 * 	= 변수 / 연산자 / 제어문 / 메소드
 * 	  ------------------------ 메소드 여러개 묶음 (클래스) => 재사용
 * 	= 메소드
 * 		=> 매개변수 : 사용자로부터 받는 값
 * 		=> 결과값 : 어떤 데이터를 넘겨주는지
 * 		=> 메소드명
 * 		=> 구현 => 결과값을 도출
 * 		=> 어느 위치에서 호출
 * 	------------------------------
 * 	1) 사용자 로그인 요청
 * 		매개변수 : id,password / 리턴형 : boolean
 * 	2) 아이디 중복 체크
 * 		매개변수 : id / 리턴형 : boolean
 * 	3) 우편 번호 검색
 * 		매개변수 : dong / 리턴형 : String[] (주소 여러개)
 * 	4) 맛집 검색
 * 		매개변수 : 검색어 (String) / 리턴형 : String[] (맛집 여러개)
 * 	5) 노래 검색
 * 		매개변수 : 검색어 (String) / 리턴형 : String[] (노래 여러개)
 * 		-------------------------------------------------- 결과값을 브라우저에 출력 (웹)
 * 	=> 형식)
 * 		어떤값을 받아서 어떤값을 보내줄지...
 * 		
 * 		리턴형 메소드명(매개변수...)
 * 		{
 * 			구현 ... (요청 처리)
 * 			return 결과값;	=====> 결과값의 데이터형과 리턴형의 데이터형은 동일해야 한다
 * 		}
 * 
 * 		데이터형 변수=메소드()
 * 		------ 리턴형에 설정한 데이터형이 동일
 *
 *	=> 기능 분리)
 *		# 입력 부분
 *		# 처리 부분
 *		# 출력 부분
 *		------------------- 모든 자바는 3가지 형태로 나뉘어진다
 *
 *	=> 리턴형 : 한가지 데이터형 (기본형) => 정수형/실수형/문자형/논리형
 *				> int 메소드명()
 *				> char 메소드명()
 *				> double 메소드명()
 *			  여러가지 데이터 (배열을 이용)
 *				> int[] 메소드명()
 *				> double[] 메소드명()
 *
 *	=> 매개변수 : 여러개 사용 가능
 *				=> 5개의 정수를 보내서 정렬하는 프로그램
 *				   --------
 *				   메소드명(int a,int b,int c,int d,int e)
 *					=> 메소드명(int[] arr)
 *					=> 3개까지 => 초과 시 배열을 이용
 *				메소드가 호출되면 항상 메소드 처음부터 실행 ...
 *				메소드 안에 선언되는 변수 : 메소드가 종료되면 사라진다
 *				------------------ 지역변수 (반드시 초기화)
 *				------------------ 매개변수 => 지역변수와 동일
 */
// 배열
// 5개의 정수를 임의로 추출 => 최댓값, 최솟값 구하기
public class 메소드_4 {
	// 1. 정수 추출 => 입력
	static int[] input() // 정수 여러개를 보내겠다(전송하겠다)
	{
		int[] arr=new int[5];
		
		// 2. 배열에 임의로 추출된 값을 저장
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		return arr; // 배열은 배열명만 전송 => 배열명 자체가 (메모리) 주소이므로
	}
	
	// 2. 최댓값 구하기 => 처리
	static int max(int[] arr) // int[] arr 설정 안하면 위에서 끝나고 사라지기 때문에 설정해야 한다
	{
		int max=arr[0];
		for(int i:arr)
		{
			if(max<i)
				max=i;
		}
		return max;
	}
	
	// 3. 최솟값 구하기 => 처리
	static int min(int[] arr)
	{
		int min=arr[0];
		for(int i:arr)
		{
			if(min>i)
				min=i;
		}
		return min;
	}
	
	// 4. 출력
	static void process()
	{
		// 정수 5개 받아서 출력
		int[] arr=input();
		int max=max(arr);
		int min=min(arr);
		for(int i:arr)
			System.out.print(i+" ");
			System.out.println("\n최댓값:"+max);
			System.out.println("최솟값:"+min);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process(); // 메소드는 파트별로 나눌 수 있어서 나중에 수정이나 기능 추가하기 편리하다
		
/*		// 1. 배열 선언
		int[] arr=new int[5];
		
		// 2. 배열에 임의로 추출된 값을 저장
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		// 3. 최댓값과 최솟값 구하기
		int min=arr[0]; int max=arr[0]; // min=100, max=0 보다는 이 방법을 써보자
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		// 전체 정수 출력
		for(int i:arr) // for-each문 => 거의 출력용
		{
			System.out.print(i+" ");
		}
		System.out.println();
		// 최댓값 및 최솟값 출력
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min); */
	}

}
