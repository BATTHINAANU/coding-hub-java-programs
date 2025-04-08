class No_of_vowelscons_strings
{
	public static void main(String args[])
	{
		String s="Hi all good morning";
		int vowel=0,consonant=0,capital=0,small=0,digits=0,symbol=0,space=0;
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			if(letter>='A'&&letter<='Z')
			{
				capital++;
				if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
					vowel++;
				else
					consonant++;
			}
			else if(letter>='a'&&letter<='z')
			{
				small++;
				if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
					vowel++;
				else 
					consonant++;
			}
			else if(letter==' ')
				space++;
			else if(letter>='0'&&letter<='9')
				digits++;
			else
				symbol++;
		}
		System.out.println("String="+s+"    and length is "+s.length());
		System.out.println("Capital count is "+capital);
		System.out.println("Small count is "+small);
		System.out.println("Vowel count is "+vowel);
		System.out.println("Consonant count is "+consonant);
		System.out.println("digit count is "+digits);
		System.out.println("space count is "+space);
		System.out.println("symbols count is "+symbol);
	}
}