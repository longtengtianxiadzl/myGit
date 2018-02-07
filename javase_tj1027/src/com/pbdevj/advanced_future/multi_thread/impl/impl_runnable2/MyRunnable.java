package com.pbdevj.advanced_future.multi_thread.impl.impl_runnable2;

public class MyRunnable implements Runnable
{
    int count = 0;
    
	@Override
	public void run()
	{
		for(int i = 0; i < 5; i++)
    	{
//    		System.out.println(this.getName() + ":  " + i);
    		
    		System.out.println(Thread.currentThread().getName() + ":  " + ++count);
    	}		
	}

}
