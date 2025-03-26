class Problem9_13_3
{
	public static void main(String args[])
	{
		int num=76,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		while(num!=0)
		{
			int rem=num%10;
			double sqrt=Math.sqrt(rem);
			if(sqrt==(int)sqrt)
			{
				if(rem>max)
				{
					max=rem;
				}	
				if(rem<min)
				{


					min=rem;
				}
			}
			num/=10;			
		}
		System.out.println("Max is "+max);
		System.out.println("Min is "+min);

	}
}