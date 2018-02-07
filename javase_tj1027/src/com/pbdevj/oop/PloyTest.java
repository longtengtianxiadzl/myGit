package com.pbdevj.oop;

public class PloyTest
{

	public static void main(String[] args)
	{
		Student student = new Student();//

		Teacher teacher = new Teacher();

		Person s_Person = new Student();// 父类指向子类：直接使用多态
		
//		AbstractPerson s_AbstractPerson = student;
//
//		IPerson s_IPerson = student;
//
//		Person t_Person = new Teacher();// 编译阶段只知道其类型是Person,不知道该Person到底是Teacher还是Student
//
//		AbstractPerson t_AbstractPerson = teacher;
//
//		IPerson t_IPerson = teacher;

		// 判断左边对象的引用是否指向右边类型的一个实例
		if (s_Person instanceof Teacher)
		{
			Teacher tea = (Teacher) s_Person;

			tea.teaching();
		}
		else
			if (s_Person instanceof Student)
			{
				Student stu = (Student) s_Person;
				
				stu.learning();
			}

	}

}
