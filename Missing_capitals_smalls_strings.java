class Missing_capitals_smalls_strings
{
	public static void main(String args[])
	{
		String s1="aA";
		System.out.println("Missing capital letters are");
		for(char x='A';x<='Z';x++)
		{
			int count=0;
			for(int y=0;y<s1.length();y++)
			{
				if(s1.charAt(y)==x)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(x+" ");
		}
		System.out.println("\n");
		System.out.println("Missing small letters are");
		for(char x='a';x<='z';x++)
		{
			int count=0;
			for(int y=0;y<s1.length();y++)
			{
				if(s1.charAt(y)==x)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(x+" ");
		}
	}
}