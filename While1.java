class While1
{
	public static void main(String args[])
	{
		int start=100,end=1000;
		int num=start;
		while(start<=end)
		{
			num=start%10;
			System.out.println(start+" Last digit is "+num);
			start++;
		}
	}
}