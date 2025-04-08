class Duplicate_in_string
{//Duplicate characters in the array 
	public static void main(String args[])
	{
		String s="Hi Hello Good Morning";
		char c1[]=s.toCharArray();
		char c2[]=new char[c1.length];
		

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
			if(count>0)
				System.out.println(c1[x]+" is repeated in "+count+" times");
		}
	}
}