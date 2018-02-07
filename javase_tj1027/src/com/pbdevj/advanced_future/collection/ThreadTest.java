package com.pbdevj.advanced_future.collection;

public class ThreadTest
{

	public static void main(String[] args)
	{
		Ticket ticket = new Ticket();
		
		Thread t1 = new Thread(ticket, "张三");
		
		Thread t2 = new Thread(ticket, "李四");
		
		t1.start();
		
		t2.start();

	}

}
