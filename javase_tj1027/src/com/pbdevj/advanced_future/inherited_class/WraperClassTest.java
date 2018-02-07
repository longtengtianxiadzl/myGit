package com.pbdevj.advanced_future.inherited_class;

public class WraperClassTest
{

	public static void main(String[] args)
	{
		Integer integer = Integer.parseInt("1");

		// System.out.println(0.533333 + 0.1);

		System.out.println(integer);

		Integer i = 127;

		Integer i2 = 127;

		Integer i3 = 128;

		Integer i4 = 128;
		
		System.out.println(i == i2);
		
		System.out.println(i3 == i4);
	}

}
