class Practice_6_3
{
	public static void main(String args[])
	{
		int start=1,end=500,count=0,sum=0;
		while(start<=end)
		{
			double square=Math.sqrt(start);
			if(square==(int)square)
			{	
				sum+=start;
				count++;
				System.out.println(start);
			}
			start++;
		}
		System.out.println("Sum is "+sum);
		System.out.println("Count is "+count);
	}
}