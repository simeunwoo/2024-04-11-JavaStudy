package com.sist.util;
import java.util.*;

public class 컬렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		// add(Object)
		// 반복문은 패턴이 있는 경우에만 사용 가능
		list.add(100);
		list.add("심은우");
		list.add('A');
		list.add(true);
		list.add(77.7);
		// 데이터형을 첨부 => 관리가 어렵다, 반복문 사용이 어렵다
		int a=(int)list.get(0);
		String name=(String)list.get(1);
		char c=(char)list.get(2);
		boolean b=(boolean)list.get(3);
		double d=(double)list.get(4);
		// => 가급적이면 => 동일한 데이터형을 저장하여 사용
		// 형변환이 부담스럽다
		// 338page => 제네릭
	}

}
