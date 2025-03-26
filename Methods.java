class Company
{
	String name="Anu";
	public static void main(String args[])
	{
		Company c1=new Company();
		System.out.println(c1.name);
		Employee e1=new Employee();
		e1.id=102;
		System.out.println(e1.id);
		System.out.println(e1.name);
	
	}
}
class Employee
{
	int id=101;
	String name="Amma";
	int salary;
}