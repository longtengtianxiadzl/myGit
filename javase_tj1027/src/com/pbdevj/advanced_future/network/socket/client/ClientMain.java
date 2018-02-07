package com.pbdevj.advanced_future.network.socket.client;

import java.net.Socket;

public class ClientMain
{
    public static void main(String[] args) throws Exception
	{
		Socket client = new Socket("192.168.80.1", 8888);//模拟客户端
		
		new InputStreamThread(client).start();
		
		new OutputStreamThread(client).start();
				
	}
}
