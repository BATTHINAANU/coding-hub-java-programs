class Command_line_demo
{
	public static void main(String anu[])
	{
		for(String s:anu)
			System.out.println(s);
		int num1=Integer.parseInt(anu[0]);//Integer.parseInt(...) is used to convert the string into integer...............
		double num2=Double.parseDouble(anu[1]);
		int num3=Short.parseShort(anu[2]);
		int num4=Byte.parseByte(anu[3]);
		boolean b=Boolean.parseBoolean(anu[4]);
		int sum=num1+(int)num2+num3;
		System.out.println("Sum is "+sum);
	}
}


/*
C:\Users\batth\OneDrive\Desktop\coding hub java programs-practice>java Command_line_demo 12 13 265
12
13
265
Sum is 290
*/