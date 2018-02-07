package com.pbdevj.advanced_future.singleton;

public class SingletionA {
	private volatile static SingletionA singletionA=null;
	private SingletionA() {}
	public static SingletionA getInstance()
	{
		if(singletionA==null) {
			synchronized (SingletionA.class) {
				if(singletionA==null) 
					singletionA=new SingletionA();
			}
		}
		return singletionA;
	}
}
