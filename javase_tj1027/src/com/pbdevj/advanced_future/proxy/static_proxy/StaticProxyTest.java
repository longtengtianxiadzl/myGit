package com.pbdevj.advanced_future.proxy.static_proxy;

public class StaticProxyTest
{

	public static void main(String[] args)
	{
		RealSubject rs = new RealSubject();
		
		AdditionalFuncation af = new AdditionalFuncation();
		
		StaticProxySubject sps = new StaticProxySubject(rs, af);
		
		sps.proxyRealSub();
	}

}
