// 빈도수 => 0,1
public class 자바제어문_반복문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1의 갯수
		int cnt0=0;
		int cnt1=0;
		
		int i=1;
		while(i<=100)
		{
			// 반복 문장 => 난수 발생 => 0이냐 1이냐
			int num=(int)(Math.random()*2); // 0,1 
			if(num==0)
				cnt0++;
			if(num==1)
				cnt1++;
			i++;
		}
		System.out.println("0이 나올 경우:"+cnt0); // 0이 나올 경우:49 // 0이 나올 경우:a
		System.out.println("1이 나올 경우:"+cnt1); // 1이 나올 경우:51 // 1이 나올 경우:(100-a)
	}

}
