package com.pbdevj.advanced_future.multi_thread.impl.wait_notify;

public class ThreadExample
{
	private int num;
	
	public synchronized void increment()
	{
		while(num != 0)
		{
			try
			{
				super.wait();//终止方法
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		num++;
		
		System.out.println(num);
		
		this.notify();//会让另一个线程沿着wait()之后的路径执行
	}

	public synchronized void decrement()
	{
		while(num == 0)
		{
			try
			{
				super.wait();//终止方法
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		num--;
		
		System.out.println(num);
		
		this.notify();
	}
}
