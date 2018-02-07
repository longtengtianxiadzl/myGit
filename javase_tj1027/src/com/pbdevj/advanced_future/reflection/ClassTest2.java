package com.pbdevj.advanced_future.reflection;

public class ClassTest2
{
	public static void main(String[] args) throws Exception
	{
		//包名.类名
		String str = new String();
		
		Class<?> clazz = str.getClass();
		
		System.out.println(clazz);
		
		System.out.println(clazz.getName());
	}
}
