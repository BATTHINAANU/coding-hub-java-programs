class Remove_multiple_spaces_strings
{
	public static void main(String args[])
	{
		String s1="hi  all   how    are     you  ",res="";
		//o/p:- hi all how are you
		for(int x=0;x<s1.length();x++)
		{
			char letter=s1.charAt(x);
			if((x+1)!=s1.length() && s1.charAt(x)==' ' && s1.charAt(x+1)==' ')
				continue;
			else
				res=res+letter;
		}
		System.out.println("After removing extra spaces "+res+"anu");
		String str[]=res.split(" ");
		for(String t:str)
			System.out.println(t);
	}
}