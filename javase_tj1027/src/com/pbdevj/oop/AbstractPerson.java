package com.pbdevj.oop;

public abstract class AbstractPerson implements IPerson
{
	public AbstractPerson()
	{
	}
	
	public void drinking()
	{
		System.out.println("喝水");
	}
	
	public abstract void running();
	
}
