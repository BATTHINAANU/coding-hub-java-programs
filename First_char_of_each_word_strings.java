class First_char_of_each_word_strings
{//string ="vital information resources under seize"      o/p:virus

	public static void main(String args[])
	{
		String s="vital information resources under seize";
		String str[]=s.split(" ");
		for(String t:str)
		{
			String s2=t;
			char letter=s2.charAt(0);
			System.out.print(letter);
		}
	}
}