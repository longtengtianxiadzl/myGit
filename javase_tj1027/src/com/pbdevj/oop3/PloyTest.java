package com.pbdevj.oop3;

public class PloyTest
{

	public static void main(String[] args)
	{
		Person person = new Teacher();

		Fruit fruit = new Fruit();

		Person p = fruit.eatFruit(person);
		
		p.eat();//当子类和父类中有相同的方法，则多态情况下调用的是子类的方法
		
		p.running();//当父类中有的方法而子类中没有该方法，则可以调用
		
	    //当子类中有的方法而父类中没有，多态情况下则不可以调用
	}

}
