class Duplicate_characters_of_Strings
{
	public static void main(String args[])
	{
		String s1="a lazy d dogg",s2="";
		for(int x=0;x<s1.length();x++)
		{
			char letter=s1.charAt(x);
			if(s1.indexOf(letter)!=s1.lastIndexOf(letter))
			{
				if(s2.indexOf(letter)==-1)
					s2=s2+letter+",";	
				
			}
		}
		System.out.println("The duplicates are "+s2);
	}
}
