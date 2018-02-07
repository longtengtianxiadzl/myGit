package javase_tj1027;

import java.util.Scanner;

public class ChoiceStrutruceTest
{

	public static void main(String[] args)
	{
		// System.out.println("--------");

		// if (5 < 3)// 产生布尔值的表达式或是布尔值。
		// {
		// System.out.println("5小于3");
		// }
		// else
		// {
		// System.out.println("5大于等于3");
		// }

		System.out.println("--------------------------");
		
		Scanner scanner = new Scanner(System.in);//该类具备从控制台动态输入数据的功能
		
		int score = scanner.nextInt();//要求从控制台输入一个整数

		if (score > 90)
		{
			System.out.println("优秀");
		}
		else
			if (score > 80)
			{
				System.out.println("优秀");
			}
			else
				if (score > 70)
				{
					System.out.println("良好");
				}
				else
					if (score >= 60)
					{
						System.out.println("及格");
					}
					else
					{
						System.out.println("不及格或无成绩");
					}
		
		scanner.close();

	}

}
