package com.pbdevj.advanced_future.reflection.instance;

import java.lang.reflect.Method;

public class CaculatorTest
{
	public static void main(String[] args) throws Exception
	{
		Class<Caculator> clazz = Caculator.class;

		Caculator caculator = clazz.newInstance();
		
		
		
		Method method=clazz.getDeclaredMethod("sayHi", new Class[] {});


		Object methodReturnValue = method.invoke(caculator, new Object[] {});

		// System.out.println("methodReturnValue = " + methodReturnValue);
		
		System.out.println("-------------------------------");

		method = clazz.getDeclaredMethod("sayHello", new Class[] { String.class });
		// 设置可访问
		method.setAccessible(true);

		methodReturnValue = method.invoke(caculator, new Object[] { "zhangsan" });

		System.out.println("methodReturnValue = " + methodReturnValue);

		System.out.println("============================");

		method = clazz.getDeclaredMethod("sum", new Class[] {Integer.TYPE, int.class});
		// 设置可访问
		method.setAccessible(true);
		

		methodReturnValue = method.invoke(caculator, new Object[] {3, 5});

		System.out.println("methodReturnValue = " + methodReturnValue);
		
//		System.out.println(Integer.TYPE == int.class);
	}
}
