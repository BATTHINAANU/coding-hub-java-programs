class Problem_11_26_3
{
	public static void main(String args[])
	{
		//Find the minimum element of the array

		int a[]={10213131,-20,30,40,50,100,1000,12012,123456};
		int min=Integer.MAX_VALUE;
		Problem_11_26_3 p1=new Problem_11_26_3();
		System.out.println(p1.findMin(min,a));
	}
	int findMin(int min,int a[])
	{
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
			{
				min=a[x];
			}
		}
		return min;	
	}
}