class Age
{
	public static void main(String args[])
	{
	 int age=122;
	 if(age<0)
	 System.out.println("This is a negative age");
	 else if(age>60)
	 System.out.println("Senior citizen");
	 else if(age>=18)
	 System.out.println("Major");
	 else if (age<10)
	 System.out.println("Kid");
	 else if(age<18)
	 System.out.println("Minor");
	 else
	 System.out.println("Invalid age");
	}
}