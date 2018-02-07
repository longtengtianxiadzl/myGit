package com.pbdevj.advanced_future.proxy.dynamic_proxy;

//真实主题角色
public class RealSubject implements ISubject
{

	@Override
	public void doTask(String str)
	{
		System.out.println("房子出租:" + str);
	}

}
