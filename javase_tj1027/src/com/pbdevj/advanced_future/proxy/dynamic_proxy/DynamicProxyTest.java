 package com.pbdevj.advanced_future.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest
{

	public static void main(String[] args)
	{
		RealSubject rs = new RealSubject();
		
		AdditionalFuncation af = new AdditionalFuncation();
		
		InvocationHandler ih = new DynamicProxySubject(rs, af);
		
//		ISubject subject = (ISubject) Proxy.newProxyInstance(ISubject.class.getClassLoader(),
//                new Class[] { ISubject.class },
//                ih);
		
		ISubject subject = (ISubject) Proxy.newProxyInstance(rs.getClass().getClassLoader(),
                rs.getClass().getInterfaces(),
                ih);

		subject.doTask("三居室");
	}

}
