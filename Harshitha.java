class Harshitha
{
	public static void main(String args[])
	{
		String s="ANU";
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)=='A'||s.charAt(x)=='E'||s.charAt(x)=='I'||s.charAt(x)=='O'||s.charAt(x)=='U')
			{
				count++;
			}
		}
		System.out.println("The number of vowels in the string "+s+" are "+count);
	}
}