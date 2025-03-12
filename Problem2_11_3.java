class Problem2_11_3
{
	public static void main(String args[])
	{
		int num=10,max=0,previous_max=0,rem=0,temp=num,max1=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem>max)
			{
				max1=max;
				max=rem;					
			}
			else if (rem>max1 && rem!=max) 
			{
                		max1=rem;             
			}
			num/=10;
			
		}
		System.out.println(max+" is the first max digit of a number");
		System.out.println(max1+" is the 2nd largest number");
	
	}
}
