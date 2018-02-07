package com.pbdevj.advanced_future.io.stream.char_stream.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriterTest
{
	public static void main(String[] args)
	{
		BufferedWriter bw = null;
		
		Scanner input = null;
		
		try
		{
			bw = new BufferedWriter(new FileWriter(new File("d:/io/bb.txt")));
		 
			input = new Scanner(System.in);
			
			String content = null;
			
			while((content = input.next()) != null)
			{
				bw.write(content, 0, content.length());
				
				bw.flush();
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
				bw.close();
				
				input.close();
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
