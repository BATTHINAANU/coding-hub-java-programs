class Problem_10_26_3
{
	public static void main(String args[])
	{
		//Find the maximum element of the array

		int a[]={10213131,20,30,40,50,100,1000,12012,123456};
		int max=Integer.MIN_VALUE;
		Problem_10_26_3 p1=new Problem_10_26_3();
		System.out.println(p1.findMax(max,a));
	}
	int findMax(int max,int a[])
	{
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				max=a[x];
			}
		}
		return max;
	}
}