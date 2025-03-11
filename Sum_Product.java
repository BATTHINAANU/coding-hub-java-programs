class Sum_Product
{
	public static void main(String args[])
	{
		int start=1,end=5,sum=0,prod=1;
		while(start<=end)
		{
			sum+=start;
			prod*=start;
			start++;
		}
		System.out.println("Sum is "+sum);
		System.out.println("product is "+prod);
	}
}