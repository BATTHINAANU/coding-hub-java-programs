class Word_with_maximum_length
{
	public static void main(String args[])
	{
		String s="vital informations resources under seize confirmation";
		String str[]=s.split(" ");
		int max_length=0;
		String max_word=" ";
		for(String t:str)
		{
			System.out.println(t+" "+t.length());
			if(t.length()>max_length)
			{
				max_length=t.length();
				max_word=t;
			}
			else if(t.length()==max_length)
			{
				max_word=max_word+","+t;
			}
		}
		System.out.println("Maximum length word is "+max_word+" with the length "+max_length);
	}
}