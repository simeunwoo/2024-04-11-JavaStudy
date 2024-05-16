package com.sist.main_2;
/*
 * 	Movie => CGV / MegaBox / 롯데 시네마 => 목록, 상세, 검색, 예약
 * 	Music => Genie / Melon => 목록, 상세, 검색, 음반 결제
 *	~~~> 상속 활용
 *
 *	예)
 *	동물 + 식물
 *	|
 *	포유류 양서류 조류 ... => 추상화 (공통성이 많다)
 *	...
 *						=> 구체화 (밑으로 내려갈수록 구체화 ↑)
 */

public abstract class MusicSystem {
	public static Music[] musics=new Music[50];
	public abstract void init(); // 데이터 초기화
	// 설계가 되어 있다
	public abstract void find(String title);
	public abstract void list();
	public abstract void detail(int mno);
}
