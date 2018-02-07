package com.pbdevj.advanced_future.multi_thread.impl.etends_thread2;

public class MyThread2 extends Thread
{
private Myte m;
	
    public MyThread2(Myte m)
	{
		super();
		this.m = m;
	}

	@Override
    public void run()
    {	int a=m.getA();
    	for(int i = 0; i < 5; i++)
    	{
//    		System.out.println(this.getName() + ":  " + i);
    		
    		System.out.println(Thread.currentThread().getName() + ":  " + a);
    		a++;
    	}
    }
}
