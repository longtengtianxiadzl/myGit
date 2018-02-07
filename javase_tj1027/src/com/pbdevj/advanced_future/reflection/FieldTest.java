package com.pbdevj.advanced_future.reflection;

import java.lang.reflect.Field;

public class FieldTest
{

	public static void main(String[] args)
	{
		Class<String> clazz = String.class;
		
//		System.out.println(Arrays.toString(clazz.getFields()));
		
//		Field[] fields = clazz.getFields();
		
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields)
		{
			System.out.println(field);
			
			System.out.println(field.getName());
		}
	}

}
