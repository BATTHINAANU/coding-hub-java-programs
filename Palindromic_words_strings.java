class Palindromic_words_strings
{
	public static void main(String args[])
	{
		String s1="mom and dad and anuna",res="";
		String str[]=s1.split(" ");
		for(String t:str)
		{
			String s2=t;
			StringBuffer sb=new StringBuffer(s2);
			sb.reverse();
			if(s2.contentEquals(sb))
			{
				res=res+s2+" ";
			}
		}
		System.out.println("Palindromic words are "+res);
	}
}

