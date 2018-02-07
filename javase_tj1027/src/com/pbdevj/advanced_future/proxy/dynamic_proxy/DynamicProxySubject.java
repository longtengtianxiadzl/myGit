 package com.pbdevj.advanced_future.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理主题角色
//动态代理：代理角色一定要实现一个接口InvocationHandler
public class DynamicProxySubject implements InvocationHandler
{
	
	private RealSubject rs;
	
	private AdditionalFuncation af;
	
	public DynamicProxySubject(RealSubject rs, AdditionalFuncation af)
	{
		super();
		this.rs = rs;
		this.af = af;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
//		System.out.println(proxy.getClass().getName());
		
		if(rs == null)
		{
			rs = new RealSubject();
		}
		
		if(af == null)
		{
			af = new AdditionalFuncation();
		}
		
		af.before();
		
		Object returnValue = method.invoke(rs, args);
//		System.out.println("method return value :" + returnValue);
		
		af.after();
		
		return returnValue;
	}
	

}
