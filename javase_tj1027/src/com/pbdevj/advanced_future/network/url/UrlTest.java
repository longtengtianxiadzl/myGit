package com.pbdevj.advanced_future.network.url;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class UrlTest
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://www.baidu.com");
		
//		URLConnection conn = url.openConnection();
//		
//		InputStream is = conn.getInputStream();
		InputStream is=url.openStream();
		
		byte[] b = new byte[512];
		
		FileOutputStream fos = new FileOutputStream("/home/zhaozhenlong/baidu.html");
		
		int len = 0;
		
		while((len = is.read(b)) != -1)
		{
			fos.write(b, 0, len);
		}
		
		fos.close();
		
		is.close();
	}
}
