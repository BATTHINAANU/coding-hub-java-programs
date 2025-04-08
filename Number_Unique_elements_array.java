class Number_Unique_elements_array
{//number of the unique elements in an array
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
			if(count==1)
			{
				count1++;
				System.out.println(a[x]);
			}
		}
		if(count1!=0)
			System.out.println("Number of unique elements are "+count1);
	}
}