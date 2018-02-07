package com.pbdevj.oop;

public class Teacher extends Person
{
	private int tid;

	public Teacher()
	{
	}

	public Teacher(int tid)
	{
		super();
		this.tid = tid;
	}

	public void teaching()
	{
		System.out.println("教课");
	}

	@Override
	public void jumping()
	{
		System.out.println("老师跳");

	}

}
