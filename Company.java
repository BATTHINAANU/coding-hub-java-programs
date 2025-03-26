class Company
{
	String name;
	public static void main(String args[])
	{
		Company c1=new Company();
		c1.name="TCS";
		System.out.println("Company name is : "+c1.name);
		Employee e1=new Employee();
		e1.id=1;
		e1.emp_name="ANU";
		e1.salary=1000000;
		System.out.println("In "+c1.name+" "+e1.emp_name+" is an employee with id "+e1.id+" and she is earning the salary of "+e1.salary);
		Employee e2=new Employee();
		System.out.println("Default values of "+"id is "+e2.id+" employee name is "+e2.emp_name+" and employee salary is "+e2.salary);
	}
}
class Employee
{
	int id;
	String emp_name;
	int salary;
}