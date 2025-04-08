class Print_array
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50,60,70};
		Print_array b=new Print_array();
		b.print(a,0);
	}

	void print(int a[],int x)
	{
		if(x<a.length)
		{
			System.out.println(a[x]);
			print(a,x++);
		}
	}
}