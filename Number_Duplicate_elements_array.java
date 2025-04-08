class Number_Duplicate_elements_array
{//number of duplicate elements in an array
	public static void main(String args[])
	{
		int a[]={1,3,2,4,1,1,9,4,10,2,1};
		int b[]=new int[a.length];
		int count1=0;
		for(int x=0;x<a.length;x++)
		{
			if(b[x]==1)
				continue;
			int count=1;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=1;
				}
			}
			if(count>1)
			{
				count1++;
			}
		}
		if(count1!=0)
		{
			System.out.println("Number of duplicate elements are "+count1);
		}
	}
}