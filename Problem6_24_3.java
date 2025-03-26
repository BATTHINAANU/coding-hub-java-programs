class Problem6_24_3
{
	int id;
	String name;
	Problem6_24_3(int id)
	{
		this.id=id;
	}
	Problem6_24_3(String name)
	{
		this.name=name;
	}
	Problem6_24_3(int i,String n)
	{
		id=i;
		name=n;	
	}
	Problem6_24_3()
	{
		id=1;
		name="TAPASWIN";
	}
	void display()
	{
		System.out.println(id+" \n "+name);
	}
	public static void main(String args[])
	{		
		Problem6_24_3 p1=new Problem6_24_3();
		p1.display();
		Problem6_24_3 p2=new Problem6_24_3(2);
		System.out.println(p2.id);
		p2.id=12;
		p2.name="anu";
		p2.display();
		Problem6_24_3 p3=new Problem6_24_3("Anu");
		p3.display();
		Problem6_24_3 p4=new Problem6_24_3(2,"Rishitha");
		p4.display();
	}
}