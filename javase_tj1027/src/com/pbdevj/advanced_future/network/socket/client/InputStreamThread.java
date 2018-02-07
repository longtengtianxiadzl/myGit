package com.pbdevj.advanced_future.network.socket.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class InputStreamThread extends Thread
{
	private Socket socket;
	
	public InputStreamThread(Socket socket)
	{
		super();
		this.socket = socket;
	}

	@Override
	public void run()
	{
		InputStream is = null;
		
		try
		{
			is = socket.getInputStream();
			
			byte[] bs = new byte[512];
			
			int len = 0;
			
			while((len = is.read(bs)) != -1)
			{
				String str = new String(bs, 0, len);
				
				System.out.println(str);
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
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
