package com.pbdevj.advanced_future.factory_pattern.simple_factory;

public class SimpleFactoryTest
{

	public static void main(String[] args)
	{
		IPerson person = SimpleFactory.doTask("americ");

		if (person instanceof Chinese)
		{
			Chinese chinese = (Chinese) person;

			chinese.sayHi();
		}
		else
		{
			American american = (American) person;

			american.sayHi();
		}
	}

}
