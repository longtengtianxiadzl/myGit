package com.pbdevj.advanced_future.multi_thread.impl.impl_runnable2;

public class MyRunnableTest
{
	public static void main(String[] args)
	{
		Runnable mr = new MyRunnable();
		
		Thread t = new Thread(mr, "线程1");

		t.start();
		
	//	mr = new MyRunnable2();

		Thread t2 = new Thread(mr, "线程2");

		t2.start();
	}
}
