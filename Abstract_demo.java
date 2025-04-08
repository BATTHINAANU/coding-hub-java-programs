/*
class Abstract_demo
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.add();
		c.sub();
		c.mul();
	}
}
abstract class Parent
{
	abstract  void add();//unimplemented or abstract method
	void sub()
	{
		System.out.println("SUB method");
	}
}
class Child extends Parent
{
	void mul()
	{
		System.out.println("MUL method");
	}
	@Override
	void add()
	{
		System.out.println("ADD method");
	}	
}
*/

/*
class Abstract_demo
{
	public static void main(String args[])
	{
		Child c=new Child(10,20);
		int addition=c.add();
		int subtraction=c.sub();
		int multiplication=c.mul();
		double division=c.div();
		int modulous=c.mod();
		System.out.println(addition);
	}
}
abstract class Parent
{
	int a,b;
	Parent(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract  int sub();//unimplemented or abstract method
	int add()
	{
		return a+b;		
	}
	int mul()
	{
		return a*b;
	}
		
}
class Child extends Parent
{
	int x,y;
	Child(int x,int y)
	{
		super(100,200);
		this.x=x;
		this.y=y;
	}
	double div()
	{
		return x/y;	
	}
	int mod()
	{
		return x%y;
	}
	@Override
	int sub()
	{
		return x-b;
	}	
}

*/


/*

class Abstract_demo
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.add();
		c.sub();
		c.mul();
	}
}
abstract class Parent
{
	abstract void add();//unimplemented or abstract method
	void sub()
	{
		System.out.println("SUB method");
	}
}
class Child extends Parent
{
	void mul()
	{
		System.out.println("MUL method");
	}
	@Override
	void add()
	{
		System.out.println("ADD method");
	}	
}

*/

/*
class Abstract_demo
{
	public static void main(String args[])
	{
		Parent p=new Child();
		p.add();
		p.mul();
		
	}
}
abstract class Parent
{
	abstract void add();//unimplemented or abstract method
	void sub()
	{
		System.out.println("SUB method");
	}
}
class Child extends Parent
{
	void mul()
	{
		System.out.println("MUL method");
	}
	@Override
	void add()
	{
		System.out.println("ADD method");
	}	
}
*/

/*
class Abstract_demo
{
	public static void main(String args[])
	{
		Parent.add();
	}
}
abstract class Parent
{
	static void add()
	{
		System.out.println("ABSTRACT CLASS STATIC METHOD");
	}

}
*/

class Abstract_demo
{
	public static void main(String args[])
	{
		Parent p=new Child();
		p.add();
		p.add(10);
	}
}
abstract class Parent
{
	abstract void add();
	abstract void add(int a);
}
class Child extends Parent
{
	@Override
	void add()
	{
		System.out.println("Default method");
	}
	@Override
	void add(int b)
	{
		System.out.println("Parameterized method");
	}
}

























