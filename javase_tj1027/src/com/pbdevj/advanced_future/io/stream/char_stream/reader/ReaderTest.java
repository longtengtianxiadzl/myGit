package com.pbdevj.advanced_future.io.stream.char_stream.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderTest
{
	public static void main(String[] args)
	{
		BufferedReader br = null;
		
		try
		{
			br = new BufferedReader(new FileReader(new File("d:/io/bb.txt")));
		 
			String content = null;
			
			while((content = br.readLine()) != null)
			{
				System.out.println(content);
			}
			
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
