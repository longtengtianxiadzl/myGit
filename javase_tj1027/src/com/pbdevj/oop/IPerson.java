package com.pbdevj.oop;

public interface IPerson extends Aaa, Bbb
{
   public static final int ID = 0;
   
   public abstract void jumping();
   
   static void test()
   {
	   
   }
   
   public default void test2()
   {
	   
   }
}
