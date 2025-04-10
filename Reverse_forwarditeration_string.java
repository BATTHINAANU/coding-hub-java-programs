class Reverse_forwarditeration_string
{
	public static void main(String args[])
	{
		String s="Anu Batthina",res="";
		for(int x=0;x<s.length();x++)
		{
			res=s.charAt(x)+res;
		}
		System.out.println("Reverse of the string is "+res);
	}
}