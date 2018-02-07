package com.pbdevj.advanced_future.factory_pattern.abstract_factory;

public class ConcreteMercedesAndBenzFactory implements Factory
{

	@Override
	public Benz getBenzProduct(String type)
	{
		if ("GLK".equals(type))
			return new BenzGLK();

		if ("600".equals(type))
			return new Benz600();

		return null;
	}

	@Override
	public Maybach getMaybachProduct(String type)
	{
		if ("S".equals(type))
			return new MaybachSLevel();

		if ("E".equals(type))
			return new MaybachELevel();
		
		return null;
	}

}
