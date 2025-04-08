class Diff_concat_plus
{
	public static void main(String args[])
	{
		String s="Anu Batthina";
		System.out.println(s);   //Anu Batthina
		s=s+" Anu "+1+2+" naidu"+12.345+true+'a'; //
		System.out.println(s);
		s.concat(" Hi ");
		System.out.println(s);
		s=s.concat(" Hi ");
		System.out.println(s);
	}
}