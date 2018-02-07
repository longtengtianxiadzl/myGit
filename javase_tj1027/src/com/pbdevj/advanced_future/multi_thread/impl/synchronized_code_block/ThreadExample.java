package com.pbdevj.advanced_future.multi_thread.impl.synchronized_code_block;

public class ThreadExample
{
	public void increment()
	{
		synchronized(this)
		{
			for (int i = 0; i < 5; i++)
			{
				try
				{
					Thread.sleep((long) (Math.random() * 1000));
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("increment : " + i);
			}
		}
		
	}

	public void decrement()
	{
		synchronized (this)
		{
			for (int i = 0; i < 5; i++)
			{
				try
				{
					Thread.sleep((long) (Math.random() * 1000));
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("decrement : " + i);
			}
		}
		
		
	}
}
