package javase_tj1027;

public class ForLoopTest
{

	public static void main(String[] args)
	{
		// 请求出5以内的自然数的和。
		int num = 0;
		
		int sum = 0;
		
		for (; num <= 5; )
		{
			sum += num;
			
			num++;
		}

		System.out.println("sum = " + sum);

		System.out.println("num = " + num);
		
	}

}
