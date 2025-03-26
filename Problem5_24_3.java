class Problem5_24_3
{
	public static void main(String args[])
	{
		Constructor c0=new Constructor();
		c0.display();
		Constructor c1=new Constructor(504,"ANU","anu@gmail.com","A",100);
		c1.display();
		Constructor c2=new Constructor("ANUSREE",507,"anusree@gmail.com","A",99);
		c2.display();
	}
}
class Constructor
{
	int roll;
	String name,email,section;
	int marks;
	Constructor()//Default Constructor
	{
		roll=506;
		name="JAYA RANI";
		email="jaya@gmail.com";
		section="A";
		marks=98;
	}
	Constructor(int r,String n,String e,String s,int m)//Parameterized Constructor 
	{
		name=n;//local instances
		roll=r;
		email=e;
		section=s;
		marks=m;
	}
	Constructor(String name,int roll,String email,String section,int m)
	{
		this.name=name;
		this.roll=roll;
		this.email=email;
		this.section=section;
		marks=m;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+email+" "+section+" "+marks);
	}
}