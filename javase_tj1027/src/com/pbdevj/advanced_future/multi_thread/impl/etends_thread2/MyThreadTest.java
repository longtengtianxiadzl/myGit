package com.pbdevj.advanced_future.multi_thread.impl.etends_thread2;

public class MyThreadTest
{

	public static void main(String[] args)
	{
		Myte m=new Myte();
		MyThread mt = new MyThread(m);//创建状态：不会分配资源
		
		System.out.println(mt.getPriority());//线程优先级
		
		mt.start();//可运行(就绪)状态:分配资源
		
		MyThread2 mt2 = new MyThread2(m);
		
//		System.out.println(mt.getPriority());
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
		
		mt2.start();
	}

}
