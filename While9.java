class While9
{
	public static void main(String args[])
	{
		int start=20,end=1;
		while(start>=end)
		{
			int square=(int)Math.sqrt(start);
			if(square*square==start)
			{
				System.out.println(start);
			}
			start--;
		}
	}
}