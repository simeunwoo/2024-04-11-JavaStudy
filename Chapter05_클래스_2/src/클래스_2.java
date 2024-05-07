/*
 * 	1. 114page
 * 			객체 => 변수 (여러개의 변수/여러개 메소드) 동시에 관리하는 영역
 * 			--- 설계 => 영역 class
 * 			--- 동시에 관리를 위해서는 저장 => new
 * 	2. 115page
 * 			학생
 * 			학번 이름 학교명 성별 주소 전화 ... => 변수
 * 			=> 학생마다 따로 가지고 있는 변수 : 학번,이름,성별,주소,전화,... => new로 따로 저장하는 공간을 만들어준다
 *			=> 한개의 이름만 가지고 있다 : 학교(같은 학교인 경우),... => static
 * 			=> 명사적 => 변수
 * 			=> 동사적 => 메소드 : 점심을 먹는다, 시험을 본다, 체육을 한다,... (동작)
 * 
 * 		변수 / 변수를 활용하는 메소드 => 클래스 => 관리 (객체)
 * 		=> 예)
 * 			시계
 * 				시침 / 분침 / 초침
 * 			계산기
 * 				첫번째 정수 / 두번째 정수 / 연산자
 * 
 * 		벤치 마킹 (사이트 결정) => 분석 (명사적(출력물), 동사적(클릭/메뉴 선택)) => 클래스 설계
 * 																필요한 데이터(변수), 사용자 행위(메소드)
 * 																--------- 공통으로 사용되는 변수
 * 
 * 		115page
 *
 *		= 클래스명 = 변수 식별자와 동일
 *				  -------------
 *					알파벳이나 한글로 시작한다 (알파벳은 대소문자 구분)
 *					특수문자 _, $ => (_를 많이 사용 => 단어 2개인 경우, 임시 클래스)
 *									Main_Class, File_Name, _Temp
 *					숫자 사용 가능 (앞에 사용 금지)
 *					공백은 사용 불가능
 *					키워드는 사용 불가능
 *			*** 약속
 *				한글은 가급적이면 사용하지 않는다 (한글 운영체제에 따라 다르다) => 알파벳을 기본으로 이용
 *				한글 제작 => AWS에 호스팅 => 한글이 깨진다
 *				알파벳은 시작 첫문자는 대문자로 한다
 *				같은 폴더에서는 같은 이름의 클래스명을 사용할 수 없다
 *				한개의 파일(.java)에 여러개의 클래스를 만들 수 있다
 *				클래스 형태
 *					# 데이터형 클래스
 *					=> 변수만 설정 => 사용자 정의 데이터형 / ~VO(Spring), ~DTO(MyBatis), ~Bean(JSP)
 *					# 액션 클래스
 *					=> 메소드 설정 => 기능만 처리 / ~DAO, ~Manager, ~Controller(요청=>응답)
 *
 *		117~118page		
 *
 *		class ClassName
 *		{
 *			*** 멤버변수
 *				new => 저장 => 따로 메모리 생성 => 인스턴스 변수
 *				컴파일 시 저장 => 한개의 메모리 생성 => 정적 변수 (= 클래스 변수) (static)
 *
 *			*** 초기화
 *				인스턴스 변수 : {}, 생성자
 *				static 변수 : static{}, 생성자 => 자동 저장이 가능 => 생성자를 이용하지 않는다
 *
 *			*** 변수 활용 => 메소드
 *		}
 */
public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
