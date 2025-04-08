class Problem3_27_3
{
	public static void main(String args[])
	{
		Problem3_27_3 p1=new Problem3_27_3();
		int a[]={10,20,30,40,50};
		int res[]=p1.sum(a);
		System.out.println("The resultant array is :");
		for(int x=0;x<res.length;x++)
			System.out.println(res[x]);
	}
	int[] sum(int a[])
	{
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(x==0)
			{
				b[x]=a[x]+a[x+1];
			}
			else if(x==a.length-1)
			{
				b[x]=a[x-1]+a[x];
			}
			else
			{
				b[x]=a[x-1]+a[x+1];
			}
		}
		return b;
	}
}