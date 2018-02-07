package javase_tj1027;

import java.util.Scanner;

public class SwitchStrutruceTest
{
    int num = 10;
    
  

	public static void main(String[] args)
	{
//		testTheFirstSwitch();
//		testTheSecondSwitch();
		
		testTheThirdSwitch(EnumType.B);
		
	}

	private static void testTheFirstSwitch()
	{
		Scanner scanner = new Scanner(System.in);//该类具备从控制台动态输入数据的功能

		int score = scanner.nextInt();//要求从控制台输入一个整数
		
		//switch后的小括号内是一个常量，它的类型必须是byte、short、char、int、enum、String
		switch (score / 10)
		{
			case 10:
				System.out.println("优秀");
//				break;//强制终止程序在其作用域范围内的执行
			case 9:
				System.out.println("优秀");
//				break;
			case 8:
				System.out.println("优秀");
				break;
			case 7:
				System.out.println("良好");
				break;
			case 6:
				System.out.println("及格");
				break;
			default:
				System.out.println("不及格或无成绩");
				break;
		}
		
		scanner.close();
	}
	
	private static void testTheSecondSwitch()
	{
		Scanner scanner = new Scanner(System.in);//该类具备从控制台动态输入数据的功能

		String strScore = scanner.next();//要求从控制台输入一个整数
		
		//switch后的小括号内是一个常量，它的类型必须是byte、short、char、int、enum、String
		switch (strScore)
		{
			case "A":
				System.out.println("优秀");
//				break;//强制终止程序在其作用域范围内的执行
			case "B":
				System.out.println("优秀");
//				break;
			case "C":
				System.out.println("优秀");
				break;
			case "D":
				System.out.println("良好");
				break;
			case "E":
				System.out.println("及格");
				break;
			default:
				System.out.println("不及格或无成绩");
				break;
		}
		
		//scanner.close();
	}

	private static void testTheThirdSwitch(EnumType enumType)
	{
		//switch后的小括号内是一个常量，它的类型必须是byte、short、char、int、enum、String
		switch (enumType)
		{
			case A:
				System.out.println("优秀");
//				break;//强制终止程序在其作用域范围内的执行
			case B:
				System.out.println("优秀");
//				break;
			case C:
				System.out.println("优秀");
				break;
			case D:
				System.out.println("良好");
				break;
			case E:
				System.out.println("及格");
				break;
			default:
				System.out.println("不及格或无成绩");
				break;
		}
		
		//scanner.close();
	}

    
}

enum EnumType
{
	A, B, C, D, E;
}
