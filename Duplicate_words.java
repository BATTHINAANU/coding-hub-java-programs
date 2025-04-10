class Duplicate_words
{
	public static void main(String args[])
	{
		String s1="hello all this is anu anu is all ok ok",res="";
		String str[]=s1.split(" ");
		for(int x=0;x<str.length;x++)
		{
			String s2=str[x];
			if(s1.indexOf(s2)!=s1.lastIndexOf(s2))		
			{
				if(res.indexOf(s2)==-1)
				{
					res=res+s2+" ";
				}
			}
		}
		System.out.println("The duplicate words are: "+res);
	}
}