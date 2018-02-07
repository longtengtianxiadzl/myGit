package com.pbdevj.oop;

public class Student extends Person
{
	private final int sid;

	public Student()
	{
//		this(0);
		this.sid = 1;
	}
	

	public Student(int sid)
	{
		super();
		this.sid = sid;
	}



//	public int getSid()
//	{
//		return sid;
//	}
//
//	public void setSid(int sid)
//	{
//		this.sid = sid;
//	}

	public void learning()
	{
//		super.eat();//调用父类中相应的成员方法，它可以放在方法体中的任一行
		
		//首先会在同一个类中调用相应的方法，如果当前类中没有要调用的方法，
		//则会找父类中是否有该方法，如果有则调用，否则报错。		
		this.eat();
		
		System.out.println("学习");
		
	}
	
	@Override
	public void eat()
	{
		System.out.println("学生吃饭");
	}

	@Override
	public void jumping()
	{
		System.out.println("学生跳");
	}
}
