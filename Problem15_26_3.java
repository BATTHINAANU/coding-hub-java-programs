class Problem15_26_3
{
	public static void main(String args[])
	{
		int a[]={2000,1000,12,20,27,100};
		Problem15_26_3 p1=new Problem15_26_3();
		if(a.length>1)
	     	{
			int first_max=p1.findMax1(a,Integer.MIN_VALUE);
			int second_max=p1.findMax2(a,first_max,Integer.MIN_VALUE);
			System.out.println("First maximum value is "+first_max);
			System.out.println("Second maximum value is "+second_max);
				
	     	}
		else if(a.length==1)
		{
			System.out.println("MAX 1==MAX "+a[0]);
		}
		else
		{
			System.out.println("Array is empty");
		}
	}
	int findMax1(int a[],int max)
	{
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				max=a[x];
			}
		}
		return max;
	}
	int findMax2(int a[],int max,int max2)
	{
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max2 && a[x]!=max)
				max2=a[x];
		}
		return max2;
	}
}