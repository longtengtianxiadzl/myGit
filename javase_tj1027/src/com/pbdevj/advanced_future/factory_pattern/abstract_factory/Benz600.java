package com.pbdevj.advanced_future.factory_pattern.abstract_factory;

//具体产品工厂角色
public class Benz600 extends Benz
{

	@Override
	public void createBenz()
	{
		System.out.println("制造奔驰600");
	}

	
}