package com.pbdevj.advanced_future.reflection.instance;

public class Caculator
{
    public void sayHi()
    {
    	System.out.println("你好！");
    }
    
    private String sayHello(String name)
    {
    	return name + ": Hello！";
    }
    
    private int sum(int num, int num2)
    {
    	return num + num2;
    }
}
