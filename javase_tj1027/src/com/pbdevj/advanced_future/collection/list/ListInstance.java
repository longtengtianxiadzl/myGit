package com.pbdevj.advanced_future.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.apache.commons.lang.builder.CompareToBuilder;

@SuppressWarnings("unused")
public class ListInstance
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void testVector()
	{
		Vector vector = new Vector();

		vector.add("aaa");

		vector.add(1);// int-->Integer(Auto Box)

		vector.add(new Integer(12));

		vector.add(3.2);// double-->Double

		vector.add(0, "aaa");

		// Vector vector2 = new Vector();
		//
		// vector2.add("aaa");
		//
		// vector2.add(1);// int-->Integer(Auto Box)
		//
		// vector2.add(new Integer(12));
		//
		// vector2.add(3.2);// double-->Double
		//
		// vector2.add(0, "aaa");
		//
		// vector.addAll(vector2);

		// System.out.println(vector.size());
		//
		// System.out.println(vector);

		for (int i = 0; i < vector.size(); i++)
		{
			if (vector.get(i).equals("aaa"))
				vector.remove(vector.get(i));
			// System.out.print(vector.get(i) + " ");
		}

		System.out.println(vector.size());

		System.out.println("\n---------------------");

		for (Object object : vector)
		{
			System.out.print(object + "   ");
		}
	}

	public void testVector2()
	{
		Vector<String> vector = new Vector<>();

		vector.add("aaa");

		vector.add("bbb");

		vector.add("aaa");

		vector.add("bbb");

		// System.out.println(Arrays.toString(vector.toArray()));

		// for (String string : vector)
		// {
		// System.out.println(string);
		// }

		System.out.println("----------------");

		Enumeration<String> en = vector.elements();

		while (en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}

		System.out.println("==========================");

		for (Enumeration<String> enu = vector.elements(); enu.hasMoreElements();)
		{
			System.out.println(enu.nextElement());
		}
	}

	public void testArrayList()
	{
		List<String> list = new ArrayList<>();

		list.add("a");

		list.add("d");

		list.add("b");

		list.add("e");

		list.add("c");

		// System.out.println(list);

		for (String str : list)
		{
			System.out.println(str);
		}

		System.out.println("-----------------------");

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();)
		{
			System.out.println(iterator.next());
		}
	}

	public void testLinkedList()
	{
		List<String> list = new LinkedList<>();

		list.add("a");

		list.add("d");

		list.add("b");

		list.add("e");

		list.add("c");

		// System.out.println(list);

		// Collections.sort(list);

		Collections.shuffle(list);

		for (String str : list)
		{
			System.out.println(str);
		}

		System.out.println("-----------------------");

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();)
		{
			System.out.println(iterator.next());
		}
	}

	public void testArrayListByDefinitedObj()
	{
		Employee employee = new Employee(1, "zhangsan");
		Employee employee2 = new Employee(2, "lisi");
		Employee employee3 = new Employee(3, "wangwu");
		Employee employee4 = new Employee(4, "zhaoliu");
		Employee employee5 = new Employee(5, "chenqi");

		List<Employee> list = new ArrayList<>();

		list.add(employee4);

		list.add(employee2);

		list.add(employee5);

		list.add(employee);

		list.add(employee3);
		
//		Collections.sort(list, new SortedOuterClass());

//		Collections.sort(list, new SortedInnerClass());
		
		//匿名内部类实现
//		Collections.sort(list, new Comparator<Employee>()
//		{
//			@Override
//			public int compare(Employee o1, Employee o2)
//			{
//				return o1.getId() - o2.getId();
//			}
//		});
		
		//Lambda表达式
		Collections.sort(list, (a, b) -> {return a.getId() - b.getId();});

		for (Employee emp : list)
		{
			System.out.println(emp);
		}

	}
	
	//内部类：类中定义类是内部类
	class SortedInnerClass implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2)
		{
			return o1.getId() - o2.getId();
		}

	}
	public void testArrayListByDefinitedObj2()
	{
		Employee2 employee = new Employee2("zhangsan");
		Employee2 employee2 = new Employee2("lisi");
		Employee2 employee3 = new Employee2("wangwu");
		Employee2 employee4 = new Employee2("zhaoliu");
		Employee2 employee5 = new Employee2("chenqi");

		List<Employee2> list = new ArrayList<>();

		list.add(employee4);

		list.add(employee2);

		list.add(employee5);

		list.add(employee);

		list.add(employee3);
		
//		Collections.sort(list, new SortedOuterClass());

//		Collections.sort(list, new SortedInnerClass());
		
		//匿名内部类实现
//		Collections.sort(list, new Comparator<Employee>()
//		{
//			@Override
//			public int compare(Employee o1, Employee o2)
//			{
//				return o1.getId() - o2.getId();
//			}
//		});
		
		//Lambda表达式
		Collections.sort(list, (a,b) -> {return a.getName().compareTo(b.getName());});

		for (Employee2 emp : list)
		{
			System.out.println(emp);
		}

	}
	
	
	

	


}
