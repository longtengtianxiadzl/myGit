package com.pbdevj.advanced_future.multi_thread.impl.synchronized_method;

public class ThreadExample
{
	public synchronized void increment()
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

	public synchronized void decrement()
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
