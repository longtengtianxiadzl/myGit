package com.pbdevj2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class HelloTest
{
	private static Hello hello = null;
	
	@BeforeClass
	public static void setUp()
	{
		System.out.println("-------Before--------");
		hello = new Hello();
	}
	
	@Before
	public void init()
	{
		System.out.println("-------INIT--------");
	}
	
	@Test
//	@Ignore
    public void testSayHello()
    {
    	String result = hello.sayHello();
    	
    	System.out.println("result = " + result);
    }
	
	@Test
    public  void testSayHello2()
    {
    	String result = hello.sayHello();
    	
    	System.out.println("result = " + result);
    }
	
	@After
	public void des()
	{
		System.out.println("-------des--------");
	}
	
	@AfterClass
	public static void tearDown()
	{
		hello = null;
		System.out.println("-------after--------");
	}
}
