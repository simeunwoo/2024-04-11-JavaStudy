package com.sist.main;
/*
 * 	멀티 예외 처리
 * 	=> catch를 여러개 사용 => catch (1로 통합)
 */
public class 예외처리_4 {
	// throws 뒤에 있는 예외가 예상이 된다 => 사용 시는 예외 처리 후에 사용 => 에러 발생 시 대처
	// => 처리는 개발자에게 맡기는 프로그램 => 떠맡기기
	public void display() throws NumberFormatException,NullPointerException,ArithmeticException
	{
		
	}
	public void print() throws NumberFormatException,NullPointerException,ArithmeticException
	{
		display();
	}
	public void print2() throws Exception
	{
		display();
	}
	public void print3()
	{
		try
		{
			display();
		}
		catch(NumberFormatException e) {}
		catch(NullPointerException e) {}
		catch(ArithmeticException e) {}
	}
	public void print4()
	{
		try
		{
			display();
		}catch(Exception e) {}
	}
	public void print5()
	{
		try
		{
			
		}catch(NumberFormatException | NullPointerException | ArithmeticException e) {}
	}
	// => throws (알림) => 알림, 직접 처리가 가능하다
	// => try => 직접 처리 => 알림을 줄 필요가 없다
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
	}

}
