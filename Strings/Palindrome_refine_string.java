class Palindrome_refine_string
{
	public static void main(String args[])
	{
		String s="a1b2c3d5321",s2="",rev="";
		
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			if(letter>='0'&&letter<='9')
			{
				s2=s2+letter;
			}
		}
		System.out.println("String is "+s);
		System.out.println("Refined string is "+s2);
		for(int x=s2.length()-1;x>=0;x--)
		{
			char letter=s2.charAt(x);
			rev=rev+letter;
		}
		System.out.println("Reverse of s2 is "+rev);
		System.out.println(s2.equals(rev)?"Palindrome":"not a palindrome");
	}
}