package com.sist.dao;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
public class EmpMemberDAO {
	   private Connection conn;
	   private PreparedStatement ps;
	   private final String URL="jdbc:oracle:thin:@192.168.10.124:1521:XE";
	   private static EmpMemberDAO dao; // 싱글턴 
	   
	   // 1. 드라이버 등록 
	   public EmpMemberDAO()
	   {
		   try
		   {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
		   }catch(Exception ex) {}
	   }
	   // 2. 오라클 연결 
	   public void getConnection()
	   {
		   try
		   {
			   conn=DriverManager.getConnection(URL,"hr3","happy");
			   // conn hr/happy
		   }catch(Exception ex) {}
	   }
	   // 3. 오라클 해제 
	   public void disConnection()
	   {
		   try
		   {
			   if(ps!=null) ps.close();
			   if(conn!=null) conn.close();
		   }catch(Exception ex) {}
	   }
	   // 4. 싱글턴 => 한사람당 한개의 DAO만 사용할수 있게 만든다 => 메모리 누수현상을 제거 
	   public static EmpMemberDAO newInstance()
	   {
		   if(dao==null)
			   dao=new EmpMemberDAO();
		   return dao;// null이 아니면 기존에 저장된 dao를 전송 
	   }
	   // 기능 설정 
	   // 1. emp,dept 데이터 출력 (웹 , 윈도우) => DAO 변경이 없다 => React / Vue / Ajax 
	   // 2. DAO / VO는 변경 사항이 없다 
	   // SQL은 검색언어 => SELECT 
	   // 1. 오라클을 배우는 목적 => 자바에서 사용이 가능 => 2주 
	   public ArrayList<EmpVO> empListData()
	   {
		   ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		   try
		   {
			   getConnection();
			   String sql="SELECT empno,ename,job,sal,hiredate,performance,dname,loc,num "
			   		+ "FROM (SELECT empno,ename,job,sal,hiredate,performance,dname,loc,rownum as num "
			   		+ "    from (SELECT empno,ename,job,sal,hiredate,performance,dname,loc "
			   		+ "	    		 		            FROM emp,dept where dept.deptno = emp.deptno ORDER BY empno ASC))" ;
			   ps=conn.prepareStatement(sql);
			   ResultSet rs=ps.executeQuery();
			   while(rs.next())
			   {
				   EmpVO vo=new EmpVO();
				   vo.setEmpno(rs.getInt(1));
				   vo.setEname(rs.getString(2));
				   vo.setJob(rs.getString(3));
				   vo.setSal(rs.getInt(4));
				   vo.setHiredate(rs.getString(5));
				   vo.setPerformance(rs.getInt(6));
				   vo.getDvo().setDname(rs.getString(7));
				   vo.getDvo().setLoc(rs.getString(8));
				   
				   list.add(vo);
			   }
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   finally
		   {
			   disConnection();
		   }
		   return list;
	   }
	   public ArrayList<EmpVO> empRankData()
	   {
		   ArrayList<EmpVO> list2=new ArrayList<EmpVO>();
		   try
		   {
			   getConnection();
			   String sql2="SELECT empno,ename,dname,performance,num "
			   		+ "	   FROM (SELECT empno,ename,dname,performance,rownum as num "
			   		+ "			 from (SELECT empno,ename,dname,performance "
			   		+ "			   	   FROM emp,dept where dept.deptno = emp.deptno "
			   		+ "                ORDER BY performance DESC))" ;
			   ps=conn.prepareStatement(sql2);
			   ResultSet rs2=ps.executeQuery();
			   while(rs2.next())
			   {
				   EmpVO vo2=new EmpVO();
				   vo2.setEmpno(rs2.getInt(1));
				   vo2.setEname(rs2.getString(2));
				   vo2.getDvo().setDname(rs2.getString(3));
				   vo2.setPerformance(rs2.getInt(4));
				   
				   list2.add(vo2);
			   }
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   finally
		   {
			   disConnection();
		   }
		   return list2;
	   }
	   
	   public int empTotalPage()
	     {
	    	 int total=0;
	    	 try
	    	 {
	    		 // 1. 연결 
	    		 getConnection();
	    		 // 2. SQL문장 
	    		 String sql="SELECT CEIL(COUNT(*)/12.0) FROM emp";
	    		 // 3. 오라클로 전송 
	    		 ps=conn.prepareStatement(sql);
	    		 // 4. SQL문장 실행 결과를 가지고 온다 => 실행 결과를 저장 (ResultSet)
	    		 ResultSet rs=ps.executeQuery();
	    		 // 5. 커서위치를 데이터에 출력된 첫번째 위치로 이동 
	    		 rs.next();
	    		 total=rs.getInt(1);
	    		 // 6. 메모리를 닫는다 
	    		 rs.close();
	    		 // 쉬운 프로그램은 모든 개발자가 동일한 코딩 (표준화) => 패턴이 한개 
	    		 // --------- 라이브러리 (MyBatis) => Spring 
	    		 
	    		 
	    	 }catch(Exception ex)
	    	 {
	    		 // 에러 확인 => 복구(X)
	    		 ex.printStackTrace();
	    	 }
	    	 finally
	    	 {
	    		 // 닫기 
	    		 disConnection();
	    	 }
	    	 return total;
	     }
	   
	   public EmpVO empDetailData(int empno)
	     {
		   EmpVO vo=new EmpVO();
	    	 try
	    	 {
	    		 getConnection();
	    		 // 조회수 증가 
	    		 String sql="UPDATE emp SET "
	    				   +"performance=performance+1 "
	    				   +"WHERE empno=?";
	    		 ps=conn.prepareStatement(sql);
	    		 ps.setInt(1, empno);
	    		 ps.executeUpdate(); // commit()
	    		 
	    		 // 데이터 읽기
	    		 sql="SELECT empno,ename,job,sal "
	    			+"FROM emp "
	    		    +"WHERE empno=?";
	    		 
	    		 ps=conn.prepareStatement(sql);
	    		 // ?에 값을 채운다 
	    		 ps.setInt(1, empno);
	    		 
	    		 // 결과값 
	    		 ResultSet rs=ps.executeQuery();
	    		 rs.next();
	    		 // 값을 VO에 저장 
	    		 vo.setEmpno(rs.getInt(1));
	    		 vo.setEname(rs.getString(2));
	    		 vo.setJob(rs.getString(3));
	    		 vo.setSal(rs.getInt(4));
	    		 rs.close();
	    		 
	    		 
	    	 }catch(Exception ex)
	    	 {
	    		 ex.printStackTrace();
	    	 }
	    	 finally
	    	 {
	    		 disConnection();
	    	 }
	    	 return vo;
	     }
	   
	   public ArrayList<EmpVO> empListData(int page)
	     {
	    	 ArrayList<EmpVO> list=new ArrayList<EmpVO>();
	    	 // VO는 상품 한개에 대한 모든 정보가 저장 
	    	 try
	    	 {
	    		 getConnection();
	    		 String sql="SELECT empno,ename,job,sal,dname,num "
	    		 		  + "FROM (SELECT empno,ename,job,sal,dname,rownum as num "
	    		 		  + "      FROM (SELECT empno,ename,job,sal,dname "
	    		 		  + "            FROM emp,dept where dept.deptno = emp.deptno ORDER BY empno ASC)) \r\n"
	    		 		  + "WHERE num BETWEEN ? AND ?";

	    		 int rowSize=12;
	    		 int start=(rowSize*page)-(rowSize-1);
	    		 //           12*1 - 11 -> 1 ==> 12*2 - 11 => 13
	    		 int end=rowSize*page;// 12 ==> 24
	    		 // 1번부터 (rownum=>1번) 
	    		 ps=conn.prepareStatement(sql);
	    		 ps.setInt(1, start);
	    		 ps.setInt(2, end);
	    		 
	    		 // 실행 요청 
	    		 ResultSet rs=ps.executeQuery();
	    		 // 첫번째부터 읽기 
	    		 while(rs.next())
	    		 {
	    			 EmpVO vo=new EmpVO();
	    			 vo.setEmpno(rs.getInt(1));
	    			 vo.setEname(rs.getString(2));
	    			 vo.setJob(rs.getString(3));
	    			 vo.setSal(rs.getInt(4));
	    			 vo.getDvo().setDname(rs.getString(5));
	    			 list.add(vo);
	    		 }
	    		 
	    		 rs.close();
	    	 }catch(Exception ex)
	    	 {
	    		 ex.printStackTrace();
	    	 }
	    	 finally
	    	 {
	    		 disConnection();
	    	 }
	    	 return list;
	     }
	   
	   
	     // 검색 => LIKE 
	     public ArrayList<EmpVO> empFindData(String name){
	    	 ArrayList<EmpVO> list = new ArrayList<EmpVO>();
	    	 try {
				getConnection();
				String sql = "SELECT empno , ename ,job,sal,hiredate,dname,loc,performance"+
							" FROM emp,dept "+
						    " WHERE emp.deptno = dept.deptno and ename like '%'||?||'%' "+
							" ORDER BY empno ASC";
				ps = conn.prepareStatement(sql);
				ps.setString(1, name);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					EmpVO vo = new EmpVO();
					vo.setEmpno(rs.getInt(1));
					vo.setEname(rs.getString(2));
					vo.setJob(rs.getString(3));
					vo.setSal(rs.getInt(4));
					vo.setHiredate(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate(5)));
					vo.getDvo().setDname(rs.getString(6));
					vo.getDvo().setLoc(rs.getString(7));
					vo.setPerformance(rs.getInt(8));
					
					list.add(vo);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				disConnection();
			}
	    	 return list;
	     }
}