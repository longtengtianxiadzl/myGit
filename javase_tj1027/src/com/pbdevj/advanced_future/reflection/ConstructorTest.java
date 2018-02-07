package com.pbdevj.advanced_future.reflection;

import java.lang.reflect.Constructor;

public class ConstructorTest
{

	public static void main(String[] args) throws Exception
	{
		Class<String> clazz = String.class;
		
//		Constructor<?>[] constructors = clazz.getConstructors();
		
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		
		for (Constructor<?> constructor : constructors)
		{
			System.out.println(constructor);
			
			System.out.println(constructor.getName());
		}
	}

}
