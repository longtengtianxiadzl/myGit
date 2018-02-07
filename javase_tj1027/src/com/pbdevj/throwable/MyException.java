package com.pbdevj.throwable;

public class MyException extends Exception
{

	public MyException()
	{
		super();
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public MyException(String message)
	{
		super(message);
		
		System.out.println("Exception Message:" + message);
	}

	public MyException(Throwable cause)
	{
		super(cause);
	}

}
