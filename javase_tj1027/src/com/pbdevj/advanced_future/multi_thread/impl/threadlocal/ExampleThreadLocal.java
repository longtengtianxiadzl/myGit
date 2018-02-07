package com.pbdevj.advanced_future.multi_thread.impl.threadlocal;

public class ExampleThreadLocal
{
	public  ThreadLocal<Integer> num=new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return 0;
		}
	};

	public int getNextNum() {
		System.out.println(num.get());
		num.set(num.get()+1);
		return num.get();
	}
}
