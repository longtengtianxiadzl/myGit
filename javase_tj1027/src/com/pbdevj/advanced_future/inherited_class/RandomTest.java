package com.pbdevj.advanced_future.inherited_class;

import java.util.Random;

public class RandomTest
{

	public static void main(String[] args)
	{
		Random random = new Random();
		
//		System.out.println(random.nextDouble());//[0, 1)
		
		System.out.println(random.nextInt(10));
	}

}
