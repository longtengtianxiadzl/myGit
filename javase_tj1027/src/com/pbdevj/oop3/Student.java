package com.pbdevj.oop3;

public class Student extends Person
{
    public void leaning()
    {
    	System.out.println("学生学习");
    }

	@Override
	public void eat()
	{
		System.out.println("学生细嚼慢咽地吃");
	}
}
