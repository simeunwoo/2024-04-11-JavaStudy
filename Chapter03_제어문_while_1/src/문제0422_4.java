// continue는 반복문에서만 사용 가능
// break는 선택문과 반복문에서 사용 가능
public class 문제0422_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=1;
		while(true)
		{
			if(i>50)
				break;
			sum+=i;
					i++;
		}
		System.out.println(sum);
	}

}
