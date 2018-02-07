package com.pbdevj.advanced_future.annotation;

import java.lang.annotation.Annotation;

@MyAnnotation(/*value = "zhangsan", */number = 123)
@Deprecated
public class Hello extends World
{

	@Override
	public String toString()
	{
		return super.toString();
	}

	@Deprecated
    public void test()
    {
    	//获取注解值需要用到反射
		Class<Hello> clazz =Hello.class;
		
		Annotation[] anns = clazz.getDeclaredAnnotations();
		
		for(Annotation ann : anns)
		{
//			System.out.println(ann);
			
//			System.out.println(ann.annotationType() == MyAnnotation.class);
			
			if(ann.annotationType() == MyAnnotation.class)
			{
				MyAnnotation ma = clazz.getAnnotation(MyAnnotation.class);
				
				System.out.println(ma.value() + ">>" + ma.number());
			}
				
		}

	}

	public static void main(String[] args)
	{
		Hello hello = new Hello();

		hello.test();
	}
}
