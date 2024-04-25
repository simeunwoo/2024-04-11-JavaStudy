/*
 * 	배열 : 같은 데이터형 여러개 데이터를 모아서 저장
 * 		 ---------- 용도가 같은 데이터
 * 		=> 고정적 단점
 * 		=> 여러개의 데이터를 한개의 이름으로 제어할 수 있다
 * 					   --------- 인덱스 => 0번부터 시작
 * 		1) 선언
 * 			데이터형[] 배열명;
 * 			데이터형 배열명[];
 * 			ex)
 * 			정수 : int[] arr / 실수 : double[] arr / 문자 : char[] arr
 * 			논리 : boolean[] arr / 문자형 : String[] arr
 * 		2) 초기화
 * 			=> 실제 값을 초기화
 * 			int[] arr;
 * 			arr=new int[]{1,2,3,4,5} // arr[1]~arr[5]를 0으로 초기화(???)
 * 			=> 기본 값을 초기화
 * 			int[] arr=new int[5]; => 자동으로 0으로 초기화 // arr[0]~arr[4]를 0으로 초기화(???)
 * 				=> int[] => 0 / double[] => 0.0 / boolean[] => false
 * 				   String[] => null(주소가 없는 상태)(모든 클래스에 적용)(참조할 수 있는 주소)
 * 				   long[] => 0L / char[] => '\0' => 공백
 * 				   ** new 연산자 : malloc() => 자주 사용하다 보니 => 연산자로 승격
 * 					  -------- => 넘겨주는 값 => (주소값->int)
 * 					  -------- 동적 메모리 할당 (생성)
 * 							   --- 실행 시마다 메모리 확보 (메모리 따라 생성)
 * 							   --- 메모리 주소가 다르다 => 클래스에서 저장
 * 			int[] arr=new int[5];
 * 			arr=[I@6f2b958e => 메모리 주소 (연속적인 메모리를 갖고 있다)
 * 								  arr[0]  arr[1]  arr[2]  arr[3] => 인덱스를 이용 =>
 * 			arr ----------------> ----------------------------
 * 								   0	|	0	|	0	|	0
 * 								 |---------------------------- 같은 크기의 메모리가 5개 생성
 * 							[I@6f2b958e
 * 								=> 주소를 이용해서 원하는 데이터에 접근하느 변수 => 참조변수
 * 								   배열 / 클래스
 * 								=> 변수 / 배열 / 클래스
 * 								   한개만 저장 / 같은 데이터형 여러개 / 다른 데이터형 여러개 저장
 * 								=> 예)
 * 									학생 1명에 대한 정보
 * 									---------------
 * 									1. 이름 / 2. 성별 / 3. 학번 / 4. 학년 /...
 * 									-> 변수 : int name; int sex; int hakbun; int year;
 * 										 => String name1,name2,name3;
 * 											String sex1,sex2,sex3;
 * 											...
 * 										 => String[] name=new String[3];
 * 											String[] sex=new String[3];
 * 											...
 * 										 => 클래스
 * 											class Student
 * 											{
 * 												String name,sex;
 * 												int hakbun,year;
 * 											}
 * 										 => 메모리를 원하는 만큼 확보할 수 있다
 * 											Student hong=new Student()
 * 											Student hong1=new Student()
 * 											Student hong2=new Student()
 * 											...
 * 		3) 값 변경
 * 			int[] arr={10,20,30,40,50}
 * 			Stack(주소)						Heap(실제 데이터가 저장되는 영역)
 * 			arr   --------------->	[0]		[1]		[2]		[3]		[4]
 * 								   --------------------------------------
 * 									10	|	20	|	30	|	40	|	50
 *								  |--------------------------------------
 *								0x100  0x104   0x108   0x112   0x116
 *
 *							배열 변수는 시작 주소값만 가지고 있다
 *							arr=0x100
 *							arr[0] => 0x100주소 첫번째값
 *							arr[1] => 0x100주소로부터 두번째값
 *							...
 *							세번째값 변경 => arr[2]=100 => 30(X) => 100으로 변경
 *							마지막값 변경 => arr[4]=500 => 50(X) => 500으로 변경
 *							배열의 값을 변경할 때 => 배열명[인덱스]
 *												   ------ 0번부터
 *												   ------ 갯수 => length
 *			=> 배열 복사
 *				얕은 복사 : 공유
 *				깊은 복사 : 새로운 배열을 생성
 * 		4) 출력 => for-each
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[] arr=new int[5];
		System.out.println(arr); // [I@6f2b958e
		int[] arr1=new int[5];
		System.out.println(arr1); // [I@1eb44e46 : 주소값이 서로 다르다 (주소니까 같을 순 없잖아?)
		*/
		
		// 메소드 => Call By Reference
		// 얕은 복사
/*		int[] arr={10,20,30,40,50};
		int[] temp=arr;
		temp[0]=100;
		temp[1]=200;
		// arr[0]=100, arr[1]=200 => 값(주소값)이 바뀌어버림 => 얕은 복사 (영향을 줌)
		System.out.println("temp[0]="+temp[0]); // temp[0]=100
		System.out.println("temp[1]="+temp[1]); // temp[1]=200
		System.out.println("arr[0]="+arr[0]); // arr[0]=100
		System.out.println("arr[1]="+arr[1]); // arr[1]=200
		*/
		
		int[] arr={10,20,30,40,50};
		int[] temp=arr.clone(); // 새로운 배열 생성
		// 설정된 그대로 복사 => 새로운 배열을 생성 => clone => 깊은 복사
		// 배열은 메모리 주소를 이용한다 => 주소를 대입하면 => 별칭 => 같은 메모리를 제어
		int[] temp2=arr;
		System.out.println("arr="+arr); // arr=[I@6f2b958e
		System.out.println("temp="+temp); // temp=[I@1f89ab83
		System.out.println("temp2="+temp2); // temp2=[I@6f2b958e // arr와 주소가 같다
		// 같은 주소면 같은 영역을 제어, 다른 주소면 다른 영역을 제어 // *클래스도 주소 개념
		temp[0]=100;
		temp[1]=200;
		System.out.println("temp[0]="+temp[0]); // temp[0]=100
		System.out.println("temp[1]="+temp[1]); // temp[1]=200
		System.out.println("arr[0]="+arr[0]); // arr[0]=10
		System.out.println("arr[1]="+arr[1]); // arr[1]=20
	}

}
