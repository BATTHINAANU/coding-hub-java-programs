class Practice6_6_3
{
	public static void main(String args[])
	{
		int num=6;
		int start=1,end=num/2,max=0;
		while(start<=end)
		{
			if(num%start==0)
			{
				System.out.println(start);
				max=start;
				
			}
			start++;
		}
		System.out.println("Highest factor is:"+max);	
	}
}