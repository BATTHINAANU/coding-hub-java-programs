class Secondmax_array
{
	public static void main(String args[])
	{
		int max1=Integer.MIN_VALUE,max2=max1;
		int a[]=new int[]{99,100,80,20,28};
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max1)
			{
				max2=max1;
				max1=a[x];

			}
			//else if(a[x]!=max1 && max2<a[x])
			else if(a[x]<max1 && a[x]>max2)
			{
				max2=a[x];
			}
		}
		System.out.println("Second maximum element is "+max2);
	}
}