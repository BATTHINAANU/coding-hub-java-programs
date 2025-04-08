class Palindrom_string
{
	public static void main(String srgs[])
	{
		String s="anA";
		String rev="";
		for(int x=s.length()-1;x>=0;x--)
		{
			char letter=s.charAt(x);
			rev=rev+letter;
		}
		if(s.equals(rev))//checks the case also
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}





		if(s.equalsIgnoreCase(rev))//regardless of case
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}
	}
}