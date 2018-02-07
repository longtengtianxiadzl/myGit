package com.pbdevj.advanced_future.multi_thread.impl.synchronized_static_method;

public class SynchronizedStaticMethodTest
{

	public static void main(String[] args)
	{
		ThreadExample tx = new ThreadExample();
		
		ThreadExample tx2 = new ThreadExample();
		
		System.out.println(tx.getClass() == tx2.getClass());
		
		IncreamentThread it = new IncreamentThread(tx);
		
		DecreamentThread dt = new DecreamentThread(tx2);
		
		it.start();
		
		dt.start();
	}

}
