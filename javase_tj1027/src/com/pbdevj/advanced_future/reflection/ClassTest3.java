package com.pbdevj.advanced_future.reflection;

public class ClassTest3
{
	public static void main(String[] args) throws Exception
	{
		Class<String> clazz = String.class;
		
		System.out.println(clazz);
		
		System.out.println(clazz.getName());
	}
}
