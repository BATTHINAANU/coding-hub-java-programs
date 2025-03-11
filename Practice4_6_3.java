class Practice4_6_3
{
	public static void main(String args[])
	{
		int num=17,sum=0,product=1;
		int start=1,end=num/2;
		while(start<=end)
		{
			if(num%start==0)
			{
				sum+=start;
				product*=start;
			}
			start++;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Product :"+product);
	}
}