class Tricky_by_student
{
	public static void main(String args[])
	{
		String s1="a bc def ghijk lm nop qrs tuvw";
		String s2="",s3="",rev="";
		System.out.println("Original string is                                 "+s1);
		for(int x=0;x<s1.length();x++)
		{
			char letter=s1.charAt(x);
			s2=letter+s2;
		}
		System.out.println("String after reverse is                            "+s2);
		for(int x=0;x<s2.length();x++)
		{
			char letter=s2.charAt(x);
			if(letter!=' ')
			{
				rev=rev+letter;
			}
		}
		System.out.println("String after removing spaces of reversed string is "+rev);
		for(int x=0,y=0;x<s1.length();x++)
		{
			if(s1.charAt(x)!=' ')
			{
				s3=s3+rev.charAt(y);
				y++;
			}
			else if(s1.charAt(x)==' ')
			{
				s3=s3+' ';
			}
		}
		System.out.println("The resultant string is                           "+s3);
	}
}
