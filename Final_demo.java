/*
class Final_demo
{
	public static void main(String args[])
	{
		B b=new B();
		b.add();
	}
}

class A
{
	final void add()
	{
		System.out.println("Parent");
	}
}
class B extends A
{
	void add(int x)//overloading
	{
		System.out.println("Child");
	}
}
*/
/*
1)Is final applicable for local variables and instance variables?

A)YES.PROOF......

class Final_demo
{
	final int X;
	Final_demo(int x)
	{
		this.X=x;		
	}
	void display()
	{
		final int a,b=100;
		a=200;
		System.out.println("Instance variable is "+X+" Local variables "+a+" "+b);
	}
	public static void main(String args[])
	{
		Final_demo f=new Final_demo(10);
		f.display();
		Final_demo f2=new Final_demo(20);
		f2.display();
		
	}
}
*/


/*

2)can we make a method as final public

A)YES.PROOF.....

class Final_demo
{
	int X;
	Final_demo(int x)
	{
		this.X=x;		
	}
	final public void display()
	{
		int a,b=100;
		a=200;
		System.out.println("Instance variable is "+X+" Local variables "+a+" "+b);
	}
	public static void main(String args[])
	{
		Final_demo f=new Final_demo(10);
		f.display();
		Final_demo f2=new Final_demo(20);
		f2.display();
	}
}



			(OR)
class Parent {
    public final void display() {
        System.out.println("This is a final public method.");
    }
}

class Child extends Parent {
    // Attempting to override the display() method will cause a compile-time error.
    //public void display() {
    //System.out.println("Trying to override.");
    }
}

*/

/*
3)can we add final keyword for main method

A)YES.PROOF......

class Final_demo
{
	void display() 
	{
        	System.out.println("This is a method.");
        }
	final public static void main(String args[])
	{
		Final_demo p=new Final_demo();
		p.display();
	}
}

*/

/*
5)can we create object for final class

A)YES.proof......

class A
{
	void add()
	{
		System.out.println("PARENT CLASS OVERRIDEN METHOD");
	}
}
final class B extends A
{
	void sub()
	{
		System.out.println("CHILD CLASS OVERRIDING METHOD");
	}
}
class Final_demo
{
	public static void main(String args[])
	{
		B b=new B();
		b.add(); 
		b.sub();
	}
}
*/

/*

6)In a final class,can a final instance variable value can be initialized using constructor?

A)YES,proof......

final class Final_demo
{
	final int X;
	Final_demo(int x)
	{
		this.X=x;		
	}
	void display()
	{
		final int a,b=100;
		a=200;
		System.out.println("Instance variable is "+X+" Local variables "+a+" "+b);
	}
	public static void main(String args[])
	{
		Final_demo f=new Final_demo(10);
		f.display();		
	}
}

*/

/*
7)are this and super are applicable for final variables

A)YES.proof......

class Parent
{
	final int X;
	Parent()
	{
		this.X=100;
	}
}
class Child extends Parent
{
	final int X;
	Child()
	{
		this.X=200;
	}

	void display()
	{
		System.out.println(X+" "+super.X);
	}

}
class Final_demo
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.display();
	}
}

*/







