package com.pbdevj.advanced_future.factory_pattern.abstract_factory;

/**
 * 抽象工厂：多个抽象产品类，派生出多个具体产品类；一个抽象工厂类，派生出多个具体工厂类； 每个具体工厂类可创建多个具体产品类的实例。
 * 即提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们的具体的类。 “一对多”的关系。
 *
 *
 * 工厂方法模式：一个抽象产品类，可以派生出多个具体产品类。 一个抽象工厂类，可以派生出多个具体工厂类。 每个具体工厂类只能创建一个具体产品类的实例。
 * 抽象工厂模式：多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。 一个抽象工厂类，可以派生出多个具体工厂类。
 * 每个具体工厂类可以创建多个具体产品类的实例。 区别：工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个。
 * 工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。
 *
 */
public class AbstractFactoryTest
{
	public static void main(String[] args)
	{
		Factory factory = new ConcreteMercedesAndBenzFactory();

		Benz benz = factory.getBenzProduct("600");

		benz.createBenz();

		benz = factory.getBenzProduct("GLK");

		benz.createBenz();

		System.out.println("-------------------");

		Maybach maybach = factory.getMaybachProduct("S");

		maybach.createMaybach();

		maybach = factory.getMaybachProduct("E");

		maybach.createMaybach();
	}
}
