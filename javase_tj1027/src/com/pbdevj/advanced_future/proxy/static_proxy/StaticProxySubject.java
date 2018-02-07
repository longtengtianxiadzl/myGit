package com.pbdevj.advanced_future.proxy.static_proxy;

//代理主题角色
public class StaticProxySubject
{
	
	private RealSubject rs;
	
	private AdditionalFuncation af;
	
	public StaticProxySubject(RealSubject rs, AdditionalFuncation af)
	{
		super();
		this.rs = rs;
		this.af = af;
	}
	
	public void proxyRealSub()
	{
		if(rs == null)
		{
			rs = new RealSubject();
		}
		
		
		if(af == null)
		{
			af = new AdditionalFuncation();
		}
		
		af.before();
		
		rs.doTask();
		
		af.after();
	}
	

}
