package com.sist.temp;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		EmpDAO dao=new EmpDAO();
		System.out.println("dao="+dao); // dao=com.sist.temp.EmpDAO@2b6856dd
		EmpDAO dao1=new EmpDAO();
		System.out.println("dao1="+dao1); // dao1=com.sist.temp.EmpDAO@5db45159 */
		
/*		for(int i=0;i<10;i++)
		{
			EmpDAO dao=new EmpDAO();
			System.out.println("dao="+dao);
		} */
/*
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@5db45159
dao=com.sist.temp.EmpDAO@6107227e
dao=com.sist.temp.EmpDAO@7c417213
dao=com.sist.temp.EmpDAO@15761df8
dao=com.sist.temp.EmpDAO@6ab7a896
dao=com.sist.temp.EmpDAO@327b636c
dao=com.sist.temp.EmpDAO@45dd4eda
dao=com.sist.temp.EmpDAO@60611244
dao=com.sist.temp.EmpDAO@3745e5c6

===> 혼자서 커넥션 10개 연결
 */
	/*	for(int i=0;i<10;i++)
		{
			EmpDAO dao=EmpDAO.newInstance(); // 싱글턴 방식
			System.out.println("dao="+dao);
		} */
/*
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd
dao=com.sist.temp.EmpDAO@2b6856dd

===> 싱글턴
 */
		EmpDAO dao=EmpDAO.newInstance();
		ArrayList<EmpVO> list=dao.empListData();
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getDeptno());
		}
		System.out.println("==============================");
		
		Scanner scan=new Scanner(System.in);
/*		System.out.print("사번 입력:");
		int empno=scan.nextInt();
		EmpVO vo=dao.empDetailData(empno);
		System.out.println(vo.getEmpno()+" "
				+vo.getEname()+" "
				+vo.getJob()+" "
				+vo.getSal()+" "
				+vo.getDeptno()); */
		
		System.out.print("검색어 입력:");
		String ename=scan.next();
		list=dao.empFind(ename);
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getDeptno());
		}
	}

}
