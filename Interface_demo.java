interface A
{
	void m1();//only public 
	public void m2();//only public 
	/*A()
	{
		System.out.println("Constructor");
	}*/

}
class Aimpl implements A
{
	@Override
	public void m1()
	{
		System.out.println("M1-METHOD");
	}
	@Override
	public void m2()
	{
		System.out.println("M2-METHOD");
	}
}
class Interface_demo
{
	public static void main(String anu[])
	{
		A a=new Aimpl();
		a.m1();
		a.m2();
	}
}