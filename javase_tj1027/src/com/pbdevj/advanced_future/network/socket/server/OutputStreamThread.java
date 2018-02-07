package com.pbdevj.advanced_future.network.socket.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class OutputStreamThread extends Thread
{
	private Socket socket;
	
	public OutputStreamThread(Socket socket)
	{
		super();
		this.socket = socket;
	}

	@Override
	public void run()
	{
		OutputStream os = null;
		
		Scanner input = null;
		
		try
		{
			os = socket.getOutputStream();
			
			input = new Scanner(System.in);
			
			String content = null;
			
			while((content = input.next()) != null)
			{
				os.write(content.getBytes(), 0, content.getBytes().length);
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				os.close();
				
				input.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
