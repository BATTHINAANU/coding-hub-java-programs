class Practice_6_3
{
	public static void main(String args[])
	{
		int start=1,end=500;
		if(start<=end)
		{
			double square=Math.sqrt(start);
			if(square==(int)square)
			{
				System.out.println(start);
			}
			start++;
		}
		
	}
}