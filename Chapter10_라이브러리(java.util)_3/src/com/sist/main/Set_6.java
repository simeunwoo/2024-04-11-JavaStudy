package com.sist.main;
/*
 * 	ArrayList / HashSet / HashMap
 * 
 * 	ArrayList
 * 	=> 중복이 있는 경우
 * 
 * 	HashSet
 * 	=> 중복이 없는 경우
 * 
 * 	HashMap
 * 	=> 두가지를 동시에 저장 (id:admin), (pwd:1234) ...
 * 
 * 	===> 자료 구조 : 데이터 저장, 데이터 수정, 데이터 추가, 데이터 삭제, 데이터 검색
 * 		=> 자바 : 컬렉션 (여러개 수집 => 관리)
 * 
 * 	데이터 수정 & 삭제 & 검색 => 데이터를 찾을 수 있는 구분자
 * 	=> ArrayList의 구분자 : 인덱스 번호 (중복이 있다)
 * 	=> Set의 구분자 : 데이터 자체 (중복이 없다)
 * 	=> Map의 구분자 : key (중복이 없다), value (중복이 가능)
 * 
 * 	배열 보완 => 고정 (가변) => 삭제, 추가 기능이 불가능
 * 
 * 	             Collection
 *                   |
 *	----------------------------------
 *  |                |               |
 *  List             Set             Map
 *  
 *  List
 *  = ArrayList
 *  = LinkedList
 *  = Vector
 *  
 *  Set
 *  = HashSet
 *  = TreeSet
 *  
 *  Map
 *  = HashMap
 *  = HashTable
 *  
 *  => 개발자 선호
 *  	ArrayList<String> list=new ArrayList<String>(); => X
 *  
 *  	List<String> list=new ArrayList<String>(); => O
 *  	List<String> list=new LinkedList<String>(); => O
 *  	List<String> list=new Vector<String>(); => O
 *  
 *  	Set<String> list=new HashSet<String>(); => O
 *  	Set<String> list=new TreeSet<String>(); => O
 *  
 *  ===> List 사용하는 연습 중요 => MyBatis, JPA에 중요
 */
import java.util.*;
public class Set_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list=new Vector<String>();
		list.addElement("홍길동");
		list.addElement("전우치");
		
		for(int i=0;i<list.size();i++)
		{
			String name=list.elementAt(i);
			System.out.println(name);
		}
	}

}
