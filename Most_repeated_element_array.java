class Most_repeated_element_array
{//Search for the most repeated element in an array
	public static void main(String args[])
	{
		int a[]={1,3,2,4,1,1,9,4,10,2,1,2,2,3,3,3,3,3,3,3};
		int b[]=new int[a.length];
		int count1=0,element=0;
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
				if(count>count1)
				{
					count1=count;
					element=a[x];
				}
			}
		}
		if(count1>1)
			System.out.println(element+" is the most repeated element");
	}
}