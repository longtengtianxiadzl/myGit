package com.pbdevj.advanced_future.io.stream.byte_stream.decorator_pattern;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DecoratorPatternTest
{

	public static void main(String[] args)
	{
		DataInputStream dis = null;

		try
		{

			dis = new DataInputStream(new BufferedInputStream(
					new FileInputStream(new File("d:/io/aa.txt"))));

			byte[] b = new byte[512];

			int len = 0;

			while ((len = dis.read(b)) != -1)
			{
				String strContent = new String(b, 0, len);

				System.out.println(strContent);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				dis.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
