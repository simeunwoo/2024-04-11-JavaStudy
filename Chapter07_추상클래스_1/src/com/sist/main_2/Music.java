package com.sist.main_2;
/*
 * 1|SPOT! (Feat. JENNIE)|지코 (ZICO)|SPOT!|//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/085/072/667/85072667_1714091257020_1_140x140.JPG/dims/resize/Q_80,0|xfqBQ2XhBCg\u0026pp=ygUUU1BPVCEgKEZlYXQuIEpFTk5JRSk%3D
 * 
 * 2|Magnetic|아일릿 (ILLIT)|SUPER REAL ME|//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/084/914/987/84914987_1711342168138_1_140x140.JPG/dims/resize/Q_80,0|Vk5-c_v4gMU\u0026pp=ygUITWFnbmV0aWM%3D
 */
// 모든 클래스에는 this, super : 상속을 내린 클래스에 접근
// 모든 클래스는 상속을 받는다 => extends Object (생략된 것임)
public class Music {
	// 다른 클래스에서 사용한다
	private String mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
	// Music 안에서만 사용 => 다른 클래스 연결 => 메소드를 이용하여 접근 => 데이터 보호 => 캡슐화
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		// 임시 변수 => 메소드 안에서만 사용 가능 => 다른 클래스에서는 사용 불가
		this.mno = mno; // 여기서 this를 뺄 경우 값이 바뀜
		// this => 자신의 클래스 객체 주소를 저장하여 사용
		// this는 static : 모든 객체는 this를 가지고 있다
		// this가 많이 사용되는 곳 => 멤버 변수 / 지역 변수의 이름이 같을 때
		// this.mno => Music이 가지고 있는 변수
	}
	public String getTitle() {
		return title;
		// 1. 지역 변수, 매개 변수 => 없는 경우 => 2. 멤버 변수
		// 지역 변수 우선 순위
		// 없는 경우에는 this.을 생략 가능
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
}
