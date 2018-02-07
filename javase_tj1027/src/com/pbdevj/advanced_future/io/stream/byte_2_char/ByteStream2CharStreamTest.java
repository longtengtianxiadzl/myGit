package com.pbdevj.advanced_future.io.stream.byte_2_char;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ByteStream2CharStreamTest
{
	public static void main(String[] args)
	{
		BufferedReader br = null;
		
		try
		{
			br = new BufferedReader(new InputStreamReader(
					new DataInputStream(new BufferedInputStream(
					new FileInputStream(new File("d:/io/aa.txt"))))));
		 
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
