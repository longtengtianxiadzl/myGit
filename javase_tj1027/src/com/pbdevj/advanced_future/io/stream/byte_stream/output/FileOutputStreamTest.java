package com.pbdevj.advanced_future.io.stream.byte_stream.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamTest
{

	public static void main(String[] args)
	{
		OutputStream os = null;
		
		Scanner input = null;
		
		try
		{
			os = new FileOutputStream(new File("d:/io/aa.txt"));
			
			input = new Scanner(System.in);
			
			String inputContent = null;
			
			while((inputContent = input.next()) != null)
			{
				if("n".equals(inputContent))
				{
					break;
				}
				
				os.write(inputContent.getBytes(), 0, inputContent.length());
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
				os.close();
				
				input.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
