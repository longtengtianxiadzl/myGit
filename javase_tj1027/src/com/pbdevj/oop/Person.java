package com.pbdevj.oop;



public abstract class Person extends AbstractPerson
{
	static int id;
	
	protected String name;
	
	private int age;
	
	public int getId()
	{
		System.out.println(id);
		
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public Person()
	{
		this(0, null, 0);//调用同一个类中相应的构造方法
	}
	
	public Person(int id, String name, int age)
	{
		super();//调用父类中相应的构造方法
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	protected /*final*/ /*static*/ void eat()
	{
		
		System.out.println("吃饭");
	}
	
//	public String eat(String foodName)
//	{
////		System.out.println("吃"+ foodName + "饭");
//		
//		return "吃"+ foodName + "饭";
//	}
//	
//	public void eat(int id)
//	{
//		this.name = "zhangsai";
//		
//		id = 3;
//		
//		System.out.println("省份证号为"+id+"的人在吃饭");
//	}
//	
//	public String eat(int id, String foodName)
//	{
////		System.out.println("吃"+ foodName + "饭");
//		
//		return "吃"+ foodName + "饭";
//	}
//	
//	void eat(String age, int id)
//	{
//		System.out.println("省份证号为"+id+"的人在吃饭");
//	}

	@Override
	public String toString()
	{
		return id + "=>>" + name + "=>>" + age;
	}

	@Override
	public void running()
	{
		// TODO Auto-generated method stub
		
	}
	
}
