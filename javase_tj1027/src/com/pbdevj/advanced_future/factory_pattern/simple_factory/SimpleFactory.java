package com.pbdevj.advanced_future.factory_pattern.simple_factory;
/**
 *简单工厂(静态工厂方法)：只有一个工厂类，工厂类中有一个静态方法，
 *一个静态方法只返回一种产品
 * 
 *
 */
public class SimpleFactory
{
	public static IPerson doTask(String country)
	{
		if (country.equals("china"))
		{
			return new Chinese();
		}
		else
			if (country.equals("americ"))
			{
				return new American();
			}
			else
			{
				return null;
			}

	}
}
