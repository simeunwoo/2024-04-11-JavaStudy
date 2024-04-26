import java.util.Arrays;

public class 실무_중복없는난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		int su=0; // 난수를 받는 변수
		boolean bCheck=false; // 중복 여부를 확인하는 변수 => 중복일 경우 : true
								//					=> 중복이 아닐 경우 : false
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck) // 중복일 경우 => 다시 수행 / 중복이 아닌 경우 => 종료 => lotto 저장
			{
				// 난수
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				// 중복이 있는 숫자가 저장되었는지 비교
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			lotto[i]=su;
		}
		System.out.println(Arrays.toString(lotto)); // [16, 27, 12, 32, 18, 13]

	}

}
