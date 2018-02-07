package com.pbdevj.advanced_future.factory_pattern.factory;

//具体工厂类
public class BenzGLKFactory extends AbstractBenzFactory
{

	@Override
	public AbstractBenz createBenz()
	{
		return new BenzGLK();
	}
	
}
