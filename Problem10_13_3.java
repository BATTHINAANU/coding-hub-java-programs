class Problem10_13_3
{
	public static void main(String args[])
	{
		int num=178045;
		while(num!=0)
		{
			int count=0;
			int rem=num%10;
			for(int i=2;i<=rem/2;i++)
			{
				if(rem%i==0)
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
					double sqrt=Math.sqrt(rem);
					if(sqrt==(int)sqrt)
					{
						System.out.println(rem+" is not a prime but it is a perfect square");
					}
					else
					{
						System.out.println(rem+" is not a perfect square and prime");
					}
				}
			num/=10;
		}
		
	
	}
}