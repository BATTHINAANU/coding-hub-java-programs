class X extends Y
{
	public static void main(String args[])
	{
		X x=new X();
		x.display();
	}
	void display()
	{
		System.out.println("CHILD METHOD");
	}
}
class Y
{
	void display()
	{
		System.out.println("PARENT METHOD");
	}
}