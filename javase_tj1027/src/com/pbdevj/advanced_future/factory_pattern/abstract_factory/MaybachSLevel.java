package com.pbdevj.advanced_future.factory_pattern.abstract_factory;


// 具体产品角色
public class MaybachSLevel extends Maybach
{

	@Override
	public void createMaybach()
	{
		System.out.println("制造迈巴赫S级");
	}
    
}
