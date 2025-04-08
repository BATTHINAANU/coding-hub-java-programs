class Problem5_27_3
{
	public static void main(String args[])
	{
		//Place largest element in the starting  index
		int a[]={10,20,30,40,24};
		Problem5_27_3 p1=new Problem5_27_3();
		if(a.length>1)
		{
			int temp_index=p1.findMax(a);
			int temp=a[0];
			a[0]=a[temp_index];
			a[temp_index]=temp;
			p1.printArray(a);	
		}
	}
	int findMax(int a[])
	{
		int max=Integer.MIN_VALUE;
		int temp_index=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				max=a[x];
				temp_index=x;
			}	
		}
		return temp_index;
	}
	void printArray(int a[])
	{
		System.out.println("The elements of the array are ");
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}
	
}