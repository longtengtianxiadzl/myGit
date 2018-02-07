package javase_tj1027;

public class DataTypeTest
{

	public static void main(String[] args)//主方法
	{
		byte bNum = 1;
		
		short sNum = -3276;
		
		char cType = 0;
		
		System.out.println('0' == 49);
		
		System.out.println(sNum);
		
		System.out.println(cType);
		
		int iNum = 12;
		
//		boolean reslut = false;
		
		float fNum = 4.3F;
		
		double dNum = 4.3;
		
		sNum = bNum;//由小类型转换成大类型叫做自动类型转换
		
		sNum = (short)iNum;//由大类型转换成小类型叫做强制类型转换
		
		fNum = (float)dNum;
		
		fNum = iNum;
		
		iNum = (int)fNum;
		
	}

}
