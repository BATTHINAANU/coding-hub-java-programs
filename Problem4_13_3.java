class Problem4_13_3
{
	public static void main(String args[])
	{
	   for(int x=1;x<=1000;x++)
	   {	
		int num=x,count=0,sum=0,temp=num;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=temp;
		while(num!=0)
		{
			int rem=num%10;
			int power=(int)Math.pow(rem,count);
			sum+=power;
			num/=10;
		}
		if(sum==temp)
			System.out.println(temp+" is an Armstrong number");
	   }	
	}
}