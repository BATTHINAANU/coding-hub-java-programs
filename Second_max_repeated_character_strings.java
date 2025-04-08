class Second_max_repeated_character_strings
{
	public static void main(String args[])
	{
		String s="aabbb";
		char c1[]=s.toCharArray();
		int c2[]=new int[c1.length];
		int max1=Character.MIN_VALUE,max2=max1;
		//System.out.println(max1);
		char max1_char=Character.MIN_VALUE,max2_char=Character.MIN_VALUE;
		for(int x=0;x<c1.length;x++)
		{
			if(c2[x]==1)
				continue;
			int count=1;
			for(int y=x+1;y<c1.length;y++)
			{
				if(c1[x]==c1[y])
				{
					count++;
					c2[y]=1;
				}
			}
			if(count>1)
			{
				if(max1<count)
				{
					max2=max1;
					max1=count;
					max2_char=max1_char;
					max1_char=c1[x];
				}
				else if(count>max2 && max2<max1)
				{
					max2=count;
					max2_char=c1[x];
				}
			}			
		}
		System.out.println("first maximum repeated element is "+max1_char);
		if(max2_char==Character.MIN_VALUE)
			System.out.println("No second maximum");
		else
			System.out.println("second maximum repeated element is "+max2_char);
	}
}