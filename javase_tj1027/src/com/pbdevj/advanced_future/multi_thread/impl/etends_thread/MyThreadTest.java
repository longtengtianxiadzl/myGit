package com.pbdevj.advanced_future.multi_thread.impl.etends_thread;

public class MyThreadTest
{

	public static void main(String[] args)
	{
		MyThread mt = new MyThread();//创建状态：不会分配资源
		
		mt.start();//可运行(就绪)状态:分配资源
		
//		MyThread mt2 = new MyThread();
//		
//		mt2.start();
	}

}
