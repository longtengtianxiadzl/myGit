package com.pbdevj.advanced_future.reflection;

public class ClassTest
{
	public static void main(String[] args) throws Exception
	{
		//包名.类名
		Class<?> clazz = Class.forName("java.lang.String");
		
		System.out.println(clazz);
		
		System.out.println(clazz.getName());
	}
}
