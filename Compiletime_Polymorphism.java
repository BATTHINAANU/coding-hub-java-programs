class Compiletime_Polymorphism
{
	public static void main(String args[])
	{
		Compiletime_Polymorphism m=new Compiletime_Polymorphism();
		System.out.println(m.m1("ANU NAIDU"));
	}
	public void m1()
	{

	}
	public double m1(String x,int y)
	{
		return 10;
	}
	public int m1(int x)
	{
		return 111;
	}
	int m1(int y,String s)
	{
		return 109866;
	}
	String m1(String s)
	{
		return "Anu";
	}
}