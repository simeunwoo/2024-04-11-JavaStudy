/*
 * 		프로그램 => 변수,연산자,제어문
 * 				 ------------- => 많은 경우 => 이름을 한개로 압축
 * 								  ----------------------- 배열 / 클래스
 * 		배열 : 고정적이다, 같은 데이터형만 모아서 관리
 * 		클래스 : 가변적이다, 다른 데이터형을 모아서 관리 (*******)
 * 
 * 		=> 1. 변수를 여러개 묶음
 * 		=> 2. 명령문을 여러개 묶음
 * 		   ----------------- +
 * 								클래스 (한개에 대한 기능)
 * 								=> 게시판
 * 								=> 회원 : 가입, 탈퇴, 수정, 로그인, 아이디 찾기
 * 								------------------------------------- 다음에 재사용
 * 								재사용 => 이미 상용화 => 신뢰성
 * 
 * 		=> 문법은 변수, 연산자, 제어문 => 누가 더 잘 묶어 사용하는가?
 * 										   ------- 관련된 것만 묶어서 사용
 * 	 
 * 		프로그램 제어
 * 		---------
 * 		1. 조건문 : 프로그램에서 조건에 맞는 문장만 실행이 가능
 * 			= 단일조건문
 * 				if(조건문) = 부정연산자, 비교연산자, 논리연산자만 사용 가능 => true/false
 * 				{
 * 					조건이 true일 때 실행 문장
 * 					=> false면 건너 뛴다
 * 				}
 * 				=> 오류 처리, 검색어 입력이 없는 경우, 범위를 벗어난 경우,...
 * 				=> 입력창이 있는 경우
 * 				   ---- 회원가입 => 오라클 (NOT NULL) => * 필수 입력
 * 			= 선택조건문
 * 				if(조건문)
 * 				{
 * 					true일 때 처리
 * 				}
 * 				else
 * 				{
 * 					false일 때 처리
 * 				}
 * 				=> 서버 프로그램 => 요청 받아서 처리 => 결과값을 보내준다
 * 								---------------------------
 * 								로그인이 된 경우 => main 이동
 * 								로그인이 안된 경우 => 'ID, PWD가 틀리다' 알림
 * 			= 다중조건문
 * 				경우의 수가 많은 경우
 * 				=> 로그인
 * 					ID가 없는 경우
 * 					비밀번호가 틀린 경우
 * 					로그인 ...
 * 				=> 한번만 수행 => 해당 조건문 1개만 수행
 * 				if(조건)
 * 				{
 * 					조건 true => 처리 => 종료
 * 					false일 때는 밑에 있는 조건으로 이동
 * 				}
 * 				else if(조건)
 * 				{
 * 					조건 true => 처리 => 종료
 * 					false일 때는 밑에 있는 조건으로 이동
 * 				}
 * 				else if(조건)
 * 				{
 * 					조건 true => 처리 => 종료
 * 					false일 때는 밑에 있는 조건으로 이동
 * 				}
 * 				else
 * 				{
 * 					생략이 가능
 * 					해당 조건이 없는 경우에 주로 처리
 * 				}
 * 				= 메뉴 처리
 * 				= 키보드 처리
 * 				= 네트워크 프로그램
 * 				= 간결하게 만든 제어문 => switch~case
 * 									----------- 애플리케이션 => 웹 (다중조건문)
 * 
 * 		2. 반복문 : 같은 동작을 하는 소스를 모아서 처리
 * 			=> 데이터베이스 읽기 / 파일 읽기
 * 			=> 많이 사용 => 화면 출력 => 목록
 * 			=> 횟수가 지정된 경우 => for
 *				 1	  2		4
 *			for(초기값;조건식;증가식)
 *			{
 *				반복 수행 문장 3
 *			}
 *			1 = 2 = 3 = 4 2 = 3 = 4 2 = 3 = 4...
 *				--------- --------- --------- 2번이 false일 때 종료
 *			=> 반복 횟수를 모르는 경우 => while
 *				=> 순차적으로 수행
 *					초기값 ------------ 1
 *					while(조건문) ----- 2
 *					{
 *						반복 수행 문장 -- 3
 *						증가식 -------- 4 => 2번으로 이동 => 2번 FALSE면 종료
 *					}
 *				=> 데이터베이스 / 파일 읽기
 *				---------------------
 *				=> 화면 => 무한 스크롤
 *				=> 이미지 슬라이딩
 *				--------------------- 자바스크립트
 *
 *			웹 프로그램
 *			브라우저에서 실행
 *			------
 *			HTML/CSS/JavaScript : 단점 => 데이터 수집이나 요청처리가 불가능
 *										------------------------
 *										 화면 출력 / 화면 변경 / 제어
 *			----------------------------------- Front
 *					| 데이터 전송
 *				  Java =>>> 매개역할
 *					|
 *				  오라클
 *			----------------------------------- Back
 *												---- + Full Stack
 *					
 * 		3. 반복제어문 : 필요에 따라서 반복을 종료 / 특정 부분을 제어
 * 					 => break			 => continue
 * 						-----				--------
 * 					for/while				for => 증가식
 * 					=> 무조건 종료				while => 조건식 => 무한루프 => 처음부터 다시 실행
 * 						|
 * 					System.exit(0) => break 대신 사용이 가능
 * 					-------------- 프로그램을 완전 종료 시에
 * 					*** 자신의 반복문만 제어 가능
 * 					for()
 * 					{
 * 						for()
 * 						{
 * 							break --- 2차 for문만 제어
 * 						}
 * 						break; --- 1차 for문만 제어
 * 					}
 */
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
