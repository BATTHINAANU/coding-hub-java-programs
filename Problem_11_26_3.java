class Problem_11_26_3
{
	public static void main(String args[])
	{
		//Find the maximum element of the array
		int a[]={23,45,234,54,1,0};
		int min=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
			{
				min=a[x];
			}
		}
		System.out.println("The minimum element in the array is "+min);
	}
}