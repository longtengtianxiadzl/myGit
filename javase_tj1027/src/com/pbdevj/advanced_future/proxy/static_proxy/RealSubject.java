package com.pbdevj.advanced_future.proxy.static_proxy;

//真实主题角色
public class RealSubject extends AbstractSubject
{

	@Override
	public void doTask()
	{
		System.out.println("房子出租");
	}

}
