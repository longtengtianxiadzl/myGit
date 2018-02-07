package com.pbdevj.advanced_future.inherited_class;

public enum EnumType
{
     A(1), B(2), C(3), D(4), E(5);
	
	private int num;
	
	private EnumType()
	{
		this(0);
	}
	
	private EnumType(int num)
	{
		this.num = num;
	}
	
	public void test()
	{
		
	}
}
