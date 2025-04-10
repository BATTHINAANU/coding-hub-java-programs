class Change_1standlastasUppercase_and_inbetween_smallcase
{
	public static void main(String args[])
	{
		String s1="  hEllo  aLl gOod morning  ",res="";
		s1=s1.trim();
		String str[]=s1.split(" ");
		for(String t:str)
			System.out.println(t);
		for(int x=0;x<str.length;x++)
		{	
			String s2=str[x];
			char letter1=s2.charAt(0);
			char letter2=s2.charAt(s2.length()-1);
			res=res+Character.toUpperCase(letter1);
			for(int y=1;y<s2.length()-1;y++)
			{
				char letter3=s2.charAt(y);
				res=res+Character.toLowerCase(letter3);
			}
			res=res+Character.toUpperCase(letter2)+" ";
		}
			System.out.println(res.trim());
	}
}