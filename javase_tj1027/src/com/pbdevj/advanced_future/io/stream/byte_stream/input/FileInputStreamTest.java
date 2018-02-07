package com.pbdevj.advanced_future.io.stream.byte_stream.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamTest
{

	public static void main(String[] args)
	{
		InputStream is = null;
		
		try
		{
			is = new FileInputStream(new File("d:/io/aa.txt"));
			
			byte[] b = new byte[512];
			
			int len = 0;
			
			while((len = is.read(b)) != -1)
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
				is.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
