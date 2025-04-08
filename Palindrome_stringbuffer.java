class Palindrome_stringbuffer
{
	public static void main(String args[])
	{
		String s="anuna",res="";
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			if(letter>='A' && letter<='Z' || letter>='a' && letter<='z')
				res=res+letter;
		}
		System.out.println("Result string "+res); //Result string amanaplanacanalpanama
		StringBuffer sb=new StringBuffer(res);
		System.out.println(sb);  //amanaplanacanalpanama   //res value
		sb.reverse();
		System.out.println(sb); //after reversing

	/*
		if(res.contentEquals(sb))//for string and string buffer checking

			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	*/

		String rev=sb.toString();
		System.out.println(rev.equals(res)?"Palindrome":"not palindrome");
	}
}