class Problem4_25_3
{
	void add()
	{
		System.out.println("Default method");
	}
	void add(int x)
	{
		System.out.println(" method integer parameter");
	}
	void add(short x)
	{
		System.out.println(" method short parameter");
	}
	void add(byte x)
	{
		System.out.println(" method byte parameter");
	}
	void add(long x)
	{
		System.out.println(" method long parameter");
	}
	void add(float x)
	{
		System.out.println(" method float parameter");
	}
	void add(char x)





	{
		System.out.println(" method character parameter");
	}
	void add(double x)
	{
		System.out.println(" method double parameter");
	}
	void add(String s)
	{
		System.out.println(" method string parameter");
	}
	public static void main(String args[])
	{
		Problem4_25_3 p1=new Problem4_25_3();
		p1.add((int)'a');
	}

}