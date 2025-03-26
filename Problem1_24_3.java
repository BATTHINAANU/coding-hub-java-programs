class Problem1_24_3
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.display();
		Student s2=new Student(502,"Rishitha","rishitha@gmail.com","A");
		s2.display();
		Student s3=new Student(503,"Mahesh","mahesh@gmail.com","A");
		s3.display();
	}
}
class Student
{
	int roll;
	String name,email,section;
	Student()
	{
		roll=501;
		name="Tapaswin";
		email="tapaswin@gmail.com";
		section="A";
	}
	Student(int r,String n,String e,String s)//Local variables
	{
		roll=r;//Local Instances
		name=n;
		email=e;
		section=s;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+email+" "+section);
	}
}