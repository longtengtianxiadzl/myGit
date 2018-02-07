package javase_tj1027;

public class WhileLoopTest
{

	public static void main(String[] args)
	{	
//		testSum();
		
//		testEvenSum();
		
//		testEvenSum2();

		testEvenSum3();
	}
	
	private static void testEvenSum3()
	{
		//请求出5以内的偶数和。
		int num = 0;
		
		int sum = 0;
		
		while(num <= 5)
		{
			num++;
			
			if(num > 5)
			{
				break;//强制终止程序的执行。
			}
			
			if(num % 2 != 0)
			{
				continue;//结束本次循环，进入下次循环。
			}
			
			sum += num;
			
		}
		
		System.out.println("sum = " + sum);
		
		System.out.println("num = " + num);
	}
	
	private static void testEvenSum2()
	{
		//请求出5以内的偶数和。
		int num = 0;
		
		int sum = 0;
		
		while(num <= 5)
		{
			if(num % 2 == 0)
			{
				sum += num;
			}
			
			num++;
		}
		
		System.out.println("sum = " + sum);
		
		System.out.println("num = " + num);
	}
	
	private static void testEvenSum()
	{
		//请求出5以内的偶数和。
		int num = 0;
		
		int sum = 0;
		
		while(num <= 5)
		{
			sum += num;
			
			num += 2;
		}
		
		System.out.println("sum = " + sum);
		
		System.out.println("num = " + num);
	}


	private static void testSum()
	{
		//请求出5以内的自然数的和。
		int num = 0;
		
		int sum = 0;
		
		while(num <= 5)
		{
			sum += num;
			
			num++;
		}
		
		System.out.println("sum = " + sum);
		
		System.out.println("num = " + num);
	}

}
