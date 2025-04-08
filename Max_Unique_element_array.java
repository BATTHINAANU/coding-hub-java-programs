class Max_Unique_element_array
{//Search for the max unique element in an array
	public static void main(String args[])
	{
		int a[]={1,3,2,4,1,1,9,4,10,2,1};
		int b[]=new int[a.length];
		int max=Integer.MIN_VALUE;
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
				if(a[x]>max)
				{	
					max=a[x];
				}
			}
		}
		if(max!=Integer.MIN_VALUE)
			System.out.println(max+" is the last unique element");
		else
			System.out.println("There are no unique elements");
	}
}