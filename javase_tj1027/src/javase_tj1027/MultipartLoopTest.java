package javase_tj1027;

public class MultipartLoopTest
{

	public static void main(String[] args)
	{
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= i; j++)
			{
					System.out.print(j + " * " + i + " = " + i * j + "  ");
			}
			
			System.out.println();
		}
	}

}
