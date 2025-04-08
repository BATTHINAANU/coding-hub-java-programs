class Problem4_27_3
{
	public static void main(String args[])
	{
		//Second minimum element
		int a[]={1,-20,30,28,45,23};
		Problem4_27_3 p1=new Problem4_27_3();
		if(a.length>1)
		{
			int first_min=p1.firstMin(a);
			int second_min=p1.secondMin(a,first_min);
			System.out.println("First minimum value is "+second_min);
			System.out.println("Second minimum value is "+first_min);
		}
		else if(a.length==1)
		{
			System.out.println("Only one element "+a[0]);
		}
		else
		{
			System.out.println("Array is empty");
		}
	}
	int firstMin(int a[])
	{
		int min1=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min1)
			{
				min1=a[x];
			}			
		}
		return min1;
	}
	int secondMin(int a[],int min1)
	{
		int min2=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min2 && a[x]!=min1)
			{
				min2=a[x];
			}	
		}
		return min2;
	}
}