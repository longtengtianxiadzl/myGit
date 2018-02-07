package com.pbdevj.advanced_future.multi_thread.impl.impl_runnable;

public class MyRunnableTest
{
	public static void main(String[] args)
	{
		MyRunnable mr = new MyRunnable();
		
//		MyRunnable mr2 = new MyRunnable();

		Thread t = new Thread(mr);

		t.start();

		Thread t2 = new Thread(mr);

		t2.start();
	}
}
