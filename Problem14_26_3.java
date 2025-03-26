class Problem14_26_3
{
	public static void main(String args[])
	{
		int a[]={100};
		int max1=Integer.MIN_VALUE,temp=0,temp1=max1;
		if(a.length>1)
		{
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=1;y<a.length;y++)
			{
			 if(a[x]>a[y])
			{
				temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;			
			}
			}
			
		}
		
		System.out.println("The elements of the array are ");
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max1)
			{
				temp1=max1;
				max1=a[x];
			}
		}
		System.out.println("Second max value is "+temp1);
		}
		else if(a.length==1)
			System.out.println("1st maximum is the second maximum "+a[0]);
		else
			System.out.println("Array is empty");
	}
}