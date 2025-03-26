class Problem1_13_3
{
	public static void main(String args[])
	{
		int num=4,count=0;
		for(int start=2;start<=num/2;start++)
		{
			if(num%start==0)
			{
				count++;
				break;
			}	
		}
		if(count==0 && num>=2)
		{
			System.out.println(num+" is a prime number...");
		}
	}
}