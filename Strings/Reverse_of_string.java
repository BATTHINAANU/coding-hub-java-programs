class Reverse_of_string
{
	public static void main(String args[])
	{
		String s="Hi all good morning";
		String res="";
		
		for(int x=s.length()-1;x>=0;x--)
		{
			char letter=s.charAt(x);
			res=res+letter;
		}
		System.out.println(res);
	}
}
