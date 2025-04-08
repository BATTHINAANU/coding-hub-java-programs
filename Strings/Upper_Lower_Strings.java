
class Upper_Lower_Strings
{
	public static void main(String args[])
	{
		String s=new String("Hi Anu baby@1234#"),res="";
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			if(letter>='A'&&letter<='Z')
			{
				char lower=(char)(letter+32);
				res=res+lower;
				
			}
			else if(letter>='a'&&letter<='z')
				res=res+(char)(letter-32);
			else
				res=res+letter;
		} 
		System.out.println("Original string is "+s);
		System.out.println("Resultant string is "+res);
	}
}

/*
class Upper_Lower_Strings
{
	public static void main(String args[])
	{
		String s="anuBaby@1234";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
}
*/