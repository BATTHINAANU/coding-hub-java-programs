/*

8)can we provide a static keyword for local variables.

A)NO.we can't.It raises an error.....

class Static_demo
{
	void add()
	{
		static int a,b;
		System.out.println("Sum is "+Static_demo.a+Static_demo.b);
	}
	public static void main(String args[])
	{
		Static_demo s=new Static_demo();
		s.add();
		Static_demo s1=new Static_demo();
		s1.add();
	}
}

*/

/*

9)can we overload the static methods.

A)Yes.Proof.......

class Static_demo
{
	static void add(int a,int b)
	{
		System.out.println("static Sum is "+(a+b));
	}
	static void add(double a,double b)
	{
		System.out.println("Sum is "+(a+b));
	}
	public static void main(String args[])
	{
		Static_demo s1=new Static_demo();
		s1.add(20,30);
		s1.add(20.0,30.0);
		s1.add(10,20);
	}

}


*/
/*
10)

class Static_demo
{
	public static void main(String args[])
	{
		Parent p=new Child();
		p.add();
	}
}

class Parent
{
	public static void add()
	{
		System.out.println("Parent class method");
	}
}
class Child extends Parent
{
	public static void add()
	{
		System.out.println("Child class method");
	}
}

*/
/*
class Static_demo
{
	public static void main(String args[])
	{
		System.out.println("ANU");
		Static_demo s=new Static_demo();
		s.main(10);
	}
	public static void main(int a)
	{
		System.out.println("Parent");
	}
}

*/
/*
class Static_demo
{
	public static void main(String args[])
	{
		Parent p=new 
	}
}
class Parent 
{
	public static void main(String args[])
	{
		System.out.println("Parent");
	} 
}
class Child extends Parent
{
	public static void main(String args[])
	{
		System.out.println("Child");
	} 

}
*/


class Static_demo
{
	public static void main(String args[])
	{
		Parent p=new Child();
		 p.add();
	}
}

class Parent
{
	public static void add()
	{
		System.out.println("Parent class method");
	}
}
class Child extends Parent
{
	public static void add()
	{
		System.out.println("Child class method");
	}
}






















