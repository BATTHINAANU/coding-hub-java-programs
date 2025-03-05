class While7
{
	public static void main(String args[])
	{
		int start=1,end=10,sum=0,prod=1,temp=start;
		while(start<=end)
		{
			if(start%2==0)
			{
				sum=sum+start;
			}
			else
			{
				prod=prod*start;
			}
			start++;	
		}
		System.out.println("Sum of even numbers between "+temp+" and "+end+" is "+sum);
		System.out.println("Product of odd numbers between "+temp+" and "+end+" is "+prod);
	}
}