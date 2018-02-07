package com.pbdevj.oop3;

public class Teacher extends Person
{
	public void teaching()
	{
		System.out.println("老师教课");
	}

	@Override
	public void eat()
	{
		System.out.println("老师大口大口地吃");
	}
}
