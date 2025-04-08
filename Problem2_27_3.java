class Problem2_27_3
{
	//print the negative values of one array in another array in reverse order
	public static void main(String args[])
	{
		Problem2_27_3 p1=new Problem2_27_3();
		int a[]=new int[]{10,-2,-10,15,29,-29,-39};
		int count=p1.calCount(a,0);
		int res[]=p1.reverse(a,count);
		System.out.println("The negative values of the a[] array in the reverse order");
		for(int x=0;x<res.length;x++)
		{
			System.out.println(res[x]);
		}
		
	}
	int calCount(int a[],int count)
	{
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				count++;
			}
		}
		return count;
	}
	int[] reverse(int a[],int count)
	{
		int b[]=new int[count];
		for(int x=a.length-1,y=0;x>=0;x--)
		{	
			if(a[x]<0)
			{
				b[y]=a[x];
				y++;
			}
		}
		return b;
	}
}