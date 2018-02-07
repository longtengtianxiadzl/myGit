package com.pbdevj.oop;

public class StaticVarAndMethodTest
{
	public static void main(String[] args)
	{
//		Person person = new Person();
//
//		person.id = 1;
//		
//		person.eat();
		
		Person.id = 1;
		
		System.out.println(Person.id);
		
//		Person.eat();
	}
}
