package com.sist.server;
class MyThread extends Thread
{
	// Thread를 사용 시 => run()에서 동작 구현
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+":"+getName());
				Thread.sleep(200);
			}
		}catch(Exception ex) {}
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread(); // Thread-0
		MyThread m2=new MyThread(); // Thread-1
		MyThread m3=new MyThread(); // Thread-2
		
		m1.start();
		m2.start();
		m3.start();
	}
/*
1:Thread-0
1:Thread-1
1:Thread-2
2:Thread-2
2:Thread-0
2:Thread-1
3:Thread-2
3:Thread-0
3:Thread-1
4:Thread-0
4:Thread-2
4:Thread-1
5:Thread-0
5:Thread-1
5:Thread-2
6:Thread-1
6:Thread-0
6:Thread-2
7:Thread-0
7:Thread-1
7:Thread-2
8:Thread-1
8:Thread-0
8:Thread-2
9:Thread-1
9:Thread-0
9:Thread-2
10:Thread-0
10:Thread-1
10:Thread-2

===> 0, 1, 2의 출력 순서는 무작위 = 출력할 때마다 바뀐다
 */

}
