class Unique_words
{
	public static void main(String args[])
	{
		String s1="hello all this is anu anu is all ok ok batthina";
		String str[]=s1.split(" ");
		System.out.println("The Unique words are ");
		for(int x=0;x<str.length;x++)
		{
			String s2=str[x];
			if(s1.indexOf(s2)==s1.lastIndexOf(s2))		
			{
				System.out.println(s2);
			}
		}
	}
}