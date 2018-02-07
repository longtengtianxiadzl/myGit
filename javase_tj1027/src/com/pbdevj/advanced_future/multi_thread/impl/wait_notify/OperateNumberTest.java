package com.pbdevj.advanced_future.multi_thread.impl.wait_notify;

public class OperateNumberTest
{

	public static void main(String[] args)
	{
		ThreadExample tx = new ThreadExample();

		IncreamentThread it = new IncreamentThread(tx);

		IncreamentThread it2 = new IncreamentThread(tx);

		DecreamentThread dt = new DecreamentThread(tx);

		DecreamentThread dt2 = new DecreamentThread(tx);

		it.start();

		it2.start();

		dt.start();

		dt2.start();
	}

}
