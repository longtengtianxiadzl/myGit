package com.pbdevj.advanced_future.multi_thread.impl.threadlocal;

public class SynchronizedStaticMethodTest
{

	public static void main(String[] args)
	{
		ExampleThreadLocal tx = new ExampleThreadLocal();
		
		
		IncreamentThread it = new IncreamentThread(tx);
		
		DecreamentThread dt = new DecreamentThread(tx);
		
		it.start();
		
		dt.start();
	}

}
