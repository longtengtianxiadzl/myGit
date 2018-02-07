package com.pbdevj.advanced_future.io.stream.serializable_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest
{

	public static void main(String[] args) throws Exception
	{
		Emp emp = new Emp(1111, "zhangsan");
		
		
		testSerializableObj(emp);
		
		testUnSerializableObj();
	}
	
	public static void testSerializableObj(Emp emp) throws Exception
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/home/zhaozhenlong/a.txt")));
		
		oos.writeObject(emp);
	}
	
	public static void testUnSerializableObj() throws Exception
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/home/zhaozhenlong/a.txt")));
	
		Emp emp = (Emp)ois.readObject();
		
		
		emp.eat();
	}

}
