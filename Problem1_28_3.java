class Problem1_28_3
{
	public static void main(String args[])
	{
		//check duplicates in an array
		int a[]={1,2,1,3,4,2,2,5};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{	
					count++;
				}
				if(count>1)
				{
					System.out.println("Duplicates of "+a[i]+" occurs "+count+" many times in the array");	
				}
			}
		}
	}
}