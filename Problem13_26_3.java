class Problem13_26_3
{
	public static void main(String args[])
	{
		int a[]={10,20};
		int b[]={30,40};
		int temp=0;
	if(a.length==b.length)
	   {
		for(int x=0;x<a.length;x++)
		{
			temp=a[x];
			a[x]=b[x];
			b[x]=temp;
		}	
		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println("b["+x+"]="+b[x]);

		}
	   }				
	}
}