class Missing_characters_string
{
	public static void main(String args[])
	{
		String s=new String("Hi I am anu");
		s=s.toLowerCase();
		char c[]=s.toCharArray();
		for(char t:c)
			System.out.println(t);
		System.out.println(s);
		System.out.println("Missing elements are");
		for(char x='a';x<='z';x++)
		{
			int count=0;
			for(char t:c)
			{
				if(x==t)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(x+" ");
			}
		}
	}
}