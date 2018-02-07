package com.pbdevj.throwable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionTest
{

	public static void main(String[] args) throws Exception
	{
		test2();
	}

	private static void test() throws Exception
	{
		try
		{
			throw new FileNotFoundException("D盘不存在a.txt文件");
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally//final
//		{
//			System.out.println("一定执行的代码块");
//		}

	}
	
	public static void test2() throws Exception
	{
		try(FileOutputStream fos = new FileOutputStream(new File("d:/a.txt"));)
		{
			
		}
		
	}

}
