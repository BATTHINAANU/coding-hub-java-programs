public class Default_Constructor 
{
	int a,b;
	Default_Constructor()
	{
		a=10;
		b=20;
	}
	void display()
	{
		System.out.println(a+" "+b);
	}
	Default_Constructor(int a,int b)
	{
		this.a=a;
		this.b=b;
		//System.out.println("Constructor2 invoked");
		//System.out.println(a+" "+b);
	}
	public static void main(String args[])
	{
		Default_Constructor d=new Default_Constructor();
		//System.out.println(d.a+" "+d.b);
		d.display();
		Default_Constructor d1=new Default_Constructor(20,30);
		//System.out.println(d1.a+" "+d1.b);
		d1.display();
	}

}
