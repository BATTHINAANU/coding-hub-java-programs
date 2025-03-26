class Prime_or_not
{
	public static void main(String args[])
	{	
		Prime p1=new Prime();
		//p1.number=1;
		p1.isPrime();
	}
}
class Prime
{
	int number,count;
	void calFactor()
	{
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				count++;
				break;				
			}
		}
	}
	void isPrime()
	{
		System.out.println((count==0&&number>1)?number+" Prime":number+" Not a prime");
	}
}