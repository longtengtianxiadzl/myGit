package com.pbdevj.advanced_future.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInstance
{
	public void testHashSet()
	{
		Set<String> set = new HashSet<>();

		set.add("aaa");

		// set.add("aaa");

		set.add("eee");

		set.add("ccc");

		set.add("ddd");

		set.add("bbb");

		// System.out.println(set.size());
		//
		// System.out.println(set);
		
		for (String string : set)
		{
			System.out.println(string);
		}

		System.out.println("--------------");

		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();)
		{
			String string = iterator.next();

			System.out.println(string);
		}
	}

	public void testTreeList()
	{
		SortedSet<String> set = new TreeSet<>();

		set.add("aaa");

//		 set.add("aaa");

		set.add("eee");

		set.add("ccc");

		set.add("ddd");

		set.add("bbb");

		// System.out.println(set.size());
		//
		// System.out.println(set);
		
		System.out.println(set.first());
		
		System.out.println(set.last());
		
		System.out.println("---------------");

		for (String string : set)
		{
			System.out.println(string);
		}

		System.out.println("--------------");
		
		SortedSet<String> ss = set.subSet("aaa", "ccc");
		
//		SortedSet<String> ss = set.tailSet("ccc");

		for (Iterator<String> iterator = ss.iterator(); iterator.hasNext();)
		{
			String string = iterator.next();

			System.out.println(string);
		}
	}
	
	public void testTreeList2()
	{
		NavigableSet<String> set = new TreeSet<>();

		set.add("aaa");

//		 set.add("aaa");

		set.add("eee");

		set.add("ccc");

		set.add("ddd");

		set.add("bbb");

		// System.out.println(set.size());
		//
		// System.out.println(set);
		
		System.out.println(set.first());
		
		System.out.println(set.last());
		
		System.out.println("---------------");

		for (String string : set)
		{
			System.out.println(string);
		}

		System.out.println("--------------");
		
		SortedSet<String> ss = set.subSet("aaa", "ccc");
		
//		SortedSet<String> ss = set.tailSet("ccc");

		for (Iterator<String> iterator = ss.iterator(); iterator.hasNext();)
		{
			String string = iterator.next();

			System.out.println(string);
		}
	}

}
