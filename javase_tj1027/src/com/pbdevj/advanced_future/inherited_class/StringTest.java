package com.pbdevj.advanced_future.inherited_class;

public class StringTest
{
	public static void main(String[] args)
	{
        String string = new String("zhangsan");
        
        String string2 = new String("zhangsan");
        
        System.out.println(string == string2);
        
        System.out.println(string.equals(string2));
        
        System.out.println("---------------------");
        
        
        String str = "abc";
        
        String str2 = new String("abc");
        
        String str3 = "ab" + "c"; 
        
        String str4 = "ab";
        
        String str5 = str4 + "c";
        
        System.out.println(str == str5);
        
        System.out.println(str.equals(str2));
        
        System.out.println("---------常用方法------------");
        
        String string3 = "abB a";
        
//        System.out.println(string3.length());
//        System.out.println(string3.toUpperCase());
//        System.out.println(string3.toLowerCase());
//        System.out.println(string3.concat("abba"));
//        System.out.println(string3.charAt(0));
//        System.out.println(string3.indexOf("B"));
//        System.out.println(string3.substring(2));
//        System.out.println(string3.substring(1, 3));
//        System.out.println(string3.startsWith("ab"));
//        System.out.println(string3.endsWith("ab"));
//        System.out.println(string3.lastIndexOf("a"));
//        System.out.println(string3.contains("Ba"));
//        System.out.println(string3.trim());
//        String[] strArr = string3.split(" ");
//        System.out.println(strArr.length);
//        System.out.println(Arrays.toString(strArr));
//        System.out.println(String.valueOf(4));
//        System.out.println(string3.getBytes());
        
	}
}
