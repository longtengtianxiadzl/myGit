package com.pbdevj.advanced_future.singleton;

public final class Singleton
{
   private static final Singleton SINGLETON = new Singleton();
	
   private Singleton()
   {
	   
   }
   
   public static Singleton getInstance()
   {
	   return SINGLETON;
   }
}
