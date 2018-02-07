package com.pbdevj.advanced_future.multi_thread.impl.synchronized_static_method;

public class ThreadExample
{
	public static synchronized void increment()
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

	public static synchronized void decrement()
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
