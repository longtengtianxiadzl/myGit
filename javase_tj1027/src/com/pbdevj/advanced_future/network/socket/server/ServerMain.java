package com.pbdevj.advanced_future.network.socket.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain
{
    public static void main(String[] args) throws Exception
	{
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(8888);//模拟服务器
		
		while(true)
		{
			Socket socket = server.accept();
			
			new InputStreamThread(socket).start();
			
			new OutputStreamThread(socket).start();
		}
		
				
	}
}
