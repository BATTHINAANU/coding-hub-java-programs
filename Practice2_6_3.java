class Practice2_6_3
{
	public static void main(String args[])
	{
		int start=1,end=100,count=0;
		while(start<=end)
		{
			if(start%3==0 && start%5==0)
			{
				count++;	
			}
			start++;
		}
		System.out.println(count);
	}
	
}