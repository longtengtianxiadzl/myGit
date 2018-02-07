package com.pbdevj.advanced_future.multi_thread.impl.threadlocal;

public class DecreamentThread extends Thread
{
	private ExampleThreadLocal tx;
	
    public DecreamentThread(ExampleThreadLocal tx)
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
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int a=tx.getNextNum();
			
			System.out.println("decrement=********=>"+ a);
			++a;
		};
    }
}
