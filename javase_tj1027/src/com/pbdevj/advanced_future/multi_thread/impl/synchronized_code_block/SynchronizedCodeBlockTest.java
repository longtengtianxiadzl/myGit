package com.pbdevj.advanced_future.multi_thread.impl.synchronized_code_block;

public class SynchronizedCodeBlockTest
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
