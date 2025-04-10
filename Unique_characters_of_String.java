class Unique_characters_of_String
{
	public static void main(String args[])
	{
		String s="a lazy dog";
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			if(s.indexOf(letter)==s.lastIndexOf(letter))
				System.out.println(letter);
		}
	}
}
