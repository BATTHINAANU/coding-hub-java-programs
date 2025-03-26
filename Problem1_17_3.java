class Problem1_17_3
{
	public static void main(String args[])
	{
		Operations o1=new Operations();
		int a=o1.a=20;int b=o1.b=10;
		o1.addition(a,b);
	}
}
class Operations
{
	int a,b;
	void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	void subtraction(int a,int b)
	{
		System.out.println(a-b);
	}
	void multiplication(int a,int b)
	{
		System.out.println(a*b);
	}
}