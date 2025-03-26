class Problem12_13_3
{
	public static void main(String args[])
	{
		int num=17845,temp=num;
		while(num!=0)
		{
			int count=0;
			int rem=num%10;
			for(int start=2;start<=rem/2;start++)
			{
				if(num%start==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && rem>1)

			{
				System.out.println(rem+" is a prime number");
			}
			else
			{
				System.out.println(rem+" is not a prime number");
			}
			num/=100;	
		}
	}
}