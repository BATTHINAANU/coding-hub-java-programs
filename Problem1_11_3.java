class Problem1_11_3
{
	public static void main(String args[])
	{
		int num=12345,max=0,previous_max=0,rem=0,temp=num,max1=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem>max)
			{
				max=rem;
								
			}
			num/=10;
			
		}
		System.out.println(max+" is the first max digit of a number");
		while(temp!=0)
		{
			rem=temp%10;
			if(rem==max)
			{
				temp/=10;
				continue;
			}
			if(rem>max1)
			{
				max1=rem;
			}
			temp/=10;
		}
		System.out.println(max1+" is the second largest digit of a number");	
	}
}