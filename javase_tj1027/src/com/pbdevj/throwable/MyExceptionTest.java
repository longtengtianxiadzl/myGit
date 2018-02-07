package com.pbdevj.throwable;

public class MyExceptionTest
{

	public static void main(String[] args) throws Exception
	{
		test();
	}

	private static void test() throws Exception
	{
		throw new MyException("自定义异常");
	}

}
