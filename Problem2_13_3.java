class Problem2_13_3
{
	public static void main(String args[])
	{
		for(int x=1;x<=10;x++)
		{
			for(int y=1;y<=10;y++)
			{
				if(y==5)
					continue;
				System.out.println(y);
			}
		}
	}
}