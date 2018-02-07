package com.pbdevj.advanced_future.multi_thread.impl.threadlocal;

public class IncreamentThread extends Thread
{
	private ExampleThreadLocal tx;

	public IncreamentThread(ExampleThreadLocal tx)
	{
		super();
		this.tx = tx;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int a = tx.getNextNum();
			

			System.out.println("increment==>" + a);
			++a;
		}
		;
	}
}
