package com.sist.temp;
import java.util.*;
import java.sql.*;
// (자바 12장)
public class EmpDAO {
	// 오라클 연결
	private Connection conn;
	// 오라클에 SQL 문장 전송
	private PreparedStatement ps;
	/*
	 * 	사용자 요청 ==매개 변수==> 자바 ==SQL 문장 제작==> 오라클
	 * 												|
	 * 								 			SQL 문장 실행 =====> 결과값 저장 =====> 데이터 출력 (윈도우, 브라우저 : VO, DAO 변경이 없다)
	 */
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// 싱글턴 (DB에선 필수 => 커넥션 남발 때문 => 한개만 객체 생성) => 한개의 객체만 사용 가능 => 오라클 연동
	private static EmpDAO dao;
	/*
	 * 	thin : 연결만 하는 역할 => 무료
	 * 	oci : oracle client => 유료
	 */
	// 1. 드라이버 등록 (한번만 등록)
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Dbeaver, sqldeveloper
		}catch(Exception ex) {}
	}
	// 2. 싱글턴 패턴 => 메모리 공간을 1개만 사용 => static
	public static EmpDAO newInstance()
	{
		if(dao==null) // 생성이 안된 경우
			dao=new EmpDAO(); // 새롭게 생성하고
		return dao; // 이미 생성된 dao를 사용한다
	}
	// 3. 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			// conn hr/happy => 오라클 명령
		}catch(Exception ex) {}
	}
	// 4, 오라클 닫기
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			// 송수신 => 닫고
			if(conn!=null) conn.close();
			// exit
		}catch(Exception ex) {}
	}
	// 5. 오라클에 요청
	public ArrayList<EmpVO> empListData(String dong)
	{
		ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			// 5-1. 연결
			getConnection();
			// 5-2. SQL 문장 만들기
			String sql="SELECT zipcode,sido,gugun,dong,NVL(bunji,' ')"
					+ "FROM zipcode "
					+ "WHERE dong LIKE '%"+dong+"%'";
			// 5-3. 오라클로 전송
			ps=conn.prepareStatement(sql);
			// 5-4. 오라클에서 실행된 결과를 첨부한다
			ResultSet rs=ps.executeQuery(); // enter 키 치기
			
			// => list에 첨부
			while(rs.next())
			{
				// double => rs.getDouble(번호)
				// date => rs.getDate(번호)
				EmpVO vo=new EmpVO();
				vo.setZipcode(rs.getString(1)); // 오라클은 0번이 없다 => 무조건 1번부터 시작
				vo.setSido(rs.getString(2));
				vo.setGugun(rs.getString(3));
				vo.setDong(rs.getString(4));
				vo.setBunji(rs.getString(5));
				list.add(vo);
			}
			rs.close(); // 메모리 해제
		}catch(Exception ex)
		{
			ex.printStackTrace(); // 에러 확인
		}
		finally
		{
			disConnection(); // 오라클 닫기
		}
		return list;
	}
}