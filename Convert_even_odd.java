class Convert_even_odd
{
	public static void main(String args[])
	{
		String s1="hello all",res="";
		s1=s1.trim();
		for(int x=0;x<s1.length();x++)
		{
			char letter=s1.charAt(x);
			if(letter>='A'&&letter<='Z' || letter>='a'&&letter<='z')
			{
				if(x%2==0)
				{
					res=res+Character.toUpperCase(letter);
				}
				else
				{
					res=res+Character.toLowerCase(letter);
				}
			}
			else
				res=res+letter;	
		}
		System.out.println(res);
	}
}