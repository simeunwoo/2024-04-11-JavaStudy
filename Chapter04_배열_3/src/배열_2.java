/*
 * 	문자 10개를 저장
 * 	=> 출력
 * 		HELLO
 * 	=> 반대 출력
 * 		OLLEH
 * 	=> Sort => 이차 for
 * ------------------------------------
 * 		 ------- 기본 개념(X) =>  포트폴리오
 * 	면접 : 기술 면접 / 코딩 테스트 / 인성 면접
 * 		  테스트지 / 인성 면접
 * ------------------------------------ 이력서 먼저 통과해야 면접 단계로 이동
 * 	이력서 : 학력, 사용 가능 기술, 포트폴리오 위주로 봄
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		// 출력
		for(char c:alpha)
		{
			System.out.print(c+" "); // J P K C X U P G S E 
		}
		System.out.println("\n-------------반대로 출력(인덱스 번호 이용)");
		for(int i=alpha.length-1;i>=0;i--)
		{
			System.out.print(alpha[i]+" "); // E S G P U X C K P J 
		}
		// 출력 => for-each : 출력 중심 => 웹 => 배열(컬렉션=12장)
		/*
		 * 	for(데이터형 변수:배열명)
		 * 		-----	  ----
		 * 		  |			|
		 * 		 ------------ 일치 (데이터형 변수가 데이터형이 클 수도 있다)
		 * 	char[]
		 * 
		 * 	for(char c:배열)
		 * 	for(int i:배열)
		 * 	for(double d:배열)
		 * 
		 * 	byte < char < int < long < double
		 * 	==========>
		 * 	* 가급적이면 같은 데이터형으로 받는다
		 * 	* 인덱스를 이용하는 것이 아니라 실제 배열에 저장된 값을 읽어 온다
		 * 	* 단점 : 관련된 다른 배열의 값을 출력할 수 없다
		 * 	String[] names={"","","","",""}
		 * 	String[] sexes={"","","","",""}
		 * 	-----------------> index => 일반 for를 이용
		 * 
		 * 	이름(성별)
		 * 	for(String name:names)
		 * 	* 뒤에서부터 출력은 안된다
		 */
		 
	}

}
