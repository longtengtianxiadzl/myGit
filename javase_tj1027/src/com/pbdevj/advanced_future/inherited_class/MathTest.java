package com.pbdevj.advanced_future.inherited_class;

public class MathTest
{

	public static void main(String[] args)
	{
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.abs(-8));
        System.out.println(Math.round(8.4));
        System.out.println((int)Math.floor(-11.8));
        System.out.println((int)Math.floor(11.8));
        System.out.println(Math.random());//[0, 1)
        System.out.println((int)Math.ceil(4.3));
        System.out.println(Math.min(4, 6));
        System.out.println(Math.max(2, Math.max(0, 1)));
	}

}
