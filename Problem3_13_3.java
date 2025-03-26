class Problem3_13_3
{
	public static void main(String args[])
	{
		for(int start=10;start<=100;start++)
		{
			int num=start,sum=0;
			System.out.println(num+"Sum of the digits are : ");
			while(num!=0)
			{
				int rem=num%10;
				sum+=rem;
				num/=10;
			}
			System.out.println(sum);
			
		}
	}
}