class Problem15_26_3
{
	public static void main(String args[])
	{
		int a[]={1000,12,20,27,100};
		int first_max=Integer.MIN_VALUE,second_max=first_max;
	  if(a.length>1)
	     {
		for(int x=0;x<a.length;x++)
		{		
			if(a[x]>first_max)
			    {	
				second_max=first_max;
				first_max=a[x];
			    }
			else if(a[x]<first_max && a[x]>second_max)
			{
				second_max=a[x];
			}
			
		}
		System.out.println("Second max value is "+second_max);
	    }
	  else 
		{
			System.out.println("MAX 1==MAX "+a[0]);
		}
	}
}