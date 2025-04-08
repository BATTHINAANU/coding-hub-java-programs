class Even_odd_index_values_strings
{
	public static void main(String args[])
	{
		String s1="Hi anu 123",s2="",s3="",s4="",s2_rev="";
		for(int x=0;x<s1.length();x++)
		{
			if(x%2==0)
				s2=s2+s1.charAt(x);
			else
				s3=s3+s1.charAt(x);
		}
		System.out.println("S1 string is "+s1);
		System.out.println("Even index chars of s1 that is S2 is "+s2);
		System.out.println("Odd index chars of s1 that is S3 is "+s3);
		for(int x=s2.length()-1;x>=0;x--)
		{
			s2_rev=s2_rev+s2.charAt(x);
		}
		System.out.println("Reverse of s2 is "+s2_rev);
		s4=s2_rev.toLowerCase()+s3.toUpperCase();
		System.out.println("The resultant String is "+s4);
	}
}