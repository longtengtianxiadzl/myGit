package com.pbdevj.advanced_future.multi_thread.impl.synchronized_method;

public class SynchronizedMethodTest
{

	public static void main(String[] args)
	{
		ThreadExample tx = new ThreadExample();
		
		IncreamentThread it = new IncreamentThread(tx);
		
		DecreamentThread dt = new DecreamentThread(tx);
		
		it.start();
		
		dt.start();
	}

}
