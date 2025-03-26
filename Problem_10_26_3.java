class Problem_10_26_3
{
	public static void main(String args[])
	{
		//Find the maximum element of the array
		int a[]={10,20,30,40,50,100,1000,12012,123456};
		int max=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				max=a[x];
			}
		}
		System.out.println("The maximum element in the array is "+max);
	}
}