class Problem7_27_3
{
	public static void main(String args[])
	{
		Problem7_27_3 p1=new Problem7_27_3();
		int a[]={5,1};
	   if(a.length>0)
	   {
		int first_max=p1.firstMax(a,Integer.MIN_VALUE);
		int temp=a[0];
		a[0]=a[first_max];
		a[first_max]=temp;
		int second_max=p1.secondMax(a,a[0],Integer.MIN_VALUE);
		temp=a[1];
		a[1]=a[second_max];
		a[second_max]=temp;
		System.out.println("The array elements are:");
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	   }
	}
	int firstMax(int a[],int max)
	{
		int first_max_index=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				max=a[x];
				first_max_index=x;
			}
		}
		return  first_max_index;
	}
	int secondMax(int a[],int max1,int max2)
	{
		int temp_max_index=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]!=max1 && a[x]>max2)
			{
				max2=a[x];
				temp_max_index=x;
			}	
		}
		return temp_max_index;
	}
}