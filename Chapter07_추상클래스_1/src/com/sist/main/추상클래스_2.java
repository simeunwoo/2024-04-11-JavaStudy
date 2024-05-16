package com.sist.main;

abstract class Button
{
	public abstract void click();
}

class Login extends Button
{
	@Override
	public void click()
	{
		System.out.println("로그인 요청");
	}
}

class Join extends Button
{
	@Override
	public void click()
	{
		System.out.println("회원 가입 요청");
	}
}
// 추상 클래스 사용 => 결합성이 낮게 만들 수 있다
public class 추상클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn=new Login();
		btn.click(); // 로그인 요청
		
		btn=new Join();
		btn.click(); // 회원 가입 요청
	 }

}
