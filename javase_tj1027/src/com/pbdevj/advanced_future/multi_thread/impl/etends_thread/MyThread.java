package com.pbdevj.advanced_future.multi_thread.impl.etends_thread;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
    	for(int i = 0; i < 5; i++)
    	{
//    		System.out.println(this.getName() + ":  " + i);
    		
    	//	System.out.println(Thread.currentThread().getId());
    		
    		System.out.println(Thread.currentThread().getName() + ":  " + i);
    	}
    }
}
