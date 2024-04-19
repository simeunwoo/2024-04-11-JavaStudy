/*
 * 	연산자
 * 		1. 단항연산자 : 연산대상(피연산자) => 1개 ----------> int a=10; ++a, --a
 * 			= 증감연산자 : 반복문에서 주로 사용			boolean bCheck=true => !bCheck
 * 				++, -- : 1증가, 1감소					int a=65; => (char)a
 * 				-------
 * 				전치 연산자
 * 				++a => 먼저 증가 나중에 다른 연산 처리
 * 				int a=10;
 * 				int b=++a;
 * 				a=a+1;
 * 				b=a;
 * 				-------
 * 				후치 연산자
 * 				a++ => 먼저 다른 연산 처리 나중에 증가
 * 				int a=10;
 * 				int b=a++;
 * 				b=a;
 * 				a=a+1;
 * 				*** ++a, a++ => a는 무조건 1개 증가한다
 * 				int a=10;
 * 				System.out.println(a++); => 출력 후에 증가 => 10
 * 				System.out.println(++a); => 증가 후에 출력 => 11
 * 			= 부정연산자 : 조건문에서 주로 사용
 * 				무조건 결과값 : true/false => !
 * 				6==8 => false
 * 				!(6==8) => true => 반댓값
 * 			= 형변환연산자 : 실수->정수 / 문자->정수 / 정수->문자 ...
 * 				데이터형에 대한 형변환 => 클래스 형변환 (is-a, has-a)
 * 				데이터형의 크기 : byte<char<int<long<float<double
 * 								------------> 데이터형을 크게 (UpCasting)
 * 								<------------ 데이터형을 작게 (DownCasting)
 * 				=> UpCasting : 자동 변경
 * 				=> DownCasting : 강제 변경 (형변환 연산자)
 * 			ex)	int a='A' : char=>int 변경
 * 				double d=10 : int=>double 변경
 * 				int a=(int)10.5 : double=>int 변경이 안된다 => 강제 변경 (형변환 연산)
 * 				=> 연산처리 시에 주로 형변환이 많다
 * 				연산 => 데이터형이 같은 것끼리 연산
 * 				10+10.5 (연산처리 X) => 10.0+10.5 (int=>double 변경)
 * 				'A'+1 (연산처리 X) => 65+1 (char=>int 변경)
 * 				===> 자동으로 큰 데이터형으로 변경 후에 연산처리
 * 				형변환 : (데이터형)
 * 					= byte 변경 => (byte)10 => 10
 * 					= char 변경 => (char)65 => 'A'
 * 					= double 변경 => (double)10 => 10.0
 * 					*** boolean은 형변환이 없다 (형변환은 숫자와 관련)
 * 					*** 형변환은 필요 시에만 하면 된다 (무조건 할 필요는 X)
 * 
 * 		2. 이항연산자 : 연산대상(피연산자) => 2개
 * 			= 산술연산자
 * 				=> 비트연산자(&,|,^), 쉬프트연산자(<<,>>), 반전연산자(~ : 양수->음수,음수->양수에 사용)
 * 				=> +, -, *, /, % => 5개의 연산
 * 				+
 * 				=> 덧셈 : 10+10=20
 * 				=> 문자열 결합 : "Hello "+"Korea" => "Hello Korea"
 * 				/
 * 				=> 0으로 나눌 수 없다
 * 				=> 정수/정수=정수
 * 				%
 * 				=> 부호(+/-)는 왼쪽 편의 부호만 남는다
 * 				*** 연산처리가 될 때 => 다른 데이터형일 경우 => 큰 데이터형으로 결과값이 나온다
 * 					int+double=double / int+char=int / long+int+double=double
 * 					*** int 이하 (byte,char)는 연산 결과가 int로 나온다
 * 					byte+byte=int / byte+char=int / char+char=int
 * 			= 비교연산자
 * 			= 논리연산자
 * 			= 대입연산자
 * 		3. 삼항연산자
 * 	
 */
public class 자바연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
	//	System.out.println(a++); // 10
		System.out.println(++a); // 11
	}

}
