class Problem1_27_3
{
	//copy even index values into another array
	int count;
	public static void main(String args[])
	{
		Problem1_27_3 p1=new Problem1_27_3();
		int res[]=p1.evenIndexElements(new int[]{10});
		for(int x=0;x<res.length;x++)
			System.out.println(res[x]);
	}
	int[] evenIndexElements(int a[])
	{
		if(a.length%2==0)
			count=a.length/2;
		else 
			count=a.length/2+1;//we need even index elements
		int b[]=new int[count];
		for(int x=0,y=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				b[y]=a[x];
				y++;
			}
		}
		return b;
	}
}