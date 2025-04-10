class Change_1stlast_words_to_uppercases
{//input:
	public static void main(String args[])
	{
		String s1="    Hello all Good morning     ",res="";
		s1=s1.trim();
		String str[]=s1.split(" ");
		str[0] = str[0].toUpperCase(); // First word
	        str[str.length - 1] = str[str.length - 1].toUpperCase(); // Last word
		for(int x=0;x<str.length;x++)
		{
			res+=str[x];
			if(x<str.length-1)
				res+=" ";
		}	
		System.out.println(res);	
	}
}