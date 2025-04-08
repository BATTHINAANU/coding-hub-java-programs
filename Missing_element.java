class Missing_element
{
	public static void main(String args[])
	{
		//Missing elements in the specified range

		int a[]=new int[]{10,20,30,30,20,40,48,50};

		for(int x=10;x<=100;x+=10)
		{
			int count=0;
			for(int temp:a)
			{
				if(x==temp)//if element found then no need to check remaining array elements
				{
					count++;
					break;
				}
			}
			if(count==0)//element not found condition 
				System.out.println(x);
		}
	}
}