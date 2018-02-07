package com.pbdevj.advanced_future.inherited_class;

public class ObjectTest
{
	public static void main(String[] args)
	{
		Employee employee = new Employee("zhangsan");

		Employee employee2 = new Employee("zhangsan");

		System.out.println(employee == employee2);

		System.out.println(employee.equals(employee2));

		System.out.println(employee);

		System.out.println(employee2);

	}
}
