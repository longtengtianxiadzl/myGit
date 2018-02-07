package com.pbdevj.advanced_future.multi_thread.impl.impl_runnable;

public class MyRunnable implements Runnable
{
  int count;
  
	@Override
	public void run()
	{
		 //int count = 0;
		
		for(int i = 0; i < 5; i++)
    	{
			
			try
			{
				Thread.sleep((long)(Math.random() * 1000));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
//    		System.out.println(this.getName() + ":  " +  ++count);
    		
    		System.out.println(Thread.currentThread().getName() + ":  " + ++count);
    	}		
	}

}

