package com.pbdevj.advanced_future.collection;


public class Ticket implements Runnable
{
    boolean flag = false;
    
    int count = 10;
    
    int num = 0;
    
	@Override
	public void run()
	{
		while(!flag)
		{
			test();
			
			try
			{
				Thread.sleep((long)(Math.random()*1000));
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void test()
	{
		while(true)
		{
			if(count <= 0)
			{
				break;
			}
			count--;
			
			num++;
			 
			System.out.println(Thread.currentThread().getName() + "买到第"+ num + "票，还有" + count + "张票");
		}
	}

}
