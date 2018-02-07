package com.pbdevj.advanced_future.multi_thread.impl.impl_runnable2;

public class MyRunnable2 implements Runnable
{

	@Override
	public void run()
	{
		int count = 0;
		
		for(int i = 0; i < 5; i++)
    	{
//    		System.out.println(this.getName() + ":  " + ++count);
    		
    		System.out.println(Thread.currentThread().getName() + ":  " + ++count);
    	}		
	}

}
