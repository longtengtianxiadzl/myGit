package com.pbdevj.advanced_future.io.file;

import java.io.File;

public class FileTest
{

	public static void main(String[] args)
	{
		
		System.out.println(File.pathSeparator);
		
		System.out.println(File.pathSeparatorChar);
		
		System.out.println(File.separator);
		
		System.out.println(File.separatorChar);
		
        File file = new File("d:/io/a.txt");
        
//        System.out.println(file.isDirectory());
        
//        System.out.println(file.isFile());
        
        if(file.isFile())
        {
        	String fileName = file.getName();
        	
        	System.out.println(fileName);
        	
        	String filePath = file.getAbsolutePath();
        	
        	System.out.println(filePath);
        	
        	fileName = filePath.substring(filePath.lastIndexOf("\\")+1);
        	
        	System.out.println(fileName);
        }
        
        File file2 = new File("d:/tj1027/zhangjie");
        
        if(!file2.exists())
        {
//        	file2.mkdir();//只能创建一个目录
        	
        	file2.mkdirs();
        }
//        else
//        {
//        	file2.delete();
//        	
//        	System.out.println("文件被删除！");
//        }
        
        
        System.out.println(file2.getParent());
	}

}
