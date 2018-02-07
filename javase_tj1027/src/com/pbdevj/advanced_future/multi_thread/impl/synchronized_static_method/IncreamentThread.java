package com.pbdevj.advanced_future.multi_thread.impl.synchronized_static_method;

public class IncreamentThread extends Thread
{
	private ThreadExample tx;
	
    public IncreamentThread(ThreadExample tx)
	{
		super();
		this.tx = tx;
	}

	@Override
    public void run()
    {
		
		tx.increment();
    }
}
