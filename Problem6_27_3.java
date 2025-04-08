class Problem6_27_3
{
	public static void main(String args[])
	{
		//Place largest element in the starting  index and smallest element in the last index
		int a[]={-241,20,-30,40,100};
		Problem6_27_3 p1=new Problem6_27_3();
		if(a.length>1)
		{
		   
			int min_temp_index=p1.findMin(a);
			int temp=a[a.length-1];
			a[a.length-1]=a[min_temp_index];
			a[min_temp_index]=temp;
			int max_temp_index=p1.findMax(a);
			temp=a[0];
			a[0]=a[max_temp_index];
			a[max_temp_index]=temp;
			p1.printArray(a);	
		}
	}
	int findMin(int a[])
	{
		int min=Integer.MAX_VALUE;
		int temp_index=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
			{
				min=a[x];
				temp_index=x;
			}	
		}
		return temp_index;
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