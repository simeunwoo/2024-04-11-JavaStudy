package com.sist.set;
import java.util.*;
public class Set_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(("심은우"+20).hashCode());
//		System.out.println(("손흥민"+20).hashCode());
		// 변수값이 같은 경우 => 같은 객체 => hashCode()를 이용하여 처리
		Set<Integer> set=new HashSet<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int k=r.nextInt(100)+1;
			set.add(r.nextInt(100)+1);
			System.out.print(k+" "); // 92 16 1 74 14 20 64 64 61 53 
		}
		
//		System.out.println("저장된 개수:"+set.size()); // 저장된 개수:9
		// Set은 중복이 되면 제거가 되기 때문에 저장된 개수가 10개라고 보장할 수 없다
		
		TreeSet<Integer> set2=new TreeSet<Integer>();
		set2.addAll(set);
		
		System.out.println("\n=== 50 이상 출력 ===");
		
		System.out.println(set2.tailSet(50)); // [61, 65, 80, 85, 89, 92, 94] (위의 것과 별개)
		
		System.out.println("\n=== 50 이하 출력 ===");
		
		System.out.println(set2.headSet(50)); // [15, 39] (역시 별개)
		
	}

}
