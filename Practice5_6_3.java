class Practice5_6_3
{
	public static void main(String args[])
	{
		int num=6,count=0;
		int start=1,end=num;
		while(start<=end)
		{
			if(num%start==0)
			{
				count++;
			}
			start++;
		}	
		System.out.println(count);
		System.out.println((count==4)?num+" is a Super number":num+"not a super number");
		System.out.println(count==2?"prime number":"");
	}
}