package com.sist.io;
/*
 * 	355~357page
 * 
 * 	1. java.io : CheckedException을 가지고 있다 => 예외 처리를 반드시 해야 한다
 * 	= io : 입출력
 *		inputStream : read() : 읽기
 *		outputStream : write() : 쓰기
 *	= Stream : 데이터가 이동하는 통로
 *		FIFO => 먼저 들어간 값이 먼저 나오는 방식 => Queue
 *
 *	2. File
 *
 *	3. FileInputStream / FileOutputStream
 *
 *	4. FileReader / FileWriter
 *
 *	5. BufferedReader / BufferedWriter
 *
 *	6. BufferedInputStream / BufferedOutputStream
 *
 *	7. ObjectInputStream / ObjectOutputStream
 *	-----------------------------------------------------
 *	InputStream / OutputStream : 읽기 / 쓰기 => 1byte씩 읽기를 한다 (한글은 깨진다)
 *		=> 업로드 / 다운로드
 *		=> 바이트 스트림
 *
 *	Reader / Writer : 읽기 / 쓰기 => 2byte씩 읽기/쓰기를 한다 (한글이 정상적)
 *		=> 파일 읽기 / 쓰기 (한글 포함)
 *		=> 문자 스트림
 *
 *	=> moive.txt
 *	=> FileReader
 *
 *	1) 메모리에 저장 => 프로그램이 종료되면 모든 데이터가 사라진다
 *     --------- 속도가 빠르다
 *     | 영구적으로 저장하는 장치
 *       -----------------
 *        파일
 *        --- 1. 데이터 노출 / 2. 잊어버릴 가능성 / 3. 관련된 데이터를 따로 저장해서 처리하기 어렵다
 *            *** 4. 구분자가 없다 => 배열에 저장, ArrayList에 저장해서 사용
 *            ------------------------------------------------------------------
 *            => 보완 : RDBMS (관계형 데이터베이스) => 오라클
 *            => 업로드 / 다운로드
 *            => 추천 => 카페/블로그 => 읽은 데이터를 파일에 저장 후에 분석 => 분석된 데이터를 오라클로 전송
 *            	=> 임시 저장
 * 
 * 2) 파일에 정보
 * 		File : 파일, 폴더 정보를 가지고 있다
 *	
 */
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
