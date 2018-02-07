package com.pbdevj.advanced_future.factory_pattern.factory;

//具体工厂类
public class Benz600Factory extends AbstractBenzFactory
{

	@Override
	public AbstractBenz createBenz()
	{
		return new Benz600();
	}
	
}
