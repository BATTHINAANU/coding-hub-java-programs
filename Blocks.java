/*
class Blocks
{
	int x;
	{
		x=10;
		System.out.println("Instance block executed");
	}
	public Blocks()
	{
		System.out.println("Constructor executed,x="+x);
	}
	{
		System.out.println("Instance block 2 executed");
	}

	public static void main(String args[])
	{
		Blocks b1=new Blocks();
		Blocks b2=new Blocks();
	}
}
*/

class Blocks
{
	static int x;
	static
	{
		x=10;
		System.out.println("static block executed");
	}
	public Blocks()
	{
		System.out.println("Constructor executed,x="+x);
	}
	static
	{
		System.out.println("static block 2 executed");
	}

	public static void main(String args[])
	{
		//Blocks b1=new Blocks();
		//Blocks b2=new Blocks();
	}
}