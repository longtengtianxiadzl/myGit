package com.pbdevj.advanced_future.factory_pattern.abstract_factory;

public interface Factory
{
   public abstract Benz getBenzProduct(String type);
   
   public abstract Maybach getMaybachProduct(String type);
}
