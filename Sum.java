class Sum
{
	public static void main(String args[])
	{
		Addition a1=new Addition();
		a1.a=10;a1.b=20;
		a1.firstMethod();
		Addition a2=a1;
		a2.firstMethod();
		int a,b;
		a=10;
		b=1000;
		System.out.println(a+b);
		Addition a3=new Addition();
		a3.firstMethod();
	}
}
class Addition
{
      	int a,b;
	void firstMethod()
	{
		System.out.println("Sum is "+(a+b));
	}
}