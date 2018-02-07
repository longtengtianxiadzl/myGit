package javase_tj1027;

import java.util.Arrays;

public class ArrayTest
{

	public static void main(String[] args)
	{
//		testDefinitedTheFirstArrayType();
		
//		testDefinitedTheSecondArrayType();
		
		testDefinitedTheThirdArrayType();
	}
	
	private static void testDefinitedTheThirdArrayType()
	{
		int[] intArr = {9, 3, 2, 6, 1}; //数组的长度
		
//		Arrays.sort(intArr);
		
		Arrays.sort(intArr, 0, intArr.length);
		
		for (int value : intArr)
		{
			System.out.println(value);
		}
		
	}
	
	private static void testDefinitedTheSecondArrayType()
	{
		int[] intArr = new int[]{9, 3, 2, 5, 1}; //数组的长度
		

		for (int i = 0; i < intArr.length; i++)
		{
			System.out.println("intArr[" + i + "] = " + intArr[i]);
		}
	}


	private static void testDefinitedTheFirstArrayType()
	{
		int[] intArr = new int[5]; //数组的长度
		
//		System.out.println(intArr.length);
		
//		intArr[0] = 0;//数组元素的下标(索引)是从0开始
//		
//		intArr[1] = 1;
//		
//		intArr[2] = 2;
//		
//		intArr[3] = 3;
//		
//		intArr[4] = 4;//数组的最大下标值= 数组的长度-1；
//		
//		intArr[5] = 5;
		
		for (int i = 0; i < intArr.length; i++)
		{
			System.out.println("intArr[" + i + "] = " + i);
		}
	}

}
