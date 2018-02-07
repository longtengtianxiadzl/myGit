package com.pbdevj.advanced_future.singleton;

public class SingletonTest
{
	public static void main(String[] args)
	{
        Singleton s = Singleton.getInstance();
        
        Singleton s2 = Singleton.getInstance();
        
        System.out.println(s == s2);
        
        SingletionA a=SingletionA.getInstance();
        SingletionA a1=SingletionA.getInstance();
        System.out.println(a==a1);
        
        SingletionB b=SingletionB.getInstance();
        SingletionB b1=SingletionB.getInstance();
        System.out.println(b==b1);
	}
}
