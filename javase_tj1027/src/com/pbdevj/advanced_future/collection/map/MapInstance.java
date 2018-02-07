package com.pbdevj.advanced_future.collection.map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapInstance
{
	public void testHashtable()
	{
		Hashtable<String, String> table = new Hashtable<>();// key->value

		table.put("a", "aaa");

		table.put("b", "bbb");

		table.put("c", "ccc");

		table.put("d", "ddd");

		table.put("e", "eee");

		// System.out.println(table.size());

		// System.out.println(table);

		for (Enumeration<String> keyStr = table.keys(); keyStr.hasMoreElements();)
		{
			String key = keyStr.nextElement();

			System.out.println(key + "-->" + table.get(key));
		}

		System.out.println("-----------------");

		for (String key : table.keySet())
		{
			System.out.println(key + "==>" + table.get(key));
		}

		System.out.println("-----------------");

		for (Iterator<String> iterator = table.keySet().iterator(); iterator.hasNext();)
		{
			String type = iterator.next();

			System.out.println(type + "===>>>" + table.get(type));
		}

		System.out.println("-----------------");

		Set<Entry<String, String>> set = table.entrySet();

		for (Entry<String, String> entry : set)
		{
			System.out.println(entry.getKey() + ">>>>" + entry.getValue());
		}

		System.out.println("-----------------");

		for (Iterator<Entry<String, String>> iterator = table.entrySet().iterator(); iterator.hasNext();)
		{
			Entry<String, String> entry = iterator.next();

			System.out.println(entry);
		}

		System.out.println("--------获取值---------");

		for (String value : table.values())
		{
			System.out.println(value);
		}

		System.out.println("--------获取值2---------");

		for (Enumeration<String> en = table.elements(); en.hasMoreElements();)
		{
			System.out.println(en.nextElement());
		}
	}

	public void testHashMap()
	{
		Map<String, String> map = new HashMap<>();// key->value

		map.put("a", "aaa");

		map.put("b", "bbb");

		map.put("c", "ccc");

		map.put("d", "ddd");

		map.put("e", "eee");

		for (String key : map.keySet())
		{
			System.out.println(key);
		}

		System.out.println("-----------------------");

		for (Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext();)
		{
			String type = iterator.next();

			System.out.println(type);
		}

		System.out.println("-----------获取值-----------");

		for (String key : map.values())
		{
			System.out.println(key);
		}

		System.out.println("-----------获取值-----------");

		for (Iterator<String> iterator = map.values().iterator(); iterator.hasNext();)
		{
			String type = iterator.next();

			System.out.println(type);

		}

		System.out.println("-----------获取Key-Vlaue-----------");

		for (Entry<String, String> entry : map.entrySet())
		{
			System.out.println(entry);
		}

		System.out.println("-----------获取Key-Vlaue-----------");

		for (Iterator<Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext();)
		{
			System.out.println(iterator.next());
		}
	}

	public void testTreeMap()
	{
		SortedMap<String, String> map = new TreeMap<>();// key->value

		map.put("a", "aaa");

		map.put("b", "bbb");

		map.put("c", "ccc");

		map.put("d", "ddd");

		map.put("e", "eee");

		for (String key : map.keySet())
		{
			System.out.println(key);
		}

		System.out.println("-----------------------");

		for (Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext();)
		{
			String type = iterator.next();

			System.out.println(type);
		}

		System.out.println("-----------获取值-----------");

		for (String key : map.values())
		{
			System.out.println(key);
		}

		System.out.println("-----------获取值-----------");

		for (Iterator<String> iterator = map.values().iterator(); iterator.hasNext();)
		{
			String type = iterator.next();

			System.out.println(type);

		}

		System.out.println("-----------获取Key-Vlaue-----------");

		for (Entry<String, String> entry : map.entrySet())
		{
			System.out.println(entry);
		}

		System.out.println("-----------获取Key-Vlaue-----------");

		for (Iterator<Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext();)
		{
			System.out.println(iterator.next());
		}
	}
}
