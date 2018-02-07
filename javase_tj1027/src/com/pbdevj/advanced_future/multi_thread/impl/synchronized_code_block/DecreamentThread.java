package com.pbdevj.advanced_future.multi_thread.impl.synchronized_code_block;

public class DecreamentThread extends Thread
{
	private ThreadExample tx;
	
    public DecreamentThread(ThreadExample tx)
	{
		super();
		this.tx = tx;
	}

	@Override
    public void run()
    {
		tx.decrement();
    }
}
