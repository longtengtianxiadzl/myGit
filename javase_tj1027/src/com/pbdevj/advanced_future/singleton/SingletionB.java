package com.pbdevj.advanced_future.singleton;

public class SingletionB {
	private static  SingletionB b=null;
	private SingletionB() {}
	public static synchronized SingletionB getInstance() {
		if(b==null) b=new SingletionB();
		return b;
	}
}
