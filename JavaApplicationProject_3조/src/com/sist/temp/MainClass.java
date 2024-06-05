package com.sist.temp;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		EmpDAO dao=EmpDAO.newInstance();

		Scanner scan=new Scanner(System.in);
		System.out.print("동 입력:");
		String dong=scan.next();
		
		ArrayList<EmpVO> list=dao.empListData(dong);
		for(EmpVO vo:list)
		{
			System.out.println(vo.getZipcode()+" "
					+vo.getSido()+" "
					+vo.getGugun()+" "
					+vo.getDong()+" "
					+vo.getBunji());
		}
		System.out.println("==============================");

	}

}
