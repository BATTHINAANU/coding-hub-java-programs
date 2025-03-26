class Problem1_14_3
{
	public static void main(String args[])
	{
		int num=1234567800,count=0,temp=num;
		while(num!=0)
		{	
			int rem=num%10,fact=1;
			count++;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;
			}
			if(rem==fact)
			{
				System.out.println(rem+" is a strong number");
			}
			num/=10;
		}
		System.out.println(" count is "+count);
		num=temp;
		if(count%2==0)
		{	
			int sum=0;
 
			while(num!=0)
			{
				int rem=num%100,fact=1,temp_rem=rem;
			   while(rem!=0)
			   {		
				int rem1=rem%10;
				for(int i=1;i<=rem1;i++)
				{
					fact*=i;
				}
				sum+=fact;
				rem/=10;				
			   }
			       if(temp_rem==sum&&rem>0)
				{
					System.out.println(temp_rem+" is a strong number");
				}
				else
					System.out.println(temp_rem+" is not a strong number");				num/=100;
			}	
		}
	}
}