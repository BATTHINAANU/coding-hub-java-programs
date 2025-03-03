class Letter_convert
{
	public static void main(String args[])
		{
			char ch='a';
			
                        if(ch>='A'&&ch<='Z')
			{
			  int lower=ch+32;
			  System.out.println((char)lower);		
			}
			else if(ch>='a'&&ch<='z')
			{
			  int upper=ch-32;
			  System.out.println((char)upper);
			}
		}
}