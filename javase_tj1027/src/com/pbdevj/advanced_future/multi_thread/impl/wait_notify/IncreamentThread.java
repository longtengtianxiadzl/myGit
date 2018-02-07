package com.pbdevj.advanced_future.multi_thread.impl.wait_notify;

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
		for(int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep((long) (Math.random() * 1000));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			tx.increment();
		}
    }
}
